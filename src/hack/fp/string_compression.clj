(ns hack.fp.string-compression)

(defn run-length-encode [s]
  (loop [c (first s)
         s (rest s)
         n 1
         accum (transient [])]
    (if-let [k (first s)]
      (if (= c k)
        (recur c (rest s) (inc n) accum)
        (if (= n 1)
          (recur k (rest s) 1 (conj! accum c))
          (recur k (rest s) 1 (conj! (conj! accum c) n))))
      (->> (if (= n 1)
             (conj! accum c)
             (conj! (conj! accum c) n))
           persistent!
           (apply str)))))
