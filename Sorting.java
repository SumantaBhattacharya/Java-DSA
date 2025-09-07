import java.util.Arrays;

public class Sorting {

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
        int[] arr2 = {
                69,
                68,
                101,
                180,
                440,
                480,
                781
        };

        int[] arr3 = {
                5, 3, 4, 1, 2
        };

        int[] result = Bubble_Sort(arr);
        System.err.println("Bubble_Sort" + Arrays.toString(result));

        int[] result2 = Selection_Sort(arr2);
        System.err.println("Selection_Sort" + Arrays.toString(result2));

        int[] result3 = Insertion_Sort(arr3);
        System.out.println("Insertion_Sort: " + Arrays.toString(result3));

    }

    // pick the next element and compare with the sort part of the elements
    private static int[] Insertion_Sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }

            }

        }

        return arr;

    }

    private static int[] Selection_Sort(int[] arr) {
        // TODO Auto-generated method stub

        for (int i = 0; i < arr.length - 1; i++) {// nth times

            int smallestIndex = i; // suppose the first element is already sorted means thje left side of the array
                                   // is are supposing is already sorted
            // so we dont have to check over the left side of the array again

            // one swap per one iteration
            // so that we dont have to j = i + 1 run the algorithm again within sorted part
            // here we are reducing the length as sorting from initial not alike to the
            // bubble sort
            for (int j = i + 1; j < arr.length; j++) {// O(n^2) - n-1, n-2, n-3
                // Arithmetic progression

                if (arr[smallestIndex] > arr[j]) {

                    // loop will continue for all the elements of the array until we find the
                    // smallest element
                    smallestIndex = j;// found the smallest element index

                }

            }

            // everytime the inner loops runs we getting a smallest element
            // swap the elements
            int temp = arr[smallestIndex];// arr[smallestIndex] is the smallest index element in the right side
            // arr[i] = temp → overwrites arr[i] with that smallest value. we lossing the
            // arr[i]
            arr[smallestIndex] = arr[i]; // at the position of the smallest element index move the initial greater
                                         // element
            arr[i] = temp; // move the smallest index element to initial indecs

        }

        return arr;

    }

    // here the comparison is done with all the adjasent elements
    private static int[] Bubble_Sort(int[] arr) {

        // n - 1 count iterations
        for (int i = 0; i < arr.length - 1; i++) {// O(n)

            // O(n^2) - n-1, n-2, n-3, ..... n-nth times
            for (int j = 0; j < arr.length - i - 1; j++) { // initially, after sednding the greatest element to the
                                                           // right side we are excluding 1 each time so that we dont
                                                           // have to check the right side again we are considering it
                                                           // as sorted

                // bubble sort in decending order
                if (arr[j] < arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

        }

        return arr;

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) { // add a comma between elements
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
