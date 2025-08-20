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
        }
        ;

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