(ns fizzbuzz.core)

(defn divisible-by? [n & nums]
  (reduce (fn [acc result] (and acc (zero? (rem n result)))) true nums))

(defn generate [n]
  (cond
    (divisible-by? n 3 5) "FizzBuzz"
    (divisible-by? n 3) "Fizz"
    (divisible-by? n 5) "Buzz"
    :else (str n)))