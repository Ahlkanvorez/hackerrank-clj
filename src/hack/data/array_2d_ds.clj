(ns hack.data.array-2d-ds)

(defn hourglassSum [arr]
  (letfn [(hourglass-coords-at [r c]
            [[r c] [r (inc c)] [r (+ c 2)]
             [(inc r) (inc c)]
             [(+ r 2) c] [(+ r 2) (inc c)] [(+ r 2) (+ c 2)]])
          (hourglass-sum-at [r c]
            (->> (hourglass-coords-at r c)
                 (transduce (map (partial get-in arr)) +)))]
    (->> (mapcat (fn [r] (map (fn [c] [r c]) (range 4))) (range 4))
         (transduce (map (partial apply hourglass-sum-at)) max
                    (hourglass-sum-at 0 0)))))
