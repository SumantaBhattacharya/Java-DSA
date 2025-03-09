import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList_Exercise3 {
    /*
     * Create a manu program with the following options:
     * 1. Add Element
     * 2. Remove Element
     * 3. Display Elements
     * 4. Exit
     * 
     * This program runs infinitely until the user chooses the fourth option
     * 
     */

    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();

        /* int choice;
        do {
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = new Scanner(System.in).nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to add: ");
                    myList.add(new Scanner(System.in).nextInt());
                    break;
                case 2:
                    System.out.print("Enter the index of the element to remove: ");
                    int index = new Scanner(System.in).nextInt();
                    if (index >= 0 && index < myList.size()) {
                        myList.remove(index);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.println("Elements in the list: " + myList);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
                };
            }while (choice != 4);
            */


            /* 
            Scanner sc = new Scanner(System.in);

            
            while (true) { // Infinite loop, exits on choice 4
                 // Display menu inside the loop
                try {
                System.out.println("\nMenu:");
                System.out.println("1. Add Element");
                System.out.println("2. Remove Element");
                System.out.println("3. Display Elements");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                    System.out.print("Enter an integer to add: ");
                    int addElement = sc.nextInt();
                    myList.add(addElement);
                    break;
    
                    case 2:
                    System.out.print("Enter the index of the element to remove: ");
                    int removeIndex = sc.nextInt();
    
                    if(removeIndex >= 0 && removeIndex < myList.size()){
                        myList.remove(removeIndex);
                    }else{
                        System.out.println("Invalid index!");
                    }
    
                    break;
                    case 3:
                        System.out.println("Elements in the list: " + myList);
                        break;
                
                    case 4:
                        System.out.println("Exiting...");
                        sc.close(); // Close Scanner
                        return; // Exit the program

                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 4 choices.");
                }
            }catch(Exception e){
                System.out.println("Invalid input! Please enter a number.");
                // Clear invalid input
                sc.next(); // Consume the invalid input and continue with the loop
            }
        }
        */

        Scanner sc = new Scanner(System.in);

        while (true) {
            
            DisplayMenu();

            int choice = sc.nextInt();
            // Integer choiceObj = Integer.valueOf(choice);
            // the .equals() method is only for objects
            // System.out.println("You selected option: " + choice); // Show selected option

            if (choice == 1) {
                // AddElement(myList, sc);
                System.out.println("Option Selected-1: Add Element");
                System.out.print("Enter an integer to add: ");
                int num = sc.nextInt();

                myList.add(num);

                // System.out.println("Element added successfully!");
                int index = myList.size() -1;

                System.out.println("Element added successfully at index " + num + " at index " + index);

            }else if(choice == 2){
                System.out.println("Option Selected-2: Remove Element");
                
                // RemoveElement(myList, sc);
                System.out.print("Enter the index of the element to remove: ");

                int value = sc.nextInt();
                
                // nested if else
                // if (index >= 0 && index < myList.size()) {
                if(myList.contains(value)){
                    // myList.remove(index);
                    myList.remove(Integer.valueOf(value));// this is a new way of writting it this method will return an intger object
                    
                    // myList.remove(new Integer(value));// this contractor takes a primitive integer value

                    // System.out.println("Element removed successfully at index " + index);
                    System.out.println("Removed element:1 " + value);

                } else {
                    // System.out.println("Invalid index!");
                    System.out.println("No element was removed because no such element is there in the array list!.");
                }

            }else if(choice == 3){
                System.out.println("Option Selected-3: Display Elements");

                System.out.println("Elements in the list: " + myList);

            }else if(choice == 4){
                System.out.println("Option Selected-4: Exit");

                System.out.println("Exiting...");
                sc.close();
                return;

            }else{
                System.out.println("Invalid choice! Please enter a number between 1 and 4 choices.");
            }
            // enum

        }

     }

    public static void DisplayMenu() {
        
        System.out.println("\nMenu:");
        System.out.println("1. Add Element");
        System.out.println("2. Remove Element");
        System.out.println("3. Display Elements");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");

    }

}

// Factor	                        While Loop	                    Do-While Loop
// Guaranteed Execution?	        No (can exit immediately)	    Yes (executes at least once)
// Efficiency	                    O(N²) worst-case	            O(N²)  worst-case
// Readability	                    More common for infinite loops	Good when menu should appear at least once
// Memory Usage	                    Same (O(N))	                    Same (O(N))

// the while loop is a better choice in this case because:
// It prevents unnecessary execution if the user inputs "Exit" (4) immediately.
// It avoids an extra iteration if the user already decides to exit on the first input.

/* 
 For int values, use ==.
For objects (e.g., Integer, String, or nullable values), Objects.equals() is useful.
 */