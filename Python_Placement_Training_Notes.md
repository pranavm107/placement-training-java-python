# Python Placement Training 


# Table of Contents

1.  Introduction to Python
2.  Variables and Data Types
3.  User Input
4.  Type Casting
5.  Operators
6.  Conditional Statements
7.  Loops
8.  Functions
9.  Strings
10. Lists
11. Tuples
12. Sets
13. Dictionaries
14. OOP (Classes & Objects)
15. Pillars of OOP
16. Practice Programs
17. Interview Questions

------------------------------------------------------------------------

# 1. Introduction to Python

## What is Python?

Python is a high-level, interpreted, object-oriented programming
language. It is easy to learn because its syntax is simple and similar
to English.

### Features

-   Easy to Read
-   Easy to Learn
-   Open Source
-   Platform Independent
-   Large Library Support
-   Used in AI, ML, Data Science, Web Development and Automation

------------------------------------------------------------------------

# 2. Variables

Variables store data.

``` python
name = "Pranav"
age = 20
cgpa = 7.8
```

## Data Types

  Type    Example
  ------- -----------
  int     10
  float   10.5
  str     "Hello"
  bool    True
  list    \[1,2,3\]
  tuple   (1,2,3)
  set     {1,2,3}
  dict    {"a":1}

------------------------------------------------------------------------

# 3. User Input

``` python
name = input("Enter Name: ")
age = int(input("Enter Age: "))
```

### Type Conversion

``` python
int()
float()
str()
bool()
```

------------------------------------------------------------------------

# 4. Operators

## Arithmetic

  Operator   Meaning          Example
  ---------- ---------------- ----------
  \+         Addition         5+2=7
  \-         Subtraction      5-2=3
  \*         Multiplication   5\*2=10
  /          Division         5/2=2.5
  //         Floor Division   5//2=2
  \%         Modulus          5%2=1
  \*\*       Power            2\*\*3=8

## Comparison Operators

Return True or False.

``` python
a=10
b=20

print(a>b)
print(a<b)
print(a==b)
```

## Identity Operators

``` python
a=[1,2]
b=a
c=[1,2]

print(a is b)
print(a is c)
print(a is not c)
```

Difference: - == compares values. - is compares memory locations.

------------------------------------------------------------------------

# 5. Conditional Statements

``` python
age=int(input())

if age>=18:
    print("Adult")
elif age>=13:
    print("Teenager")
else:
    print("Child")
```

------------------------------------------------------------------------

# 6. Loops

## For Loop

``` python
for i in range(1,6):
    print(i)
```

## While Loop

``` python
i=1
while i<=5:
    print(i)
    i+=1
```

## break / continue

-   break exits the loop.
-   continue skips the current iteration.

------------------------------------------------------------------------

# 7. Functions

``` python
def add(a,b):
    return a+b

print(add(5,4))
```

Benefits: - Code reuse - Easy maintenance - Better readability

------------------------------------------------------------------------

# 8. Strings

``` python
name="Python"

print(name.upper())
print(name.lower())
print(name[::-1])
```

------------------------------------------------------------------------

# 9. Lists

``` python
numbers=[10,20,30]
numbers.append(40)
numbers.remove(20)
```

------------------------------------------------------------------------

# 10. Tuples

Immutable collection.

``` python
t=(1,2,3)
```

------------------------------------------------------------------------

# 11. Sets

No duplicate values.

``` python
a={1,2,3}
b={2,3}

print(b.issubset(a))
print(a.issuperset(b))
```

------------------------------------------------------------------------

# 12. Dictionaries

Stores key-value pairs.

``` python
student={
    "name":"Pranav",
    "age":20
}

for k,v in student.items():
    print(k,v)
```

------------------------------------------------------------------------

# 13. Object-Oriented Programming (OOP)

## What is OOP?

Object-Oriented Programming is a programming approach where programs are
built using **classes** and **objects**.

### Class

A class is a blueprint.

``` python
class Student:
    pass
```

### Object

An object is an instance of a class.

``` python
s=Student()
```

### Constructor

``` python
class Student:
    def __init__(self,name):
        self.name=name
```

### Methods

``` python
class Student:
    def display(self):
        print("Hello")
```

------------------------------------------------------------------------

# 14. Four Pillars of OOP

## 1. Encapsulation

Wrapping data and methods together.

## 2. Inheritance

``` python
class Animal:
    pass

class Dog(Animal):
    pass
```

Allows code reuse.

## 3. Polymorphism

Same method name with different behavior.

## 4. Abstraction

Hide implementation details.

``` python
from abc import ABC,abstractmethod

class Shape(ABC):
    @abstractmethod
    def area(self):
        pass
```

------------------------------------------------------------------------

# 15. Practice Programs

-   Largest of three numbers
-   Factorial
-   Reverse a string
-   Arithmetic calculator
-   Dictionary iteration
-   Subset and Superset
-   Class and Object example

------------------------------------------------------------------------

# 16. Placement Interview Questions

1.  Difference between List and Tuple?
2.  Difference between == and is?
3.  What is OOP?
4.  What is Inheritance?
5.  What is Polymorphism?
6.  What is Abstraction?
7.  Difference between while and for loop?
8.  Difference between append() and extend()?

------------------------------------------------------------------------

# Quick Revision

-   Python is interpreted.
-   Variables store data.
-   Lists are mutable; tuples are immutable.
-   Sets remove duplicates.
-   Dictionaries store key-value pairs.
-   Classes are blueprints.
-   Objects are instances.
-   Inheritance promotes code reuse.
-   Abstraction hides implementation.
-   Polymorphism allows one interface with multiple behaviors.
