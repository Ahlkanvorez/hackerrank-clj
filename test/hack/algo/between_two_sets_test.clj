(ns hack.algo.between-two-sets-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.between-two-sets :refer [getTotalX]]))

(deftest getTotalX-test
  (is (= 3 (getTotalX [2 4] [16 32 96])))

  (is (= 2 (getTotalX [3 4] [24 48]))))
