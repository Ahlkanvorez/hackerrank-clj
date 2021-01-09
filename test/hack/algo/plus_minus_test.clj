(ns hack.algo.plus-minus-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.plus-minus :refer [plusMinus]]))

(deftest plus-minus-test
  (is (= "0.500000\n0.333333\n0.166667\n"
         (with-out-str
           (plusMinus [-4 3 -9 0 4 1]))))

  (is (= "0.375000\n0.375000\n0.250000\n"
         (with-out-str
           (plusMinus [1 2 3 -1 -2 -3 0 0])))))
