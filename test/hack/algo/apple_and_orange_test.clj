(ns hack.algo.apple-and-orange-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.apple-and-orange :refer [countApplesAndOranges]]))

(deftest apple-and-orange-test
  (is (= "1\n1\n"
         (with-out-str
           (countApplesAndOranges 7 11
                                  5 15
                                  [-2 2 1]
                                  [5 -6])))))
