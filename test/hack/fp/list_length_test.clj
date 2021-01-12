(ns hack.fp.list-length-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.list-length :refer [length]]))

(deftest length-test
  (is (= 0 (length [])))

  (is (= 1 (length [0])))

  (is (= 2 (length [0 0])))

  (is (= 3 (length [0 0 0]))))
