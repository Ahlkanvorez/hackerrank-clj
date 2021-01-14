(ns hack.fp.functions-or-not-test
  (:require [clojure.test :refer [deftest is]]
            [hack.fp.functions-or-not :refer [function?]]))

(deftest function?-test
  (is (true? (function? [1 1 2 2 3 3])))

  (is (true? (function? [1 2 2 4 3 6 4 8])))

  (is (false? (function? [0 1 0 2]))))
