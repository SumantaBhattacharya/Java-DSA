public class Two_Dimentional {
    // Two-Dimentional Arrays in Java(Exercise 1)
    // Write a program that prints the sum of each row in a 2D array.

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        // int sumOf_Num = 0;

        // Calculate the sum of each row
        // number of the rows which is 3
        for (int i = 0; i < arr.length; i++) {// number of rows
            int sumOf_Num = 0; // sumOf_Num should be an integer variable and should store the sum of the
                               // current row.

            // sumOf_Num = 0
            // sumOf_Num;

            // instead of storing the sum in a separate variable, we can directly add the
            // element to the sum array.
            // sum[i] += arr[i][j]; // i is the index of the row and j is the index of the
            // column

            /*
             * int[][] sumOf_Num = {
             * {0, 0, 0},
             * {0, 0, 0},
             * {0, 0, 0}
             * 
             * };
             */

            // number of the column(0-1-2) in our case it is 3
            for (int j = 0; j < arr[i].length; j++) {// -1 exclude the last column

                // if we would have been declared of outside of the outer loop then it would
                // have been conatining the sum of the elements of the first row and the second
                // row and it the last iteration it will add the elements of the third row to
                // the variable sum. now variable sum contains of all the elements inside the
                // array.

                // i = row, j = elements 
                sumOf_Num += arr[i][j];// i is the index of the row and j is the index of the column
                // Declaring the variable sum inside the out loop yhen the scope of the variable
                // sum is the outer loop so at the ened of each iteration of the outer loop this
                // variable will be de-allocated from the memory because at the end of the outer
                // loop the scope of the variable ends so when we are executing the next
                // iteration we are declaring a new variable and the previous varibale was
                // destroyed or de-allocated

                // Suppose that if declared the variable sum outside of the loop then we need to
                // assign this variable to be equal to 0 each time we start itearting. so now in
                // the first iteration the variable sum will be assigned to be equal to 0 each
                // time we start iterarting so now in the first iterating the varible sum will
                // be assigned to be equal to be 0 and then we will get the sum of the first row
                // and the printed and then the second iteration we will re-assign the variable
                // sum to be equal to 0 and after that the same thing will continue to do son
                // until the loop comes to an end

            }
            // System.out.println("𝒯𝓀ℯ 𝒮𝓊𝓂 𝒪𝒻 𝓇ℴ𝓌𝓈 " + (i + 1) + ": " +sumOf_Num);
            System.out.println("Sum of row " + (i + 1) + ": " + sumOf_Num);// the sum is only printed once per row, after all elements are summed. 
        }

        // to print the sum of each column
        // In this case, iterate over the 2D array column by column so the outer loop will iterate over the number of the column and the inner loop will iterate over the number of the rows

        int sum_Of_Num;

        // Calculate the sum of each column
        // arr[i].length refers to the number of columns in row i.
        
        // for (int i = 0; i < arr[i].length; i++) { // isn't valid for looping over columns. This results in an ArrayIndexOutOfBoundsException when i becomes equal to the number of columns.
        for (int i = 0; i < arr[0].length; i++) // Number of columns (all rows have equal length)
        {

            sum_Of_Num = 0;

            for (int j = 0; j < arr.length; j++) {
                
                // i = column, j = rows
                
                // sum_Of_Num = 0
                // sum_Of_Num;
                // instead of storing the sum in a separate variable, we can directly add the
                // element to the sum array.
                // sum[i] += arr[i][j]; // i is the index of the row and j is the index of the
                // column

                sum_Of_Num = sum_Of_Num + arr[j][i];
            }

            System.out.println("Sum of column " + (i + 1) + ": " + sum_Of_Num); // the sum is only printed once per column, after all elements are summed.

        }

        // EXERCISE - Write a program that prints the maximum of each row in 2D array

        int[][] arr1 = { { 1, 10, 3, 8 }, { 9, 12, 16, 7 }, { 5, 2, 11, 4 } };

        int maxOf_row;

        // Calculate the maximum of each row
        // number of the rows which is 3
        for (int i = 0; i < arr1.length; i++) {// number of rows

            // here we are supposing that the first element is the maximum
            maxOf_row =  arr1[i][0]; // maxOf_row should be an integer variable and should store the maximum of the current row.

            // instead of storing the maximum in a separate variable, we can directly add the
            // element to the max array.

            // Compare with every element in the row
            for (int j = 0; j < arr1[i].length; j++) {// -1 exclude the last column
                // Start from 1, since maxOf_row is arr1[i][0]


                // here we need to comapre the first element will the the elements of an array then the second element wiil be agin compared from 0th index to check the other elements of the array excepting itself and so on 

                // if (arr1[i][0] > arr[i][j]) {// comparing the first element (arr1[i][0]) with every element in the row, including itself.
                    //If the first element (arr1[i][0]) is greater than a particular element (arr[i][j]), you are not updating maxOf_row correctly.
                    // instead, we should check if the current element is greater than the stored maximum and update maxOf_row accordingly.
                if (arr1[i][j] > maxOf_row){// chekc every element of the row if the current element is greater than the previous maximum number of the row then update the max variable to the current element
                    // update max
                    maxOf_row = arr1[i][j];
                }// if it is not true the maximum will stay as it is

                // maxOf_row (arr1[i][j] > maxOf_row) ? arr1[i][j] : maxOf_row

            }
            System.out.println("Maximum in row " + (i + 1) + ":- " + maxOf_row);

        }

        // or 

        for (int i = 0; i < arr1.length; i++) {// number of the row
            System.out.println("Maximum in row " + (i + 1) + ": " + getMax(arr1[i]));
        }

        // You cannot define a method inside the main method.

    }

    // When calling getMax(arr1[i]) inside main(), each row of arr1 (which is a 1D array) is passed into integers.
    private static int getMax(int[] integers) {// means integers = arr1
        // Now we are working with 1D array
        int max = integers[0]; // Assume first element is max

        // Because max was already set to 1 before the loop began.
        // There's no need to compare it with itself; it would be redundant.
        // first iteration (i = 0), it would compare 1 with itself (1 < 1), which is always false, making no difference.

        for (int i = 1; i < integers.length; i++) {
            max = (max < integers[i] ? integers[i] : max);
        }
        // Return the maximum value found in the array.
        return max;
    }
    // it takes array of integers as a parameter

}
