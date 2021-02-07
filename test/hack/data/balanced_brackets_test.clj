(ns hack.data.balanced-brackets-test
  (:require [clojure.test :refer [deftest is]]
            [hack.data.balanced-brackets :refer [isBalanced]]))

(deftest isBalanced-test
  (is (= "YES" (isBalanced "{[()]}")))

  (is (= "NO" (isBalanced "{[(])}")))

  (is (= "YES" (isBalanced "{{[[(())]]}}"))))

