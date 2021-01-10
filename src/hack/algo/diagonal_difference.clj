(ns hack.algo.diagonal-difference)

(defn diagonalDifference [arr]
  (let [sum (partial reduce + 0)
        max-idx (dec (count arr))
        primary (sum (map-indexed
                      (fn [idx coll]
                        (nth coll idx))
                      arr))
        secondary (sum (map-indexed
                        (fn [idx coll]
                          (nth coll (- max-idx idx)))
                        arr))]
    (Math/abs (- primary secondary))))
