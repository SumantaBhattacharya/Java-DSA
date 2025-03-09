// import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// import java.util.Arrays;

public class MyArrayList_Exercise1 {
    public static void main(String[] args) {

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
         * 
         * Enter 5 strings: Neso Neso Academy Academy Neso
         * Your unique sorted Elements: [Academy, Neso]
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to enter numbers or words? (Enter 'number' or 'word'): ");

        String choice = sc.nextLine().trim().toLowerCase();

        if (choice.equals("number"))// choice == ""
        {
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Enter numbers (type 'done' to stop):");
            /*
             * for (int index = 0; index < list.size(); index++) {
             * int temp = sc.nextInt();
             * if(!list.contains(temp)){
             * list.add(temp);
             * }
             * }
             */

            while (true) {// if i dont give a number then user cant stop from inputting the number so i
                          // have to give a limitations.
                // int input = sc.nextInt();

                // Read input as String
                String input = sc.next();
                
                if (input.equalsIgnoreCase("done")) {// int temp = sc.nextInt() this causing error because if temp is an integer it will not be able to check the "done" string string value so 
                    break; // Stop input when user types "done"
                }else{

                try{

                    // int temp = sc.nextInt(); instead of this we need to conver the existing temp so 
                    int temp = Integer.parseInt(input);

                    if (!list.contains(temp)) {
                        list.add(temp);
                    }
                }catch(NumberFormatException e) {
                    System.out.println("Invalid input! Enter a number or 'done' to stop.");
                }
                }



                // else{
                // break;
                // }
            }

            Collections.sort(list);

            System.out.println("Your unique sorted elements: " + list);
        } else if (choice.equals("word")) {
            ArrayList<String> list = new ArrayList<String>();
            /*
             * for (int index = 0; index < list.size(); index++) {
             * int temp = sc.nextLine();
             * if(!list.contains(temp)){
             * list.add(temp);
             * }else{
             * break;
             * }
             * }
             */

             System.out.println("Enter words (type 'done' to stop):");

            while (true) {
                // int temp = sc.nextLine();
                String temp = sc.nextLine().trim(); // Read input as String

                if (temp.equalsIgnoreCase("done")) {
                    break; // Stop input when user types "done"
                }
                if (!list.contains(temp)) {
                    list.add(temp);
                }
                

                // if (!list.contains(temp)) {
                //     list.add(temp);
                // }else{(temp.equalsIgnoreCase("done")) {
                //     break; // Stop input when user types "done"
                // }
                

                // if (!temp.equalsIgnoreCase("done") && !list.contains(temp)) {
                //     list.add(temp);
                // }
                

                // else{
                // break;// here the the program arise is how do we know that the is done
                // inputting
                // // for we have have to identify whether the user want to add more tent or
                // number or he/she is done inputting.
                // }
                
                // if (temp.equals(Integer)) {//temp.equalsIgnoreCase("done")
                    // int input = Integer.parseInt(input);

                    // if (input.equalsIgnoreCase("done")) {
                        // break; // Stop input when user types "done"
                    // }

                    //break; // Stop input when user types "done"
                // }

            }

            Collections.sort(list);
            System.out.println("Your unique sorted elements: " + list);
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }

        sc.close();

        // ArrayList doesnt have a fixed size so we dont have to give a fixed size.

        // -1 to reach to the last index in this case we dont have to so,
        // we will use a while loop to add elements in the array list.
        // while (num-- > 0) {
        // int input = sc.nextInt();
        // if (!list.contains(input)) {
        // list.add(input);
        // }
        // }
        // // Collections.sort(list); // sorts the elements in ascending order
        // System.out.println("Your unique sorted Elements: " + list); // prints [1, 2,
        // 3, 5, 6, 8, 9]
        // System.out.println("Your unique sorted Elements: " +
        // Arrays.toString(list.toArray())); // prints [1, 2, 3, 5, 6, 8, 9]

        // Instead of above code, we can use a for loop to iterate over the array list
        // and print its elements.
        // for (Integer num : list) {
        // System.out.print(num + " ");
        // }
        // System.out.println();
        // Collections.sort(list); // sorts the elements in ascending order
        // System.out.println("Your unique sorted Elements: " + list); // prints [1, 2,
        // 3, 5, 6, 8, 9]

        // System.out.println("Your unique sorted Elements: " +
        // Arrays.toString(list.toArray(new Integer[0]))); // prints [1, 2, 3, 5, 6, 8,
        // 9]

        // System.out.println("Your unique sorted Elements: " + list); // prints [1, 2,
        // 3, 5, 6, 8, 9]

    }
}
