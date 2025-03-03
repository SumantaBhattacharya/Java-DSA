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

        

    }
}
