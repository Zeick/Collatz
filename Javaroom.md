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
```

poistetaan.

## X11-IKKUNA
DISPLAY-ympäristömuuttujaan on asetettava XQuartz-ohjelman sijainti, joka on hakemistossa
```
/private/tmp/com.apple.launchd.(JOKIN KOODI)/org.macosforge.xquartz:0
```
Jos ei toimi, asennetta XQuartz suoraan [tekijän kotisivulta](https://www.xquartz.org/).

TÄMÄ ON TOIMENPIDE  SUORITETTU ja se voidaan kirjata edistymisraporttiin. 

## CARRIAGE RETURN
NetBeans ei tulosta vieläkään Carriage returnia `\r` oikein. Googletuksella huomaa, että sama ongelma on ollut raportoituna jo vuonna 2013, eikä bugia ole vieläkään saatu korjattua. Uskomatonta. :rage:

Onneksi NetBeans on vain testausympäristö, ja komentorivillä asia toimii niin kuin pitääkin. Kun huomasin, että yksinkertaisinkaan testi-carriage-return-ohjelma ei toimi niin kuin pitää, epäilykseni heräsi. Kun jatkossa testataan Collatz-ohjelman kohtaa (3) eli reaaliaikaispäivitystä, tulee testaus suorittaa komentoriviltä. Työskentelyhakemistoksi valitaan `Primus` ja sitten kirjoitetaan
```
mvn package
java -jar target/Primus-1.0-SNAPSHOT.jar
```
Jar-tiedoston nimi saattaa olla myös jokin muu. Tärkeintä on, että tiedostonimessä ei ole sanaa `original`.

## LONG JA INT
`Long`-tyyppinen muuttuja voi sisältää luvun, jonka itseisarvo on korkeintaan `2^(31)-1`, kun taas `int`-tyypillä rajoitus on `2^(16)-1`. Koska haluamme Collatz-ohjelmamme käsittelevän myös suuria lukuja, käytämme `long`-tyyppistä muuttujaa.
