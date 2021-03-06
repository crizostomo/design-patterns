# Introduction to Design Patterns

## 📝 Table of Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Tests and Usage](#usage)
- [Built Using](#built_using)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>

- In this code, it was explored the use of eleven design patterns: 
  - STRATEGY, 
  - CHAIN OF RESPONSIBILITY,
  - TEMPLATE METHOD,
  - STATE,
  - COMMAND,
  - OBSERVER,
  - ADAPTER,
  - DECORATOR,
  - COMPOSITE,
  - FACADE,
  - PROXY

## 🏁 Getting Started <a name = "getting_started"></a>

These instructions will get you a copy of the project up and running on your local machine for development and studying purposes.

### Prerequisites

What you need to install/have installed in order to execute this piece of code.

```
- Java Language
- IDE - Intellij
```

## 🔧 Running the tests and Usage <a name = "usage"></a>

- Go to the main applications and run this code 

### Patterns explored here


- STRATEGY PATTERN: Each class has their own implementation, we can use
polymorphism with interface, or an abstract class. When we do this we eliminate
if and else used excessively


- CHAIN OF RESPONSIBILITY PATTERN: A sequence of responsibilities that verifies
if each point needs to apply something. In order to avoid duplication we used
inheritance in "mother class" called 'Discount' and abstract method called
'calculate' to ensure that each class own this method called 'calculate'


- TEMPLATE METHOD PATTERN: This pattern reuses common parts in code avoiding
duplicated parts


- STATE PATTERN: Similar to the 'STRATEGY PATTERN' but it is based on states and
their transitions


- COMMAND PATTERN: is a behavioral design pattern that turns a request into a
stand-alone object that contains all information about the request.


- OBSERVER PATTERN: We have classes observers/listeners, and we have a main class
that is executing this event and as soon as this happens the listeners will
be notified.


- ADAPTER PATTERN: An adapter creates "a bridge" that helps the code to be more flexible.


- DECORATOR PATTERN: The idea is to decorate/compose one object with another one.


- COMPOSITE PATTERN: It looks like the 'DECORATOR', but here we compose an object as it was
a tree structure.


- FACADE PATTERN: When you have a complex project that involves several classes, instead of
showing this complexity to your client, he simply calls a method that encapsulates and abstracts
all of these details and as consequence the client is free to know all the methods.


- PROXY PATTERN: We have an object and the proxy pattern creates a layer that intercepts the calls
to the original object and by doing this, it is possible to do validations, verifications and so 
on.


## ⛏️ Built Using <a name = "built_using"></a>

- [Java](https://www.oracle.com/java/technologies/java-se-glance.html) - Language
- [IntelliJ](https://www.jetbrains.com/idea/download/#section=windows) - IDE


## ✍️ Authors <a name = "authors"></a>

- [@crizostomo](https://https://github.com/crizostomo) - Initial work

## 🎉 Acknowledgements <a name = "acknowledgement"></a>

- This piece of code was built thanks to Alura and refactoring.guru.
