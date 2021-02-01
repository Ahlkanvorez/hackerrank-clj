(ns hack.math.restaurant)

(defn restaurant [l b]
  (/ (* l b) (.. (biginteger l) (gcd (biginteger b)) (pow 2))))
