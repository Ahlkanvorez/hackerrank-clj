(ns hack.math.sherlock-tiles-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.sherlock-tiles :refer [movingTiles]]))

(deftest movingTiles-test
  (is (= [4.14213562373095 0.0000] (movingTiles 10 1 2 [50 100]))))
