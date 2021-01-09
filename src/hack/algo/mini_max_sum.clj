(ns hack.algo.mini-max-sum)

(defn miniMaxSum [arr]
  (let [arr (sort arr)
        minimum (reduce + 0 (take 4 arr))
        maximum (reduce + 0 (take-last 4 arr))]
    (println minimum maximum)))
