(ns hack.algo.time-conversion)

(defn timeConversion [s]
  (let [am? (re-find #"AM" s)
        [h m s & _] (clojure.string/split s #"\D+")
        h (Integer/parseInt h)
        h (cond am? (format "%02d" (mod h 12))
                (= 12 h) h
                :else (+ h 12))]
    (str h ":" m ":" s)))
