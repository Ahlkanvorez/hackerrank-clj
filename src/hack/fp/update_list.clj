(ns hack.fp.update-list)

(defn update-list [coll]
  (letfn [(abs [x] (if (< x 0) (- x) x))]
    (map abs coll)))
