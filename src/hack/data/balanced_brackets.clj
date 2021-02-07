(ns hack.data.balanced-brackets)

(def pairs
  {\{ \}
   \( \)
   \[ \]})

(def opens (set (keys pairs)))

(defn match? [o b]
  (= (pairs o) b))

(defn balanced? [s]
  (loop [o []
         s s]
    (if-let [b (first s)]
      (if (contains? opens b)
        (recur (conj o b) (rest s))
        (if (match? (peek o) b)
          (recur (pop o) (rest s))
          false))
      (empty? o))))

(defn isBalanced [s]
  (if (balanced? s) "YES" "NO"))
