(ns hack.fp.ex)

(defn round [k x] (Double/parseDouble (format (str "%." k "f") x)))

(defn factorial [n] (reduce * (range 1 (inc n))))

(defn series-term [x n] (/ (Math/pow x n) (factorial n)))

(defn e
  "Approximate e^x using the Taylor Series with 10 terms to 4 decimals"
  [x]
  (->> (map (partial series-term x) (range 10)) (reduce + 0) (round 4)))
