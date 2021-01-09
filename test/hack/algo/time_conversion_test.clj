(ns hack.algo.time-conversion-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.time-conversion :refer [timeConversion]]))

(deftest time-conversion-test
  (is (= "19:05:45" (timeConversion "07:05:45PM")))

  (is (= "07:05:45" (timeConversion "07:05:45AM")))

  (is (= "12:05:45" (timeConversion "12:05:45PM")))

  (is (= "00:05:45" (timeConversion "12:05:45AM"))))
