(ns hack.math.summing-n-series-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.summing-n-series :refer [summingSeries]]))

(deftest summingSeries-test
  (is (= 4 (summingSeries 2)))

  (is (= 1 (summingSeries 1))))
