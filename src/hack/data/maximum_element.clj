(ns hack.data.maximum-element)

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
