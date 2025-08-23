import java.util.Arrays;

class FirstandLast_index {

    public static void main(String[] args) {
        int[] nums = {// sorted array
                5, 7, 7, 7, 8, 8, 10
        };

        int target = 7;

        int[] result = searchRange(nums, target);
        // System.out.println(result);
        System.out.println(Arrays.toString(result));

    }

    public static int[] searchRange(int[] arr, int target) {

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

                int first_index = mid;
                int last_index = mid;

                // if(first_index > 0 && arr[first_index - 1]){
                // first_index --;
                // }

                while (first_index > 0 && arr[first_index - 1] == target) {
                    first_index--;
                }

                while (last_index < arr.length - 1 && arr[last_index + 1] == target) {
                    last_index++;
                }

                // if(last_index > 0 && arr[last_index + 1]){
                // last_index ++;
                // }

                return new int[] { first_index, last_index };

            }

           

            /*
             * intuition:
             * Only, when we find out the target element, then we would be able to return
             * the first and last position of it. So when we find the element, return the
             * index of it; that will be the first position. Then iterate all over the
             * element searching for the target again. If the element can't be seen again,
             * the first position becomes the last position. If not, then we have found the
             * same target element after the first position, then make it as our last
             * position. Another question that can arise here is: what if we find the target
             * multiple times more than 2? In that case, what we do is iterate until we find
             * the last of the same target and return both the first and last position of
             * it.
             */
        }

        // if target is not found
        return new int[] { -1, -1 };

    }
}
/*
 * 
 * 
 * 
 * for more clarification
 * Index: 0 1 2 3 4 5 6
 * Array: 5 7 7 7 8 8 10
 * Target: 7
 * while (left > 0 && arr[left - 1] == target) left--;
 * mid = start + (end - start) / 2;
 * mid= 0 + (6 - 0) / 2 = 3
 * so at 3rd index 7 is the mid value
 * Step by step:
 * left = 3, arr[2] = 7 → matches → left-- → left = 2
 * left = 2, arr[1] = 7 → matches → left-- → left = 1
 * left = 1, arr[0] = 5 → does not match → stop
 * 
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1742916471/
 */
