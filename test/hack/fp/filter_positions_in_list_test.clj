(ns hack.fp.filter-positions-in-list-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.filter-positions-in-list :refer [filter-positions]]))

(deftest filter-positions-test
  (is (= "5\n4\n7\n8\n"
         (with-out-str
           (filter-positions [2 5 3 4 6 7 9 8]))))

  (is (= "15\n1\n6\n18\n1\n"
         (with-out-str
           (filter-positions [8 15 22 1 10 6 2 18 18 1])))))
