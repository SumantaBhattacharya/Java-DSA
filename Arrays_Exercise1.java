// import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Exercise1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many elements? (Max is 20): ");
        int num = sc.nextInt();

        // EXERCISE
        // Write a program that fills an array with n integers entered by the user
        // Suppose that the user can enter atleast 1 number and at most 20 numbers

        // if the num is not atleast 1 number and at most 20 numbers, we will keep asking for another number tot the user for that 
        while (num <= 0 || num > 20) {// num cannot be less than 20 or equal to 0
            // if num is less than 200 or equal to 0 then,
            System.out.println("Invalid input! Please enter a number between 1 and 20.");
            System.out.print("How many elements? (Max is 20): ");
            num = sc.nextInt();// we will ask user again to input the number
        }

        

        // after we getting num from the user
        // now we will create an array of size num and fill it with user input numbers
        int[] arr = new int[num]; // this defining the size

        // first thing we want to do is to fill this array with integers from the user

        /* 
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // now we will print the array
        System.out.println("Array elements:");
        System.out.print("[");
        for (int i = 0; i < num ; i++) {
            System.out.print(arr[i]);
            if (i < num - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");

        */

        fillArrayOfIntegers(arr);
        printArrayOfIntegers(arr);

        sc.close();

    }

    // control + i = copilot

    private static void fillArrayOfIntegers(int[] arr){

        Scanner input = new Scanner(System.in);// after that, we want to iterate over all the elements of this array and assign them to be equal to a number from the user.
            // size
        
        System.out.println("Enter " + arr.length + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }

        input.close();

    }

    private static void printArrayOfIntegers(int[] arr){
        System.out.println("Array elements:");
        // System.out.print("[");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        //     if (i < arr.length - 1) {
        //         System.out.print(", ");
        //     }
        // }
        // System.out.print("]");

        System.out.println(Arrays.toString(arr));
    }

}