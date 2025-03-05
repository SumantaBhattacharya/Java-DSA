// import java.util.*;

public class Arrays_Exercise3 {
    // EXERCISE
    // Write a program that displays the sum, product, and average of the elements of an integer array

    public static void main(String[] args) {

        /* 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        // Fill the array with integers
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
            */
    
        int [] arr = {7, 9, -8, 6, 4};

        int sum = 0;
        int product = 1;

        // Calculate the sum and product of the elements
        /* 
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // System.out.println(sum);
            product *= arr[i];
            // System.out.println(product);
        }*/

        // Using built-in methods
        // sum = Arrays.stream(arr).sum();
        // product = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
        // System.out.println("Sum: " + sum);
        // System.out.println("Product: " + product);

        System.out.print("Sum Calculation: " + arr[0]);
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
            System.out.print(" + " + arr[i]);
        }
        System.out.println(" = " + sum);

        System.out.print("Product Calculation: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            product *= arr[i];
            System.out.print(" * " + arr[i]);
        }
        System.out.println(" = " + product);

        // Calculate the average
        double average = (double) sum / arr.length;

        // Display the results
        // System.out.println("Sum: " + sum);
        // System.out.println("Product: " + product);
        System.out.println("Average: " + average);

        // Find the maximum and minimum values
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Writting a program that displays the number of occurances of ana element in the array.

        int searchElement = 9;

        /*
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                count++;
            }
        }
             */

        // Using built-in methods
        // count = Arrays.stream(arr).filter(e -> e == searchElement).count();
        // System.out.println("Number of occurrences of " + searchElement + ": " + count);

        
        System.out.println("Number of occurrences of " + searchElement + ": " +getNumberofOccurances(arr, searchElement));

        // sc.close();

    }

    public static int getNumberofOccurances(int[] arr, int searchElement){
        // TODO: Implement this method

        int count = 0;

        // Using built-in methods
        // count = Arrays.stream(arr).filter(e -> e == searchElement).count();
        // return (int) count;

        for (int i = 0; i < arr.length; i++) {
            if (searchElement == arr[i]) {// if this is true we will increment tthe count varaible, first of all we are itrating over all the elements and each time if the current element is equal to the search element we will increment the count varaible. if this condition is not true we will simply increment this i and check the next element and eventually, when this loop finishes executing we will have the number of occurancess in this variable so outside of the loop when we finish all we have to do is to return this varaible
                count++;
            }
        }

        return count;

    }

}
