# Collatz-projekti
Projektin tavoitteena on tehdä kokeellinen Java-ohjelma [Collatzin konjektuurin](http://en.wikipedia.org/wiki/Collatz_conjecture) visualisoimiseen ja testaamiseen pienillä luvuilla.

## Konjektuuri
Jos luku on parillinen, jaetaan se kahdella. Jos se on pariton, se kerrotaan kolmella ja lisätään siihen yksi:

![](https://wikimedia.org/api/rest_v1/media/math/render/svg/7cd0f82453ee3d32d73d41e5ebe43079369ba9d6)

Tämän jälkeen operaatiota toistetaan, kunnes saavutaan lukuun 1. Collatzin konjektuurin mukaan tämä prosessi johtaa aina lukuun 1, riippumatta siitä mikä positiivinen kokonaisluku valitaan aloitusarvoksi.

## Ohjelmointisuunnitelma
Ohjelmointikielenä toimii Java ja piirto-ohjelmana Gnujavaplot.

### Versio 1.0
Ohjelma kysyy käyttäjältä positiivisen kokonaisluvun. Jos luku on positiivinen kokonaisluku, iteroidaan ja kerrotaan kuinka monta iteraatiokertaa kului ennen kuin saavuttiin lukuun 1.

Esimerkki ohjelman toiminnasta:

```
Syötä positiivinen kokonaisluku: 27
111 iteraatiota
```
### Versio 1.1
Ohjelma tulostaa jokaisessa iteraatiossa myös välivaiheen.

Esimerkki ohjelman toiminnasta:
```
Syötä positiivinen kokonaisluku: 27
27, 82, 41, 124, 62, 31, 94, 47, 142, 71, 214, 107, 322, 161, 484, 242, 121, 364, 182, 91, 274, 137, 412, 206, 103, 310, 155, 466, 233, 700, 350, 175, 526, 263, 790, 395, 1186, 593, 1780, 890, 445, 1336, 668, 334, 167, 502, 251, 754, 377, 1132, 566, 283, 850, 425, 1276, 638, 319, 958, 479, 1438, 719, 2158, 1079, 3238, 1619, 4858, 2429, 7288, 3644, 1822, 911, 2734, 1367, 4102, 2051, 6154, 3077, 9232, 4616, 2308, 1154, 577, 1732, 866, 433, 1300, 650, 325, 976, 488, 244, 122, 61, 184, 92, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1

111 iteraatiota
```
### Versio 1.2
Ohjelma antaa kolme vaihtoehtoa käyttäjälle. Ensimmäinen vaihtoehto tulostaa vain iteraatioiden määrän, toinen kaikki iteraatiot ja kolmas kelaa taaksepäin (rewind) iteraatiotulostetta jokaisessa vaiheessa.
Esimerkki ohjelman toiminnasta:
```
(1) Tulosta iteraatioiden määrä
(2) Tulosta kaikki iteraatiot
(3) Tulosta iteraatio reaaliajassa
? 1
Syötä positiivinen kokonaisluku: 27
111 iteraatiota
```
### Versio 2.0
Ohjelmassa annetaan neljäs vaihtoehto: piirtää ja tallentaa visualisointi iteroinnista, missä x-akselilla on iterointivaihe (eli suoritusaika) ja y-akselilla lukujonon arvo iterointivaiheessa.
![](https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Collatz5.svg/800px-Collatz5.svg.png)

Lopullisen kuvan ei tarvitse olla täsmälleen saman näköinen. Se on tässä havainnolistamista varten. Helpoin tapa tulostaa tämä lienee [Gnujavaplotilla](http://javaplot.panayotis.com/).
