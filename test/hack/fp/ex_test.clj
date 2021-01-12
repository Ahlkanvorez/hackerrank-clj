(ns hack.fp.ex-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.ex :refer [e]]))

(deftest e-test
  (is (= 2423600.1887 (e 20.0)))

  (is (= 143.6895 (e 5.0)))

  (is (= 1.6487 (e 0.5)))

  (is (= 0.6065 (e -0.5))))
