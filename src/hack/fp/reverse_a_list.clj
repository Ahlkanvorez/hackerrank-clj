(ns hack.fp.reverse-a-list
  (:refer-clojure :exclude [reverse]))

(defn reverse [coll]
  (loop [accum ()
         coll coll]
    (if-let [x (first coll)]
      (recur (conj accum x) (rest coll))
      accum)))
