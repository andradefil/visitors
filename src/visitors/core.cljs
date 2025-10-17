(ns visitors.core)

(defonce counter (atom 239))

(defn render! []
  (set! (.-innerHTML (.getElementById js/document "display"))
        (str "<b style='font-family:sans-serif;font-size:54px'>"
             @counter "</b")))
(render!)
