import java.util.Arrays;

public class AgnosticBS {

    public static void main(String[] args) {

        int arr[] = {
                2, 5, 8, 12, 16, 23, 38, 56, 72, 91

        };

        // Binary Search is used for sorted arrays

        Arrays.sort(arr); // it sorts the original array arr

        int target = 56;

        int result = AgnosticBinaryS(arr, target);
        System.out.println(result);

    }

    public static int AgnosticBinaryS(int[] arr, int target) {

        int Start = 0;
        int End = arr.length - 1;

        boolean isAsc;
        //  boolean isAsc = arr[Start] <= arr[End];

        if (arr[Start] <= arr[End]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (Start <= End) {

            int mid = Start + (End - Start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    Start = mid + 1;
                } 
                else{
                    End = mid - 1;
                }
                
            } else {
                if (target > arr[mid]) {
                    End = mid - 1;
                }
                else{
                    Start = mid + 1;
                }

            }
        }

        return -1;

    }

}
