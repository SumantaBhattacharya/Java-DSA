public class linearSearchInRange {
    public static void main(String[] args) {
        //           0    1  2  3   4   5    6
        int[] arr = {10, 22, 8, 29, 30, 41, 60};
        // Q. Search for 3 in the range of index [1, 4] which is 22 8 29 30 instaed of running from 0 - nth index
        int target = 29;
        int startIndex = 1;
        int endIndex = 4;
        int result = LinearSearchInRange(arr, target, startIndex, endIndex);

        if (result == -1) {
            System.out.println("Element not found in the given range");
        } else {
            System.out.println("Element found at index " + result);
        }

    }

    // search in the array: return the index if the item found
    public static int LinearSearchInRange(int[] arr, int target, int startIndex, int endIndex) {
        // In Java, constructors have the same name as the class.
        // constructors don’t have any return type
        // The error message "This method has a constructor name" occurs because your class name linearSearchInRange starts with a lowercase letter, which is unusual for a Java class.

        // startIndex < 0 ⬅ Prevents negative index values, which would cause an ArrayIndexOutOfBoundsException.
        // means like 1 cannnot be grater than 4
        // endIndex >= arr.length ⬅ Preventing index out of bound error.
        // means like 4 cannnot be grater than 6, it's not possible to access 6th index of array.
        // If startIndex is greater than endIndex or endIndex is greater than array length, it means the range is invalid.
        // Return -1 to indicate this.
        if (startIndex < 0 || startIndex > endIndex || endIndex >= arr.length) {
            return -1; // invalid range
        }

        // search for the target in the given range(taking the index only)
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == target) {// arr[i] refers to the element at index i.
                return i; // returning index of that element. which is the index (position) of the element, not the element itself.
            }// If we return arr[i] instead of i, the function will return the value of the element instead of its index.
        }

        return -1; // element not found in the given range

    }

}
