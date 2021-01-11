(ns hack.math.find-the-point-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.find-the-point :refer [findPoint]]))

(deftest findPoint-test
  (is (= [2 2] (findPoint 0 0 1 1)))

  (is (= [3 3] (findPoint 1 1 2 2))))
