(ns project-euler.multiples)

(defn below-n
  [n]
  (filter
   #(or (= 0 (mod % 3)) (= 0 (mod % 5)))
   (take (- n 1) (iterate inc 1))))

(defn sum-of-first-n
  [n]
  (reduce + (below-n n)))
