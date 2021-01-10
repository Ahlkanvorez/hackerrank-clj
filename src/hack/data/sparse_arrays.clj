(ns hack.data.sparse-arrays)

(defn matchingStrings [strings queries]
  (let [histogram (frequencies strings)]
    (map #(get histogram % 0) queries)))
