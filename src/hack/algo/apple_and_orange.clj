(ns hack.algo.apple-and-orange)

(defn countApplesAndOranges
  "s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree."
  [s t a b apples oranges]
  (letfn [(on-house? [p] (<= s p t))
          (count-on-house [coll tree]
            (->> (map #(+ tree %) coll)
                 (filter on-house?)
                 count))]
    (println (count-on-house apples a))
    (println (count-on-house oranges b))))
