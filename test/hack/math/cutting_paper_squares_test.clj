(ns hack.math.cutting-paper-squares-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.cutting-paper-squares :refer [solve]]))

(deftest solve-test
  (is (= 2 (solve 3 1))))
