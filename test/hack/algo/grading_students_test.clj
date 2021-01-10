(ns hack.algo.grading-students-test
  (:require [clojure.test :refer [deftest is]]
            [hack.algo.grading-students :refer [gradingStudents]]))

(deftest grading-students-test
  (is (= [7 13 19 21 34 37] (gradingStudents [7 13 19 21 34 37])))

  (is (= [75 67 40 33] (gradingStudents [73 67 38 33]))))
