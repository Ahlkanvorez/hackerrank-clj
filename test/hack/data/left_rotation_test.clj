(ns hack.data.left-rotation-test
  (:require [clojure.test :refer [deftest is]]
            [hack.data.left-rotation :refer [rotateLeft]]))

(deftest rotateLeft-test
  (is (= [1 2 3] (rotateLeft 0 [1 2 3])))

  (is (= [2 3 1] (rotateLeft 1 [1 2 3])))

  (is (= [3 1 2] (rotateLeft 2 [1 2 3])))

  (is (= [1 2 3] (rotateLeft 3 [1 2 3]))))
