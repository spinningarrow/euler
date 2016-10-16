;; helpers
(defn- evenly-divisible?
  [num divisor]
  {:pre [(not (zero? divisor))]}
  (zero? (mod num divisor)))

(defn- fibonacci
  ([] (fibonacci 0 1))
  ([a b] (lazy-seq (cons a (fibonacci b (+ a b))))))

;; 1
(defn multiples-of-3-and-5
  [limit]
  (apply + (filter #(or (evenly-divisible? % 3) (evenly-divisible? % 5))
                   (take limit (range)))))

(multiples-of-3-and-5 1000)

;; 2
(defn even-fibonacci-numbers
  [max]
  (apply + (filter even?
                   (take-while #(< % max) (fibonacci)))))

(even-fibonacci-numbers 4000000)
