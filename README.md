# Continous Delivery Android README

## Fragen:
### Was ist notwendig zur Build-Automatisierung?
1. Android Build Tools: Die neuesten Versionen der Android Build Tools sollten installiert sein. Die Android Build Tools umfassen wichtige Command-Line-Programme.
2. Build System: Ein Build-System sollte verwendet werdedn, um den Build Prozess zu automatisieren. Ein Beispiel dafür ist Gradle.
3. Build-Skripte: Build-Skripte definieren den Build-Prozess. In Gradle-Projekten sind das die Dateinen build.gradle im Projektverzeichnis.
4. Continuous Integration Tools: Man sollte CI-Tools wie Jenkins oder GitLabCI verwenden, um Builds automatisch bei Code-Änderungen durchzuführen. Diese Tools können mit dem Repository verbunden werden und lösen dann automatisch den Build-Prozess aus.
5. Version Control System: Ein VCS übernimmt die Quellcodeverwaltung. Das CI-Tool kann mit dem VCS verbunden werden, um den Build automatisch auszulösen.
6. Abhängigkeitsmanagement: Maven oder Gradle können dazu verwendet werden, Abhängigkeiten zu verwalten. Das ist nötig, um alle benötigten Bibliotheken korrekt herunterzuladen.

### Welchen Vorteil liefert Testautomatisierung in CI/CD-Pipelines?
1. Entwickler erhalten sofortiges Feedback zur Qualität ihres Codes. Somit können Fehler frühzeitig erkannt und behoben werden.
2. Automatische Tests werden bei jeder Code-Änderung ausgeführt und stellen sicher, dass neue Funktionen keine vorhandenen Funktionalitäten beeinträchtigen. Dies trägt zu einer guten Umsetzung der Contiuous Integration bei.
3. Automatisierte Tests können Unit-Tests, Integration-Tests und UI-Tests beinhalten und führen zu einer umfassenden Testabdeckung.
4. Automatische Tests bieten eine Rückverfolgbarkeit von Codeänderungen zu Testergebnissen. Somit kann man schnell feststellen, welche Änderungen zu Fehlern geführt haben.
5. Automatische Tests reduzieren den Zeitaufwand für manuelle Tests und führen somit zu Kosteneinsparungen.

### Wozu dient Containerization in der Entwicklung und in CI/CD-Pipelines?
1. Container sind leichtgewichtige, portable Einheiten, die alle Abhängigkeiten und Konfigurationen für eine Anwendung enthalten. Sie gewährleisten, dass die Anwendung in verschiedenen Umgebungen konsistent ausgeführt werden kann.
2. Container ermöglichen eine konsistente Entwicklungsumgebung für Entwickler. Somit werden Probleme vermieden, die aufgrund von den unterschiedlichen lokalen Umgebungen der Entwickler entstehen.
3. Container sind eine isolierte Ausführungsumgebung für Anwendungen. Das minimiert Konflikte zwischen verschiedenen Anwendungen. Außerdem werden durch die Isolation Sicherheitsprobleme vermieden.
4. Container teilen den Kernel des Hostbetriebssystems, was zu einer effizienten Nutzung von Ressourcen führt.
5. Container sind leicht zu skalieren, sowohl horizontal als auch vertikal. Dies bedeutet, dass Entwickler und CI/CD-Pipelines problemlos mehr Instanzen von Containern erstellen können, um die Anforderungen an die Entwicklung und den Bereitstellungsprozess zu erfüllen.

### Wie kann Inversion of Control (IoC) dabei unterstützen?
IoC ist ein Entwurfsmuster, bei dem die Kontrolle üer bestimmte Aufgaben von der eigenen Klasse an ein externes Framework übergeben wird. Beispielsweise kann Funktionalität dann durch Dependency Injection in der eigenen Klasse eingefügt werden. Somit wird die Modularität, Testbarkeit und Flexibilität des Codes verbessert. Beispiele für IoC-Frameworks für Android sind Dagger (Dependency Injection Bibliothek von Google, die Annotations verwendet) oder Koin (Dependency Injection Bibliothek, die Kotlin-basiert ist).

### Welche Schritte in einer CI/CD-Pipeline müssen beachtet werden?

### Wie sieht eine Delivery/Deployment-Strategie aus?

### Was muss eigentlich "ausgeliefert" werden?

### Welche Umgebung ist notwendig zum Ausführen bzw. zur Bereistellung des jeweiligen Themas?

## Secrets

## Anti-patterns
- Hartkodieren von Passwörtern/Schlüssel
- Unversionierte Dependendies

## Vorgehen bei der Aufgabe:
- Arbeitsaufteilung (Android Präsentationsbeispiel, Secrets, Pipeline, Fragen beantwortung, etc)
- Startschuss
- Präsentationserstellung
- Präsentieren (05.12.23 13:40/16:10)
