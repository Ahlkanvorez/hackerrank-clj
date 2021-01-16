(ns hack.algo.breaking-the-records)

(defn breakingRecords [all-scores]
  (loop [scores (rest all-scores)
         maxes 0
         mins 0
         last-max (first all-scores)
         last-min (first all-scores)]
    (if-let [n (first scores)]
      (cond
        (> n last-max) (recur (rest scores) (inc maxes) mins n last-min)
        (< n last-min) (recur (rest scores) maxes (inc mins) last-max n)
        :else (recur (rest scores) maxes mins last-max last-min))
      [maxes mins])))
