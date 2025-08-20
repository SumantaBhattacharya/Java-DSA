public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };

        int target = 15; // Example target value

        // Assuming you want to find the ceiling of the target in the array
        int ceilingIndex = findCeiling(arr, target);
        // System.out.println(ceilingIndex); gives the index inside array gives the value
        System.out.println(ceilingIndex == -1
                ? "Target not found in the array."
                : "Smallest element in the array that is greater than or equal to the target is: " + arr[ceilingIndex]);
    }
    // Ceiling = Smallest element in the array that is greater than or equal to the target.
    // but if the target element is grater than the greatest number in the array in that case no ceiling 

    public static int findCeiling(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return -1; //  if the target element is grater than the greatest number in the array in that case no ceiling 
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1; // Move to the right half
            } else if (target < arr[mid]) {
                end = mid - 1; // Move to the left half
            } else {
                return mid; // Element found at index mid
            }
        }

        return start;

    }

}
