(defproject GEverding/cljs-log "0.1.0-SNAPSHOT"
  :description "Nice and easy logging for ClojureScript."
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2411"]
                 [org.clojure/google-closure-library "0.0-20140226-71326067"]]
  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]
  :hooks [leiningen.cljsbuild]
  :clojurescript? true
  :cljsbuild {:builds [{:source-paths ["src"],
                        :compiler {:output-to "out/cljs-log.js"
                                   :output-dir "out"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
