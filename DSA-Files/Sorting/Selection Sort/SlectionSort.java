// package Selection Sort.img;

/*
 
Selection Sort is a simple and efficient sorting algorithm  
works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.

Selection Sort Algorithm:

Step 1: Set MIN to location 0
Step 2: Search the minimum element in the list
Step 3: Swap with value at location MIN
Step 4: Increment MIN to point to the next element
Step 5: Repeat until the list is sorted

Time Complexity
Best Case Complexity: This occurs when there is no sorting required, meaning the array is already sorted. The best-case time complexity is O(n^2).
Average Case Complexity: This occurs when the array elements are in a jumbled order. The average case time complexity is also O(n^2).
Worst Case Complexity: This occurs when the array elements are required to be sorted in reverse order (e.g., you need to sort in ascending order, but the elements are in descending order). The worst-case time complexity is O(n^2).

Space Complexity
O(1)

 */

import java.util.Arrays;

public class SlectionSort {
    
    public static void main(String[] args) {
        
        int[] arr = {12, 29, 25, 8, 32, 17, 40};

        int [] result = SelectionSort(arr);
        System.out.println(Arrays.toString(result));
    };

    public static int [] SelectionSort(int [] arr) {
        
        
        for (int i = 0; i < arr.length - 1; i++) {// consider this as index
            
            int smallestIndex = i; // assume that the 0th index is the first samllest element
             
            // this will lopp to all the elements in the array to find the smallest element in the array
            for (int j = i + 1; j < arr.length; j++) {// here we have to check until the last element
                
                // the searching for the next smallest element\
                // if the i + i = j which is for searching from the second element of the array because we have assumend the first element is sorted
                  // it will only swap if smallest Index element is grater than the next element because the smallest element at 0th or initial indecs canot be greater than the next element if the initial element is not greater than the any elements in rest of the array then things need to be kept same so no need to write any code for that  

                    // to swap the postion

                // this was previously holding the 0th index
                // j is holding i + 1 means the second element
                if (arr[j] < arr[smallestIndex]) {

                    smallestIndex = j;// found a smaller element index
                }

                // else keep the swapping as it is as no swaping is needed
            }

            // the loop is gone thorugh all elements to find the smaller element
            // now we have to perform the swap operation 
            // here we have to swap the elements

            int temp = arr[i];// which olding the 0th index value
            // to swap it with the smallest element index we do
            arr[i] = arr[smallestIndex]; // here we have pass the smallest element to the 0th index
            // now we have to pass the 0th index element to the smallest element index
            arr[smallestIndex] = temp; // not arr[i] because its value has changed thats why we are storing it in temp
        }

        return arr;

    }
}
/*
 
Intuition
---------
We Search in the array for the smallest element. In our case, 8 is the smallest element put in the 0th index then increment the 0th index to get the next smallest element in the 1st index. Do this repetively for all the elements in the array from the 0th index to nth index

Or, We could have implimented the same thing, Other way around.

We search for the largest element in the array and swap it postion with the nth index (arr.length - 1) of the array do -1 everytime we sort the elements in the array so doing this repetively will sort the array

 */