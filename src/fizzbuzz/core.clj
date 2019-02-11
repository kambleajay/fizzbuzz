(ns fizzbuzz.core)

(defn generate [n]
  (cond
    (zero? (rem n 3)) "Fizz"
    (zero? (rem n 5)) "Buzz"))
