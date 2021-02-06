(ns hack.algo.divisible-sum-pairs)

(defn divisibleSumPairs [n k ar]
  (letfn [(divisible-pair? [i j]
            (= 0 (mod (+ (nth ar i) (nth ar j)) k)))]
    (loop [j 1
           i 0
           c 0]
      (cond (>= j n) c
            (>= i j) (recur (inc j) 0 c)
            (divisible-pair? i j) (recur j (inc i) (inc c))
            :else (recur j (inc i) c)))))
