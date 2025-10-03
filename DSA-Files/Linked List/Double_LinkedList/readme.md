<!-- [text](../README.md) -->

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
> in Single linked list is the collection of nodes in which each nodes are connected through links. And in the single linked list, each node contains the data field and only one link. That is the link of the next node. But in the doubly linked list, each node contains the data field and two links. 1 is the link of the next node, another is the link of the previous node. So doubly linked list is the collection of nodes in which every node contains data field and link of the next node, as well as link of the previous node.
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
```bash
None<---1010[|68|]---><---4200[|69|]---><---2300[|143|]--->None
```
```markdown 
> So we have here doubly linked list We have three nodes. Data is 69, 68, 143 And here each node contains two links. This is the first node contains the previous link as none and the second node conatins the next link as the next node link. And the last node contains next node link as none. i. The first step is create the node with two links and a data field, initially I'll take both the link will be takes as none or null. i.ii. whenever we create a node, it will have a reference. So we will take 5000 as its reference. ii. Now, the next step is we want to add this node as the first node of the linked list. 
```

```
   
```