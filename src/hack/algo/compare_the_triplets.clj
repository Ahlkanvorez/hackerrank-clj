(ns hack.algo.compare-the-triplets)

(defn compareTriplets [a b]
  (->> (map (fn [a b]
              (cond (> a b) [1 0]
                    (< a b) [0 1]
                    :else [0 0]))
            a b)
       (reduce (fn [[A B] [a b]] [(+ A a) (+ B b)])
               [0 0])))
