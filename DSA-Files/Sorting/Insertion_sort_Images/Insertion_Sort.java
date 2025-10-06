package Sorting.Insertion_sort_Images;

/* 
Insertion Sort
Insertion sort is a simple, efficient sorting algorithm that works by building a sorted array one element at a time, similar to sorting a hand of playing cards. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and inserted into their correct position in the sorted part.

Algorithm Steps

The algorithm proceeds with the following steps:
Step 1: If the element is the first element, assume it is already sorted.
Step 2: Pick the next element and store it in a variable (often called a key).
Step 3: Compare this key with all elements in the sorted sub-array.
Step 4: If an element in the sorted array is smaller than the key, move to the next element. Else, shift all greater elements one position to the right to make space.
Step 5: Insert the key into its correct position.
Step 6: Repeat steps 2-5 until the entire array is sorted.

Incertion sort is basicallly selction sort with addition to bubble sort
*/

public class Insertion_Sort {
    public static void main(String[] args) {

        int[] arr = {
                5,3,4,1,2
        };

        Incertion_Sort(arr);
        printArray(arr); // print sorted array
    }

    public static void Incertion_Sort(int[] arr) {

        //                  i <= n - 2 
        for (int i = 0; i < arr.length - 1; i++) {
            // for (int index = 0; index <= arr.length - 2; index++) {

            for (int j = i + 1; j > 0; j--) {// j= j-1 this line is responsible for shifting the j and j-1 value if j is updated the j and i is updated

                // j is always going to be grater than 0 and j is always going to be subtracting
                // itself with -1 and j is always starting as i + 1

                //   j     <    (arr[j - 1] = i)
                if (arr[j] < arr[j - 1]) {// if array of j is smaller than the previous element

                    // swap
                    swap(arr, j, j - 1);             
                } else {
                    break;
                }

            }

        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]); 
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}

/*
 * 
 * Incersion Sort
 * -----------
 * 
 * Sorting the array partially
 * 
 * 0, 1, 2, 3, 4
 * [5, 3, 4, 1, 2]
 * ---- Sort till index number 1
 * ------- Sort till index number 2
 * ---------- Sort till index number 3
 * -------------- Sort till index number 4
 * 
 * Put the next element at the correct position
 * 
 * For every index, put the next index element at the correct index left hand
 * side
 * 
 * After 1st pass, i = 0, the first part will be sorted means sort till index
 * number-1 [3, 5, 4, 1, 2]
 * After 2nd pass, i = 1, the second part will be sorted means sort til the
 * index number-2 [3, 4, 5, 1, 2]
 * . [1, 3, 4, 5, 2]
 * . [1, 2, 3, 4, 5]
 * 
 * 0, 1, 2, 3, 4
 * [5, 3, 4, 1, 2] left hand side become sorted
 * 
 * i j 0, 1
 * - = - = (i = 0, j = i + 1) [5, 3] sort this
 * 0 1
 * 0, 1, 2
 * = (i = 1, j = i + 1) [3, 5, 4] sort this
 * 
 * 0, 1, 2, 3
 * = (i = 2, j = i + 1) [3, 4, 5, 1] sort this Outer loop
 * 
 * 0, 1, 2, 3, 4
 * = (i = 3, j = i + 2) [1, 3, 4, 5, 2] sort this
 * 
 * 0, 1, 2, 3, 4
 * = (i = arr.length - 1, j = i + 1) [1, 2, 3, 4, 5] sort this
 * 
 * i / 0 = i = 0 = j
 * 
 * Incertion sort is adaptive : Steps get's reduced if array is sorted, if j !<
 * j-1 break loop
 * no of swaps is reduced as compared to bubble sort
 * Incertion sort is stable
 * Used for smaller values of N => Works good when array is partially sorted
 * this is why it takes part in hybrid sorting algorithms
 * 
 */

 /*
  JECA-2023

  48. Insertion sort algorithm has a best-case time complexity of ______________.

    (A) O(n) (B) O(n2) 
    (C) O(n3) (D) O(n4) 

        (A) O(n)
 
*/