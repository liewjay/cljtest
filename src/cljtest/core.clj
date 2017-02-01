(ns cljtest.core)

(time
  (->>
    (range 1 101)
    (map #(* % %))
    (reduce +)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
