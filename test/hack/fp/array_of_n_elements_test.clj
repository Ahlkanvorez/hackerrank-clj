(ns hack.fp.array-of-n-elements-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.array-of-n-elements :refer [array-with-length]]))

(deftest array-with-length-test
  (is (= [] (array-with-length 0)))

  (is (= [0] (array-with-length 1)))

  (is (= [0 0] (array-with-length 2)))

  (is (= [0 0 0] (array-with-length 3)))

  (is (= [0 0 0 0] (array-with-length 4))))
