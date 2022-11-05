## Object-oriented Programming 11: Inheritance & Encapsulation
> Created by Anita Nursi &nbsp;&middot;&nbsp;
> Student ID Number: 21343018 &nbsp;&middot;&nbsp;
> Majority of Informatics &nbsp;&middot;&nbsp;
> Faculcity of Engineering &nbsp;&middot;&nbsp;
> Universitas Negeri Padang
---

# #1 Inheritance
Inheritance is an important pillar of OOP (Object-Oriented Programming). It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well.  

## Why do we need it?
- Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class’s code.
- Method Overriding: Method Overriding is achievable only through Inheritance. It is one of the ways by which java achieves Run Time Polymorphism.
- Abstraction: The concept of abstract where we do not have to provide all details is achieved through inheritance. Abstraction only shows the functionality to the user.

## Important terminologies used in Inheritance
- Class: Class is a set of objects which shares common characteristics/ behavior and common properties/ attributes. Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
- Super Class/Parent Class: The class whose features are inherited is known as a superclass(or a base class or a parent class).
- Sub Class/Child Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
- Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

## How to use it?
The extend keyword is used for inheritance in java. Using the extends keyword indicates you are derived from an existing class. In other words, “extends” refers to increased functionality.

```
class derived-class extends base-class  
{  
   //methods and fields  
}  
```
---

# #2 Encapsultion
Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield. 

- Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of its own class in which it is declared.
- As in encapsulation, the data in a class is hidden from other classes using the data hiding concept which is achieved by making the members or methods of a class private, and the class is exposed to the end-user or the world without providing any details behind implementation using the abstraction concept, so it is also known as a combination of data-hiding and abstraction.
- Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
- It is more defined with the setter and getter method.

```
// fields to calculate area
class Area {

int length;
int breadth;

// constructor to initialize values
Area(int length, int breadth) {
	this.length = length;
	this.breadth = breadth;
}

// method to calculate area
public void getArea() {
	int area = length * breadth;
	System.out.println("Area: " + area);
}
}

class Main {
public static void main(String[] args) {

	Area rectangle = new Area(2, 16);
	rectangle.getArea();
}
}
```
---

### Source
> https://www.geeksforgeeks.org/inheritance-in-java/#:~:text=In%20Java%2C%20inheritance%20means%20creating,your%20current%20class%20as%20well.
> https://www.geeksforgeeks.org/encapsulation-in-java/

---
