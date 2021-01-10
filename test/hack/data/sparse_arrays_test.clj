(ns hack.data.sparse-arrays-test
  (:require [clojure.test :refer [deftest is]]
            [hack.data.sparse-arrays :refer [matchingStrings]]))

(deftest matchingStrings-test
  (is (= [2 1 0]
         (matchingStrings ["aba" "baba" "aba" "xzxb"]
                          ["aba" "xzxb" "ab"])))

  (is (= [1 0 1]
         (matchingStrings ["def" "de" "fgh"]
                          ["de" "lmn" "fgh"])))

  (is (= [1 3 4 3 2]
         (matchingStrings ["abcde" "sdaklfj" "asdjf" "na" "basdn"
                           "sdaklfj" "asdjf" "na" "asdjf" "na" "basdn"
                           "sdaklfj" "asdjf"]
                          ["abcde" "sdaklfj" "asdjf" "na" "basdn"]))))
