(ns combinator)

(defn I
  "Identity combinator.
  Ix = x"
  [x]
  x)

(defn K
  "Constant combinator.
  Kxy = x"
  [x]
  (fn [y] x))

(defn S
  "Substitution combinator.
  Sxyz = xz(yz)"
  [x]
  (fn [y]
    (fn [z]
      ((x z) (y z)))))
