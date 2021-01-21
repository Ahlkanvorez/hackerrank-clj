(ns hack.fp.string-compression-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.string-compression :refer [run-length-encode]]))

(deftest run-length-encode-test
  (is (= "abca3b3" (run-length-encode "abcaaabbb")))

  (is (= "abcd" (run-length-encode "abcd")))

  (is (= "a3ba4c2a4ba" (run-length-encode "aaabaaaaccaaaaba"))))
