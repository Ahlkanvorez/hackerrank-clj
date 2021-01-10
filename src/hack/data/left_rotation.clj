(ns hack.data.left-rotation)

(defn rotateLeft [d arr]
  (loop [r []
         a arr
         d d]
    (if (<= d 0)
      (into (vec a) r)
      (recur (conj r (first a)) (rest a) (dec d)))))
