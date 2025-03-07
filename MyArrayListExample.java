import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListExample{
    
    /* 
    1. Collection framework
    2. Array (fixed size)
    3. Collection framework provides a dynamic array
    4. ArrayList size is variable
    5. ArrayList elements are stored in a dynamic array
    6. ArrayList elements are not fixed in size
    7. ArrayList elements can be of any type
    8. ArrayList elements are stored in order
    9. ArrayList elements can be duplicated
    10. ArrayList maintains insertion order
    11. ArrayList is not synchronized
    12. ArrayList uses an indexed dynamic array, NOT hashing (hashing is used in HashMap).
    13. ArrayList provides fast random access (O(1)).
    14. ArrayList allows null values
    15. ArrayList implements the Cloneable interface
    16. ArrayList supports Cloneable
    17. ArrayList is a list-based collection
    18. ArrayList supports the Collection interface
    19. ArrayList supports the List interface
    20. ArrayList is not a Map
    21. ArrayList is not a Set
    22. ArrayList supports the RandomAccess interface, enabling fast access via index.
    23. ArrayList supports the Iterable interface, allowing iteration with loops.
    24. ArrayList does not support the Queue interface
    25. ArrayList does not support the Deque interface
    26. ArrayList does not support the SortedSet interface
    27. ArrayList does not support the NavigableSet interface
    28. ArrayList does not support the SortedMap interface
    29. ArrayList does not support the NavigableMap interface
    30. ArrayList does not support the ConcurrentSet interface
    31. ArrayList does not support the ConcurrentMap interface
    */

    // ArrayList store elements in a non continioous form
    // ArrayList can only store objects not primitive datatypes and uses heap memory for storing the objects
    /*
    ArrayList is implemented as an array, but it dynamically grows and shrinks as needed
    ArrayList is a growable array, meaning it can automatically expand and contract as needed
    ArrayList supports fast random access, which means it can retrieve elements by their index in O(1) time complexity
    ArrayList default initial cpasity is 10
    // Internally, the ArrayList constructor calls:
    private static final int DEFAULT_CAPACITY = 10;
    */

    public static void main(String[] args) {
        // Integer String Float Boolean
        // Creating an ArrayList object
        // ArrayList<Intger> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> listOfStrings = new ArrayList<>();
        // ArrayList<Boolean> listOfBooleans = new ArrayList<>();

        // add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(new Integer(40));
        list.addFirst(5);
        list.addLast(60);

        // add element in between
        list.add(1, 15);
        // list.add(-1); // throws IllegalArgumentException

        System.out.println("list: " + list);

        // get elements
        int firstElement = list.get(0); // returns 10
        int lastElement = list.get(list.size() - 1); // returns 40
        System.out.println("firstElement: " + firstElement + " " + "lastElement: " + lastElement);

        // get element by index
        // elementAtIndex = list.get(-1); // throws IndexOutOfBoundsException
        // elementAtIndex = list.get(list.size()); // throws IndexOutOfBoundsException
        // elementAtIndex = list.get(list.size() + 1); // throws IndexOutOfBoundsException
        // elementAtIndex = list.get(list.size() / 2 - 1); // throws IndexOutOfBoundsException
        // elementAtIndex = list.get(-1 - 1); // throws IndexOutOfBoundsException
        // elementAtIndex = list.get(-1 * (list.size() / 2)); // throws IndexOutOfBoundsException

        int elementAtIndex = list.get(list.size() / 2); // list.size() / 2 => 4 / 2 = 2 => list.get(2) fetches the value at index 2 => returns 30
        System.out.println("elementAtIndex: " + elementAtIndex );
        // Index  0   1   2   3
        //        10  20  30  40


        // elementAtIndex = list.get(-1); // throws IndexOutOfBoundsException
        // elementAtIndex = list.get(list.size() - 1 + 1); // throws IndexOutOfBoundsException
        // elementAtIndex = list.get(list.size() / 2 + 1); // throws IndexOutOfBoundsException

        // Integer isAuto-boxed to Integer object before comparison
        System.out.println("First element: " + firstElement); // prints 10
        System.out.println("Last element: " + lastElement); // prints 30

        // remove elements
        //list.remove(1); // Removes the element at index 1 (which is now 15)
        System.out.println("The removed element is: " + list.remove(1)); 
        // list.remove(new Integer(20)); // removes 20
        // list.remove(null); // removes null
        // list.remove(0); // removes 10
        // list.remove(40); // removes 40
        // list.remove(list.size() - 1); // removes 30
        

        // check if ArrayList is empty
        boolean isEmpty = list.isEmpty(); // returns false
        System.out.println("Is list empty? " + isEmpty); // prints false

        list.trimToSize(); // Reduces capacity to match current size

        // size of ArrayList
        int size = list.size(); // returns 2
        System.out.println("The size of the list is? " + size);

        // set elements
        // list.set(1, 25); // replaces the element at index 1 with 25
        // list.set(list.size(), 50); // throws IndexOutOfBoundsException
        // list.set(-1, 45); // throws IndexOutOfBoundsException
        // list.set(list.size() + 1, 65); // throws IndexOutOfBoundsException
        // list.set(-1 * (list.size() / 2), 75); // throws IndexOutOfBoundsException
        // list.set(list.size() / 2, 85); // list.size() / 2 => 2 / 2 = 1 => list.set(1, 85) fetches the value at index 1 => replaces 30 with 85
        list.set(list.size()-1, 69);
        // System.out.println("list: " + list); // prints [10, 85]

        System.out.print("ArrayList: [ ");
        // iterate over ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)); // prints 10, 30
            if(i < list.size() -1){
                System.out.print(", ");
            }
            // System.out.println("ArrayList: " + list.get(i).toString());

        }
        System.out.println(" ]");

        // sort ArrayList
        Collections.sort(list);// sorts the elements in ascending order
        System.out.println("list after sorting: " + list); // prints [10, 30, 69]

        // clear ArrayList
        list.clear(); // removes all elements
        boolean isListEmptyAfterClear = list.isEmpty(); // returns true
        System.out.println("Is list empty after clear? " + isListEmptyAfterClear); // prints true

    }

}
