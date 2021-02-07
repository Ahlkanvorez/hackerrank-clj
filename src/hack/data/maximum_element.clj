(ns hack.data.maximum-element)

(defn maximum-element-loop [queries]
  (loop [s []
         m ##-Inf
         queries queries]
    (when-let [[c x] (first queries)]
      (case c
        1 (recur (conj s x) (max m x) (rest queries))
        2 (let [h (peek s)
                s (pop s)]
            (recur s
                   (if (= h m)
                     (apply max (conj s ##-Inf))
                     m)
                   (rest queries)))
        3 (do (println m)
              (recur s m (rest queries)))))))

(defn maximum-element [queries]
  (letfn [(dispatch [s m [[c x] & q]]
            (case c
              1 #(dispatch (conj s x) (max m x) q)
              2 #(remove-top s m q)
              3 #(peek-max s m q)
              nil :done))
          (remove-top [s m q]
            (let [h (peek s)
                  s (pop s)
                  m (if (= h m)
                      (apply max (conj s ##-Inf))
                      m)]
              #(dispatch s m q)))
          (peek-max [s m q]
            (println m)
            #(dispatch s m q))]
    (trampoline dispatch [] ##-Inf queries)))
