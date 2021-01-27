(ns hack.fp.pascals-triangle)

(defn pascal [r c]
  (if (or (= c 0) (= c r))
    1
    (+ (pascal (dec r) c)
       (pascal (dec r) (dec c)))))

(defn print-triangle [n]
  (dotimes [r n]
    (dotimes [c (inc r)]
      (print (pascal r c))
      (when (< c r) (print " ")))
    (println)))
