package com.example.xiiivs.dndspellcaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AddMoreSpells extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_more_spells);
        Spell s01 = new Spell(
                "Leczenie lekkich ran",
                "Nasycasz istotę pozytywną energią lecząc ją w ten sposób.",
                "1",
                "1k8 +1/poziom (max +5)",
                "Tura Standardowa",
                "1");
        Spell s02 = new Spell(
                "Leczenie poważnych ran",
                "Nasycasz istotę pozytywną energią lecząc ją w ten sposób.",
                "3",
                "3k8 +1/poziom (max +15)",
                "Tura Standardowa",
                "2");
        Spell s03 = new Spell(
                "Latanie",
                "Istota zaczarowana potrafi latać.\nJeżeli czar dobiegnie końca gdy istota będzie w powietrzu, czar rozprasza się powoli sprawiając że istota będzie powoli opadać na ziemię.",
                "3",
                "1min/poziom",
                "Tura Standardowa",
                "3");
        Spell s04 = new Spell(
                "Kula ognista",
                "Zaklęcie powoduje wybuch płomieni, któremu towarzyszy niski huk.",
                "3",
                "1k6/poziom (max 10k6) od ognia",
                "Tura Standardowa",
                "4");
        Spell s05 = new Spell(
                "Błyskawica",
                "Uwalniasz potężne wyładowania energii elektrycznej.\nWyładowanie podąża w lini prostej od rzucającego na odległość 36m.",
                "3",
                "1k6/poziom (max 10k6) od elektryczności",
                "Tura Standardowa",
                "5");
        Spell s06 = new Spell(
                "Magiczny pocisk",
                "Z twojego palca wystrzeliwujesz pocisk magicznej energii, który bezbłędnie trafia w cel.\nWystrzeliwujesz 1 pocisk na 1lvl,\n2 na 3lvl,\n3 na 5lvl,\n4 na 7lvl,\n5 na 9lvl.",
                "1",
                "1k4 +1/pocisk",
                "Tura Standardowa",
                "6");
        Spell s07 = new Spell(
                "Ognista strzała",
                "Zamieniasz zwykłe strzały na płomienne.\nZadają teraz dodatkowe 1k6 od ognia.",
                "3",
                "50 strzał na 10min/poziom",
                "Tura Standardowa",
                "7");
        Spell s08 = new Spell(
                "Ognista tarcza",
                "Twoje ciało otaczają płomienie zadające rany każdej istocie, która trafi Cię atakiem wręcz.\nOtrzymuje ono 1k6 +1/poziom (max +15) ran od ognia.\nDodatkowo ataki skierowane wobec Ciebie na bazie ognia i mrozu zadają Ci tylko połowę obrażeń.",
                "4",
                "1runda/poziom",
                "Tura Standardowa",
                "8");
        Spell s09 = new Spell(
                "Przyzwanie potwora",
                "Zaklęcie przywołuje istotę pozaplanarną która podlega twoim rozkazom.",
                "5",
                "1runda/poziom",
                "Tura Podwójna",
                "9");
        Spell s10 = new Spell(
                "Kamienna skóra",
                "Istota dostajeodporność na ciosym cięcia, itp.",
                "4",
                "10min/poiom, redukuje do 10 na cios, trwa do limitu 150 zablokowanych obrażeń",
                "Tura Standardowa",
                "10");

        SpellDB spellDB = new SpellDB(this);
        spellDB.addSpell(s01);
        spellDB.addSpell(s02);
        spellDB.addSpell(s03);
        spellDB.addSpell(s04);
        spellDB.addSpell(s05);
        spellDB.addSpell(s06);
        spellDB.addSpell(s07);
        spellDB.addSpell(s08);
        spellDB.addSpell(s09);
        spellDB.addSpell(s10);
        Toast.makeText(this, "Dodano 10 podstawowych zaklęć", Toast.LENGTH_SHORT).show();
        finish();
    }
}
