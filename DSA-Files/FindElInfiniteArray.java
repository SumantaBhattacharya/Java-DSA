public class FindElInfiniteArray {

    // https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(searchRange(arr, target));

    }

    
    public static int searchRange(int[] arr, int target) {

        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1; // box of size two


        while (target > arr[end]) {
            // We’re trying to find a range so end is not the last index value it is part of the last element of the array thats why we are considering assigning it to index 1 to end as above coded
             int newStart = end + 1;
             // double the box value
             // initially the size of the box will be 2 start start was 0th index means 1 index and end was 1st index means second element
             // newEnd = previous End + sizeofbox * 2 
             // (end - start + 1) is the formula for calculating the size of the box as initially 1-0+1 = 2
                 end = end + (end - start + 1) * 2;// +1 is for searching from the next element in the next chunk or part of the existing/original array
                 start = newStart;
        /*
         (end - start + 1) = the current window size.
         Multiply by 2 → you’re saying “make the next window twice as large as the current window”.
         Then end + (...) → shift the window forward instead of just doubling end.
         end = end + (end - start + 1) * 2 So the +1 ensures the next window starts right after the previous one ends.
         */
        }

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