(ns hack.fp.array-of-n-elements)

(defn array-with-length [n]
  (vec (take n (repeat 0))))
