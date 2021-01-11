(ns hack.math.handshake)

(defn handshake
  "Computes n choose 2, the number of pairs in a group of size n."
  [n]
  (/ (* n (dec n)) 2))
