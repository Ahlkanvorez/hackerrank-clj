(ns hack.algo.subarray-division)

(defn birthday [s d m]
  (loop [c 0
         s s]
    (if (< (count s) m)
      c
      (let [k (reduce + 0 (take m s))]
        (if (= k d)
          (recur (inc c) (rest s))
          (recur c (rest s)))))))
