(ns hack.math.restaurant)

(defn gcd-sqr [a b]
  (if (zero? b)
    (* a a)
    (recur b (mod a b))))

(defn restaurant [l b]
  (/ (* l b) (gcd-sqr l b)))
