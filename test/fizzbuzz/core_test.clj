(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest generate-test
  (is (= "Fizz" (generate 3))))
