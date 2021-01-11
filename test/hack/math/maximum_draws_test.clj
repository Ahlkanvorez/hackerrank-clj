(ns hack.math.maximum-draws-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.maximum-draws :refer [maximumDraws]]))

(deftest maximumDraws-test
  (is (= 2 (maximumDraws 1)))

  (is (= 3 (maximumDraws 2))))
