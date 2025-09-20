import bank.*;
// import bank.Account;

public class OOPSystems {
    
    public static void main(String[] args) {

        Pen.brand = "Pentonic"; // static variables can be accessed without creating an object

        // new allocates memory for a brand new Pen object in the heap memory, Each new creates a separate, independent object
        // Pen() - The Constructor Call, The constructor initializes the object,  Constructor name MUST match the class name exactly ii. No return type iii. Called automatically when object is created with new
        // creating an object
        Pen pen1 = new Pen("Green", "Gel"); // Pen is stating like a datatype which can hold only the object of Pen class
        // This only calls the parameterized constructor, non parameterized constructor is never called
/*
Stack (Variables)        Heap (Objects)
┌───────────────┐        ┌───────────────┐
│  pen1 ────────┼───────►│ Pen Object    │
│               │        │ color: null   │
│               │        │ type: null    │
└───────────────┘        └───────────────┘
The pen1 variable holds a reference (memory address) to the Pen object in the heap.
*/

        pen1.color = "Blue";
        pen1.type = "Gel";
/* 

Stack:                    Heap:
┌─────────────┐          ┌──────────────────┐
│ Pen pen1 ───┼─────────►│ Pen Object       │
│             │          │ color: "Blue"    │ 
│             │          │ type: "Gel"      │ 
└─────────────┘          └──────────────────┘
                             ↑
                             │
                         'this' points here
                         (inside method calls)
*/

        // it doesnt convert the whole object to string. initially it will print the class name and the hashcode of the object (hexadecimal representation)
        System.out.println(pen1); // Automatically calls toString(). whether we .toString() or not, it will call toString() method

        pen1.write();
        pen1.printColor();

        System.out.println(pen1.brand);

        // copy constructor
        Pen pen2 = new Pen(pen1);// we assigned the properties of pen1 to pen2
        pen2.printColor();

        pen2.printInfo("Fountain", pen2.color);

        TriangularShape TriangularShapepen = new TriangularShape (); // this line is a call
        TriangularShapepen.color = "Purple";
        TriangularShapepen.type = "Fountain";

        Horse horse = new Horse();
        horse.walk();

    }

};

/*abstract*/ class Pen{ // abstract is used for blueprint and genaral methods which is appy for all if we have used abstract it could not be instantiate will cause an run time error.
    String color;
    String type;
    int weight;

    // static takes memory only once
    static String brand; // same brand for every pen

    public static void changedBrand(){
        brand = "Apsra";// changing the brand for all
    }

    // abstract void hold ();

    void write(){
        System.out.println("Writing something");
    };

    public void printColor(){
        System.out.println("ink color: "+ this.color);// This keyword >> This is a Reference variable which holds the Referrence id of the current object. and this always points to the current object.
    };

    // method overloading (compile time polymorphism) >> same method name with different parameters
    public void printInfo(String type){
        System.out.println("Pen type: "+ type);
    };

    public void printInfo(int weight){
        System.out.println("Pen weight in grams is: "+ weight);
    };

    public void printInfo(String type, String color){
        System.out.println("Pen type: "+ type + ", Pen color: "+ color);
    };


    // Declare fields

    // bank.Account acc1;
    // bank.Account acc2;

    // constructors are for initializing objects and calling setup methods.
    Pen(){// non parametized constructor

        // These are constructor definitions (blueprints for object creation)
        this("Red", "Ballpoint"); // Constructor call must be the first statement in a constructor, Default constructor calls parameterized constructor with defaults
        
        System.out.println("Constructor called"); // this will print the reference id of the current object

        this.write();

        this.color = "Black"; // here the values are getting updated
        this.type = "Ballpoint";
        this.printColor();

        // Initialize accounts inside constructor
        // acc1 = new bank.Account("Sudip Bhattacharya", "9957066307", 1000.0);
        // acc2 = new bank.Account();
        // acc2.name = "Sumanta Bhattachaya";
        // acc2.accountNumber = "8133862158";

    }

    Pen(String color , String type){// parametized constructor
        this.color = color;
        this.type = type;

        System.out.println(color + " pen created");
    }

    // copy constructor is defined by the user, copying the values from one object to another
    Pen(Pen pen2){

        // it copying the pen2 object inside its current object
        this.color = pen2.color;
        this.type = pen2.type;

        System.out.println("Copy constructor called");

    }


    @Override // Java doesn't automatically know which fields you want to print or how you want them formatted
    public String toString(){// now, what we are doing is we are overriding the toString method of the Object class
        return "This is a " + this.color + " pen of type " + this.type; // its like telling the java we want these values then java is converting the class object to string
    };// this cant make an impact on write or printColor method as they are not inherited class

};

// Single level inheritance - one child class inheriting from a single parent class
class TriangularShape extends Pen{// class name always be capital, StudentPen is inheriting the properties of Pen class
    public void area(int length, int height) { // using double to avoid integer division issues
        double area = 0.5 * length * height;
        System.out.println("Pen cross-section area: " + area + " mm²");
    }

    public void pen(){
        System.out.println("Triangular Shape Pen must be hold to write");
    };

}

// Multi-level inheritance - multiple child class inheriting from a single parent class
class  EquilateralTriangle extends TriangularShape {
    public void refill() {
        System.out.println("Refilling the fountain pen.");
    }

    public void describeErgonomics() {
        System.out.println("Equilateral triangular shape provides uniform grip from all angles");
    };

    public void pen(){
        System.out.println("Writing something with Equilateral Triangle Shape Pen must be hold");
    };

}

// Hirarchial Inheritance - parent class point to multiple child class
class CircleShape extends Pen {
    public void area(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Pen cross-section area: " + area + " mm²");
    }
    public void pen(){
        System.out.println("Circlular Shape Pen must be hold to write");
    };
}

// Hybrid Inheritance - combination of two or more types of inheritance
// Multiple Inheritance - one child class inheriting from multiple parent class (not supported in java through classes but can be achieved through interfaces)

interface ANIMAL {
    
    int eyes = 2; //fixed property static, fixed, public, final, abstract by default. 

    void walk();// define this is absteact and public by default.

    // Interfaces i. cannot have contructors ii. no non abstarct function

}

interface Herbivore {
    public void eat();
}

// multiple inheritance is possible in interface
class  Horse implements ANIMAL {
    // impliment
    public void walk(){
        System.out.println("walk on 4 legs");
    }
    public void eat(){
        System.out.println("eat's veg");
    }
}
