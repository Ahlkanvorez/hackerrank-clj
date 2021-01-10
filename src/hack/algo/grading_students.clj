(ns hack.algo.grading-students)

(defn gradingStudents [grades]
  (letfn [(round [grade]
            (if (< grade 38)
              grade
              (let [r (rem grade 5)]
                (if (< (- 5 r) 3)
                  (+ grade (- 5 r))
                  grade))))]
    (mapv round grades)))
