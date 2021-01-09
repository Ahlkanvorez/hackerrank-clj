(ns hack.algo.array-sum-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.array-sum :refer [simpleArraySum]]))

(deftest array-sum-test
  (is (= 31 (simpleArraySum [1 2 3 4 10 11])))

  (is (= 10 (simpleArraySum [1 2 3 4])))

  (is (= 0 (simpleArraySum [1 -1 2 -2 3 -3]))))
