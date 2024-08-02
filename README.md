# Mikroservisna Aplikacija Za Konverziju Mernih Jedinica

Ova aplikacija je primer mikroservisne arhitekture koja se sastoji od sledećih servisa:

1. **Eureka Server** - Servis za registraciju i otkrivanje drugih servisa.
2. **Gateway** - Servis koji služi kao ulazna tačka za sve API zahteve i preusmerava ih ka odgovarajućim mikroservisima.
3. **Prefix Information System** - Mikroservis koji pruža informacije o prefiksima (naziv, simbol, decimalni ekvivalent i razmeru).
4. **Measurement Service** - Mikroservis koji koristi informacije iz "Prefix Information System" servisa za vršenje konverzije između različitih mernih jedinica.

## Pokretanje Aplikacije

1. **Pokrenuti Eureka Server:** Pokrenite aplikaciju Eureka Server kako bi omogućili registraciju drugih servisa.
2. **Pokrenuti Gateway:** Pokrenite Gateway servis koji će hendlovati sve ulazne API zahteve.
3. **Pokrenuti Prefix Information System:** Pokrenite ovaj mikroservis za pružanje informacija o prefiksima.
4. **Pokrenuti Measurement Service:** Pokrenite ovaj mikroservis za konverziju mernih jedinica i generisanje krajnjeg rezultata.
