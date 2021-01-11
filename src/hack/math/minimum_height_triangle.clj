(ns hack.math.minimum-height-triangle)

(defn minimum-height
  "The least integer height of a triangle with the given base & area.

Since area = base * height / 2, it follows the triangle must have
height = 2 * Area / base"
  [base area]
  (int (Math/ceil (/ (* 2 area) base))))
