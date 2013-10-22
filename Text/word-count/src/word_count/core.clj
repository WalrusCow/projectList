(ns word-count.core
  (:gen-class))

(defn whitespace? [s]
  ((set " \n\t\r") s))

(defn word-count [s]
  (loop [whitespace true s s c 1]
    (if (empty? s)
      (if whitespace (dec c) c)
      (if (whitespace? (first s))
        (recur true (rest s) (if whitespace c (inc c)))
        (recur false (rest s) c)))))

(defn -main [s & args]
  (println (word-count s)))
