( def a 3 )
( println ( cond (= a 1) "A" 
                 (= a 2) "B" 
                 (= a 3) "C" 
                 :else "D" )  )
