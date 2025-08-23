public class FirstAndLast_Position {// DSA-File
    
    public static void main(String[] args) {
        
        int[] nums = {// sorted array
                5, 7, 7, 7, 8, 8, 10
        };

        int target = 7;

        int[] result = searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]"); // Output: [1, 3]


    }

    public static int[] searchRange(int[] arr, int target) {

        // linear search approach
        int first_index = -1;
        int last_index = -1;

        int [] ans ={-1,
                      -1,
                    };

       for (int i = 0; i < arr.length; i++) {
          if (target == arr[i]) {
             first_index = i;
             break;
          }
       }

       for (int i = arr.length - 1; i >= 0; i--) {
          if (target == arr[i]) {
             last_index = i;
             break;
          }
       }

    //    return new int[] { first_index, last_index };
         ans[0] = first_index;
         ans[1] = last_index;
    
         return ans;

    }

}
