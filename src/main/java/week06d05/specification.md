### Junior/Mid level csoport mai gyakorlati feladata:

Készíts a `week06d05` csomagban egy `Biscuit` nevű osztályt, amelynek van 2 attribútuma: `BiscuitType type` és `int gramAmount`. A `BiscuitType` legyen felsorolásos típus a 3 kedvenc kekszfajtáddal. A `Biscuit` nevű osztálynak legyen egy `static` metódusa `of` néven, mely paraméterként egy `BiscuitType`-ot, és egy `int gramAmount`-ot vár és visszaad egy új `Biscuit` objektumot amelyet a megadott paraméterek alapján hoz létre.

__Bónusz feladat:__ konzolra írás esetén a Biscuit jelenítse meg a type és a gramAmount mezőket!

### Senior level csoport mai gyakorlati feladata:

Készíts a `week06d05` csomagban egy `Bottle` nevű osztályt, amelynek van 2 attribútuma: `BottleType type` és `int filledUntil`. A `BottleType` legyen felsorolásos típus az alábbi értékekkel: `GLASS_BOTTLE` és `PET_BOTTLE`, . A `Bottle` nevű osztálynak legyen egy `static` metódusa `of` néven, mely paraméterként egy `BottleType`-ot vár és visszaad egy új `Bottle` objektumot amelyet a megadott paraméter alapján hoz létre. A `Bottle` osztálynak legyen egy `fill` metódusa, mely egy `int fillAmount` paramétert vár. A `fill` meghívása esetén végezzen ellenőrzést, hogy megtelt-e már a `Bottle` objektum. Az ehhez szükséges `int maximumAmount` mezőt a `BottleType` tartalmazza! Ha túlcsordulna a `Bottle` objektum, akkor dobjunk kivételt!
