# Hyvä paikka välittää tietoa tai toivomuksia projektin edistymisestä

## MERGE-KONFLIKTIT
Kun tulee merge-ristiriita, niin tiedostoon tulee tämän näköinen juttu:
```
<<<<< HEAD

(koodia koodia)

===========

(koodia koodia)

>>>>>> [hex-koodi]
```
Git ei tajua onko tiedostossa oltava se koodinpätkä joka on HEADin ja yhtäsuuruusmerkkiviivan välissä vai yhtäsuuruusmerkkiviivan ja hex-koodin välissä. Ohjelmoijan on itse valittava se mikä säilytetään. Vaihtoehtoinen koodinpätkä ja ylimääräiset rivit 
```
<<<<< HEAD
==========
>>>>>> [hex-koodi]

poistetaan.
