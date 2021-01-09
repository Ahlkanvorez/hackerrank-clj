(ns hack.algo.birthday-cake-candles-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.birthday-cake-candles :refer [birthdayCakeCandles]]))

(deftest birthday-cake-candles-test
  (is (= 2 (birthdayCakeCandles [3 2 1 3])))

  (is (= 5 (birthdayCakeCandles [2 2 2 2 2]))))
