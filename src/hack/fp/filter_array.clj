(ns hack.fp.filter-array
  (:refer-clojure :exclude [filter]))

(defn filter [p coll]
  (loop [accum []
         coll coll]
    (if-let [x (first coll)]
      (if (p x)
        (recur (conj accum x) (rest coll))
        (recur accum (rest coll)))
      accum)))

(defn filter-array [b coll]
  (doall (map println (filter (partial > b) coll))))
