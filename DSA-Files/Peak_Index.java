public class Peak_Index {
    /*
     * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
     * 852. Peak Index in a Mountain Array
     * 
     * You are given an integer mountain array arr of length n where the values
     * increase to a peak element and then decrease.
     * Return the index of the peak element.
     * 
     * Your task is to solve it in O(log(n)) time complexity.
     * 
     * 
     * Example 1:
     * Input: arr = [0,1,0]
     * Output: 1
     * 
     * Example 2:
     * Input: arr = [0,2,1,0]
     * Output: 1
     * 
     * Example 3:
     * Input: arr = [0,10,5,2]
     * Output: 1
     * 
     * Constraints:
     * 3 <= arr.length <= 105
     * 0 <= arr[i] <= 106
     * arr is guaranteed to be a mountain array.
     */

    public static void main(String[] args) {

        /* 
         mountain array basically basically means rising then falling in a order of
         numbers
         here we are asked to return the peak element basically means the highest
         element of all elements in the array
         no target element is required
         searching from the mid making the mid as the highest element in the array
         that means mid should be > than start and end if it is than this is the peak
         element and return the index of that element
         here suppose target as you peak element which is arr[mid + 1]. arr[mid + 1]
         is the peak
         mountain array means the peak index is at the mid or in decreasing slope
         visually like a mountain array always has that “uphill → peak → downhill”
         */

        int[] arr = {
                // 0 1 2 3   4 5
                0, 1, 2, 10, 5, 2,
        };

        int result = peakIndexInMountainArray(arr);
        System.out.println("Peak Element found at index: " + result);


    }

    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        /*
         * int end = 1;
         * while(target > arr[end] ){end = start;end = end * 2;}
         * 
         * while(arr[mid + 1] > arr[end] ){ end = start; end = end * 2; }
         * No, we shouldn’t do end = end * 2 in mountain array problems — that’s for
         * “infinite array” searching.
         */

        while (start < end) {

           int mid = start + (end - start) / 2;

            if (arr[mid + 1] > arr[mid]) {
                start = mid + 1;
            } else if (arr[mid + 1] < arr[mid]) {// the peak would be the end element in binary search
                end = mid;// see in a mountain array we are either increasing peak then decreasing for reversing back though so end = mid - 1 is not required the key is visual think it visually
                // we are downfalling from the other side not falling from the climbed site think visually
            }

        }

        return end; 

    }

}
/*
 * we can’t just check if arr[mid] > arr[start] and arr[mid] > arr[end].
 * That only works if the peak coincidentally lies in the middle.
 * 
 * arr[mid] == arr[mid+1] will never happen
 * 
 * In the decreasing slope case (arr[mid] > arr[mid+1]), the peak could actually
 * be at mid itself.
 * If you do end = mid - 1, you might accidentally skip the peak.
 * 
 * If arr[mid] < arr[mid + 1], then we are in the increasing slope, so the peak
 * must be to the right.
 * If arr[mid] > arr[mid + 1], then we are in the decreasing slope, so the peak
 * must be at mid or to the left.
 * 
 * The trick is:
 * If you’re on the increasing side → move right (start = mid + 1).
 * If you’re on the decreasing side → move left, but keep mid (end = mid).
 * 
 */