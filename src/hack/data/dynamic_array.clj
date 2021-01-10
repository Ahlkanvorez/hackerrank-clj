(ns hack.data.dynamic-array)

(defn dynamicArray [n queries]
  (letfn [(one [coll l x y]
            (update coll (mod (bit-xor x l) n) conj y))
          (two [coll l x y]
            (let [s (nth coll (mod (bit-xor x l) n))]
              (nth s (mod y (count s)))))]
    (loop [coll (vec (take n (repeat [])))
           l 0
           queries queries
           r []]
      (if-let [[q x y] (first queries)]
        (case q
          1 (recur (one coll l x y) l (rest queries) r)
          2 (let [l (two coll l x y)]
              (recur coll l (rest queries) (conj r l))))
        r))))

