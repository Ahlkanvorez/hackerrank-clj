(ns hack.math.army-game)

(defn gameWithCells
  "Calculate supply requirements for an n by m grid.

  Supply requirements are commutative, and for an nx1 grid are
  (quot (inc n) 2). Extending this to an nxm grid simply requires
  calculating the number of double columns that can be addressed by a
  single row of supplies, which is identical to calculating the
  requirements for a 1xm grid, (quot (inc n) 2).
  Alternatively, supply requirements are equivalent to mapping a
  multiplication table such that each product is replaced with a square
  of four copies of itself; e.g.
  _ 1 2 3        _ 1 2 3 4 5 6
  1 1 2 3        1 1 1 2 2 3 3
  2 2 4 6   ->   2 1 1 2 2 3 3
  3 3 6 9        3 2 2 4 4 6 6
                 4 2 2 4 4 6 6
                 5 3 3 6 6 9 9
                 6 3 3 6 6 9 9
  Since each supply covers a square of cells."
  [n m]
  (letfn [(supplies-for [n] (quot (inc n) 2))]
    (* (supplies-for n) (supplies-for m))))
