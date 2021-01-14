(ns hack.fp.functions-or-not)

(defn function? [coll]
  (loop [accum {}
         coll coll]
    (if-let [k (first coll)]
      (if-not (contains? accum k)
        (recur (assoc accum k (second coll)) (drop 2 coll))
        (let [v (second coll)]
          (if (= v (get accum k))
            (recur accum (drop 2 coll))
            false)))
      true)))
