(ns hack.fp.filter-positions-in-list)

(defn take-even-positions [coll]
  (when-let [x (first coll)]
    (cons x (lazy-seq (take-even-positions (drop 2 coll))))))

(defn filter-positions [coll]
  (doall (map println (take-even-positions (rest coll)))))

