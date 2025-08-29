public class Find_index {// DSA-File
    // https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
    /*
     Find Position of an Element in a Sorted Array of infinite Numbers
     Difficulty Level : Medium Last Updated : 07 May, 2021

     Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
        Source: Amazon Interview Experience.
      Sincle array is sorted, the first thing clicks in our mind is to apply Binary Search.
      But the problem is, we don’t know the size of the array.

      if the array is infinite that means we dont have proper bounds to apply binary search.
      So in order to find the position of the key (target element), first we need to find proper bounds
      and then apply binary search algorithm.

      Let low be pointing to 1st element and high pointing to 2nd element of the array.
      Now compare the key with the element at high index (high index element).

       -> If the key is greater than the high index element, then copy high index to low index (update low to high) and double the high index (high to 2*high).
       -> if the key is smaller than the high index element, then we have found our bounds.
          then apply binary search on high and low indices found (Now apply binary search between low and high index).

          - This approach is efficient because it finds the bounds in O(log n) time and then binary search in O(log n) time, so total O(log n).

     */

    public static void main(String[] args) {

            //        0  1   2   3  4   5
        int [] arr = {68,69,180,440,480,781 }; // assuming this is a sorted infinite array of n elements init

        int target = 440; // element to be searched


        int result = searchRange(arr, target);

        if (result != -1) {
            System.out.println("Element " + arr[result] + " found at index: " + result);
        } else {
            System.out.println("Element not found inside infinite array");
        }

        /*
        while (true) {
            arr.push(Math.random());
        }

        In Java, arrays don’t have a .push() method.
        Java arrays have a fixed size, so you can’t keep pushing into them.
        In Java, arrays (int[] arr) have a fixed size once created.
        "infinite", meaning we don't know the actual size, so we cannot use arr.length
        So, you cannot create an actual infinite array in Java — memory is always finite.

        */
        

    }

    public static int searchRange(int[] arr, int target) {

       
       int start = 0;
       int end = 1;
      
        while (target > arr[end]){
            start = end; 
            end = end * 2; 
        }

        for (int i = 0; i < end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
       
        return -1;
    }

}