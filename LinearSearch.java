public class LinearSearch {
    public static void main(String[] args) {
        int target;
        target = 19;
        
        int [] arr = {420, 69, 68, 180, 181, 101};

        int result = LinearS(arr, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }
    // search in the array: return the index if the item found
    // otherwise if not found return -1
    public static int LinearS(int [] arr, int target) {

        if(arr.length == 0){// -1 will never be index
            return -1; // it check's If the array is empty, return -1
        }else{
            for(int i=0; i < arr.length; i++){

                if(arr[i] == target){
                    return i;
                } // If the target is found, return the index

            }// think what if the target is not found then how do we hadle this so we return -1 

            return -1;

        }
    }
}
// Java doesn't allow two main methods with different parameters to be used as entry points.
/*
if the target is NOT found then the method loops through the array.
If it doesn't find target, the function reaches the end without returning anything.
Since Java requires all possible code paths to return a value, the compiler throws an error.
*/
/*
 c:; cd 'c:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA'; & 'C:\Program Files
\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\AppData\Roaming\Code
\User\workspaceStorage\a2f98c90904ed0cbb5cb5c15e30f1d9d\redhat.java\jdt_ws\JAVA-DSA_f3908bcf\bin' 'LinearSearch'
 */