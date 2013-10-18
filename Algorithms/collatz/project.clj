(defproject collatz "0.1.0-SNAPSHOT"
  :description "Count Collatz iterations"
  :url "https://github.com/WalrusCow/projectList"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main collatz.core
  :profiles {:uberjar {:aot :all}})
