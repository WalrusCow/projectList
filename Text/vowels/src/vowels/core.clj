(ns vowels.core
  (:gen-class))

; Check if it's a vowel
(defn vowel? [c] ((set "aeiou") c))

; Count the number of vowels in a string
(defn numVowels [s] (count (filter vowel? s)))

; Count the number of each vowel in a string
(defn countEachVowel [s]
  (reduce
    #(update-in %1 [%2] inc)
    (apply conj (map #(hash-map % 0) "aeiou"))
    (filter vowel? s)))

(defn -main [s & args]
  (println
    "Number of vowels :" (numVowels s)
    "\nBreakdown :" (countEachVowel s)))
