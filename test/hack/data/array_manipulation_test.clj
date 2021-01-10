(ns hack.data.array-manipulation-test
  (:require [clojure.test :refer [deftest is]]
            [hack.data.array-manipulation :refer [arrayManipulation]]))

(deftest arrayManipulation-test
  (is (= 10 (arrayManipulation 10 [[1 5 3]
                                   [4 8 7]
                                   [6 9 1]])))

  (is (= 200 (arrayManipulation 5 [[1 2 100]
                                   [2 5 100]
                                   [3 4 100]])))

  (is (= 31 (arrayManipulation 10 [[2 6 8]
                                   [3 5 7]
                                   [1 8 1]
                                   [5 9 15]]))))
