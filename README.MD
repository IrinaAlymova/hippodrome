# Hippodrome Game

Hippodrome Game is a console game for betting on horses. You launch program for three horses, one of them will randomly win.

Made as a homework for Java Course, showcases the use of Java standard compiler and archiver, including the use of external libraries.

## Launch from command line

1. Download this repository to your computer.
2. Open the command line tool on your computer and go to this repository, create a /target folder there.
```bash
mkdir target
```
3. Use Java Compiler to compile classes into /target folder.
```bash
javac -d target/ src/game/*.java
```
In case you use external libraries, please add them in CLASSPASS:
```bash
javac -d target/ -cp .:external/external.jar src/game/*.java
```
4. Go to /target folder and launch compiled main class using JVM, passing 3 arguments:
```bash
java game.Hippodrome Horse1 Horse2 Horse3
```
In case you use external libraries, please add them in CLASSPASS:
```bash
java -cp .:../external/external.jar game.Hippodrome Horse1 Horse2 Horse3
```

## Launch from executable .jar file

1. Make steps #1 - #3 from the instruction above.
2. Using standard Java archiver archive a compiled class in /target folder stating Hippodrome.class as main:
```bash
jar cvfe hippodrome.jar . game/Hippodrome.class
```
3. There will be a new .jar file in the /target folder - it is executable:
```bash
java -jar hippodrome.jar Horse1 Horse2 Horse3
```