(ns collatz.core)

(defn countCollatz [x]
  (loop [x x n 0]
    (if (= x 1) n
      (if (zero? (mod x 2))
        (recur (/ x 2) (inc n))
        (recur (inc (* x 3)) (inc n))))))

(defn -main [x & args] (println (countCollatz (read-string x))))
;(defn -main [& args] (println (countCollatz (read-string (first args)))))
