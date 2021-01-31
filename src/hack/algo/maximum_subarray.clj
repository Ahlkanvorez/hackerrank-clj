(ns hack.algo.maximum-subarray)

(defn max-subarray
  "Determine the maximum contiguous subarray of coll.
  This uses dynamic programming by keeping two running sums: one which
  is the maximum continuous subarray sum encountered so far, and the
  other is a running sum for the current contiguous subarray being
  processed. In this way, all subarray sums are calculated, but without
  redundant additions, resulting in an O(N) algorithm using O(1) extra
  space."
  [coll]
  (loop [m Integer/MIN_VALUE
         c 0
         coll coll]
    (if-let [n (first coll)]
      (let [c (max n (+ n c))]
        (recur (max m c) c (rest coll)))
      m)))

(defn max-subsequence
  "Determine the maximum subset of values in coll.
  For this exercise, a subsequence is any subset of the coll.
  The maximum subset of values is identical to the maximum subarray
  when coll is sorted, since all the maximum values are then adjacent."
  [coll]
  (max-subarray (sort coll)))

(def maxSubarray (juxt max-subarray max-subsequence))
