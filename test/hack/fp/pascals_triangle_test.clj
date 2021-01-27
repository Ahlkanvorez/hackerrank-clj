(ns hack.fp.pascals-triangle-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.pascals-triangle :refer [print-triangle]]))

(deftest print-triangle-test
  (is (= "1\n1 1\n1 2 1\n1 3 3 1\n"
         (with-out-str
           (print-triangle 4)))))
