public class L3_nextGreatestLetter {

    public static void main(String[] args){
        
        char[] arr = {'c','f','j','x','x','y','y'};
        char target = 'c';  

        int result = nextGreatestLetter(arr, target);

    System.out.println(result == -1 ? 0 : "Smallest element in the array that is greater than the target is: " + arr[result]);

    }

    public static int nextGreatestLetter(char[] arr, char target) {
        
        if (target > arr[arr.length - 1]) {
            return -1;
        };

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

           int mid = start + (end - start) / 2;

           if(target > arr[mid]){
              start = mid + 1;
           }else{
            end = mid -1;
           }// no equal condition

        }


        return start;      

    }
} 