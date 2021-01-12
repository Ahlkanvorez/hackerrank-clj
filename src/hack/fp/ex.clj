(ns hack.fp.ex)

(defn round [k x] (Double/parseDouble (format (str "%." k "f") x)))

(defn factorial [n] (reduce * (range 1 (inc n))))

(defn series-term [x n] (/ (Math/pow x n) (factorial n)))

(defn e
  "Approximate e^x using the Taylor Series with 10 terms to 4 decimals"
  [x]
  (round 4 (transduce (map (partial series-term x)) + 0 (range 10))))
