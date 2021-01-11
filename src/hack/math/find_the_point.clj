(ns hack.math.find-the-point)

(defn findPoint
  "Computes the inversion of [px py] across [qx qy]."
  [px py qx qy]
  (letfn [(sub [u v] (mapv - u v))
          (scale [a v] (mapv (partial * a) v))]
    (sub (scale 2 [qx qy]) [px py])))
