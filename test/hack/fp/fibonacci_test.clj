(ns hack.fp.fibonacci-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.fibonacci :refer [fibonacci]]))

(deftest fibonacci-test
  (is (= 0 (fibonacci 0)))

  (is (= 1 (fibonacci 1)))

  (is (= 1 (fibonacci 2)))

  (is (= 2 (fibonacci 3)))

  (is (= 3 (fibonacci 4)))

  (is (= 5 (fibonacci 5)))

  (is (= 8 (fibonacci 6)))

  (is (= 13 (fibonacci 7)))

  (is (= 21 (fibonacci 8))))

