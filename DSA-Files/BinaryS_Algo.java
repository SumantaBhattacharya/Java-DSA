
import java.util.Arrays;

public class BinaryS_Algo {

    public static void main(String[] args) {

        int[] arr = {
                59,
                69,
                68,
                120,
                420,
                480,
                170,
                781
        };

        Arrays.sort(arr);

        int result = binarySearch(arr);
        System.out.println(result);

    }

    public static int binarySearch(int [] arr) {

        int start = 0;// start from 0th index
        int end = arr.length - 1;

        while (start <= end) {
            
            int mid = (start + end) / 2;
            
            int target = 781;

            if (target > arr[mid]) {
                start = mid + 1;
            }else if (target < arr[mid] ) {
                end = mid - 1;
            }else{
                return mid;
            }

        }

        return -1;

    }

}
/*
 (Start + End) / 2
Example: If Start = 0 and End = 10,
(0 + 10) / 2 = 5.

Start + (End - Start) / 2
Same example:
0 + (10 - 0) / 2 = 0 + 5 = 5.
 */