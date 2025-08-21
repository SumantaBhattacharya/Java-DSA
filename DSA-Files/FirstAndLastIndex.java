// 2nd 
public class FirstAndLastIndex {

    public static void main(String[] args) {
       //              0, 1, 2, 3, 4, 5, 6, 
        int[] nums = { 5, 7, 7, 7, 8, 8, 10 };
        int target = 5;

        int[] result = searchRange(nums, target);
        System.out.println(java.util.Arrays.toString(result));

    }

    public static int[] searchRange(int [] arr, int target) {

        int first_index = firstIndex(arr, target);
        int last_index = lastIndex(arr, target);

        return new int[] { first_index, last_index };

    }

    public static int firstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // let say initially the first occurance is -1
        int first_position = -1;


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;// incase of 5 this will execute multiple times 
            } else {
                // we find out target value in the array no match even if we go left so first_position value never changes after we set it to 0 in the third iteration
                first_position = mid; // so we find the first occurance at the mid so we have to go either left or
                                      // right to find the first occurance and last occurance of the target element
                // to search for left we do
                end = mid - 1;
            }

        }

        // after the loop has been ended we have arrived to our first occurance of the
        // target element so we return the index
        return first_position;

    }

    public static int lastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // let say initially the last occurance is -1
        int last_position = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // we find out target value in the array
                last_position = mid; // so we find the first occurance at the mid so we have to go either left or
                                     // right to find the first occurance and last occurance of the target element
                // we did left now we search to the right
                start = mid + 1;
            }

        }
        return last_position;
    }

}
