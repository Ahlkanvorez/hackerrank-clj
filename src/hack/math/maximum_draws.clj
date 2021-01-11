(ns hack.math.maximum-draws)

(def maximumDraws
  "Number of choices of n types required before two of one type arise.

  This demonstrates the pigeonhole principle; if there are n types,
  and n + 1 items, at least one type will have two items -- since, if
  each type has one item, the (n + 1)th item must also be in one of
  those types, making two of that type, and any other distribution of
  the items among the n types would result in more than two of the same
  type."
  inc)
