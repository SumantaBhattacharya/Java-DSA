package QuesSet_Array;

import java.util.Arrays;

public class ArraysCode4_1 {
    // i.i https://www.geeksforgeeks.org/problems/need-some-change/1
    // Given an array arr of positive integers. The task is to swap every ith element of the array with (i+2)th element.
    
    public static void main(String[] args) {
        int arr[] = {69, 68, 420, 440, 14};

        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr) {
       // The loop must stop when i+2 would be out of bounds.
       for (int i = 0; i < arr.length - 2; i++) { 
        // swap i with i+2
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
       }
    }

}