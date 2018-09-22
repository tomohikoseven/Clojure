(defn century [year] (+ ( quot ( - year 1 ) 100 ) 1 ) )

( println ( century 1901 ) )
