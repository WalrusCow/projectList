(ns base-convert.core
  (:gen-class))

(defn baseConverter [x base]
  (loop [x x s '()]
    (if (zero? x) (apply str s)
      (recur (/ (- x (mod x base)) base) (conj s (mod x base))))))


(defn -main
  "I don't do a whole lot ... yet."
  [n base]
  (println (baseConverter (read-string n) (read-string base))))
