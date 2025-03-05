public class P_array {
    // Practice question on java
    public static void main(String[] args) {
        // Practice problem 1
        // Create an array of 5 floats and their sum
        float [] arr = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};// In Java, arrays are implemented as objects because Java treats arrays as reference types rather than primitive types. 
        //  float arr[] = {2.0f, 4.6f}; // could be this way too

        // Java internally creates an object in the heap memory to store the elements.
        float sum = 0.0f;

        for(float element: arr){// foreach
            sum += element;
        }

        System.out.println("Sum of array elements: " + sum);

        // Practice problem 2
        // Write a program to find out whether a given integer is present in an array or not

        float num = 100.0f;
        boolean isInArray = false;

        for (float element : arr) {
            
            if (num == element) {
                isInArray = true;
                break;
            }else{
                // continue to the next element
                continue;
            }

        }

        if (isInArray) { // isInArray == true
            System.out.println(num + " is in the array: " + isInArray);
        }else{
            System.out.println(num + " is not in the array: " + isInArray);
        }

        // Practice problem 3
        // Calculate the average marks from an array containing marks of all students in Physics using for each loop.

        float[] marks = {85.2f, 92.3f, 78.5f, 90.1f, 67.8f};
        float totalMarks = 0.0f;

        for (float mark : marks) {
            totalMarks += mark;
        }

        float averageMarks = totalMarks / marks.length;
        System.out.println("Average marks in Physics: " + averageMarks);

        // Practice problem 4
        // Create a Java program to add two matrices of size 2 * 3

        // array of arrays
        int[][] matrix1 = {
            {1, 2, 3}, // 1 row
            {4, 5, 6}  // 2nd row
       //   1st 2nd 3rd column   
        };
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        // Resultant matrix to store the sum
        // int[][] sumMatrix = new int[2][3];
        int [][] resultingMatrix = {
            {0, 0, 0},
            {0, 0, 0}
        };

        // Printing the resulting matrix in proper format
        System.out.println("Sum of the two matrices:");
        System.out.println("["); // Opening bracket for matrix

        // 2*3
        //      for (int i = 0; i < 2; i++)
        for (int i = 0; i < matrix1.length; i++) {// Loop for rows
            System.out.print("["); // Opening bracket for row
            //  for (int j = 0; j < 3; j++)
            for (int j = 0; j < matrix1[0].length; j++) {// Loop for columns
                // System.out.format("Setting value for i =%d and j=%d\n", i ,j);
                resultingMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(resultingMatrix[i][j] + " "); 

                // j < 3 - 1 = j < 2 = 0 < 2, 1 < 2, 2 < 2 false
                if (j < matrix1[0].length - 1) {
                    System.out.print(", "); // Add comma between elements
                }
/* 
j	Condition  (j < 2)	      Action
0	✅         0 < 2 	    Print 8,
1	✅         1 < 2	        Print 10,
2	❌         2 < 2(false)	Print 12 (no comma)
*/

            }
            System.out.println("]"); // End row
        }
        
        System.out.println("]"); // Closing bracket for matrix  | Move to the next row

        // Practice problem 5
        // Write a Java Program to reverse an array

        // int devide = Math.floorDiv(5, 2);
        // System.out.println("devide:" + devide);

        int[] arr1 = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr1.length / 2; i++) {
            
            int front = i;
            int back = arr1.length - 1 - i;

            /*
            int frontP = arr1.toString().charAt(i);
            int backP = arr1.toString().charAt(arr1.length - 1 - i);
            arr1[front] = backP;
            arr1[back] = frontP;


// arr1.toString() does not give the actual array elements as a string.
// Instead, it returns a memory reference like [I@some_hashcode], which is meaningless for your logic.
// So, charAt(i) will not fetch actual numbers from the array but instead random characters from that reference string.

             */

             
            int temp = arr1[front];
            arr1[front] = arr1[back];
            arr1[back] = temp;

        }

        // System.out.println("Reversed array: " + java.util.Arrays.toString(arr1));
        
        // Printing array elements without converting to a string
        for (int elements : arr1) {
            System.out.print(elements + " ");
        }

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        // int l = arr.length;

        int n = Math.floorDiv(arr2.length, 2);

        System.out.println("\nReversed array: ");

        for (int index = 0; index < n; index++) {
            // swap a[i] and a[l- 1 - i]
            int temp = arr2[index];
            arr2[index] = arr2[arr.length - 1 - index];
            arr2[arr.length - 1 - index] = temp;
        }// same logic as upper we just didnt stored anything in values

        for (int elements : arr2) {
            System.out.print(elements + " ");
        }

        // Practice problem 6
        // Write a Java program to find the maximum element in an array

        int[] arr3 = {1, 2, 3, 4, 5};
        int max = arr3[0];

        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] > max) {
                max = arr3[i];
            }
        }
        
        System.out.println("\nMaximum element in the array: " + max);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Practice problem 7
        // Write a Java program to find the minimum element in an array

        int[] arr4 = {1, 2, 3, 4, 5};
        int min = arr4[0];

        for (int i = 1; i < arr4.length; i++) {
            if (arr4[i] < min) {
                min = arr4[i];
            }
        }
        
        System.out.println("Minimum element in the array: " + min);

        // Practice problem 8
        // Write a Java program to find whether an array is sorted or not

        int[] arr5 = {1, 2, 3, 4, 5};
        boolean isSorted = true;
        //  checking the position (index)
        for (int i = 0; i < arr5.length - 1; i++) { // 0 < 4(5-1) = ✅ arr5[i] > arr5[i + 1] -> arr5[0] > arr5[i + 1] ->  arr5[0] > arr5[0 + 1] => 1 > 1+1 -> 1 > 2 ❌ , 1 < 4 ✅  arr5[i] > arr5[i + 1] -> arr5[1] > arr5[1 + 1] -> arr5[1] > arr5[2] -> 2 > 3 ❌ , 2 < 4 ✅ arr5[i] > arr5[i + 1] -> arr5[2] > arr5[2 + 1] -> 3 > 4 => ❌ , 3 < 4 ✅ arr5[i] > arr5[i + 1] => arr5[3] > arr5[3+1] -> 4 > 5 ❌, 4 < 4 ❌(Loop stops)
            if (arr5[i] > arr5[i + 1]) {// 1 is for the next position
                isSorted = false;// then we would have need to swap so we have taken it as false
                break;
            }
        }
        
        System.out.println("Array is sorted: " + isSorted);

        // EXERCISE
        // Write a program that fills an array with n integers entered by the user

        // Suppose that the user can enter atleast 1 number and at most 20 numbers

        

    }
}
