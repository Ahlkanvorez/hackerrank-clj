(ns hack.algo.compare-the-triplets-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.compare-the-triplets :refer [compareTriplets]]))

(deftest comapre-the-triplets-test
  (is (= [0 0] (compareTriplets [1 2 3] [1 2 3])))

  (is (= [1 1] (compareTriplets [5 6 7] [3 6 10])))

  (is (= [2 1] (compareTriplets [17 28 30] [99 16 8])))

  (is (= [1 2] (compareTriplets [99 16 8] [17 28 30]))))
