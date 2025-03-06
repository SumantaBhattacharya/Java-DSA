// import java.util.Scanner;
import java.util.Arrays;
// import java.awt.Point;
// import java.util.*;

public abstract class Odd_before_Even {
    // EXERCISE
    // Write a program that places the odd elements of an array before the even elements.

    // For example, if the array is [1, 2, 4, 5, 7, 9, -2, 3], the output should be [1, 5, 7, 9, 3, -2, 4, 2].

    // Note: You are not allowed to use any additional arrays or data structures.
    // You can only modify the given array in-place.

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 7, 9, -2, 3};
        System.out.println("Original array: " + Arrays.toString(arr));

        // for iterate over this original array we are going to use for loop with a variable 'i'.
        // in each iteration, we will echeck if the current element is an even number or an odd number if it is a odd number we want to add it to the beginning of the temp array at the index j 
        // temp[j++] = arr[i]; // i will be increment at each time it finishes its executiong the first iteration of the loop so now 'i' is at the second element. 
        // temp[k++] = arr[i] //
        // increment both 'i' and 'j'
        // arr = [(1), 2, 4, 5, 7, 9, -2, 3] temp = [0, 0, 0, 0, 0, 0, 0, 0] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 0, 0, 0, 0, 0, 0, 0] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 0, 0, 0, 0, 0, 0, 2] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 0, 0, 0, 0, 0, 4, 2] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 5, 0, 0, 0, 0, 4, 2] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 5,  7, 0, 0, 0, 4, 2] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 5,  7, 9, 0,  0, 4, 2] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 5,  7, 9, 0, 0, 4, 2] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 5,  7, 9, 0,      -2, 4, 2] => arr = [1, 2, 4, 5, 7, 9, -2, 3]  temp = [1, 5,  7, 9, 3 -2, 4, 2]   
        //        i                                  j                    k               i                                 j                 k                  i                              j              k                        i                           j              k                           i                        j           k                                 i                         j  j++   k                                 i  i++                       j  j++ k                                     i  i++                      j  k                                     i                           j/k++   k                                              i                            j/k++
        // whenever we find another odd number it will be inserted in a new position, after we use the current element of 'j', we will increment it, 
        // After we insert a element at the position 'k', we want to decrement 'k' 
        // so basically, if the element is an odd number this statement "temp[j++] = arr[i];" will be executed and if the element is an even number this statement temp[k++] = arr[i]
        // each time when 'i' be incremented eight j will be incremented or 'k' will be decremenetd
        // 'i' and 'j' will be always incremented and 'k' will always be decremented in our scenario
        // we dont increment 'j' and decrement 'k' when 'i' is incremented because we dont want to increment 'j' and decrement 'k' always, we want to do that when we insert an element at the index 'j' or at the index 'k'
        // when we decrement 'k' the variable 'j' will not be affected and also when we increment the variable 'k', 'j' was not affected

        /*at the end of the loop, the temp array will contain the odd numbers in their original order followed by the even numbers.
        then we will copy the elements of temp array to the original array.
        Note: This solution assumes that the original array will not be modified by the user.*/


                // temp should contain the same number of elements in our original array
        // The elements are all 0's because the default values for an integer in an array is 
        // initialized to 0.
        
        // Here, temp is used to store the odd numbers and then place them before the even numbers in the original array
        int[] temp = new int[arr.length];

        // int[] temp = {0, 0, 0, 0, 0, 0, 0, 0};
        // to be able to add elements to the beginning of the temp array and to the end we will use two values 
// for example- a variable called 'j' to answer at the beginning and a variable called 'k' to answer at the end.
// so the initial value of the 'j' is equal to 0 and the initial value of the 'k' is equal to the length - 1
                

        int j = 0; // Index for the beginning of temp array
        int k = arr.length - 1; // Index for the ending of the temp array

        // oddBeforeEven(arr);

        // Iterate through the array from the last element to the first element
        for (int i = 0; i < arr.length; i++) {
            // If the current element is odd, add it to the beginning of the temp array(if it is an odd elementthen we will insert it at the index j and will increment 'j');
            if(arr[i] % 2 != 0){
                temp[j] = arr[i];
                j++;
                // temp[j++] = arr[i];
            }else{// arr[i] % 2 = 0
                // If the current element is even, add it to the end of the temp array(if it is an even element then we will insert it at the index k and will decrement 'k');
                // temp[k] = arr[i];
                // k--;
                temp[k--] = arr[i];
            }
            
        }
        // After we have inserted all the odd numbers at the beginning of the temp array and all the even numbers at the end of the temp array,
        // we will copy the elements of temp array to the original array
        // Copy the elements of temp array to the original array
        // System.arraycopy(temp, 0, arr, 0, arr.length);  // Note: this method will not modify the original array, it will create a new array and copy the elements of the temp array to it.  // arr = temp.clone(); // this will also create a new array and copy the elements of the temp array to it.  // arr = Arrays.copyOf(temp, temp.length); // this will also create a new array and copy the elements of the temp array to it.  // arr = Arrays.copyOfRange(temp, 0, temp.length); // this will also create a new array and copy the elements of the temp array to it.  // arr = Arrays.copyOf(arr, arr.length); // this will also create a new array and copy the elements of the original array to it.  // arr = Arrays.copyOf(arr, arr.length); // this will also create a new
        // arr = Arrays.copyOf(arr, arr.length); // this will also create a new array and copy the elements of the original array to it.  // arr = Arrays.copyOf(arr, arr.length); // this will also create a new array and copy the elements of the original array to it.  // arr = Arrays.copyOf(arr, arr.length); // this will also create a new array and copy the elements of the original array to it.
        
        copyArray(temp,arr);

            // Print the modified array
            System.out.println("Modified array: " + Arrays.toString(arr));// Output: [1, 5, 7, 9, 3, -2, 4, 2]

    }

    /*public static void oddBeforeEven(int[] arr) {
        // Iterate through the array from the last element to the first element
    }*/

    public static void copyArray(int[] temp, int[] arr){
        for (int i = 0; i < arr.length; i++) {// arr.length / temp.length in this case it doesnot make a difference becaus ethe two arrays the same length so we could also use arr.length  
            arr[i] = temp[i];// inside this method we will copy the temp array to the numbers array.
            // System.out.print(arr[i]+" ");
        }
    }

}
