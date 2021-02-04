(ns hack.fp.string-compression)

(defn run-length-encode [s]
  (->> (partition-by identity s)
       (transduce (comp (mapcat (juxt first count))
                        (remove #{1}))
                  conj)
       (apply str)))
