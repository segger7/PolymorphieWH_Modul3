# Lerntagebuch Modul 3

### Modul 3 (26.09.2024)

Dieses Programm sollte die Funktionalität einer Medienbibliothek erfüllen.
Dazu gibt es die Medien, Film und EBook die ihre eigenen Eigenschaften und Informationen, in Form
von Datenfeldern besitzen. Diese erben einige Grundfunktionalitäten von der abstrakten Klasse
Medium. Die Medien haben eine toString Methode, die alle Informationen ausgibt, und einen
Konstruktor der für alle Eigenschaften Parameter besitzt.

Die Klasse Medienbibliothek ist dazu alle Medien in einer Liste zu speichern und
dann auf die Kommandozeile auszugeben. Dazu hat sie ein privates Datenfeld vom
Typ List<Medium>. Es gibt zwei Konstruktoren, einen parameterlosen und einen mit einem Parameter.
Beim ersten wird eine neue leere Liste erstellt und beim zweiten kann man eine bereits existierende
Liste mitgeben.

Die Klasse hat auch noch zwei Methoden die dazu zuständig sind die Listeneinträge auf der Kommandozeile
auszugeben. Die erste Methode gibt alle Einträge aus der Liste, formatiert
durch die toString der einzelnen Medien, aus. Die zweite Methode hat einen String Parameter namens
Titel. Die Methode sucht alle Einträge nach einem Medium mit diesem Titel und gibt das dann vollständig
auf der Kommandozeile aus.