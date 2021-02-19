(ns hack.algo.migratory-birds)

(defn migratoryBirds [arr]
  (->> arr frequencies (sort-by first) (sort-by second >) first first))
