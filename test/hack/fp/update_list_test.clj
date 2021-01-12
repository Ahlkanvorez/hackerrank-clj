(ns hack.fp.update-list-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.update-list :refer [update-list]]))

(deftest update-list-test
  (is (= '(2 4 3 1 23 4 54)
         (update-list [2 -4 3 -1 23 -4 -54]))))
