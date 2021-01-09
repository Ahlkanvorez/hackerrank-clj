(ns hack.algo.very-big-sum-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.very-big-sum :refer [aVeryBigSum]]))

(deftest very-big-sum-test
  (is (= 5000000015
         (aVeryBigSum
          [1000000001 1000000002 1000000003 1000000004 1000000005])))

  (is (= (/ (* 100000 (dec 100000)) 2) (aVeryBigSum (range 100000)))))
