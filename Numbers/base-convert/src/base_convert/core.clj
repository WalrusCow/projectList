(ns base-convert.core
  (:gen-class))

; Do non-negative integer exponents
(defn expt [base pow]
  (loop [ans 1 p pow]
    (if (zero? p) ans
      (recur (* ans base) (dec p)))))

; Convert a string to a list of integers (string should be all integers)
(defn strToIntLst [s] (map #(- (int %) (int \0)) s))

(defn baseConverter [x base]
  (loop [x x s '()]
    (if (zero? x) (apply str s)
      (recur (quot x base) (conj s (mod x base))))))

(defn baseToDec [x base]
  (loop [s (reverse (strToIntLst x)) ans 0 i 0]
    (if (empty? s) ans
      (recur (rest s) (+ ans (* (first s) (expt base i))) (inc i)))))

(defn -main
  [n base & args]
  (let [conv (baseConverter (read-string n) (read-string base))]
    (do ; Convert it and then convert it back to prove we can
      (println conv)
      (println (baseToDec conv (read-string base))))))
