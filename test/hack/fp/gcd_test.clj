(ns hack.fp.gcd-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.gcd :refer [gcd]]))

(deftest gcd-test
  (is (= 1 (gcd 1 5)))

  (is (= 10 (gcd 10 100)))

  (is (= 1 (gcd 22 131)))

  (is (= 1 (gcd 2 3))))
