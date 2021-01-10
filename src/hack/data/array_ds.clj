(ns hack.data.array-ds)

(defn reverseArray [a]
  (loop [r () a a]
    (if (seq a)
      (recur (conj r (first a)) (rest a))
      (vec r))))
