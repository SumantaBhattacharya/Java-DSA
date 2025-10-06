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

# JECA-2023

## 41. In singly linked list, the time complexity for insertion  at a particular node is ___________.
 ```
 ```bash
     (A) O(1) (B) O(n2) 
     (C) O(n) (D) O(n logn) 
 ```
 ```
To insert at a particular node in a singly linked list,  you must first traverse the list to find the insertion  point. This traversal has a worst-case time complexity of O (n).
```

 > `(C) O(n)`

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
> Single linked list is the collection of nodes in which each nodes are connected through links. And in the single linked list, each node contains the data field and only one link. That is the link of the next node. But in the doubly linked list, each node contains the data field and two links. 1 is the link of the next node, another is the link of the previous node. So doubly linked list is the collection of nodes in which every node contains data field and link of the next node, as well as link of the previous node.
```
```
 address[prev link|Data next|link]

 None<---1011[|Data|]---><---5400[|Data|]---><---2100[|Data|]--->None
              node1                 node2               node3
```
```markdown
> It is the first node of the linked list. And it doesn't contain any previous node. It will store the link to empty value or none or null.
> this is the Second node 2 contains the data field link of the next node that is node 3 and link of node 1.  That is the previous node. And we have node 3 here. Node 3 contains data field at two links. It contains the link of the previous node, that is node 2 as well as it contains the next node reference as none or null, because we don't have any node after that. So in the doubly linked list, the first node previous references none, and the last node. next reference, next node reference is none or null or empty value.

> the first node reference is stored in the head, and that is the starting point of the linked list. And the last node of the linked list is called as Tail.

>  The list each node contains link of the next node as well as link of the previous node. That's why moving forward and backward in the linked list is easier here.

```

```markdown
# Incertion At the beginning of the list.
```
```
None<---1010[|68|]---><---4200[|69|]---><---2300[|143|]--->None
```
```markdown 
> So we have here doubly linked list We have three nodes.
```

 ```markdown
 # JECA-2023

 ## 91. Select the correct Linked list types from the options.
 ```

 ```bash
  (A) Linear linked list (B) Circular linked list 
  (C) Doubly linked list (D) Char linked list 
 ```

 > `(A) Linear linked list (B) Circular linked list (C) Doubly linked list`

 
 ```markdown
 ## 92. Select the correct Linked list operations from the  options.
 ```

 ```bash
  (A) Insertion of a node (B) Deletion of a node 
  (C) Search a node (D) Re-shaping a node 
 ```

 > `(D) Re-shaping a node`
 

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

```javascript
// My initution
    public String deleteAt(int index){

       // if linked list itself is null we cannot perform the deletion operation
        if(head == null){
            String msg = "NO NODE FOUND INSIDE LL";
            return msg;
        }else if (index < 0 || index >= size) {
            return "INVALID INDEX";
        }else{
            // find/search for the perticular node you want to delete
            // we have index of the node we want to delete that why we use for loop
            Node temp = head;

// This will always go to the last node, not the node at the specified index.
            for (int i = 0; i < size; i++) {// delete any node in ll
                temp = temp.next;
            }

            // once we find the element 
            // i. no need to create any node as we are only deleting
            // ii. delete fist
            // iii. delete last
            // iv. find the index of the element you want to delete

//  checking size == 1 and index == size inside the main logic, but these should be handled separately.

            // if it is the only node existing inside the linked list
            if (size == 1) {
                head = null;
                temp.next = null;// temp was already head it is point to null anyway, so `temp.next = null` is unnecessary
            }

            // if it is the last node you want to delete and make the second last element as the last element
            if (index == size) {
                // make the second last element next to null so it cant point to the next node
                // i. find the second last element.
                // ii. we would use while because we dont the the index of the second last element
                Node tempNode = head;
                while (tempNode.next != tail) {// this will takes us to second last element
                    tempNode = tempNode.next;
                }

                // once we found the second last element ii.i make it the last element 
                temp.next = null;
                tail = temp;

            }

            // if its(index) is in between the linkedlist then

            String msg = "NODE FOUND INSIDE LL AND DELITION PERFORMED AT THE CHOOSEN INDEX";
            return msg;

        }

    }
```
```

 [100]--->100[69,200]--->200[68,300]--->300[96,400]--->400[6,null] 
 [100]--->100[69,300]--/->200[68,300]--->300[96,400]--->400[6,null]
                  ------------------------->

```