public class FindE_InfiniteArray {

    // https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {

        // 0 1 2 3 4 5
        int[] arr = { 68, 69, 180, 440, 480, 781 }; // assuming this is a sorted infinite array of n elements init

        int target = 440; // element to be searched

        // int result = BinarySearch(arr, target, 0, arr.length - 1);
        // int result = BinarySearch(arr, target, 0, arr.length - 1);

        int result = searchRange(arr, target);
        System.out.println("Element " + arr[result] + " found at index: " + result);

    }

    public static int searchRange(int[] arr, int target) {

        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1; // box of size two

        // condition for the target to lie in the range
        // target should be less than end

        // if the target is greater than end that means target is greater than start
        // till your target is greater than end keep doubling
        // when you target element is not greater than end it basically means the target
        // element lies behind end

        while (target > arr[end]) {
            // We’re trying to find a range so end is not the last index value it is part of the last element of the array thats why we are considering assigning it to index 1 to end as above coded
             start = end;
             end = 2 * end; // multiply by 2 instead of deviding by 2
        }
        /*
         * If we started at end = arr.length - 1, that assumes we know the array size —
         * which we don’t in the "infinite array" problem.
         * 
         * By starting from 1 and doubling, we grow outward step by step until the
         * target is smaller than or equal to arr[end].
         * 
         * This avoids scanning every element (like linear search from the beginning),
         * while still not requiring knowledge of the full array length.
         */

         return BinarySearch(arr, target, start, end);

    }

    public static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;

    }

}
