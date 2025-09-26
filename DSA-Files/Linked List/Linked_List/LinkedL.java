package Linked_List; // Uncommented and changed from Linked-List to LinkedList

public class LinkedL {

    private Node head;
    private Node tail;

    private int size;
    // non-parameterised constructor
    public LinkedL(){
        this.size = 0;
    } 

    // A class is a blueprint or a template for creating objects.
    private class Node {
        // what a node will contain
        private int value;
        private Node next;

        // Types of node in ll - This constructor is used to create a node with a specified value. The next reference for this node will implicitly be null, which is useful when creating a new node that will be the last element in a list 
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int val){
        // create a new node
        Node node = new Node(val);
        // consider it as a only node so it should be point to head
        node.next = head;
        // and head should point to it
        head = node;

        // if there is no tail then make the first node as tail for that tail should point to head if it point to head it will indirectly make the first node as tail
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // head always should point to the first node - we cant update the current head to print the values in ll for that we will create another node that will also point to head and we will updating that.
    public void print(){
        Node temp = head;// we using while because we dont know how many time the loop will run
        while(temp != null){// print untill temp is not equal to null
            System.out.print(temp.value + " -> ");
            // once we got the first node value update the next to pint to the next nodes
            temp = temp.next;// head.next means head will point to now another value we just naming temp so that we dont change the original head pointing to the first node
        }
        System.out.println("END");
    }

}