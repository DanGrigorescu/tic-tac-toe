# tic-tac-toe
Acest proiect implementează un joc clasic Tic-Tac-Toe (X și O) care poate fi jucat online. Jocul suportă doi jucători care se pot conecta și juca în timp real.

Tehnologii Utilizate
-Java
-Spring Boot
-WebSockets pentru comunicația în timp real
-Maven pentru gestionarea dependențelor
-HTML/CSS/JavaScript pentru interfața cu utilizatorul

Instalare și Configurar
Pentru a rula proiectul local, urmează pașii următori:
1.Clonează repositoriul: git clone [URL_REPOZITORIU]
2.Navighează în directorul proiectului: cd tic-tac-toe-master
3.Rulează proiectul folosind Maven: ./mvnw spring-boot:run

Cum să Rulezi Aplicația
-După ce ai urmat pașii de instalare, deschide un browser și navighează la http://localhost:8080 pentru a accesa jocul.

Structura Proiectului
src/main/java: Conține codul sursă Java al aplicației.
com/javamaster/controller: Controlerele care gestionează cererile HTTP.
com/javamaster/model: Clasele model pentru joc și jucători.
com/javamaster/service: Serviciile care conțin logica de business.
src/main/resources: Resursele aplicației, inclusiv șabloanele HTML și fișierele de configurare.
src/test: Conține testele unitare pentru aplicație.

