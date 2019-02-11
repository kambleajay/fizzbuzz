(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]))

(def multiples-of-3 (->> gen/int
                         (gen/fmap #(* % 3))
                         (gen/such-that #(not= % 0))))

(defspec generate-multiples-of-3-test
  (prop/for-all [n multiples-of-3]
                (= (generate n) "Fizz")))
