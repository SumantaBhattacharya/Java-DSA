public class FirstAndLastPosition {
    
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;

        int[] result = searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]"); // Output: [1, 3]

    }

    public static int[] searchRange(int [] arr, int target){

        int[] ans = {-1, -1};

        int first_index = search(arr, target, true);
        int last_index = search(arr, target, false);

        //return new int[] { first_index, last_index };

        ans[0] = first_index; // ans is an array so we are storing the first_index at 0th index and last_index at 1th index of the array 'ans'
       
        /*
         if(ans[0] != -1){
            ans[1] = last_index;
         }
        */
       
        ans[1] = last_index;

        return ans;
        
    }

    // this function will return the index value of target return type int that is first occurance or last occurance based on the boolean value passed if not found just return -1
    public static int search(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // return mid; 
                // The line ans = mid; is executed every time we find the target element at the current mid position.
                ans = mid; // as answer is -1 if initially we found our target element at mid we store it in ans variable

                // after finding the target element we need to check the indices on the left side of mid or right side of mid, so we do this for finding the first occurance we checking we setting findStartIndex is true if 

                // if (findStartIndex == true) {
                if (findStartIndex) {// firstStartIndex is not getting returned it is just for check whether we are finding first index or last index
                    // so the middle element is found so there might be possible first occurance on the left side of the mid, so we do
                    end = mid - 1;// findStartIndex is true we find first index of the target element from going to left before mid
                }else{// if findStartIndex == false, this will execute
                    // so the middle element is found so there might be possible last occurance on the right side of the mid, so we do
                    start = mid + 1; 
                }

            }

        }

        // if start is the grater element and end is the lower element so the mid is the target element
        return ans; // after the search ans is getting returned after loop. if the while loop is not executed even once then ans will be -1 as initialized
    }// here ans is getting updated after it each turn

}
