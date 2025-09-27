public class Linked_L {

    public static void main(String[] args) {
        Linked_L list = new Linked_L();
        list.insertFirst(69);
        list.insertAt(68, 1);// this will work once the memory is allocated
        list.insertAtLast(440);
        list.insertBeforeLast(480);
        list.print();
    }

    Node head;
    Node tail;

    int size;
    public Linked_L(){
        this.size = 0;
    }
    
    public class Node{

        private int data;
        private Node next;

        public Node(int data){
            this.data = data; // by default the next will be null
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }

    public void insertFirst(int val){
     // Scenario 1: If list is empty (no existing nodes)
       if(head == null){
        Node New_Node = new Node(val);
        head = New_Node;
        // tail be point to the new node then
        tail = New_Node;
        // tail = head; // we can also write this because tail points to whatever head points to (the new node)
        size++;
       }else{// Scenario 2: If there are existing nodes
        Node New_Node = new Node(val);
        // initially New_Node.next will be empty
        New_Node.next = head;
        // now head points to new node
        head = New_Node;// asigning new head
        size++;
        // at some node will be there acting as tail 
       }
        
    }

    public void insertAtLast(int val){
       if(head == null){
        Node New_Node = new Node(val);
        head = New_Node;
        tail = New_Node;
        size++;
       }else{
        Node New_Node = new Node(val);// O(1) time complexity
        tail.next = New_Node; // now the last node next will not contain null anymore instead it will contain the address of the last node
        // now tail will point to the new_node to make it the last node
        tail = New_Node;
        size++;
       }

    }

    public void insertBeforeLast(int val){
        if(head == null){
        Node New_Node = new Node(val);
        head = New_Node;
        tail = New_Node;
        size++;
       }else if(head == tail){// Only one node in list then we insert the node before the first staring node node
        Node New_Node = new Node(val);
        New_Node.next = head;
        head = New_Node;
        size++;
       }else{
        Node New_Node = new Node(val); // created a node we have to insert before the tail

        // Find the node before tail (second last node)
        // to find that we check if head.next != null
        Node temp = head;// second last node should not point to tail

        while (temp.next != tail) {//Keep moving until next node is tail, if we use null here then this will always make temp point to the second node, not the node before tail!
            // that we have arrived to the node before the tail
            temp = temp.next;// assign the second last node to temp
        }

        New_Node.next = tail;// now it will point to the tail node
        // here we would assign the previous node before the last node next to the new node
        temp.next = New_Node;//Second last node points to new node
        size++;

       }
    };

    
    // insert at perticular index
    public void insertAt(int val, int index){

        // genarally index cannot be less than 0 or greater than size
        if (index < 0 || index > size) {
        throw new IndexOutOfBoundsException("Invalid index: " + index);
        } 

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertAtLast(val);
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
            for (int i = 0; i < size; i++) {// delete any node in ll
                temp = temp.next;
            }

            // once we find the element 
            // i. no need to create any node as we are only deleting
            // ii. delete fist
            // iii. delete last
            // iv. find the index of the element you want to delete

            // if it is the only node existing inside the linked list
            if (size == 1) {
                head = null;
                temp.next = null;
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

    public void print(){
        Node temp = head;
        
        while(temp != null){
            System.out.print("["+temp.data+"]");
            temp = temp.next;
        }
        System.out.println(" END");
    }

}
