(ns hack.math.sherlock-tiles)

(defn movingTiles [l s1 s2 queries]
  (let [ds (Math/abs (- s2 s1))
        f (/ (Math/sqrt 2) ds)]
    (mapv (fn [A] (* (Math/abs (- (Math/sqrt A) l)) f)) queries)))
