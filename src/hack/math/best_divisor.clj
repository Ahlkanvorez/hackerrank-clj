(ns hack.math.best-divisor)

(defn sum-digits [n]
  (loop [a 0
         n n]
    (if (zero? n)
      a
      (recur (+ a (mod n 10)) (quot n 10)))))

(defn divisors [n]
  (loop [a []
         k 1]
    (if (< n k)
      a
      (if (zero? (mod n k))
        (recur (conj a k) (inc k))
        (recur a (inc k))))))

(defn best-divisor [n]
  (->> (divisors n)
       (mapv (juxt identity sum-digits))
       (sort-by first)
       (sort-by second >)
       first first))
