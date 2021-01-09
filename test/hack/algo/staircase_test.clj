(ns hack.algo.staircase-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.staircase :refer [staircase]]))

(deftest staircase-test
  (is (= "     #
    ##
   ###
  ####
 #####
######
"
         (with-out-str
           (staircase 6)))))
