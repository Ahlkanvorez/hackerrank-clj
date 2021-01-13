(ns hack.fp.area-under-curve-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.area-under-curve :refer [area volume]]))

(let [a [1 2 3 4 5]
      b [6 7 8 9 10]
      L 1
      R 4]
  ;; The problem statement allowed for a 1% error.
  (deftest area-test
    (let [given 2435300.3]
      (is (>= 0.01 (Math/abs (/ (- (area a b L R) given) given))))))

  (deftest volume-test
    (let [given 26172951168940.8]
      (is (>= 0.01 (Math/abs (/ (- (volume a b L R) given) given)))))))
