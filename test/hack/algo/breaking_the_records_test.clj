(ns hack.algo.breaking-the-records-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.breaking-the-records :refer [breakingRecords]]))

(deftest breakingRecords-test
  (is (= [2 4] (breakingRecords [10 5 20 20 4 5 2 25 1])))

  (is (= [4 0] (breakingRecords [3 4 21 36 10 28 35 5 24 42]))))
