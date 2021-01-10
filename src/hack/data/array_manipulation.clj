(ns hack.data.array-manipulation)

(defn merge [a b]
  (loop [accum []
         a a
         b b]
    (if-let [x (first a)]
      (if-let [y (first b)]
        (if (< (first x) (first y))
          (recur (conj accum x) (rest a) b)
          (recur (conj accum y) a (rest b)))
        (into accum a))
      (into accum b))))

(defn arrayManipulation [n queries]
  (let [ups (sort-by first (mapv (fn [[a b k]] [a k]) queries))
        downs (sort-by first (mapv (fn [[a b k]] [(inc b) (- k)]) queries))]
    (->> (merge ups downs) (map second) (reductions + 0) (apply max))))
