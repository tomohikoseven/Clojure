( def f (fn [x y] (* x y) ) )
( println ( f 3 5 ) )

(def F #(* %1 %2) )
(println (F 3 5) )
