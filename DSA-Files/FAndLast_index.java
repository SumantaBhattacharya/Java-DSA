public class FAndLast_index {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;

        int first = firstIndex(nums, target);
        int last = lastIndex(nums, target);

        System.out.println("First: " + first + ", Last: " + last); // Output: First: 1, Last: 3
    }

    public static int firstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int first_position = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                first_position = mid; // possible first occurrence
                end = mid - 1;        // search to the left
            }
        }

        return first_position;
    }

    public static int lastIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int last_position = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                last_position = mid; // possible last occurrence
                start = mid + 1;     // search to the right
            }
        }

        return last_position;
    }
}
