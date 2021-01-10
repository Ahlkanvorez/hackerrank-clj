(ns hack.algo.diagonal-difference-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.diagonal-difference :refer [diagonalDifference]]))

(deftest diagonal-difference-test
  (is (= 15 (diagonalDifference [[11 2 4]
                                 [4 5 6]
                                 [10 8 -12]])))

  (is (= 2 (diagonalDifference [[1 0 0]
                                [0 1 0]
                                [0 0 1]])))

  (is (= 4 (diagonalDifference [[1 0 -2]
                                [0 1 0]
                                [0 0 1]]))))
