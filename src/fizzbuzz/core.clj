(ns fizzbuzz.core)

(defn generate [n]
  (cond
    (and (zero? (rem n 3)) (zero? (rem n 5))) "FizzBuzz"
    (zero? (rem n 3)) "Fizz"
    (zero? (rem n 5)) "Buzz"))
