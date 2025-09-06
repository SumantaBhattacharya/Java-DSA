import java.util.Arrays;

public class Bubble_Sort_Dsc {
    
    public static void main(String[] args) {
        
        int [] arr = {
            69,
            68,
            101,
            180,
            440,
            480,
            781
        };

        int [] result = Bubble_Sort(arr);
        System.err.println(Arrays.toString(result));

    }

    private static int [] Bubble_Sort(int[] arr) {

        //                           n - 1
        for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j = 0; j < arr.length - i - 1; j++) {
                
                // bubble sort in decending order
                if (arr[j] < arr[j+1]) {
                    
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }

        }

        return arr;


    }

}
