(ns hack.math.summing-n-series)

(defn summingSeries
  "Compute S(n) mod (10^9 + 7),
   Given T : n -> n^2 - (n - 1)^2 and S : n -> T(1) + ... + T(n).

   First observe:
     T(n) = n^2 - (n - 1)^2
          = n^2 - (n^2 - 2n + 1)
          = (n^2 - n^2) + 2n - 1
          = 2n - 1.

   Following from that,
     S(n) = T(1) + ... + T(n)
          = 2(1) - 1 + ... + 2(n) - 1
          = 2(1 + ... + n) - (1 + ...n-times... + 1)
          = 2(n(n + 1) / 2) - n
          = n^2 + n - n
          = n^2.

   Thus, S(n) is simply the square function.
   "
  [n]
  (mod (*' n n) 1000000007N))
