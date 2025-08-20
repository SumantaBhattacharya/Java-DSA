/*

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1

Constraints:
3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.

*/

public class LC1_PeakIndex {//Peak Index in a Mountain Array
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14 , 16, 18};
        int target = 15; // Example target value

        // Assuming you want to find the peak index in the mountain array
        int peakIndex = peakIndexInMountainArray(arr, target);
        if (peakIndex == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Smallest element in the array that is greater than or equal to the target is: " + peakIndex);
        }
    }

    public static int peakIndexInMountainArray(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){// index
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1; // Move to the right half
            } else if (target < arr[mid]) {
                end = mid - 1; // Move to the left half
            } else {
                return mid; // Element found at index mid
            }

        }

        // this will give the smallest element greater than or equal to the target when the condition is violated
        return arr[start];//  it will return only execute if element is not found so will it return after enetering the loop and no element is found right or if the condioton is not matched return

    }

}

/*

arr = [2, 3, 5, 9, 14, 16, 18]
target = 14

Ceiling = Smallest element in the array that is greater than or equal to the target.

Ceiling(arr, target = 14) = 14
Ceiling(arr, target = 15) = 16

// check how the mid is calculated
if(isAsc){
   if(target >= arr[mid]){
    ceiling = mid + 1;
   }else if(target <= arr[mid]){ // t=7
      ceiling = mid - 1;
    }
}

if you are not finding the element, you will just return the next greater element
for the ceiling question if the target element is not found return the graeter element than the target element 

Example Walkthrough:

Case 1 (Target = 14):
arr[mid] = 9 → 14 > 9 → move right.
arr[mid] = 16 → 14 < 16 → ceiling = 16, move left.
arr[mid] = 14 → exact match → return 14.

Case 2 (Target = 15):
arr[mid] = 9 → 15 > 9 → move right.
arr[mid] = 16 → 15 < 16 → ceiling = 16, move left.
Now start > end, exit loop → return 16.


 */

/*
im finding 480 is 420 is less than 480 it shouldnt come but 781 the smalles grater than 480 so 781 but im confiused that initially mid is 180 so it will go to right half 420 and 781 so then start will become 420 and end will become 781 then target is 480 so then mid becomes 420 the ill check 480 > 420 yes so mid + 1 then 781 so mid becomes 781 target 480 > 781 false it will end the loop and  and 781 becomes the start and return it

Loop Iterations
1. First Iteration (start=0, end=4)
mid = start + (end - start)/2 = 0 + (4-0)/2 = 2

arr[mid] = 180

Check: 480 > 180 → True

Move right: start = mid + 1 = 3

2. Second Iteration (start=3, end=4)
mid = 3 + (4-3)/2 = 3

arr[mid] = 420

Check: 480 > 420 → True

Move right: start = mid + 1 = 4

3. Third Iteration (start=4, end=4)
mid = 4 + (4-4)/2 = 4

arr[mid] = 781

Check: 480 > 781 → False

Move left: end = mid - 1 = 3

4. Loop Condition (start <= end)
Now, start = 4, end = 3 → 4 <= 3 is False → Exit loop




Loop Iterations
First Iteration (start=0, end=4)

mid = 0 + (4-0)/2 = 2 → arr[mid] = 180

Check: 70 < 180 → True

Move left: end = mid - 1 = 1

Second Iteration (start=0, end=1)

mid = 0 + (1-0)/2 = 0 → arr[mid] = 68

Check: 70 > 68 → True

Move right: start = mid + 1 = 1

Third Iteration (start=1, end=1)

mid = 1 + (1-1)/2 = 1 → arr[mid] = 69

Check: 70 > 69 → True

Move right: start = mid + 1 = 2

Loop Condition (start < end)

Now, start = 2, end = 1 → 2 < 1 is False → Exit loop


suppose i have arrat [2,3,5,9,14,16,18] target is 15 so first mid element is 9 15 > 9 true so right shift [14,16,18] 14 becomes the mid then we will checkl is 15 > 14 True right shift mid + 1, 16 start becomes index 5 whihc is 16  and end was 14 5 <= 4 is False → Exit loop return 6
 */

/*
 
find the floor of a number 
floor - biggest number smaller or equal to the target number
           
             0, 1, 2, 3,  4,   5, 6
int[] arr = {2, 3, 5, 9, 14 , 16, 18};

floor of 15 is 14
ceiling of 15 is 16

{2, 3, 5, 9, 14} all these are falls in smaller or equal to the target number
the biggest number smaller to the target number is 14

same thing as ceiling, just return end instead of -1 if number is not found

Start target End so the target should be in between if the target is not falls in between either the target is before the start or after the end
if the target is before the start then it ends up calling ceiling 
if the target is after the end then it ends up calling floor

when the target is not found, it will return the next greater element for ceiling and next smaller element for floor

when condition is violated Start > End
Start =  End + 1; // ceiling - if you need to find next biggest element when the condition is violated because of this (Start > End)
End = Start - 1; // floor - if you need to find next smallest element when the condition is violated because of this (start > end)

Ceiling ends up on the right side (index start)
Floor ends up on the left side (index end)

so sum up, we need to find the floor we need to return end if you need to find the ceiling we need to return start


Time Complexilty is log(n) where n is the number of elements in the array
 */

/*
 smallest character from the right side 
 grater than the target means ceiling
 */
