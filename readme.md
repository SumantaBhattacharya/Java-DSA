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
