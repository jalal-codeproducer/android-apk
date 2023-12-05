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
1. **Quellcode-Verwaltung**
   - Einsatz von Versionskontrollsystemen wie Git.
   - Regelmäßiges Einchecken von Code, Ressourcen und Konfigurationen.

2. **Automatisiertes Bauen (Build)**
   - Verwendung von **Gradle Build-Skripten**.
   - Sorgfältiges **Abhängigkeitsmanagement**.

3. **Automatisiertes Testen**
   - Durchführung von **Unit-Tests** mit dem Android JUnit Framework.
   - Ausführung von **Integrationstests**.
   - Einsatz von Frameworks wie **Espresso** für UI-Tests.

4. **Continuous Integration**
   - Automatische Integration von Änderungen in den Hauptentwicklungszweig.
   - Anwendung von **statischer Codeanalyse** mit Tools wie Lint.

5. **Continuous Delivery (CD)**
   - **Automatisiertes Deployment** auf Testgeräte oder Emulatoren.
   - Durchführung von **Alpha/Beta Rollouts** über den Google Play Store.

6. **Release Management**
   - Automatische **Versionierung und Tagging** des Quellcodes.
   - **Produktionsrollout** auf den Google Play Store.

7. **Monitoring und Reporting**
   - Überwachung der **App-Leistung** in der Produktion.
   - Erfassung von **Nutzungsstatistiken**.
   - Analyse von **Crash-Berichten**.

8. **Feedback und Optimierung**
   - Integration von **Nutzerfeedback** in den Entwicklungsprozess.
   - Stetige **Prozessverbesserungen**.
### Wie sieht eine Delivery/Deployment-Strategie aus?
Das Ziel von continuous delivery ist es durch einen standardisierten automatisierten prozess, zu jeder zeit, code zu haben der gebundled,verteilt und getestet werden kann. Continuous deployment erweitert diese Konzept und zielt darauf ab den code der user base just-in-time zur Verfügung zu stellen. Dies ist im Kontext von Mobile Apps nicht möglich, da diese abhängig von third-party app stores sind. 
1. **Regelmäßige Bereitstellung von Test-Builds**
   - Wöchentlich,Täglich oder per-integration
   - Dogfooding(test-builds an benutzer verteilen die die app kennen, z.B.: Mitarbeiter und wie geplant verwenden )
2. **Möglichst viel Automatisieren**
    - Mit z.B.: fastlane
    - automatisierte builds
    - automatisiertes signing von binaries
    - automatisierte tests
    - automatisiertes deployment zu test usern
    - automatisiertes build submitting zu Google Play store
3. **Stabilität und Performance tests**
    - Stability und Performance tests der Test-User erlauben das festlegen einer baseline ab welcher ein build/release successful ist
    - Testing checklisten
    - Feedback in Aktionen umwandeln
    - Monitoring des releases über Google Play console umd App-Peformance und Nutzerbewertungen zu anaylsieren

4. **Konsistenz**
    - Inkrementelle builds sollen nahtlos und kontinuierlich in die Hände der Tester kommen. 
    - Änderungen am CD prozess sind genau abzuwägen da dieser konsistent bleiben sollte um zuverlässig und robust zu sein.


### Was muss eigentlich "ausgeliefert" werden?
1. **Zweck**
   - Interne Validierung, Funktionsüberprüfung und Fehlerfindung.

2. **Inhalt**
   - Debug-Informationen und Log-Daten.
   - Möglicherweise unvollständige oder experimentelle Features.
   - Tools für Leistungs- und Fehlerüberwachung.

3. **Versionsmanagement**
   - Spezielle Versionsnummern oder Tags zur Unterscheidung von Produktionsbuilds.
   - Häufige Updates, manchmal täglich.

4. **Verteilung**
   - Über interne Kanäle wie E-Mail, firmeninterne Server oder Dienste wie Firebase App Distribution.
   
5. **Sicherheit und Datenschutz**
   - Schutz sensibler Daten, besonders bei Einbeziehung externer Tester.
   - Einhaltung interner Datenschutzrichtlinien.

### Welche Umgebung ist notwendig zum Ausführen bzw. zur Bereistellung des jeweiligen Themas?
1. **Entwicklungsumgebung**
   - **Android Studio**: Offizielle IDE für Android-Entwicklung.

2. **Testing und Emulation**
   - **Android Emulator**: Ein Bestandteil von Android Studio zur Simulation verschiedener Geräte und Android-Versionen.
   - **Physische Android-Geräte**: Für umfassendere Tests.

3. **Versionskontrolle**
   - **Git oder Ähnliches**: Zur Verwaltung von Codeänderungen, besonders in Teamumgebungen.

4. **Build-Automatisierung und Continuous Integration**
   - **Gradle**: Das offizielle Build-Automatisierungssystem für Android.
   - **CI/CD-Tools**: Wie Jenkins, CircleCI oder Travis CI zur Automatisierung von Builds und Tests.

5. **Play Store Veröffentlichung**
   - **Google Play Console**: Für die Veröffentlichung und Verwaltung von Apps im Google Play Store.

6. **Backend-Services (falls benötigt)**
   - **Server**: Für Funktionen wie Datenbankmanagement, Authentifizierung und Push-Benachrichtigungen.
   - **Cloud-Dienste**: Wie Firebase oder AWS für verschiedene Backend-Funktionen.

7. **Sicherheit und Compliance**
   - **SSL-Zertifikate**: Für sichere Datenübertragungen.
   - **Datenschutzrichtlinien und Compliance-Tools**: Zur Einhaltung von Datenschutzgesetzen.
     
## Secrets
GitHub Actions ermöglicht die Nutzung von Secrets, also variablen Werten, in Organisationen, Repositories und Umgebungen. Diese Geheimnisse können in Workflows eingebunden werden, wo der Zugriff durch spezifizierte Richtlinien kontrolliert wird. Praktisch ist die Möglichkeit, uaf Organisationsebene-Geheimnisse zu teilen und so Duplikate zu vermeiden.

Folgender Command ist verwendet worden für das generieren vom Key:
openssl base64 < some_signing_key.jks | tr -d '\n' | tee some_signing_key.jks.base64.txt

Dieser key wird im repo als Key eingetragen

## Anti-patterns
- Hartkodieren von Passwörtern/Schlüssel
- Unversionierte Dependendies

## Vorgehen bei der Aufgabe:
- Arbeitsaufteilung (Android Präsentationsbeispiel, Secrets, Pipeline, Fragen beantwortung, etc)
- Startschuss
- Präsentationserstellung
- Präsentieren (05.12.23 13:40/16:10)
