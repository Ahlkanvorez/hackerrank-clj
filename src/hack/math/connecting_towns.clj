(ns hack.math.connecting-towns)

(defn connectingTowns [_n routes]
  (mod (reduce *' routes) 1234567N))
