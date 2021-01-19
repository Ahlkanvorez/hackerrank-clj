(ns hack.fp.gcd)

(defn gcd
  "Compute the greatest common divisor of a & b via Euclid's algorithm"
  [a b]
  (cond (= a b) a
        (> a b) (recur (- a b) b)
        :else   (recur b a)))
