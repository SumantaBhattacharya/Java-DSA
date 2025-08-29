public class find_TargetPosition {

    // https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {

            //        0  1   2   3  4   5
        int [] arr = {68,69,180,440,480,781 }; // assuming this is a sorted infinite array of n elements init

        int target = 440; // element to be searched


        int result = searchRange(arr, target);

     
        System.out.println("Element " + arr[result] + " found at index: " + result);
 
        

    }

    public static int searchRange(int[] arr, int target) {

       
       int start = 0;
       int end = 1;
      
        while (target > arr[end]){// we dont need to keep the track of the start index because we are doing linear search because we know start is always going to be 0th index nut in binary search we are comparing the start and end index in the array by chunks/part by part
            // start = end; Without start, you wouldn’t know where the lower bound of the current search chunk is.
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

