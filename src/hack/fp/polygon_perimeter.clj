(ns hack.fp.polygon-perimeter)

(defn distance [[x1 y1] [x2 y2]]
  (Math/sqrt (+ (Math/pow (- x2 x1) 2)
                (Math/pow (- y2 y1) 2))))

(defn perimeter [corners]
  (let [start (first corners)]
    (loop [perimeter 0
           c start
           corners (rest corners)]
      (if-let [d (first corners)]
        (recur (+ perimeter (distance c d)) d (rest corners))
        (+ perimeter (distance c start))))))
