(ns hack.math.army-game-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.army-game :refer [gameWithCells]]))

(deftest gameWithCells-test
  (let [supply-requirements
        [[1 1 1]
         [1 2 1] [2 2 1]
         [1 3 2] [2 3 2] [3 3 4]
         [1 4 2] [2 4 2] [3 4 4] [4 4 4]
         [1 5 3] [2 5 3] [3 5 6] [4 5 6] [5 5 9]
         [1 6 3] [2 6 3] [3 6 6] [4 6 6] [5 6 9] [6 6 9]
         [1 7 4] [2 7 4] [3 7 8] [4 7 8] [5 7 12] [6 7 12] [7 7 16]
         [1 8 4] [2 8 4] [3 8 8] [4 8 8] [5 8 12] [6 8 12] [7 8 16] [8 8 16]]]
    (doseq [[r c k] supply-requirements]
      (is (= k (gameWithCells r c)))
      (is (= k (gameWithCells c r))))))
