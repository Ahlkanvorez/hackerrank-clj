(ns hack.data.array-ds-test
  (:require [clojure.test :refer [deftest is]]
            [hack.data.array-ds :refer [reverseArray]]))

(deftest array-ds-test
  (is (= [2 3 4 1] (reverseArray [1 4 3 2])))

  (is (= [3 2 1] (reverseArray [1 2 3])))

  (is (= [] (reverseArray []))))
