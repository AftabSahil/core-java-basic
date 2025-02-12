# Java 01

This repository contains basic Java programs to understand compilation and execution in Java.

## Java Compilation & Execution Guide

### 1. Compiling a Java Program
To compile a Java program and store the `.class` file in a specific folder:
```bash
javac -d ../classes filename.java
```
#### Explanation:
- `javac` → Java compiler command.
- `-d` → Specifies the destination directory for `.class` files.
- `../classes` → The folder where compiled `.class` files will be stored (relative path).
- `filename.java` → The Java source file you want to compile.

### 2. Running a Java Program
To execute a compiled Java program without navigating into the `classes` directory:
```bash
java -cp ../classes ClassName
```
#### Explanation:
- `java` → Java runtime command.
- `-cp` (or `-classpath`) → Specifies the location of `.class` files.
- `../classes` → The directory containing the compiled `.class` file.
- `ClassName` → The name of the class to run (without `.class` extension).

### Example Usage
Assume you have a file `HelloWorld.java` in the `src` directory:

#### **Step 1: Compile the Java program**
```bash
javac -d ../classes HelloWorld.java
```
This will generate `HelloWorld.class` inside the `classes` directory.

#### **Step 2: Run the compiled program**
```bash
java -cp ../classes HelloWorld
```
This will execute the `HelloWorld` program without navigating to the `classes` directory.

### Repository Structure
```
java-day01/
│-- src/
│   ├── HelloWorld.java
│-- classes/
│   ├── (Compiled .class files will be here)
│-- README.md
```

### Notes:
- Ensure that the `classes` directory exists before compilation.
- Use relative paths (`../`) carefully based on your working directory.
- Always compile before running the Java program.

## Resources
- [Java Compiler (`javac`) Documentation](https://docs.oracle.com/en/java/javase/17/docs/specs/man/javac.html)
- [Java Application Launcher (`java`) Documentation](https://docs.oracle.com/en/java/javase/17/docs/specs/man/java.html)

This repository serves as a starting point for Java beginners to understand the compilation and execution process.

