(ns hack.algo.mini-max-sum-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.mini-max-sum :refer [miniMaxSum]]))

(deftest mini-max-sum-test
  (is (= "10 14\n"
         (with-out-str
           (miniMaxSum [1 2 3 4 5]))))

  (is (= "299 9271\n"
         (with-out-str
           (miniMaxSum [7 69 2 221 8974])))))
