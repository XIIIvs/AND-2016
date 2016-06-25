# AND-2016
Projekt na zajęcia z android'a

# DND SpellCaster

Aplikacja ma za zadanie w uporządkowany sposób przechowywać informacje o czarach dla wszystkich klas "magicznyc" w grze fabularnej Dungeons and Dragons.

Składa się z czterech ekranów.

## ekran powitalny:
Pierwszy powitalny służy do wyboru rodzaju pracy aplikacji.
Z jego poziomu można wybrać:

######"LISTA" -> skutkuje tym że wyświetlona zostanie cała nasza baza danych

######"DODAJ WIELE" -> uzupełni bazę danych o 10 podstawowych zaklęć

######"PULA" -> służy do określenia jakie czary przygotowała postać którą odgrywamy

## ekran listy:
Na tym ekranie operujemy całą bazą danych. Wyświetlana jest jej zawartość oraz również z poziomu tego ekranu można dodać nowe zaklęcie do bazy.
Wciskając konkretną pozycję na liście, wyświetla się szczegółowy opis danego zaklęcia.

######"(+)" -> dodanie zaklęcia do bazy

## ekran szczegółów:
Na tym ekranie wyświetlane są wszystkie informacje dotyczące wybranego zaklęcia.
Nazwa, ikona poglądowa, poziom zaklęcia, krótki opis, statystyki oraz czas rzucania zaklęcia.
Jest tam również liczba która przypisana jest do każdego obrazka zawartego w aplikacji.
Obrazków jest 10 zatem każda inna liczba będzie odpowiednio sprowadzana do reszty z dzielenia przez 10.

## ekran dodawania do bazy:
Uzupełniamy tam wszystkie informacje po czym zatwierdzamy dodanie do bazy danych.

## ekran puli:
Ekran ten jest dosyć uproszczoną interpretacją zasad DnD. Mechanika dotycząca zaklęć w tej grze wykląda w skrócie tak, że mamy limit zaklęć jaki możemy rzucić w ciągu dnia w grze. W mojej aplikacji przyjmuję że jest to liczba 9.
Te zaklęcia najpierw wybieramy z pośród tych dostępnych w bazie.
Bo wybraniu 9 (mogą się powtarzać) wyświetla się nam pula jaką możemy wykorzystać w tym konkretnym dniu. 
Przyciski pod ikonamy służą do wyświetlenia szczegółów danego zaklęcia.

