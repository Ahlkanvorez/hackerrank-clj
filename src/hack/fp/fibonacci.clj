(ns hack.fp.fibonacci)

(def fibonacci
  (memoize
   (fn [n]
     (if (< n 2)
       n
       (+ (fibonacci (- n 1))
          (fibonacci (- n 2)))))))
