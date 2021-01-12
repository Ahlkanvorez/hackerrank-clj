(ns hack.math.leonardo-prime-factors)

(def natural-numbers (drop 1 (range)))

(defn divides [k n] (zero? (mod n k)))

(defn sieve
  "Lazy-seq of all primes via the Sieve of Eratosthenes.

  This algorithm generates all primes by removing all multiples of
  primes as each new prime is encountered. This is done lazily, so
  each time a new prime is retrieved, an additional lazy filter is
  added to remove all multiples of that prime. This establishes the
  invariant that any number left in the seq is not a multiple of any
  previous prime, and is thus a prime itself."
  [N]
  (cons (first N)
        (lazy-seq (sieve (remove (partial divides (first N)) N)))))

(def primes (sieve (rest natural-numbers)))

(defn primeCount
  "The maximum number of distinct primes whose product is at most n.

  This is equivalent to identifying the least k for which the product
  of the first k primes is at most n."
  [n]
  (if (< n 1)
    0
    (loop [c 0
           p 1
           primes primes]
      (cond (= p n) c
            (> p n) (dec c)
            :else (recur (inc c) (*' p (first primes)) (rest primes))))))
