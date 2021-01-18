(ns hack.math.connecting-towns-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.connecting-towns :refer [connectingTowns]]))

(deftest connectingTowns-test
  (is (= 3 (connectingTowns 3 [1 3])))

  (is (= 8 (connectingTowns 4 [2 2 2]))))
