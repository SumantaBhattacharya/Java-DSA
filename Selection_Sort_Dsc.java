import java.util.Arrays;

public class Selection_Sort_Dsc {
    
    public static void main(String[] args) {
        
        
        int[] arr = {
                69,
                68,
                101,
                180,
                440,
                480,
                781
        };


        int[] result2 = Selection_Sort(arr);
        System.err.println("Selection_Sort"+Arrays.toString(result2));

    }

    private static int[] Selection_Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            
            int smallestIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                
                if (arr[smallestIndex] < arr[j] ) {
                    
                    smallestIndex = j;// each time the inner loops runs we are getting the smallest element

                }

            }

            // here we are swapping the elements
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i]; // put the "i-th element" into that smallest's place from the left to right
            arr[i] = temp;

        }

        return arr;

    }

}

