(ns hack.algo.number-line-jumps)

(defn kangaroo [x1 v1 x2 v2]
  (let [dx (- x1 x2)
        dv (- v2 v1)]
    (if (and (not (zero? dv)) (nat-int? (/ dx dv)))
      "YES"
      "NO")))
