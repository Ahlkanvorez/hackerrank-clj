(ns hack.fp.area-under-curve)

(def step 0.001)

(defn polynomial [a b]
  (fn [x]
    (transduce (map (fn [[a b]] (unchecked-multiply a (Math/pow x b))))
               + 0
               (map vector a b))))

(defn series-on-interval [f L R]
  (loop [x L
         sum 0]
    (if (> x R)
      sum
      (recur (unchecked-add x step) (unchecked-add sum (f x))))))

(defn round [x decimals]
  (let [shift (Math/pow 10.0 decimals)]
    (/ (Math/round (* x shift))
       shift)))

(defn integrate [f L R step]
  (* step (series-on-interval f L R)))

(defn area [a b L R]
  (round (integrate (polynomial a b) L R step) 1))

(defn volume [a b L R]
  (let [p (polynomial a b)]
    (round (* Math/PI (integrate (fn [x] (Math/pow (p x) 2)) L R step))
           1)))
