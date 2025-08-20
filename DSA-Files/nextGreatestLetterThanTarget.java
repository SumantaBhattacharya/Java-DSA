class nextGreatestLetterThanTarget {
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {

        char[] arr = { 'c', 'f', 'j', 'x', 'x', 'y', 'y' };
        char target = 'c';

        char result = nextGreatestLetter(arr, target);

        System.out.println(result);

    }

    public static char nextGreatestLetter(char[] arr, char target) {

        if (target > arr[arr.length - 1]) {
            return arr[0];
        }//if it exceeds simply return the first element of the array.

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target >= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            } // no equal condition

        }

        return arr[start];// return the character itself instead of returning index;

    }
}


/*
Ceiling = Smallest element in the array that is greater than or equal to the target.

The question says greater than target not grater than or equal to the target so, have to remove the matching condition.

intuition:
if no character is available in the array that is larger than the target element then return the 0th index that means if no element is found return the 0th index so before entering the loop make a conditon.

 */