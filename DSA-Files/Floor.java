public class Floor {
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 5, 9, 14 , 16, 18};
        int target = 15; // Example target value

        // Assuming you want to find the floor of the target in the array
        int floorIndex = findFloor(arr, target);
        System.out.println(floorIndex == -1 
            ? "Target not found in the array." 
            : "Largest element in the array that is less than or equal to the target is: " + arr[floorIndex]);

    }

    // floor - biggest number smaller or equal to the target number
    public static int findFloor(int[] arr, int target) {

        if (target < 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }

        }

        return end; // it gives the floor of a number 
        
    }

}
