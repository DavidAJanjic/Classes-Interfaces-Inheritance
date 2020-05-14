**SERBIAN**

Opis koda:
Zadatak demonstrira rad sa klasama i interfejsima kao i nasledjivanje

Napisati Java konzolnu aplikaciju sa sledećim klasama i interfejsima:
- Tačka (klasa) – karakterišu je x i y koordinate, kao i metoda rastojanje do druge tačke
- Površ (klasa) – karakteriše je centar (tipa Tačka)
- Krug (klasa) – površ koja dodatno ima polje poluprečnik (r)
- Pravougaonik (klasa) – površ koja dodatno ima polja širina i visina (a i b)
- Kvadrat (klasa) – površ koja dodatno ima polje stranica (a)
- Obim (interfejs) – poseduje jednu metodu koja vraća obim
- Površina (interfejs) – poseduje jednu metodu koja vraća površinu
- Opisivanje (interfejs) – poseduje metodu opiši, koja vraća objekat tipa Opisivanje koji
predstavlja objekat koji opisuje taj objekat koji je pozvao metod (npr. ako pozove objekat
klase Krug, vratiće objekat klase Kvadrat koji ga opisuje, dok će objekat klase Kvadrat
vratiti objekat klase Krug itd.)
Testirati rad kreiranih klasa i interfejsa u posebnoj klasi sa main metodom.
Dodatno, za vežbu , primetiti da je kvadrat specijalan oblik pravougaonika (pravougaonik
kod koga su jednake stranice). Prilagoditi tome strukturu klasa. Razmisliti o implementaciji
klase Tačka kao statičke unutrašnje klase.

**ENGLISH**

Code Description
Assignment mainly demonstarates work with classes and interfaces as well as inheritance.

Write Java console application with these classes and interfaces:
- Dot (Class) - characterized by X and Y coordinates, as well as function -distance from another dot-
- Surface(Class) - characterized by center(type of Dot)
- Circle (Class) - surface which also posseses another field -half diameter-(r)
- Rectangle(Class) - surface which posseses additional fields of -width- and -length-(A and B)
- Square(Class) - Surface which additionaly posseses field -side-(a)
- Circumference(Interface) - possesses one method which returns circumference of an object.
- Surface(Interface) - posesses one method which returns surface of object
- Circumscription(Interface) - posseses method -circumscript- that returns the object of the type Circumscription which 
describes the object that surrounds the object that called the method
(e.g. if the Objectof the class Circle calls the method
it will return the object of the class Square which surrounds it,
while the object of class Square will return object of class Circle, etc.).

Test the work of created classes and interfaces in separate class with main method.
Additionaly, for practice, notice that the Square is a special type of Rectangle(Rectangle with equal width and length).
Adjust the structure of classes to the fact. Think about implementation of Dot class as static inner class.
