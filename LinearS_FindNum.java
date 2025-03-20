public class LinearS_FindNum {
    
    public static void main(String[] args) {
        
        int[] arr = {420, 69, 68, 180, 181, 101};

        int min = findMin(arr);
        System.out.println("Minimum value: " + min);

        int max = findMax(arr);
        System.out.println("Maximum value: " + max);

        int secondMin = findSecondMin(arr);
        System.out.println("Second minimum value: " + secondMin);

        int secondMax = findSecondMax(arr);
        System.out.println("Second maximum value: " + secondMax);

    }

    // it takes array of integers as a parameter
    // assume arr.length != 0
    // it returns the minimum value from the array
    public static int findMin(int[] arr) {
        int min = arr[0];// considering the first element always the minimum element

        
        // iterate over the array to find the smallest number
        // if any other number is smaller than the current minimum, update the minimum
        for (int i = 1; i < arr.length; i++) { //  start check from the index 0 because we have already considered the first element as the smallest one out there
            if (arr[i] < min) {// start the first and check if it is less from the other elements so
                min = arr[i];
            }
        }
        
        return min; // return the minimum number found in the array
        
    }
    
    // findMax function also takes array of integers as a parameter
    public static int findMax(int[] arr) {
        int max = arr[0];// considering the first element always the maximum element

        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] > max) {
                max = arr[i]; // update
            }

        }

        return max; // return the maximum number found in the array

    }

    public static int findSecondMin(int[] arr) {

        int min = findMin(arr); // find minimum first

        int secondMin = Integer.MAX_VALUE; // initialize second minimum with maximum possible value

        for (int i = 0; i < arr.length; i++) {
            // if (arr[i]!= min && arr[i] < secondMin) { // if current number is not minimum and less than second minimum
            if (arr[i]!= min) { // if current number is not minimum
                if (arr[i] < secondMin) { // if current number is less than second minimum
                    secondMin = arr[i]; // update second minimum
                }
            }
        }

        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {// if we find the smallest number

                // then assign to that index to the second minimum one 
                arr[i] = secondMin;
                break; // Break after replacing the first occurrence
            }
        }*/

        // return findMin(arr); // Find the new min (which is the second smallest)
        return secondMin; // return the second minimum number found in the array
        // If there are no second minimums, it will return the smallest number itself.
    }

    public static int findSecondMax(int[] arr) {
        int max = findMax(arr); // find minimum first
        int secondMax = Integer.MIN_VALUE; // initialize second maximum with minimum possible value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (arr[i] > secondMax) {// the rest is same again check arr[i] is less than the second maximum
                    secondMax = arr[i];
                }
            }
        }

        return secondMax; // return the second maximum number found in the array
        // If there are no second maximums, it will return the maximum number itself.
        /*
        Note: This implementation assumes that there are at least two distinct maximums in the array.
        If there are multiple occurrences of the maximum, the second maximum will be the one that appears second from the end.
        To find the second maximum in all occurrences, you need to modify this code accordingly.
        For example, to find the second maximum in all occurrences, you can iterate over the array and keep track of the maximum and second maximum separately.
        */
        
        // If secondMax is still Integer.MIN_VALUE, it means there was no valid second max
        // return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;

    }

}
