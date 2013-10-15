(ns fib-gen.core
  (:gen-class))

; Lazily generate infinite fibonacci sequence
; iterate does x, (f x), (f (f x)) etc...
; map first takes always the most recent item from each
; We start with seeds (0, 1)
(def fib (map first (iterate (fn [[x y]] [y (+ x y)]) [0 1])))

(defn -main [& args] (println (take (read-string (first args)) fib)))
