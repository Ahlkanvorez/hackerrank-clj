(ns hack.data.qheap1-test
  (:require [clojure.test :refer [deftest is]]
            [hack.data.qheap1 :refer [qheap1]]))

(deftest qheap1-test
  (is (= "4\n9\n"
         (with-out-str
           (qheap1 [[1 4]
                    [1 9]
                    [3]
                    [2 4]
                    [3]])))))


