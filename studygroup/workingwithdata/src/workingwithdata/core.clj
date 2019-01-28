

def star_wars-chracters
{:luke  {:fullname  "luke skywalker" :skill "targeting swamp rats"}
 :vader {:fullname  "Darth vader" :skill "crank phone calls"}
 :jarjar {:fullname "jarjar Binks" :skill "upsetting a generation of star wars fans"}}
)

(get star_wars-chracters :luke)
;;returns lukes map
(get (get stars_wars-chracters :luke) :skill)
(get-in star_wars_chracters [:luke :fullname])
(:skill (:luke star_wars-chracters));;gets luke skywalkers skill targetting
(type :skill);;gets the type of :skill hence returns keyword
(assoc-in star_wars-chracters [:vader :skill] "death grip")









(ns workingwithdata.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
