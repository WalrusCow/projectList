(ns palindrome.core
  (:gen-class))

(defn palindrome? [s]
  (= (apply conj '() s) (apply conj [] s)))

(defn -main [s & args]
  (println (palindrome? s)))
