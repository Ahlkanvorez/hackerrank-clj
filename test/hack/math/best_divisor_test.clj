(ns hack.math.best-divisor-test
  (:require
   [clojure.test :refer [deftest is]]
   [hack.math.best-divisor :refer [best-divisor]]))

(deftest best-divisor-test
  (is (= 6 (best-divisor 12))))
