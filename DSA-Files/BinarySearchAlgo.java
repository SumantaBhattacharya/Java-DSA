// import java.lang.Thread.State;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int arr[] = {

            //  0, 1, 2, 3,  4,  5,  6,  7,  8,  9,
                2, 5, 8, 12, 16, 23, 38, 56, 72, 91

        };

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int ans = BinarySearch(arr, 12);
        System.out.println(ans);

    }

    public static int BinarySearch(int [] arr, int target ){

        int Start = 0, End = arr.length - 1;

        // int mid = Start + End / 2; // this devides by 2 first
        
        while (Start <= End) {

            //int mid = (Start + End) / 2;// we have to include mid inside the loop to calculate multiple times
            int mid = Start + (End - Start) / 2;  // Safe middle index calculation

            if (target > arr[mid]) {
                Start = mid + 1;

            }else if(target < arr[mid] ){
                 End = mid - 1;
            }else {
                return mid;      
            }
        }

        return -1;//  it will return -1 if element is not found so will it return -1 after enetering the loop and no element is found right or if the condioton is not matched return -1

    }

}
