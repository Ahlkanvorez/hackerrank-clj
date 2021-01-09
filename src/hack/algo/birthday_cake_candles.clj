(ns hack.algo.birthday-cake-candles)

(defn birthdayCakeCandles [candles]
  (let [h (apply max candles)]
    (count (filter #{h} candles))))
