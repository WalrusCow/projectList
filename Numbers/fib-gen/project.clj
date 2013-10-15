(defproject fib-gen "0.1.0-SNAPSHOT"
  :description "Generate N fibonacci numbers"
  :url "https://github.com/WalrusCow/projectList"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main fib-gen.core
  :profiles {:uberjar {:aot :all}})
