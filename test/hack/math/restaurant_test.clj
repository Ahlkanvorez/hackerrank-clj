(ns hack.math.restaurant-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.restaurant :refer [restaurant]]))

(deftest restaurant-test
  (is (= 1 (restaurant 2 2)))

  (is (= 6 (restaurant 6 9))))
