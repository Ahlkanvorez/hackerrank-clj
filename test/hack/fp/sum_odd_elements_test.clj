(ns hack.fp.sum-odd-elements-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.sum-odd-elements :refer [sum-odd]]))

(deftest sum-odd-test
  (is (= 16 (sum-odd [3 2 4 6 5 7 8 0 1]))))
