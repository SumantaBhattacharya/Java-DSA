import java.util.Arrays;

public class linearSearch_2D {
    public static void main(String[] args) {
        // Arrays in Java are special objects that store primitive or reference types.
        int [][] arr = new int [][]{// new int [][] its new mandatory over here. here it automatically knows that
            {69 ,68, 101},
            {420, 180, 181},
            {11, 10, 2004},
            {2020, 2022, 2025},
            {20 , 04}
        }; 

        int target = 04;
        int row = linearSearch(arr, target);

        if (row == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at row: " + row);
        }

        int [] position = linearSearch2(arr, target); // Store row & column index

        // System.out.println(Arrays.toString(position));

        /*if (position[0]!= -1 && position[1]!= -1) {
            System.out.println("Element found at row: " + position[0] + " and column: " + position[1]);
        } else {
            System.out.println("Element not found.");
        }*/

        // position stores {row, column} index returned by linearSearch2.
        // If the element is not found, linearSearch2 returns {-1, -1}, meaning no valid row/column exists.
        /*
        If the element is found, position stores its row and column index.
        So, you can check if position[0] is not -1 to print the row and column index.
        If position[0] is -1, it means the element was not found in the array.
        In that case, you print "Element not found." as usual.
        Note: In the case of 2D array, you can return both row and column indices by modifying the return type of linearSearch from int to int[].
        position[0] means we checking the row
        position[1] means we checking the column
        In this case, you can print "Element found at row: " + position[0] + ", column: " + position[1] as usual.
        But in the case of 1D array, you can simply return position[0] as it represents the row index.*/
        
        if (position[0] == -1) {// this could be like this too position[0] == -1 && position[1] == -1
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at row: " + position[0] + ", column: " + position[1]);
        }// However, since both row and column will always be -1 when not found, checking just position[0] == -1 is enough.
        
    }

    // search in the 2D array: return the row index if the item found
    public static int linearSearch(int[][] arr, int target) {

        if(arr.length == 0){// -1 will never be index
            return -1; // it checks if the array is empty, return -1
        }

        // i is representing row here, and j is column.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {// column is less than the length of that row
                
                if (arr[i][j] == target) {
                    
                    return i; // return the row index where the target is found
                    // To return both row and column indices, you need to change the return type of linearSearch from int to int[], since it needs to return two values.
                    // return new int[]{i, j}; // Return row and column index
                }

            }
        }

        return -1; // if the target is not found in the array

    }

    public static int[] linearSearch2(int[][] arr, int target) {

        if(arr.length == 0){// -1 will never be index
            return new int[]{-1, -1}; // Return {-1, -1}(-1 for both row and column indices ) if array is empty
        }

        // i is representing row here, and j is column.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {// column is less than the length of that row
                
                if (arr[i][j] == target) {
                    
                    return new int[]{i, j}; // Return row and column index
                    // here it doesnt automatically knows that using a new keyword to create an array object in the memory
                    // To return both row and column indices, you need to change the return type of linearSearch from int to int[], since it needs to return two values.
                    // Java doesn’t support array literals for return values.
                }

            }
        }

        return new int[] {-1, -1}; // if the target is not found in the array

    }

    // find maximum in 2D array

    

    // [Additional Notes]:
    // Note: The time complexity of this linear search algorithm is O(n*m), where n is the number of rows and m is the number of columns.
    // This is because in the worst case scenario, the algorithm will have to iterate through every element in the array.
    // If the array is sorted, the time complexity can be reduced to O(n+m) or O(min(n,m)).
    // However, in most practical scenarios, the time complexity remains O(n*m) due to the nature of the problem.
    /*If the 2D array is fully sorted and treated as a 1D sorted array, 
    we can apply binary search to achieve O(log(n*m)) complexity.
    If the 2D array is not sorted, we can still use a binary search algorithm on each row or column to achieve O(log(n) + log(m)) complexity.
    But in this case, the space complexity would be O(log(n) + log(m)) due to the recursive calls in the binary search.
    If the 2D array is extremely large, it might be more efficient to use a different algorithm or data structure, such as a hash table or a balanced search tree.]
    In conclusion, the linear search algorithm is a simple and straightforward solution for searching for an element in a 2D array.
    However, it has a high time complexity and may not be suitable for large data sets.
    For efficient searching in large 2D arrays, consider using a data structure like a hash table or a balanced search tree.
    If the 2D array is sorted, consider using a binary search algorithm to achieve better performance.
    If the 2D array is not sorted, consider using a binary search algorithm on each row or column to achieve better performance.
    If the 2D array is fully sorted (row-wise and column-wise), consider using a 
    binary search algorithm to achieve O(log(n*m)) time complexity.
    If only each row is sorted (but not the entire array), apply binary search on 
    each row separately to achieve O(n log m) time complexity.
    If each column is sorted, apply binary search on each column separately 
    for O(m log n) time complexity.*/
}
