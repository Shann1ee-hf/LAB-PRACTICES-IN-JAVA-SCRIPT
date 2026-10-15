# Java Lab Manual

This project holds my work for the Java programming lab course, plus the Library Management System mini-project. I wrote everything in IntelliJ IDEA. Each lab has its own package inside `src`, so Lab 1 is in `Lab_1`, Lab 2 is in `Lab_2`, and so on.

## What you need

- JDK 17 or newer
- IntelliJ IDEA

## Running a program

1. Open IntelliJ and choose File > Open, then pick the `JavaLabManual` folder.
2. Open `src` and then the package you want, for example `Lab_3`.
3. Open a class that has a `main` method. Most of these end in `Demo`.
4. Click the green arrow next to `main` and press Run.

A few programs ask you to type something. Type it in the Run window at the bottom and press Enter.

## The labs

**Lab 1.** I made a Car class with an `isAntique()` method and a Rectangle class, then found the biggest rectangle in an array. I also tested what happens when one object variable is assigned to another, and what happens when you call a method on a null address.

**Lab 2.** This one was about constructors. I wrote a Circle that counts how many circles exist, an Employee class with automatic ID numbers and a copy constructor, and a class with static and instance blocks to see which runs first. The Temperature class uses static methods instead of public constructors.

**Lab 3.** Mostly about keeping fields private. The Student class rejects marks outside 0 to 100, and the BankAccount keeps a history that other classes can read but not change. I also wrote an immutable Person and a Temperature class that stores kelvin inside. `TemperatureChange` shows the same class working after the stored unit was changed.

**Lab 4.** Inheritance. Student and Teacher both extend Person. Vehicle, Car and ElectricCar print their constructors in order. `DogError` shows the error you get when the parent has no empty constructor. The last task compares a stack that extends ArrayList with one that holds an ArrayList inside.

**Lab 5.** Polymorphism. There is a Printer with overloaded methods, animals that each make their own sound, a payroll that still works after adding an Intern, and a demo showing that fields and methods behave differently through a parent reference. The payment processor is written two ways so they can be compared.

**Lab 6.** Abstract classes and interfaces. I did Shape with Circle, Rectangle and Square, a Flyable interface used by Bird and Aeroplane, and an Account class with two account types. Student sorting uses both Comparable and a Comparator. The last task solves a clash between two default methods.

**Lab 7.** Exceptions. The programs handle bad input and division by zero, array index errors, and a checked InvalidAgeException. BankAccount now throws InsufficientFundsException when there is not enough money. The last program shows that `finally` still runs after a `return`.

**Lab 8.** Collections and generics. I used an ArrayList for sum, maximum and reverse, a Set to remove duplicate names, a Map to count words, and wrote my own generic Stack and a generic bubble sort.

**Lab 9.** Enums and records, plus equals and hashCode for Book so a HashSet rejects duplicates. I also built a small LinkedList that works in a for-each loop, and a Coin enum that finds the fewest coins for an amount.

**Lab 10.** Files and streams. Programs here save and read text files, count lines, words and characters, remove even numbers with a Predicate, and pick students above the average with streams. The last one reads `learners.csv` and writes a report file for each grade band.

## Library Management System

This is in the `LibrarySystem` package. Run `LibraryApp` to start it.

From the menu you can add a book or DVD, register a member, borrow and return items, list overdue items, and search by title. A member can have at most 3 loans at once. Books are lent for 14 days and DVDs for 7.

The data is saved to `items.csv`, `members.csv` and `loans.csv` when you exit, and loaded again the next time the program starts. Always leave using option 0. If you stop the program with the red square, nothing is saved.

## Notes

- `DogError.java` in `Lab_4` is supposed to fail to compile, so I keep its code commented out. Otherwise the rest of the project will not build.
- `learners.csv` and `sample.txt` must be in the main project folder, next to `src`, not inside it.
- Some files, like `notes.txt` and the report files, are created when the programs run.

## Author

Name: Tinotenda S. Jiri
Course: Object Oriented Programming
Date: 15 October 2026
