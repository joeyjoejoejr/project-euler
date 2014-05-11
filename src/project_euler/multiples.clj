(ns project-euler.multiples
  "Find the sum of all the multiples of 3 or 5 below 1000.
  https://projecteuler.net/problem=1")

(defn below-n
  [n]
  (filter
   #(or (= 0 (mod % 3)) (= 0 (mod % 5)))
   (take (- n 1) (iterate inc 1))))

(defn sum-of-first-n
  [n]
  (reduce + (below-n n)))
