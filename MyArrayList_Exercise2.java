import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

// import java.util.*;

public class MyArrayList_Exercise2 {
    // Exercise
    // Create a list of unique elements taken from the user. Sort and print these
    /*
     * SOLUTION
     * 1. Read N elements from the user.
     * 2. If the element does not exist in the ArrayList, add it.(By doing this, we
     * will be storing only unique elements because we are adding thje elements in
     * the array list if and only if this element does not exist in the array list )
     * 3. Sort the ArrayList in ascending ordER USING collections.sort()
     */

    /*
     * Example:-
     * Enter 10 integers: 1 8 9 2 6 6 1 3 5 5
     * Your unique sorted Elements: [1, 2, 3, 5, 6, 8, 9]
     * 
     * Enter 10 integers: 1 1 1 1 1 1 1 1 1 2
     * Your unique sorted Elements: [1, 2]
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 integers: ");
        // System.out.print("Enter integers and -1 to stop!: ");

        for (int i = 0; i < 5; i++) {

            int temp = sc.nextInt();

            // If the element is not already in the list, add it. 
            // this method return's an boolean
            if (!list.contains(temp)) {// contains methods taken ab object, we are passing an integer to be an argument
                                       // to a parameter of type object,
                // the integer will be automatically converted into an integer object
                // Every object in java is of type object this is why we are able to pass this
                // integer as an argument of the contais method(object)

                list.add(temp);

            }// list.contains(temp) if this expression evaluates to be true we dont want to do anything because the element is already added.

        }

        /*while (true) {
            int temp = sc.nextInt();

            if (temp == -1) { // Stop taking input if the user enters -1
                break;
            }

            if(!(list.contains(temp))){
                list.add(temp);
            }
        }*/

        // Sort the ArrayList in ascending order
        // java.util.Collections.sort(list);

        // Collections.sort(list) sorts the elements in ascending order
        Collections.sort(list);

        // Print the sorted list
        System.out.println("Your unique sorted Elements: " + list);
        sc.close(); // Close the scanner
    }

}
