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

    public void insertLast(int val){

        if (tail == null) {//O(1)
            insertFirst(val); 
            return; // return from here
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    };

    // insert at perticular index
    public void insert(int val, int index){

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        // we have the index that why we use for loop
        // fint the node we want to insert before
        for (int i=0; i<index; i++) {
            temp = temp.next;
        }

        // insert after a specific node
        Node node = new Node(val);// here we are passing only the value not the next

        // New node should point to what temp was pointing to
        node.next = temp.next;
        // now the the selected node should point to new node
        temp.next = node;
        size++;

    }

    public void deleteFirst(){
        // means the head should point to the second node in ll
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
    };

    public int delFirst(){

        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        };

        size--;
        return val;

    };

    public void deleteLast(){
        // if the first element is the last element then delete that
        if (size <= 1) {
            deleteFirst();
            return;
        }

        // there are two ways i. traverse to the last node of the list ii. find the last node using tail
        // i. find the second last element and make it the last element

        // we loop until the temp.next != tail
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        // once we found the second last element make it the last element
        tail = temp;
        // cut the link betweeen second last element to the last element
        tail.next = null;

        size--;

    };

    public int delLast(){
        if (size <= 1) {
            return delFirst();
        }

        Node secondLast = get(size - 2); // return node

        int val = tail.value;

        tail = secondLast;
        tail.next = null;

        size--;

        return val;

    }

    public void deleteBeforeLast(){

        if (head == null || head.next == null) {
            System.out.println("Cannot delete before last - list too small");
            return;
        }

        // If only 2 nodes, delete the first node
        if (size == 2) {
            deleteFirst();
            return;
        }

        Node temp = head;
        // find the node before the last
        /*for (int i = 0; i < size -1; i++) {//This will make temp point to the last node, not the node before last.
            temp = temp.next;
        }*/

        while (temp.next.next != tail) { // Stop when temp.next is the node before tail
            temp = temp.next;
        }

        temp.next = tail; // Skip the node before tail
        // no need to update tail as tail is point to the last node

        size--;

    }
    
    public String deleteAt(int index){

        if (head == null) {
            return "NO NODE FOUND INSIDE LL";
        }
        if (index < 0 || index >= size) {
            return "INVALID INDEX";
        }

    // if the node is in the middle
    // i. find the previous node before the node you want to delete
    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
    }

    // temp.next is the node before the node we want to delete. update the temp.next.next with the temp.next.next this is containing the temp.next.next.next
    temp.next = temp.next.next;  
    size--;

    return "NODE FOUND INSIDE LL";

    }

    public int delete(int index){
        if (index == 0) {
            return delFirst();
        }

        if (index == size - 1) {
            return delLast();
        }

        // TC-O(n)
        Node prev = get(index - 1);// go to the previous node

        int val = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return val;

    };


    public Node get(int index){
        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp;

    }

    public Node getVal(int value){
        Node temp = head;

        // TC-O(n)
        while(temp != null){
            if(temp.value == value){
                return temp;
            }else{
                temp = temp.next;
            }
        }

        return null;// if nothing is returned means node not found

    }

    // head always should point to the first node - we cant update the current head to print the values in ll for that we will create another node that will also point to head and we will updating that.
    public void print(){
        Node temp = head;// we using while because we dont know how many time the loop will run
        while(temp != null){// temp != null ensures you print every node including the last one, then exit when temp becomes null. print untill temp is not equal to null
            System.out.print(temp.value + " -> ");
            // once we got the first node value update the next to pint to the next nodes
            temp = temp.next;// head.next means head will point to now another value we just naming temp so that we dont change the original head pointing to the first node
        }
        System.out.println("END");
    }
 
}