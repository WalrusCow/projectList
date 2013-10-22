(ns reverse.core
  (:gen-class))

; Not the best way, but an interesting way
(defn str-reverse1 [s]
  (apply str (apply conj '() s)))

; A better way
(defn str-reverse [s] (apply str (reverse s)))

(defn -main [s & args] (println (str-reverse1 s)) (println (str-reverse s)))
