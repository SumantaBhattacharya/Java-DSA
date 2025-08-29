public class Find_Position {// DSA-File
    
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
        System.out.println("Element found at index: " + result);

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
       int end = 1;// see the difference here is we are not using arr.length - 1. thats why we are forming this logic to do the same thing

       // This thing is said in the question itself there from I got this logic not from my own
        while (target > arr[end]){// the logic basically says thing if target > arr[end] then pass the end value to start and double the value of end thats it from it we get a bound of the array
            start = end; // update start to previous end
            end = end * 2; // double the end index
        }

        /*
         Visual Representation
         ---------------------

                 0  1   2   3  4   5
         arr = {68,69,180,440,480,781 };

         basically low is considered as start and high is considered as end

         low equal to says first index and high equal to says second index means

         low = 0th index in our example which is 68
         high = 1st index in our example which is 69

         lets suppose our target element is 180

         focus what the algorithm says 

         if(target > arr[end]){//If the key is greater than the high index element, then copy high index to low index and double the high index (high to 2*high).
            start = end;
            end = 2 * end;
         }

         so,

         target > high_index_element
          180   > 69 ✔
        
          Copy high index to low index and high = 2 * high

          high index is 1st index abd low index is 0th index
          if we copy then, low index becomes 1st index and high index = 1 so,

          low = 1st index
          high = 2 * high_index = 2 * 1 = 2

          low = 1st index = 69
          high = 2nd index = 180

               l   h
           {68,69,180,440,480,781 };

          repeting the same thing again

          if target > high_index_element 
            
              180  > 180 ✖

          We have found our bound/length low/start = 1 high/end = 2

          Now, we apply binary search in range 

          while(start <= end) 
                 1    <= 2   ✅
            
            mid = low + high / 2 = 3 / 2 = 1

            target = 180 mid = 1st index = 69

               l,m  h
           {68,69,180,440,480,781 };

           target > mid
           180 > 69

           Search right half 
           mid + 1 mid was 1st index which was 69 now low/start = mid + 1 means 2second index mid value becomes 180 

          m,h,l
           {180,440,480,781}

           all falls upon 180

           low = 180 high = 180

           check while condition 

           start <= end
            (2 <= 2), which is true.

          condition false 

          breaks the loop 

          return mid as 180
           

         */

        while (start <= end){
           int mid = start + (end - start) / 2;

           if (target > arr[mid]){
               start = mid + 1;
           } else if (target < arr[mid]){
               end = mid - 1;
           } else{
              return mid;
           }
        }

        return -1;

    }

}