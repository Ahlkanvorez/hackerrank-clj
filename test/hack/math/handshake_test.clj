(ns hack.math.handshake-test
  (:require [clojure.test :refer [deftest is]]
            [hack.math.handshake :refer [handshake]]))

(deftest handshake-test
  (is (= 0 (handshake 1)))

  (is (= 1 (handshake 2)))

  (is (= 3 (handshake 3)))

  (is (= 6 (handshake 4))))
