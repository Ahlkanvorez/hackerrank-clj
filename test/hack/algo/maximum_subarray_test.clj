(ns hack.algo.maximum-subarray-test
  (:require
   [clojure.test :refer [deftest is]]
   [hack.algo.maximum-subarray :refer [maxSubarray]]))

(deftest maxSubarray-test
  (is (= [10 10] (maxSubarray [1 2 3 4])))

  (is (= [10 11] (maxSubarray [2 -1 2 3 4 -5])))

  (is (= [-1 -1] (maxSubarray [-2 -3 -1 -4 -6]))))
