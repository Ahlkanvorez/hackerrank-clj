(ns hack.algo.number-line-jumps-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.number-line-jumps :refer [kangaroo]]))

(deftest kangaroo-test
  (is (= "YES" (kangaroo 0 3 4 2)))

  (is (= "NO" (kangaroo 0 2 5 3))))
