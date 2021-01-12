(ns hack.fp.sum-odd-elements)

(defn sum-odd [coll]
  (transduce (filter odd?) + 0 coll))
