public class Bubble_Sort {

    // smallest to largest element (assending order)

    // Ex- 7 8 3 1 2
    // first iterartion
    // 7 , 8, 3, 1, 2
    // 7, 3, 8, 1, 2
    // 7, 3, 1, 8, 2
    // 7, 3, 1, 2, 8
    // second iteration
    // 3, 7, 1, 2, 8
    // 3, 1, 7, 2, 8
    // 3, 1, 2, 7, 8
    // 3, 1, 2, 7, 8 ❌(excluding the last sorted element)
    // third iteration
    // 1, 3, 2, 7, 8
    // 1, 2, 3, 7, 8
    // 1, 2, 3, 7, 8 ❌ (excluding the last sorted element)
    // 1, 2, 3, 7, 8 ❌
    // fourth iteration
    // 1, 2, 3, 7, 8
    // 1, 2, 3, 7, 8 ❌(excluding the last sorted element)
    // 1, 2, 3, 7, 8 ❌
    // 1, 2, 3, 7, 8 ❌
    // fifth iteration
    // 1, 2, 3, 7, 8 ❌
    // 1, 2, 3, 7, 8 ❌
    // 1, 2, 3, 7, 8 ❌
    // 1, 2, 3, 7, 8 ❌

    // Time complexity: O(n^2)
    // Space complexity: O(1)

    // Bubble sort is not suitable for large data sets.
    // It has a worst-case and average time complexity of O(n^2), where n is the
    // number of items being sorted.
    // Bubble sort has a space complexity of O(1), meaning it does not use any additional
    // data structures.


    // Bubble sort runs (n-1) loop
    /*
     * Best case time complexity O(n)
     * Average case time complexity O(n^2)
     * Worst case time complexity O(n^2)
     * 
     * Algorithm
     * Compare the first two elements. If the first is greater than the second, swap
     * them.
     * Move to the next pair and repeat step 1.
     * Continue until the last element of the array.
     * The largest element is now at the end.
     * Repeat the process for the remaining array (excluding the last sorted
     * element).
     * Continue until the array is fully sorted.
     */

     public static void  printArray(int arr[]){
         for (int i=0; i < arr.length; i++)
             System.out.print(arr[i]+" ");
         System.out.println();
     }

     public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        // bubble sort 
        // outer loop for counting n-1 iterations
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] >  arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; // swapping elements in the array at i and i+1 index positions.
                    
                }
            }
        }

        // print sorted array
        System.out.println("Sorted array in ascending order:");
        printArray(arr);

     }

}

/*
 * 
 * Lec-46: BUBBLE SORT in PYTHON(DSA in PYTHON) with Code
 * 
 * def bubble_sort(arr):
 * n = len(arr) // 4
 * for i in range(n): // outer loop i = 0 (0-3(4-1)
 * swapped = False
 * // 0 - 2
 * for j in range(0, n-i-1): // inner loop () 4-0-1 = 4 - 1 = 3(3-1 = 2)
 * if arr[j] > arr[j+1] : // arr[10] > arr[20] = false initially j=0 now j= 1,
 * arr[20] > arr[30] false, j=1 to j=2, arr[30] > arr[40] false, arr[40] >
 * arr[40] false
 * arr[j], arr[j+1] = arr[j+1], arr[j]
 * swapped = True
 * return arr
 * 
 * if not swapped:
 * break
 * return arr
 * 
 * // 0 1 2 3
 * arr = [10, 20, 30, 40];
 * // 2 is J's end point and 3 is i's end point
 * 
 * bubble_sort(arr)
 * print("sorted array:", arr)
 * 
 * 
 */