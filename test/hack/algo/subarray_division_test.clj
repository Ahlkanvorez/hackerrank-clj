(ns hack.algo.subarray-division-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.subarray-division :refer [birthday]]))

(deftest birthday-test
  (is (= 2 (birthday [1 2 1 3 2] 3 2)))

  (is (= 0 (birthday [1 1 1 1 1 1] 3 2)))

  (is (= 1 (birthday [4] 4 1))))

