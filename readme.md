# ***If you don't sacrifice for what you want, what you want becomes the sacrifice***
<!-- Basics of Time Complexity and Space Complexity | Java | Complete Placement Course | Lecture 9 -->

<!-- ![alt text](images/image-9.png) -->
<!-- ![alt text](images/image-10.png) -->
<!-- ![alt text](images/image-11.png) -->
<!-- ![alt text](images/image-12.png) -->
<!-- ![alt text](images/image-13.png) -->
<!-- ![alt text](images/image-14.png) -->
<!-- ![alt text](images/image-15.png) -->
<!-- ![alt text](images/image.png) -->
<!-- ![alt text](images/image-1.png) -->
<!-- ![alt text](images/image-2.png) -->
<!-- ![alt text](images/image-3.png) -->
<!-- ![alt text](images/image-4.png) -->
<!-- ![alt text](images/image-5.png) -->
<!-- ![alt text](images/image-6.png) -->
<!-- ![alt text](images/image-7.png) -->
<!-- ![alt text](images/image-8.png) -->


## Array vs ArrayList in Java
[Source: GeeksforGeeks](https://www.geeksforgeeks.org/array-vs-arraylist-in-java/)

| **Aspect**                | **Array** | **ArrayList** |
|---------------------------|----------|--------------|
| **Dimensionality**        | Can be single-dimensional or multi-dimensional | Can only be single-dimensional |
| **Traversing Elements**   | Uses `for` and `foreach` loop for iteration | Uses `for-each`, `Iterator`, or `ListIterator` |
| **Length/Size**           | The `length` property gives the total size of the array | `size()` method returns the number of elements in the ArrayList |
| **Size**                 | Static and fixed length | Dynamic and resizable |
| **Speed**                | Faster due to a fixed size | Relatively slower due to resizing and dynamic behavior |
| **Primitive Data Storage** | Stores primitive data types directly (e.g., `int`, `double`) | Stores objects; primitive types are added indirectly using autoboxing and unboxing |


### Collection Framework

Collection framework is a combination of classes and interfaces.

### Collection of Classes & Interfaces

```
Iterable ⬅ Collection ⬅ i. List ii. Queue iii. Set
```

We cannot create objects out of interfaces, so some classes inherit the properties of an interface, then we create objects of those classes.

### Methods of Collections

- `add`
- `size`
- `remove`
- `iterate`
- `addAll`
- `removeAll`
- `clear`



### List Interface Structure

```
List ⬅ i. ArrayList ii. LinkedList iii. Vector iv. Stack
```

### Queue Interface

```
Queue(FIFO) ⬅ i. LinkedList ii. PriorityQueue iii. (Deque(Double ended queue) <- ArrayDeque)
```

### Set Interface

```
Set ⬅ i. HashSet ii. LinkedHashSet iii. (Sorted Set <- TreeSet)
```

### Map Interface

```
Map ⬅ i. HashMap ii. LinkedHashMap iii. (Sorted Map <- TreeMap) iv. Hashtable
```
# **Bit Manipulation in Java**

## **Introduction**
After Time Complexity, we will learn about **Bit Manipulation**. This involves manipulating bits, which are fundamental units of data in computers. Bitwise operations perform operations on individual bits of a number.

### **Why use Bitwise Operations?**
- Bitwise operations are **faster** than arithmetic operations.
- Used in many algorithms to **optimize code** and **reduce time complexity**.
- Helps in solving problems related to **binary representations** of numbers.

## **Bitwise Operations**
Bitwise operations include **AND, OR, XOR, NOT, and SHIFT**:

### **1. Bitwise AND (`&`)**
- The result is **1** if both bits are **1**, otherwise **0**.

### **2. Bitwise OR (`|`)**
- The result is **1** if either bit is **1**, otherwise **0**.

### **3. Bitwise XOR (`^`)**
- The result is **1** if the bits are **different**, otherwise **0**.

### **4. Bitwise NOT (`~`)**
- The result is the **complement** of the bit.

### **5. Bitwise SHIFT (`<<`, `>>`, `>>>`)**
- Shifts the bits **left** or **right** by a specified number of positions.

## **Applications of Bitwise Operations**
Bitwise operations are widely used in algorithms for **bit manipulation**, such as:
- Finding the **maximum or minimum value** in an array.
- Performing **bitwise operations** on numbers in a computer program.
- **Optimizing memory usage** and **enhancing computational speed**.

## **Bitwise Operations in Java**
Java provides the following bitwise operators:

### **1. Bitwise AND (`&`)**
### **2. Bitwise OR (`|`)**
### **3. Bitwise XOR (`^`)**
### **4. Bitwise NOT (`~`)**
### **5. Bitwise SHIFT (`<<, >>, >>>`)**

## **Basic Bit Manipulation Techniques**

### **1. Get a Bit**
Retrieve the bit value at a specific position in a number (whether it's `0` or `1`).

### **2. Set a Bit**
Set a bit at a specific position in a number to `1`.
- (0 → 1, 1 → 1)

### **3. Clear a Bit**
Set a bit at a specific position in a number to `0`.
- (0 → 0, 1 → 0)

### **4. Update a Bit**
Update a bit at a specific position in a number to a given value.
- (0 → 1, 1 → 0)

---

# Prerequisites

## 1. Iteration/Loops
## 2. Functions

A function that calls an inner function, where the inner function performs a calculation and returns a value to the outer function. The main function calls functions that call another function. This cycle continues until the base condition is reached, then the function returns the value to inner functions and finally to the main function.

---

## Characteristics of a Recursive Function

1. **Recursive function must call itself directly or indirectly**  
   *A recursive function is a function that calls itself to solve a problem.*

2. **Recursive function must have a base case**  
   *Recursion is a method of solving a problem by breaking it down into smaller subproblems of the same type until a base case is reached.*

3. **Recursive function must have a change in its input to move towards the base case.**

4. **Recursive function must not lead to a stack overflow.**

5. **Recursive function should be efficient and avoid redundant calculations.**

6. **Recursive function should minimize unnecessary additional data structures.**

7. **Recursive function must not use any global variables.**

8. **Recursive function must have a clear and concise return statement**  
   *The return statement is used to terminate a function and return a value from the function.*

9. **Recursive function should not use any built-in functions or libraries that directly solve the problem**  
   *Recursive functions are usually implemented manually to avoid using built-in functions or libraries that have already been optimized for recursion.*

# SPACE & TIME COMPLEXITY

## Time Complexity
Time complexity defines the relationship between the input size and the running time (or the number of operations) required by an algorithm.

### ***Time Complexity Cases***
- **Best Case:** The scenario where the algorithm performs the minimum number of operations.
- **Average Case:** The expected number of operations for a randomly chosen input.
- **Worst Case:** The scenario where the algorithm performs the maximum number of operations.

# Solved Questions on Array

## 1. Create a list of unique elements taken from the user. Sort and print these.

## 2. Write a program that fills an array with n integers entered by the user.

## 3. Write a program that displays the sum, product, and average of the elements of an integer array.

## 4. Create an array of 5 floats and their sum.

## 5. Write a program to find out whether a given integer is present in an array or not.

## 6. Calculate the average marks from an array containing marks of all students in Physics using a for-each loop.

## 7. Create a Java program to add two matrices of size 2 * 3.

## 8. Write a Java Program to reverse an array.

## 9. Write a Java program to find the maximum element in an array.

## 10. Write a Java program to find whether an array is sorted or not.


# Lec-46: BUBBLE SORT in PYTHON 🐍 with Code 👩‍💻 👨‍💻 | DSA in PYTHON 🐍  

**Description:**  
Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, indicating that the list is sorted. This video analyzes the best and worst-case time complexity.  

**Topics Discussed:**  
- Bubble sort  
- Algorithm with example  
- Best case time complexity  
- Worst case time complexity  

[![Bubble Sort in Python](https://img.youtube.com/vi/00mmzkOvLlM/maxresdefault.jpg)](https://youtu.be/00mmzkOvLlM)

## Bubble Sort

Bubble sort is not suitable for large data sets. It has a worst-case and average time complexity of **O(n²)**, where **n** is the number of items being sorted.

Bubble sort has a space complexity of **O(1)**, meaning it does not use any additional data structures.

### Bubble Sort Properties:
- Runs **(n-1)** loops.
- **Best case time complexity**: **O(n)**
- **Average case time complexity**: **O(n²)**
- **Worst case time complexity**: **O(n²)**

### Algorithm:
1. Compare the first two elements. If the first is greater than the second, swap them.
2. Move to the next pair and repeat step 1.
3. Continue until the last element of the array.
4. The largest element is now at the end.
5. Repeat the process for the remaining array (excluding the last sorted element).
6. Continue until the array is fully sorted.

# Advanced Pattern Questions | Java | Complete Placement Course - Lecture 6  

**Topics Discussed:**  
- Butterfly pattern  
- Solid rhombus  
- Number pyramid  
- Palindromic pyramid  
- Diamond pattern  

[![Advanced Pattern Questions](https://img.youtube.com/vi/Dr4PpNa7AYo/maxresdefault.jpg)](https://youtu.be/Dr4PpNa7AYo)






# Basics of Time Complexity and Space Complexity | Java | Complete Placement Course | Lecture 9  

[![Basics of Time Complexity and Space Complexity](https://img.youtube.com/vi/bQssdSrSGNE/maxresdefault.jpg)](https://youtu.be/bQssdSrSGNE)


# String Builder | Java Placement Course Lecture 13  

[![String Builder | Java Placement Course Lecture 13](https://img.youtube.com/vi/ZLDwskEhIFg/maxresdefault.jpg)](https://youtu.be/ZLDwskEhIFg)

# Operators & Binary Number System | Java Lecture 14  

[![Operators & Binary Number System](https://img.youtube.com/vi/Oud4alVQU4s/maxresdefault.jpg)](https://youtu.be/Oud4alVQU4s)

# Bit Manipulation | Java Placement Course | Lecture 15  

**Description:**  
Bit Manipulation helps reduce time complexity in algorithms.  

**Topics Discussed:**  
- Bit manipulation operations: gate, tweet, clear bit, update  
- Bit Masking: manipulating bits in a number using a bitwise mask  
- Setting or clearing specific bits in a number  
- Performing various operations on binary numbers  
- Clearing a specific bit position in a number  
- Using bit manipulation for operations on binary numbers  
- Bit manipulation operations in Java  
- Performing different operations based on specific cases  
- Set and clear operations on binary numbers  
- Updating bit manipulation operations in Java  

[![Bit Manipulation | Java Placement Course | Lecture 15](https://img.youtube.com/vi/OSoO8eCEEC8/maxresdefault.jpg)](https://youtu.be/OSoO8eCEEC8)


[![ArrayList In Java + Notes | Java Placement Course](https://img.youtube.com/vi/liFyhzZl9uw/maxresdefault.jpg)](https://youtu.be/liFyhzZl9uw)

## Explicit Imports in Java

Always use explicit imports; generally considered good practice in Java programming. Explicit imports make your code more readable and maintainable by clearly indicating which classes are being used from external packages.

Explicit imports also help to avoid potential conflicts or ambiguities that can arise when multiple classes with the same name exist in different packages. By specifying the exact classes you need, you make it easier for other developers to understand your code and for the compiler to resolve dependencies correctly.



[![Java Collections Framework | Java Placement Course](https://img.youtube.com/vi/VphowcSkBX4/maxresdefault.jpg)](https://youtu.be/VphowcSkBX4)

**interfaces cannot implement other interfaces**—they can only **extend** them.

### Explanation:
- `Iterable` is an interface.
- `Collection` is also an interface.
- `Collection` **extends** `Iterable`, not implements it.

The `implements` keyword is used when a **class** implements an interface. Since `Collection` is also an interface, it must use `extends` instead of `implements`.

[![Recursion in One Shot | Theory + Question Practice + Code | Level 1 - Easy](https://img.youtube.com/vi/5Boqfjissv0/maxresdefault.jpg)](https://youtu.be/5Boqfjissv0)

[![Magic or Myth? The Golden Ratio | Fibonacci](https://img.youtube.com/vi/2VNO-UJB2PE/maxresdefault.jpg)](https://youtu.be/2VNO-UJB2PE)

# Java Programming: Programming Question on Arrays in Java Programming

## Topics Discussed:

# Arrays in Java (Exercise 1)

**Description:**  
- Writing a program that fills an array with n integers entered by the user.  
- Writing a program that fills an array with n Points entered by the user.  

[![Arrays in Java (Exercise 1)](https://img.youtube.com/vi/gIqnW7ACL9o/maxresdefault.jpg)](https://youtu.be/gIqnW7ACL9o)


# Arrays in Java (Exercise 2)

**Description:**  
Writing a program that displays the sum, product, and average of the elements of an integer array.

[![Arrays in Java (Exercise 2)](https://img.youtube.com/vi/1GRLdNtPpQI/maxresdefault.jpg)](https://youtu.be/1GRLdNtPpQI)

# Arrays in Java (Exercise 3)

- Writing a program that displays the number of occurrences of an element in the array.

[![Arrays in Java (Exercise 3)](https://img.youtube.com/vi/HHsHydWBwJE/maxresdefault.jpg)](https://youtu.be/HHsHydWBwJE)


# Arrays in Java (Exercise 4)
**Writing a program that displays the maximum and minimum elements of an array.**

[![Arrays in Java (Exercise 4)](https://img.youtube.com/vi/G04TZ7sbMUM/maxresdefault.jpg)](https://youtu.be/G04TZ7sbMUM)


**Writing a program that puts the odd elements of an array before the even elements**.

[![Arrays in Java (Exercise 5)](https://img.youtube.com/vi/LVNTVxeavBw/maxresdefault.jpg)](https://youtu.be/LVNTVxeavBw)

# Two-Dimensional Arrays in Java (Exercise 1)

**Description:**  
Java Programming: Programming Exercise on Two-Dimensional Arrays in Java Programming  

**Topics Discussed:**  
1. Writing a program that prints the sum of each row in a 2D array.  
2. Writing a program that prints the sum of each column in a 2D array.  

[![Two-Dimensional Arrays in Java (Exercise 1)](https://img.youtube.com/vi/778UYhztFAE/maxresdefault.jpg)](https://youtu.be/778UYhztFAE)

# Two-Dimensional Arrays in Java (Exercise 2)

**Description:**  
Writing a program that prints the maximum of each row in a 2D array.  

[![Two-Dimensional Arrays in Java (Exercise 2)](https://img.youtube.com/vi/8uxGSiCiqZA/maxresdefault.jpg)](https://youtu.be/8uxGSiCiqZA)

[![ArrayLists (Exercise 1)](https://img.youtube.com/vi/YgkRoY3-ng8/maxresdefault.jpg)](https://youtu.be/YgkRoY3-ng8)

[![ArrayLists (Exercise 2)](https://img.youtube.com/vi/Dcgl-KfLmfA/maxresdefault.jpg)](https://youtu.be/Dcgl-KfLmfA)

# Linear Search

Linear Search is defined as a sequential search algorithm that starts at one end and goes  
through each element of a list until the desired element is found, otherwise the search  
continues till the end of the data set.  

## How Does Linear Search Algorithm Work?

- Every element is considered as a potential match for the key and checked for the same.  
- If any element is found equal to the key, the search is successful and the index of that element is returned.  
- If no element is found equal to the key, the search yields “No match found”.  

## Time Complexity:

- **Best Case:** In the best case, the key might be present at the first index. So the best case complexity is **O(1)**.  
- **Worst Case:** In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. So the worst-case complexity is **O(N)** where **N** is the size of the list.  
- **Average Case:** **O(N)**  

## Complexity Analysis of Linear Search:

**Auxiliary Space:** **O(1)** as except for the variable to iterate through the list, no other variable is used.  

## Advantages of Linear Search:

- Linear search can be used irrespective of whether the array is sorted or not. It can be used on arrays of any data type.  
- Does not require any additional memory.  
- It is a well-suited algorithm for small datasets.  

## Drawbacks of Linear Search:

- Linear search has a time complexity of **O(N)**, which in turn makes it slow for large datasets.  
- Not suitable for large arrays.  

![Linear Search Algorithm](https://media.geeksforgeeks.org/wp-content/uploads/20240506105158/Linear-Search-algorithm-banner-(1).webp)

# Linear Search Algorithm - Theory + Code + Questions  

[![Linear Search Algorithm](https://img.youtube.com/vi/_HRA37X8N_Q/maxresdefault.jpg)](https://youtu.be/_HRA37X8N_Q?si=ynbNCRnQtTCauUK8)  

![alt text](image-2.png)

**Video:** [Watch here](https://youtu.be/_HRA37X8N_Q?si=ynbNCRnQtTCauUK8)  

## Topics Covered:  
- What is Searching?  
- Linear Search  
- Code for Linear Search  
- 🎯 Questions:  
  - Search in String  
  - Search in Range  
  - Minimum Number  
  - Search in 2D Arrays  
  - Even Digits (with Optimized Solution)  
  - Max Wealth  

[![Binary Search Algorithm - Theory + Code](https://img.youtube.com/vi/f6UU7V3szVw/0.jpg)](https://youtu.be/f6UU7V3szVw?si=9u4aYPpXHmS5hW_V)

  
**Topics Covered:** 
- binary search
- Agnostic Binary Search

# ***Sorting in Java | Bubble Sort, Selection Sort & Insertion Sort | Java Placement Course***

[![Sorting in Java | Bubble Sort, Selection Sort & Insertion Sort | Java Placement Course](https://img.youtube.com/vi/PkJIc5tBRUE/0.jpg)](https://youtu.be/PkJIc5tBRUE?si=q7739lM_AuYX8c3h)

# ***Selection Sort Algorithm – Theory + Code***

[![Selection Sort Algorithm – Theory + Code](https://img.youtube.com/vi/Nd4SCCIHFWk/0.jpg)](https://youtu.be/Nd4SCCIHFWk?si=yAelZoDuoWfKZ1w5)

# ***Insertion Sort Algorithm – Theory + Code***

[![Insertion Sort Algorithm – Theory + Code](https://img.youtube.com/vi/By_5-RRqVeE/0.jpg)](https://youtu.be/By_5-RRqVeE?si=kqciLPjfR-sm9Tvy)

# ***Recap and Binary Search using recursion***

[![Introduction to Recursion](https://img.youtube.com/vi/M2uO2nMT0Bk/0.jpg)](https://youtu.be/M2uO2nMT0Bk?si=DFNj7naSE_wd4gNV)

 ![LvsB](LvsB.png)
 ![LvsBinary](LvsBinary.png)
 ![alt text](image-3.png)
 ![Time Complexity](image-4.png)
 <!-- ![alt text](image.png) -->


# ***Big O Notation***

- ***Big O notation*** *is used to clarify algorithms based on how fast they grow or decline.* ***Big O notation*** *is used to analyze the effeciency of an algorithm as its input approaches infinity, which means that as the size of an input to the algorithm grows, how drastically do the space or time requirements grow with it.* 

  - ***For example***, *let's say that we have a dentist and she takes 30 minutes to treat one patient, As her line of patients increases, the time that it takes for her to treat all of the patients will scale linearly with the number of patients waiting in the line. This is because it always takes her a constant amount of time to treat each individual patient supoose its 30 minutes. This would give us general understanding how how a dentist will take to treat 20 or 30 patients. This is because since we know that the dentist takes a constant amount of time, which is 30 minutes to treat each patient, we can always calculate the time it would take for the dentist to treat any number of patients by multiplying the number patients with the number of time it takes for her to treat an individual person in this case, which is 30 with this in mind we can calculate her efficiency linear. Or in Big O terms big O of n, where n is equal to the number of patients. the time that it would take her work to finsh would scale linearly or proportionally with the number of patients*.

`A constant is any step that doesnt scale with the input to the function.`
> constants are ignored due to getting less priority and gets elimated as its less dominant
>  as a functions, input moves towards infinite, constant become less and less significant.

> *Big O of One is for constant algorithms*

![Types of Order of Growth](https://learningmonkey.in/wp-content/uploads/2022/07/Types-of-Order-of-Growth-of-an-Algorithm.png)

```
Order of Growth   |     Description
------------------------------------
O(n!)             |     Factorial
```

- *when evaluating aan algorithm efficientcy, we must takes into consideration the efficiency of each step within the algorithm, we then find the highest order step, or the step that has the worst performance, and priortize it over of the better performing steps. steps that are constant, or that are O(1) or as good as it gets in terms of efficiency. So we always ignore them, unless the entirety of the function is constant, or O(1). And in that case, we would categorise the entire function as constant or O(1).* 

# ***O(log n)***
*Simply put a logarithm is the power that a number needs to be raised to get some other number.*
*number^number = some number - 2^3 = 2*2*2 = 8 - log2(8) log base 2 of 8? = 3*
*In computer science unless specified otherwise, we can always assume that the number that we want to raise to sum power is two.* 

> *Devision is the inverse of multiplication*
- if we need to multiple 2*2*2 to get 8 then we should also be able to devide 8 by 2 three times to get 1

# ***Binary Search & O(log n)*** 
- *Any algorithm that repeatedly divides the input size by a constant factor (like 2) has O(log n) time complexity.*

> Time Complexity != time taken by the algorithm to execute.
`Time Complexity measures how the number of steps an algorithm performs scales with the size of the input`

### A***ctual Execution Time Depends On:***
* i. *Processor speed (CPU clock speed, architecture)*
* ii. *Memory (RAM speed, cache size)*
    * *i.i. Background Processes*
    * *ii.ii. System load (other programs running)*
* iii. *Storage (SSD vs HDD, read/write speeds)*
* iv. *Internet speed (for network operations)*
* v. *Browser/Environment*
* vi. *Programming language (compiled vs interpreted)*
* vii. *Compiler optimizations*

### T***ime Complexity is Independent Of:***
* *Hardware specifications*
* *Internet speed*
* *Programming language*
* *Other processes running*

> *Big O notation - describes the upper bound of the growth rate of a function. Basically, means is it always take the worst case time complexity*

# Time Complexity for Coding Interviews | Big O Notation Explained | Data Structures & Algorithms

[![Time Complexity for Coding Interviews | Big O Notation Explained | Data Structures & Algorithms](https://i.ytimg.com/vi/5T0SiJocPCI/hqdefault.jpg)](https://youtu.be/5T0SiJocPCI)

# ***L-2.6: Recurrence Relation [ T(n)= 8T(n/2) + n² ] | Master Theorem | Example #1 | Algorithm***

[![L-2.6: Recurrence Relation \[ T(n)= 8T(n/2) + n² \] | Master Theorem | Example #1 | Algorithm](https://img.youtube.com/vi/FBKjvXGGCJM/0.jpg)](https://youtu.be/FBKjvXGGCJM?si=QWg1nPILyY_29D8W)

Applied the Master Theorem to solve  $T(n) = 8\,T(n/2) + n^2$.

# ***L-2.7: Recurrence Relation [ T(n)= T(n/2) + c ] | Master Theorem | Example-2 | Algorithm***

[![L-2.7: Recurrence Relation \[ T(n)= T(n/2) + c \] | Master Theorem | Example-2 | Algorithm](https://img.youtube.com/vi/nNabmfua14c/0.jpg)](https://youtu.be/nNabmfua14c?si=YSZCDpi-yTaMFqVk)

![alt text](image-5.png)
```
Auxiliary Space is the extra space or temporary space used by an algorithm.

Space Complexity of an algorithm is total space taken by the algorithm with respect to the input size. Space complexity includes both Auxiliary space and space used by input.

For example, if we want to compare standard sorting algorithms on the basis of space, then Auxiliary Space would be a better criteria than Space Complexity. Merge Sort uses O(n) auxiliary space, Insertion sort and Heap Sort use 0(1) auxiliary space. Space complexity of all these sorting algorithms is O(n) though.
```
## `Leetcode solved problems`
## 1️⃣ Find Numbers with Even Number of Digits  
**Problem:** [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)  

---

## 2️⃣ Richest Customer Wealth  
**Problem:** [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) 

---

## Find First and Last Position of Element in Sorted Array
**Problem:** [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) 

---

## Find Smallest Letter Greater Than Target
**Problem:** [Find Smallest Letter Greater Than Target](https://github.com/SumantaBhattacharya/Java-DSA/blob/main/DSA-Files/nextGreatestLetterThanTarget.java) 

---

### 1️⃣ What is $X^n$?

It just means **multiply X by itself n times**.

Example:

$$
2^4 = 2 \times 2 \times 2 \times 2 = 16
$$

So “X to the power of n” just multiplies X n times.

---

### 2️⃣ Recursive idea (breaking it into small steps)

Instead of multiplying 2 × 2 × 2 × 2 all at once, think **step by step**:

* Step 1: I know $2^4 = 2 \times 2^3$
* Step 2: $2^3 = 2 \times 2^2$
* Step 3: $2^2 = 2 \times 2^1$
* Step 4: $2^1 = 2 \times 2^0$
* Step 5: $2^0 = 1$ (we always stop here, this is called the **base case**)

Then we **multiply backwards**:

* Step 4: $2^1 = 2 \times 1 = 2$
* Step 3: $2^2 = 2 \times 2 = 4$
* Step 2: $2^3 = 2 \times 4 = 8$
* Step 1: $2^4 = 2 \times 8 = 16$

---

# ***Java OOPs in One Shot | Object Oriented Programming | Java Language | Placement Course***

[![Java OOPs in One Shot | Object Oriented Programming | Java Language | Placement Course](https://img.youtube.com/vi/bSrm9RXwBaI/0.jpg)](https://youtu.be/bSrm9RXwBaI?si=OQg4A0NRj-JnRFBF)

###### **GAVE AN HOUR REVISION OF OOPS FOR WBJECA PREPARATION**

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

Encapsulation 
- i. Packages 
- ii. Access Modifiers 
    - ii.i. public.
    - ii.ii. private. 
    - ii.iii. protected.
    - ii.iv. default.

> *Java only allows field declarations (variable definitions), not statements like object creation or assignments, directly in the class body unless they are field initializations.*

```Markdown

# **Array and Linked List**

`Array is not a continious memory allocation.` 

> Linked list is a linear data structure, which is consist of group of nodes in a sequence where each node contains a data element and reference of the next node.


type. Singular, double linked list. And circular linked list.


## **Single linked list** :
 
> is a type of linked list which is a chain of nodes in which each node contains is a type of linked list which is a chain of nodes in which each node contains data part and references pointing to the next node. data part and references pointing to the next node. In the last node of the n the last node of the single Linkedlist, list, the next reference is the next reference is also also assigned to None.assigned to None.It only facilitates forward directional traversal

> A header linked list is a type of linked list that starts with a special node called the header node. it serves as a placeholder or a starting point for the linked list.

## Double linked list

> Double linked list is a type of linked list which is a chain of nodes in which each node contains data part as well as to pointer or references pointing both previous node and the next node at the same time, In the first node of the double linked list the previous reference is assigned to none and in the last node of the double Link list, the next reference is assigned to None as well. It facilitates bidirectional traversal.

### An algorithm to insert a node after the given node in a double linked list. (4)
1. Create a new node (new_node) with the given data (new_data).
2. Check if the list is not empty
3. If the list is empty, print an error message and exit.
4. Change the previous node next reference to the reference of the new node
5. Store the previous node reference to the previous reference of the new node
6. Change the next node previous reference to the reference of the new_node.
7. Store the next node reference. To the next reference of the new node.

## Circular linked list

> Circular link list is a type of linked list which is a collection of nodes where each node is corrected through link in such a way it forms a circle. In circle linked list the last node of the list points to the first node of the list Instead of containing null value as the next reference this creates a loop in the list allowing them for continuous traversal

> There are two types of circular link list single, circular link list and double circular link list

> In circular, single linked list. A node contains data part and reference part. Each node point to the next node in the sequence but the last node contains the address of the first node

> The traversal start from the first Node and the last node is linked with the first node, which forms a traversing loop
```

```
1066              2042             1099
[69|2046]--><--[68|1099]---><---[77|1066]
    <---------------------------------
```

```markdown
> In Circular Double link list is a type of circular linked list, where each node contains the data part, previous reference. And next reference each node point to the next node in the sequence. the first node contains the reference of the last node. At the last node contains the reference of the first node, which forms a circle and facilitates even forward and backward traversing.
```

```
    -------------------------------------------->
1066                  2042                    1099
[1099|69|2046]--><--[1066|68|1099]---><---[2042|77|1066]
  <-------------------------------------------------
```

```markdown
#### linked list advantages
(i) Linked lists are dynamic in nature: LinkedList are not contained of a fixed size
(ii) Efficient memory utilisation: LinkedList’s are not contained a fixed size. It is dynamic in nature. It can fit to its size accordingly allowing it to use memory more efficiently
(iii) Efficient insertion and deletion in linked list insertion. deletion operations can be easily implemented
(iv) Efficient in dynamic operation: Linked list reduces the access time for insertion and deletion and for the other operations
(v) Ease in implementation: implementing basic operations like insertion, deletion, peak or top, and is empty, etc. Is simpler in linked list
```

## *Divide and Conquer Algorithm*

- The *`divide and conquer algorithm`* is recursively breaks down a complex problem into subproblems. Once the solutions to the sub-problems are obtained, they are combined to give a solution to the original problem.

- *`Stack`* can be implemented using arrays or linked list. 
*`Queues`* can be implemented using linked list, arrays and circular linked list

#####  Evaluation the time and space complexity of *`stack`* operation in linked list implementation. (3)
    
- **Push Operation**:
    - `Time Complexity`: 
        - *O(1)*.
- **Pop Operation**:
    - `Time Complexity`: 
        - *O(1)*.

`The time complexity` of *`stack`* operations in linked list implementation is *O(1)* for all operations, including push, pop, and peek. This is because the *`stack`* is implemented using a linked list, which allows for constant-time insertions and deletions at the beginning of the list.

`Space Complexity:` space complexity for a *`stack`* implemented using a linked list is O(N), where N is the number of elements in the *`stack`*. The space complexity is determined by the total number of nodes, and it is proportional to the number of elements in the *`stack`*.

`Blob URLs are temporary and only work within your current browser session.`

```
C, Python basics/DSA, Java OOP/DSA, Node.js, Express, EJS, SQL, MongoDB → CPU.

HTML/CSS/React → CPU for logic, GPU only for rendering graphics/animations in the browser.
```
![Java DSA Image](https://github.com/SumantaBhattacharya/Java-DSA/blob/main/4a2cd984-4f32-45cb-b6ba-4f64e356b9b3.jpg?raw=true)

<!-- ![Java DSA Image](https://github.com/SumantaBhattacharya/Java-DSA/blob/main/46ca4e21-37fb-43d9-a9d0-b47567b31045.jpg?raw=true) -->

<!-- ![Sumanta Bhattacharya's Certificate](https://files.oaiusercontent.com/file-JE1E6PEXch4ahZAhK1q1tq?se=2025-03-17T16%3A04%3A01Z&sp=r&sv=2024-08-04&sr=b&rscc=max-age%3D299%2C%20immutable%2C%20private&rscd=attachment%3B%20filename%3D6df2b67f-757d-4bf7-83c0-ba9256132c18.jpg&sig=%2BC09WDeIOM%2Buv2SDeUv1InSUVEE9R/p9kD027WgiiwQ%3D) -->

<!-- 
![Sumanta Bhattacharya's Certificate](https://files.oaiusercontent.com/file-XseJoMyVnsgZGNgLKVnidd?se=2025-03-17T15%3A57%3A29Z&sp=r&sv=2024-08-04&sr=b&rscc=max-age%3D299%2C%20immutable%2C%20private&rscd=attachment%3B%20filename%3DSUMANTA%2520BHATTACHARYA.png&sig=frWBZHqTDuXZEHPP7hxhueGPPMYqYtVchpbH%2B4U/y0c%3D) -->

