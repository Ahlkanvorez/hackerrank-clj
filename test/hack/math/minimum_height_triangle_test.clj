(ns hack.math.minimum-height-triangle-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.minimum-height-triangle :refer [minimum-height]]))

(deftest minimum-height-test
  (is (= 3 (minimum-height 4 6)))

  (is (= 2 (minimum-height 2 2)))

  (is (= 12 (minimum-height 17 100))))
