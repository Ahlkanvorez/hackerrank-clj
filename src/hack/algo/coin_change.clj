(ns hack.algo.coin-change)

(def count-change
  (memoize
   (fn [n coins]
     (cond (zero? n) 1
           (neg? n) 0
           :else
           (if-let [k (first coins)]
             (+' (count-change (- n k) coins)
                 (count-change n (rest coins)))
             0)))))

(defn getWays [n coins]
  (count-change n coins))
