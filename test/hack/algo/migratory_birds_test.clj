(ns hack.algo.migratory-birds-test
  (:require
   [clojure.test :refer [deftest is]]
   [hack.algo.migratory-birds :refer [migratoryBirds]]))

(deftest migratoryBirds-test
  (is (= 4 (migratoryBirds [1 4 4 4 5 3])))
  (is (= 3 (migratoryBirds [1 2 3 4 5 4 3 2 1 3 4]))))

