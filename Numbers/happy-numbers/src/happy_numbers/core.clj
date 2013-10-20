(ns happy-numbers.core
  (:gen-class))

; Return a sequence of the digits of a number
(defn digits [x]
  (loop [digits '() x x]
    (if (zero? x) digits
      (recur (conj digits (mod x 10)) (quot x 10)))))

; Determine if a number is happy
(defn happy? [n]
  (loop [visited #{} n n]
    (if (= n 1) true
      (if (visited n) false
        (recur (conj visited n) (reduce + (map #(* % %) (digits n))))))))

(defn -main
  [n & args]
  (println (happy? (read-string n))))
