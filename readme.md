# ***If you don't sacrifice for what you want, what you want becomes the sacrifice***
<!-- Basics of Time Complexity and Space Complexity | Java | Complete Placement Course | Lecture 9 -->

![alt text](images/image-9.png)
![alt text](images/image-10.png)
<!-- ![alt text](images/image-11.png) -->
![alt text](images/image-12.png)
![alt text](images/image-13.png)
![alt text](images/image-14.png)
![alt text](images/image-15.png)

![alt text](images/image.png)
![alt text](images/image-1.png)
![alt text](images/image-2.png)
![alt text](images/image-3.png)
![alt text](images/image-4.png)
![alt text](images/image-5.png)
![alt text](images/image-6.png)
![alt text](images/image-7.png)
![alt text](images/image-8.png)


# Array vs ArrayList in Java
[Source: GeeksforGeeks](https://www.geeksforgeeks.org/array-vs-arraylist-in-java/)

| **Aspect**                | **Array** | **ArrayList** |
|---------------------------|----------|--------------|
| **Dimensionality**        | Can be single-dimensional or multi-dimensional | Can only be single-dimensional |
| **Traversing Elements**   | Uses `for` and `foreach` loop for iteration | Uses `for-each`, `Iterator`, or `ListIterator` |
| **Length/Size**           | The `length` property gives the total size of the array | `size()` method returns the number of elements in the ArrayList |
| **Size**                 | Static and fixed length | Dynamic and resizable |
| **Speed**                | Faster due to a fixed size | Relatively slower due to resizing and dynamic behavior |
| **Primitive Data Storage** | Stores primitive data types directly (e.g., `int`, `double`) | Stores objects; primitive types are added indirectly using autoboxing and unboxing |


## Collection Framework

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

