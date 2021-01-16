(ns hack.algo.between-two-sets)

(def factor? (comp zero? mod))

(defn factor-of-every? [coll n]
  (every? #(factor? % n) coll))

(defn every-a-factor? [coll n]
  (every? #(factor? n %) coll))

(defn getTotalX [a b]
  (->> (range (apply max a) (inc (apply min b)))
       (filter #(and (every-a-factor? a %)
                     (factor-of-every? b %)))
       count))
