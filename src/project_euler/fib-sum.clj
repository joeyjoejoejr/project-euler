(ns project-euler.fib-sum
  "By considering the terms in the Fibonacci sequence whose values do not exceed
   four million, find the sum of the even-valued terms.
   https://projecteuler.net/problem=2")

(defn fib
  [a b]
  (cons a (lazy-seq (fib b (+ b a)))))

(def even-fib (filter #(= 0 (mod % 2)) (fib 1 1)))

(defn sum-even-fib
  "Sums all the even finacci numbers that are less than n"
  [n]
  (reduce + (take-while (partial >= n) even-fib)))

(sum-even-fib 4000000)
