(ns word-count.core
  (:gen-class))
(use 'clojure.java.io)

(defn whitespace? [s]
  ((set " \n\t\r") s))

(defn word-count [s]
  (loop [whitespace true s s c 1]
    (if (empty? s)
      (if whitespace (dec c) c)
      (if (whitespace? (first s))
        (recur true (rest s) (if whitespace c (inc c)))
        (recur false (rest s) c)))))

(defn word-count-file [fileName]
  (with-open [rdr (reader fileName)]
    (reduce + 0 (map word-count (line-seq rdr)))))

(defn -main [s & args]
  (println (word-count-file s)))
