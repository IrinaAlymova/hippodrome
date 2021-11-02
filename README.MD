# Hippodrome Game

Hippodrome Game is a console game for betting on horses. You launch program for three horses, one of them will randomly win.

Made as a homework for Java Course, showcases the use of Java standard compiler and archiver, including the use of external libraries.

## Environment variables
In order for this Java program to work properly, make sure variable PATH contains a path to JDK on your computer. Download JDK [here](https://www.oracle.com/java/technologies/downloads/) if you don't have it yet.

## Launch in command line

1. Download this repository to your computer.
2. Open the command line tool on your computer and go to /game package in this repository.
3. Use Java Compiler that is included in a standard JDK to compile classes.
```bash
javac Hippodrome.java
```
4. Launch compiled main class using JVM passing 3 horse names as arguments:
```bash
java Hippodrome Sivka Burka Kaurka
```
5. Don't forget to bet before launch!

## Archivation in executable .jar file

1. Make steps #1 - #3 from the instruction above.
2. Using standard Java archiver archive a compiled class.
```bash
jar cvf program.jar .
```
7. There will be a new .jar file in the same folder - it is executable and can be launched without commnd line.