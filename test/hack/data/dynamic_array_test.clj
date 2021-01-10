(ns hack.data.dynamic-array-test
  (:require [clojure.test :refer [deftest is]]
            [hack.data.dynamic-array :refer [dynamicArray]]))

(deftest dynamic-array-test
  (is (= [7 3]
         (dynamicArray 2 [[1 0 5] [1 1 7] [1 0 3] [2 1 0] [2 1 1]]))))
