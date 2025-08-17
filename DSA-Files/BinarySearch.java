// import java.math.BigInteger;
import java.util.Arrays;
public class BinarySearch{
    public static void main(String[] args) {
        // you need to tell Java that the literal is a long by appending L
        long arr[] = {
            2, 5, 8, 12, 16, 23, 38, 56, 72, 91

        };

        // Binary Search is used for sorted arrays

        Arrays.sort(arr); // it sorts the original array arr

        System.out.println(arr.length + " elements in the array after sorting:" + Arrays.toString(arr));

        int searchElement = 781; // element to search in the array

        int result = Arrays.binarySearch(arr, searchElement);

        if (result >= 0) {
            System.out.println("Element " + searchElement + " found at index: " + result);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }


    }
}

                /*
                 * To calculate the mid value we need to know the length of the array devided by2
                 * in this example the length is 10 so mid = 10/2 = 5
                 * so the mid value is 16 at index 5
                 * To search for an element we need to compare the mid value with the element we are searching for
                 * if the element is less than the mid value we need to search in the left half
                 * if the element is greater than the mid value we need to search in the right half
                 * if the element is equal to the mid value we have found the element
                 * If the element is not found we need to return -1
                 * The binary search algorithm works by dividing the array into two halves and searching in the half where the element is likely to be present.
                 * It works by repeatedly finding the middle index:
                 * mid = (low + high) / 2
                 * In binary search, low and high are the two pointers (or indexes) that mark the current search range within your sorted array.
                 * where low is the starting index 0 and high is the ending index of the array (array.length - 1).
                 */
                /* 
                 * The binary search algorithm is a search algorithm that finds the position of a target value within a sorted array.
                 * The binary search algorithm is a logarithmic algorithm that works by dividing the array into two halves and searching in the half where the element is likely to be present.
                 * The time complexity of binary search is O(log n) which is much faster than linear
                 * search which has a time complexity of O(n).
                 * The binary search algorithm is used for sorted arrays.
                 * The binary search algorithm is an efficient way to search for an element in a sorted array.
                 *  * The binary search algorithm is a divide and conquer algorithm.
                 */

/*
Binary Search Algorithm
-----------------------

Optimised way to search used for sorted array;

Binary Search is used for sorted arrays


Assume that the array is sorted

*/

/*
 blob:https://web.whatsapp.com/bd474bad-6856-4c81-a875-d51f92ee13e5
 */