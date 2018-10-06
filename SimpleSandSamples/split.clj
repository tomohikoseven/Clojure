(def src "ABC DEF GHI JKL")
(def dst (clojure.string/split src #" "))
(println (second dst))
