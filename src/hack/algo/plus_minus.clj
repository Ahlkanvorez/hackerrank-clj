(ns hack.algo.plus-minus)

(defn plusMinus [arr]
  (let [c (float (count arr))
        p (count (filter pos? arr))
        n (count (filter neg? arr))
        z (count (filter zero? arr))]
    (printf "%.6f%n%.6f%n%.6f%n" (/ p c) (/ n c) (/ z c))))
