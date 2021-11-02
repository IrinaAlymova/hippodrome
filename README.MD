# Hippodrome Game

Hippodrome Game is a console game for betting on horses. You launch program for three horses, one of them will randomly win.

Made as a homework for Java Course, showcases the use of Java standard compiler and archiver, including the use of external libraries.

## Environment variables
In order for this Java program to work properly, make sure variable PATH contains a path to JDK on your computer. Download JDK [here](https://www.oracle.com/java/technologies/downloads/) if you don't have it yet.

## Launch in command line

1. Download this repository to your computer.
2. Open the command line tool on your computer and go to this repository, create a /target folder there.
3. Use Java Compiler that is included in a standard JDK to compile class into /target folder.
```bash
javac -d target/ src/game/Horse.java
```
4. Go to /target folder and compile second class.
```bash
javac ../src/game/Hippodrome.java -d ../target/
```
5. Launch compiled main class using JVM, passing 3 horse names as arguments:
```bash
java /game/Hippodrome Sivka Burka Kaurka
```
6. Don't forget to bet before launch!

## Archivation in executable .jar file

1. Make steps #1 - #4 from the instruction above.
2. Using standard Java archiver archive a compiled class in /target folder.
```bash
jar cvf hippodrome.jar .
```
3. There will be a new .jar file in the /target folder - it is executable.

## External libraries

1. In case external libraries should be added to the program, please add CLASSPATH to compilation and launch commands.
2. There will be a new .jar file in the /target folder - it is executable and can be used as external library:
```bash
javac -cp ".;external-library.jar" src/game/Hippodrome.java
java -cp ".;external-library.jar" src/game/Hippodrome
```