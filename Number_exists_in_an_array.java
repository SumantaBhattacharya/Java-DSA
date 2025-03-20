public class Number_exists_in_an_array{
    public static void main(String[] args){

      int [] arr = { 18, 12, 9, 14, 77, 50} ;

      boolean bool = false;

      for(int i=0; i<arr.length; i++){
        if(arr[i] == 14){
            // if we directly print this, then it will continue the search even after printing that we gotten the number in an array, so because of that we need to break and exit from the search/loop when the desired element is found.
            // System.out.println("yes, number exists in array")
            bool = true;
            break;
        }
        // continue
        // else{
            // System.out.println("No, number not exists in array")
        // }

    }

    if (bool) {
        System.out.println("Yes, number exists in array");
    } else {
        System.out.println("No, number not exists in array");
    }
     
    }
}