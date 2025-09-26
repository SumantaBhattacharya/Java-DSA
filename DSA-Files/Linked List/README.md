```Markdown

# **Array and Linked List**

`Array is not a continious memory allocation.` 

> Linked list is a linear data structure, which is consist of group of nodes in a sequence where each node contains a data element and reference of the next node.

type. Singular, double linked list. And circular linked list.

## **Single linked list** :
 
> is a type of linked list which is a chain of nodes in which each node contains is a type of linked list which is a chain of nodes in which each node contains data part and references pointing to the next node.  In the last node of the n the last node of the single Linkedlist, list, the next reference is the next reference is also also assigned to None. It only facilitates forward directional traversal

> A header linked list is a type of linked list that starts with a special node called the header node. it serves as a placeholder or a starting point for the linked list.
```

![Linked List Uses](https://www.freecodecamp.org/news/content/images/2023/05/7.png)



```bash
                     address
[data part and reference pointing to the next node]

head - A referrence variable
[100]
 ⬇             200         300
[69, 200]--->[68,300]--->[440,NULL]


Addition of New Node
---------------------
head
[100]
 ⬇             200        300        ̶3̶0̶0̶  400
[69, 200]-->[68,300]-->[480, 400]-->[440,NULL]


Delition of Existing Node
-------------------------
i. 

head
[100]
 ⬇             200        300         400
[69, 200]-->[̶6̶8̶,̶3̶0̶0̶]-->[480, 400]-->[440,NULL]

ii.

head
[100] 
 ⬇            3̶0̶0̶  200       400
[69, 200]-->[480, 400]-->[440,NULL]

```



```markdown
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
```

![D-Linked List Uses](https://www.sanfoundry.com/wp-content/uploads/2022/08/singly-linked-list-example.png)

```markdown
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

![Circular Linked List Uses](https://files.prepinsta.com/2023/02/Circular-Linked-List-Application-1024x603.webp)


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

![Linked List](https://media.geeksforgeeks.org/wp-content/uploads/20240508162652/stack-as-linked-list-768.png)
