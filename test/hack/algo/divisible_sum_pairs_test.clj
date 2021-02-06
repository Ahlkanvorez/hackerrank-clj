(ns hack.algo.divisible-sum-pairs-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.divisible-sum-pairs :refer [divisibleSumPairs]]))

(deftest divisibleSumPairs-test
  (is (= 3 (divisibleSumPairs 6 5 [1 2 3 4 5 6])))

  (is (= 5 (divisibleSumPairs 6 3 [1 3 2 6 1 2]))))


