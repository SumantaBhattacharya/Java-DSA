public class nextGreatestLetterThanTargetNumber {
    // start be actually to the length of the array

    public static void main(String[] args) {

        char[] arr = { 'c', 'f', 'j', 'x', 'x', 'y', 'y' };
        char target = 'c';

        char result = nextGreatestLetter(arr, target);

        System.out.println(result);

    }

    public static char nextGreatestLetter(char[] arr, char target) {

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

        return arr[start % arr.length  ]; // return the character itself instead of returning index;

    }
    
}
