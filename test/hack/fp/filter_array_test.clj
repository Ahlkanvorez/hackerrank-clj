(ns hack.fp.filter-array-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.filter-array :refer [filter-array]]))

(deftest filter-array-test
  (is (= "2\n1\n0\n"
         (with-out-str
           (filter-array 3 [10 9 8 2 7 5 1 3 0]))))

  (is (= "-41\n-28\n21\n-29\n"
         (with-out-str
           (filter-array 25 [-41 46 -28 21 52 83 -29 84 27 40])))))
