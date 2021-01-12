(ns hack.fp.reverse-a-list-test
  (:refer-clojure :exclude [reverse])
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.reverse-a-list :refer [reverse]]))

(deftest reverse-test
  (is (= '(2 1 0) (reverse (range 3))))

  (is (= '(0 28 4 18 17 26 28 3 22 19)
         (reverse [19 22 3 28 26 17 18 4 28 0]))))
