(ns hack.fp.list-length)

(defn length [coll]
  (loop [coll coll
         c 0]
    (if (seq coll)
      (recur (rest coll) (inc c))
      c)))
