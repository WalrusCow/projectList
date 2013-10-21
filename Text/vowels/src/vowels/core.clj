(ns vowels.core
  (:gen-class))

; Count the number of vowels in a string
(defn numVowels [s]
  (count (filter #((set "aeiou") %) (seq s))))

; Count the number of each vowels in a string
(defn countEachVowel [s]
  (let [vc (apply conj (map #(hash-map % 0) "aeiou"))]
    (reduce (fn [m c] (update-in m [c] inc)) vc (filter #(not (nil? (vc %))) s))))

(defn -main
  [s & args]
  (println "Number of vowels :" (numVowels s) "\nBreakdown :" (countEachVowel s)))
