(defproject palindrome "0.1.0-SNAPSHOT"
  :description "Determine if a string is a palindrome"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main palindrome.core
  :profiles {:uberjar {:aot :all}})
