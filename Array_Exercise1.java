import java.util.Scanner;

public class Array_Exercise1 {
    public static void main(String[] args) {
        // Create a list of unique elements taken from the user. Sort and print these
        /*
         SOLUTION
         1. Read N elements from the user.
         2. If the element does not exist in the ArrayList, add it.(By doing this, we will be storing only unique elements because we are adding thje elements in the array list if and only if this element does not exist in the array list )
         3. Sort the ArrayList in ascending ordER USING collections.sort()
         */
        // elements.

        /*
         * Enter 10 integers: 1 8 9 2 6 6 1 3 5 5
         * Your unique sorted Elements: [1, 2, 3, 5, 6, 8, 9]
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements? (Max is 20): ");
        int num = sc.nextInt();

        while (num <= 0 || num > 20) {// num cannot be less than 20 or equal to 0
            System.out.println("Invalid input! Please enter a number between 1 and 20.");
            System.out.print("How many elements? (Max is 20): ");
            num = sc.nextInt();// we will ask user again to input the number
        }

        int[] arr = new int[num];

        fillArrayOfNumber(arr);
        printArrayOfNumber(arr);
        sortedArrayOfNumber(arr);

        sc.close();

    }

    public static void fillArrayOfNumber(int[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter " + "first " + "integer of the Array length-" + arr.length + ": ");
        for (int i = 0; i < arr.length; i++) {
            // int input = sc.nextInt();
            arr[i] = sc.nextInt();
        }

        sc.close();

    }

    public static void printArrayOfNumber(int[] arr) {
        System.out.println("Array elements:");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public static void sortedArrayOfNumber(int[] arr) {

        // firstly we need to find whether an array is sorted or not

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {// If accessing arr[i + 1], make sure i < arr.length - 1.
            if (arr[i] > arr[i + 1]) {
                isSorted = false;// swap
                break;
            }
        }

        // System.out.println("Array is sorted: " + isSorted);
        if (isSorted) {
            System.out.println("Array is already sorted.");
        } else {
            // If array is not sorted, we need to sort it
            // Here we will use bubble sort
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    // Swap elements
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.print("Sorted ");
            printArrayOfNumber(arr);
        }

    }

}