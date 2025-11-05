package QuesSet_Array;

import java.util.Arrays;

public class ArraysCode4 {
    // Q1: Swaping Values in an Array
    public static void main(String[] args) {
        int arr[] = {69, 68, 420, 440, 14};

        System.out.print("Original Array: ");
        System.out.println(Arrays.toString((arr)));

        // You need to provide the indices (positions) of the elements to swap, not their values.
        int idx1 = 0;
        int idx2 = 1;

        swap(arr, idx1, idx2);

        System.out.println(Arrays.toString((arr)));

        int val1 = 69;
        int val2 = 68;
        
        // Find the indices of these values in the array
        int index1 = findIndex(arr, val1);
        int index2 = findIndex(arr, val2);

        swapVal(arr, index1, index2);
        System.out.println(Arrays.toString((arr)));
        
    }
    
    private static void swap(int[] arr, int idx1, int idx2) { // O(1)
        int temp = arr[idx1]; // This method performs exactly three operations regardless of the size of the array.
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    private static int findIndex(int[] arr, int val) { 

       // to find the index of the element we have to loop to that element first
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == val) {
               return i; // return the index
           }
        }

       return -1;
    }

    // to swap by their values we need to first find their indecs
    private static void swapVal(int[] arr, int idx1, int idx2) { // O(n)
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
