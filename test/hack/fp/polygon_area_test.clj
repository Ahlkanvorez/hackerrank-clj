(ns hack.fp.polygon-area-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.polygon-area :refer [area]]))

(deftest area-test
  (is (= 1.0 (area [[0 0] [0 1] [1 1] [1 0]])))

  (is (= 115342.0 (area [[1043 770] [551 990] [681 463]]))))
