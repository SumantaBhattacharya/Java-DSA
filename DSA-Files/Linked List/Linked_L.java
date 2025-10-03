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

    if (head == null) {
        return "NO NODE FOUND INSIDE LL";
    }
    if (index < 0 || index >= size) {
        return "INVALID INDEX";
    }

    // Delete first
    if (index == 0) {
        head = head.next;// here there is nothing to do with tail
        size--;
        return "NODE DELETED AT INDEX 0";
    }

    // Delete last
    if (index == size - 1) {
        // there are two ways i. traverse to the last node of the list ii. find the last node using tail
        // i. find the second last element and make it the last element

        // we loop until the temp.next != tail
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        // once we found the second last element make it the last element
        tail = temp; // updated the tail
        // cut the link betweeen second last element to the last element
        tail.next = null;
        size--;
        return "NODE DELETED AT LAST INDEX";
    }


    // Case 3: Delete in middle
    // in order to delete, you need a reference to the previous node so you can update its next pointer
    // i. Traverse to the node BEFORE the one we want to delete
    Node temp = head;
    for(int i=0; i < index-1; i++){// traverse forward
        // run the loop until you find the node just before the one you want to delete
        temp = temp.next; // temp.next will run until we get a node before the index node
    }
    // now update the temp.next so that it can point to the next to the deleted node
    temp.next = temp.next.next;// temp.next.next points to node (the node AFTER the one to delete) ii. So we're making prev node point directly to node next to the deleted node
    size--;

    return "NODE FOUND AND DELETION PERFORMED AT INDEX " + index;

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
