(defproject
  reagent-anim "0.1.0-SNAPSHOT"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2760"]
                 [reagent "0.4.3"]]


  :plugins [[lein-cljsbuild "1.0.4"]]


  :cljsbuild {:builds
              {:test
               {:source-paths ["src"]
                :compiler     {:preamble      ["reagent/react.js"]
                               :output-to     "target/test.js"
                               :output-dir    "target/out"
                               :source-map    "target/out.js.map"
                               :optimizations :advanced}}}})
