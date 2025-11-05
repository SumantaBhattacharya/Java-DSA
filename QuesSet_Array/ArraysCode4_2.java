package QuesSet_Array;

import java.util.Arrays;

public class ArraysCode4_2 {
    // https://www.geeksforgeeks.org/dsa/minimum-number-swaps-required-sort-array/
    // Given an array arr[] of distinct elements, find the minimum number of swaps required to sort the array.
    
    public static void main(String[] args) {
        int arr[] = {69, 68, 420, 440, 14};
        System.out.println(minSwaps(arr));

        System.out.println(Arrays.toString(arr));

    }

    // sort the arrays to get the number of swaps
    private static int minSwaps(int[] arr) {    
        int count = 0;// two loops because we have to run the loop of each element every time once one element is sorted then run loop to sort another element
        for (int i = 0; i < arr.length - 1; i++) {// and this will run the loop to run for sort each element
            for (int j = 0; j < arr.length - 1 - i; j++) {// this will sort the each element once
                // sort when the lesser element is right hand side of the greater element
                if (arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }else{
                    continue;
                }
            }

        }

        return count;

    }       

}

