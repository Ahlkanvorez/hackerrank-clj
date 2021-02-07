(ns hack.data.maximum-element-test
  (:require [clojure.test :refer [deftest is]]
            [hack.data.maximum-element :refer [maximum-element]]))

(deftest maximum-element-test
  (is (= "26\n91\n"
         (with-out-str
           (maximum-element [[1 97]
                             [2]
                             [1 20]
                             [2]
                             [1 26]
                             [1 20]
                             [2]
                             [3]
                             [1 91]
                             [3]])))))

