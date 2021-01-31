(ns hack.algo.coin-change-test
  (:require
   [clojure.test :refer [deftest is]]
   [hack.algo.coin-change :refer [getWays]]))

(deftest getWays-test
  (is (= 4 (getWays 4 [1 2 3])))

  (is (= 5 (getWays 10 [2 5 3 6]))))

