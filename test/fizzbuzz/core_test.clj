(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]))

(defn multiples-of-n [n]
  (->> gen/int
       (gen/fmap #(* % n))
       (gen/such-that #(not= % 0))))

(defspec generate-multiples-of-3-test
  (prop/for-all [n (multiples-of-n 3)]
                (= (generate n) "Fizz")))

(defspec generate-multiples-of-5-test
         (prop/for-all [n (multiples-of-n 5)]
                       (= (generate n) "Buzz")))

(defspec generate-multiples-of-3-and-5-test
         (prop/for-all [n (multiples-of-n 15)]
                       (= (generate n) "FizzBuzz")))
