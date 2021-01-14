(ns hack.fp.polygon-perimeter-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.polygon-perimeter :refer [perimeter]]))

(deftest perimeter-test
  (is (= 4.0 (perimeter [[0 0] [0 1] [1 1] [1 0]]))))
