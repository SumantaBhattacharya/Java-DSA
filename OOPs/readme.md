# ***OBJECT ORIENTED PROGRAMMING SYSTEMS***

## H***ow*** J***ava*** W***orks***:
`Default Behavior:` When you pass an object to System.out.println(), **Java** automatically calls the object's toString() method

`Inheritance:` All **Java** classes inherit from the Object class, which has a default toString() method that returns: ClassName@HashCode

> **Java** is explicit - you must define the string representation yourself.

* **Java** cannot automatically print all fields of an object. You must explicitly define what should be printed through the toString() method.*

## ***What can be overridden?***
- *Only methods inherited from a **parent class***
- *Your `write()` method is **not inherited** - it's defined directly in your Pen class*
- *You can only override methods that come from a superclass*

### O**OPSystems**
- *Every Java class automatically extends Object class (even if you don't write extends Object)*
- *Object class already has a toString() method, toString() Inherited from the Object class (every class's parent)*
- *Pen class inherits this method from Object*
- *We're overriding (replacing) the inherited behavior*

`You can only override what you inherit.`

> * **Constructors** are perfect for initializing objects and calling setup methods. they're can be multiple **constructors** in the same class.*

#### ***Key Points:***
* *main method: You call **constructors** to create objects*
* *Class: You define **constructors** to specify how objects are created*
* *this() must be first: ***Constructor*** calls to other **constructors** must be the first statemen*

* [*notes*](https://docs.google.com/document/d/1uv9EdLaG9TK7iNcMneLeEaChzvmXU9Xu_Uv5iZwswFk/edit?tab=t.0)

> A **Copy constructor** is an overloaded **constructor** used to declare and initialize an object from another object. 

## ***Polymorphism -*** 
i. ***poly - many. morphism - forms.*** 
- i. **function overloading.** 
    - *i.i. compile time polymorphism.* 
- ii. **function overriding.**
    - *ii.i. run time polymorphism.*

> In Java, method overloading is allowed only if the method signature is different.

- Java identifies methods by: 
    i. Method name 
    ii. Parameter types (in order) 
    iii. Number of parameters 
    NOT by: 
        i. Parameter names.
        ii. Return type. 
        iii. Access modifiers.

`A class with a main method can still be inherited. The fact that it has public static void main(String[] args) doesn’t stop it from being a parent class.`

> *The Math class is part of the java.lang package, which is automatically imported in every Java program.*
<!-- ![Java Inheritance Image](https://d2o2utebsixu4k.cloudfront.net/media/images/blogs/share_image/c64b540d-4d8b-46d1-9bc9-ea52f69572a1.png)
![Java Inheritance Image](https://tse2.mm.bing.net/th/id/OIP.C5vzQakublCwNBwlV6aGDwHaFj?rs=1&pid=ImgDetMain&o=7&rm=3) -->
![Java Inheritance Image](https://www.acte.in/wp-content/uploads/2020/08/types-of-inheritance-1024x670.png)

`Each public class must be in its own file`

## ***Encapsulation***
- i. *Packages* 
- ii. *Access Modifiers *
    - ii.i. *public.*
    - ii.ii. *private.* 
    - ii.iii. *protected.*
    - ii.iv. *default.*

> *Java only allows field declarations (variable definitions), not statements like object creation or assignments, directly in the class body unless they are field initializations.*

***`Encapsulation`*** - i. Data hiding - Data hiding is a process of protecting members of class from unintended changes whereas, ***`Abstraction`*** - is hinding the implimentation details and showing only important/useful parts to the user. i. abstract class ii. interface

***`Encapsulation`*** i. Packages ii. Access Modifiers

1. ***`Abstract Class`***
- *An abstract class must be declared with an abstract keyword*
- *It can have abstract and non abstract methods.*
- *It cannot be instantiated.*
- *It can have contructors and static methods as wel*l
- *It can have final methods which will force the subclass not to change the body of the method*

> 1.i. Pure abstraction is done by interfaces

### 2. ***Interfaces***
- *All the fields in interface are public, static, and final by default.*
- *All methods are public & abstract by default.*
- *A class that impliments an interface must impliment all the methods declared in the interface.*
- *Interface support the functionality of multiple inheritance.*