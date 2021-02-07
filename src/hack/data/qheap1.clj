(ns hack.data.qheap1
  (:import (java.util PriorityQueue Queue)))

(defn qheap1 [queries]
  (letfn [(dispatch [^Queue heap [[c x] & q]]
            (case c
              1 #(push heap x q)
              2 #(delete heap x q)
              3 #(peek heap q)
              nil heap))
          (push [^Queue heap x q]
            (.offer heap x)
            #(dispatch heap q))
          (delete [^Queue heap x q]
            (.remove heap x)
            #(dispatch heap q))
          (peek [^Queue heap q]
            (println (.peek heap))
            #(dispatch heap q))]
    (trampoline dispatch (PriorityQueue. (count queries)) queries)))
