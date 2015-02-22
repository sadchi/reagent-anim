(ns reagent-anim.core
  (:require [reagent.core :as r]))


(def class (r/atom "cl1"))

(defn swap-class [a-value]
  (reset! a-value (condp = @a-value
                    "cl1" "cl2"
                    "cl2" "cl1")))

(defn elem [a-class]
  (fn []
    [:div {:class @a-class :on-click #(swap-class a-class)} "TEST STRING test string"]))

(r/render-component [elem class] (.getElementById js/document "test"))