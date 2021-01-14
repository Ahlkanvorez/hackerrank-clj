(ns hack.fp.polygon-area)

(defn area [corners]
  (let [[xn yn] (first corners)]
    (loop [area 0
           corners corners]
      (if-let [[x1 y1] (first corners)]
        (if-let [[x2 y2] (second corners)]
          (recur (+ area (- (* x1 y2) (* x2 y1))) (rest corners))
          (recur (+ area (- (* x1 yn) (* xn y1))) (rest corners)))
        (Math/abs (/ area 2.0))))))
