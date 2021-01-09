(ns hack.algo.staircase)

(defn staircase [n]
  (letfn [(space [i] (apply str (take (- n i) (repeat " "))))
          (row [i] (apply str (take i (repeat "#"))))]
    (doseq [i (range 1 (inc n))]
      (println (str (space i) (row i))))))
