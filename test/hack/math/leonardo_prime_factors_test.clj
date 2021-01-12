(ns hack.math.leonardo-prime-factors-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.leonardo-prime-factors :refer [primeCount]]))

(deftest primeCount-test
  (is (= 0 (primeCount 1)))

  (is (= 1 (primeCount 2)))

  (is (= 1 (primeCount 3)))

  (is (= 4 (primeCount 500)))

  (is (= 5 (primeCount 5000)))

  (is (= 10 (primeCount 10000000000))))
