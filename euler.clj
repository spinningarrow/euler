;; helpers
(defn- evenly-divisible?
  [num divisor]
  {:pre [(not (zero? divisor))]}
  (zero? (mod num divisor)))

;; 1
(defn multiples-of-3-and-5
  [limit]
  (apply + (filter #(or (evenly-divisible? % 3) (evenly-divisible? % 5))
                   (take limit (range)))))

(multiples-of-3-and-5 1000)
