(ns reagent-anim.core
  (:require [reagent.core :as r]))


(def class (r/atom "cl1"))
(def temp (r/atom "Just a text blblblblbllblbb"))

(defn swap-class [a-value]
  (reset! a-value (condp = @a-value
                    "cl1" "cl2"
                    "cl2" "cl1")))

(defn sub-elem [a-val]
  (fn []
    (.log js/console "sub rendered")
    [:div @a-val]))

(defn elem [a-class]
  (fn []
    [:div {:class @a-class :on-click #(swap-class a-class)} [sub-elem temp]]))

(r/render-component [elem class] (.getElementById js/document "test"))