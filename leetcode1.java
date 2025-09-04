public class leetcode1 {
    // 1295. Find Numbers with Even Number of Digits
    // Given an array nums of integers, return how many of them contain an even
    // number of digits.
    /*
     * Example 1:
     * 
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     * Explanation:
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits.
     * 
     * Example 2:
     * Input: nums = [555,901,482,1771]
     * Output: 1
     * Explanation:
     * Only 1771 contains an even number of digits.
     * 
     * 
     * Constraints:
     * 
     * 1 <= nums.length <= 500
     * 1 <= nums[i] <= 105
     * 
     * Topics
     * i. Array ii. Math
     * 
     * Hint 1
     * How to compute the number of digits of a number ?
     * 
     * Hint 2
     * Divide the number by 10 again and again to get the number of digits.
     * 
     */

    public static void main(String[] args) {

        int[] arr = { 12, 345, 2, 6, 7896 }; // suppose 12 contains 2 digits which is a even number same as 7896
                                             // contaisn 4 digits which is a even number

        int Numbers_withEvenNumber_ofDigits = findNumbers_withEvenNumber_ofDigits(arr);
        int Numbers_withEvenNumber_ofDigit = findNumbers_withEvenNumber_ofDigit(arr);
        int Numbers_withEvenNumbers_ofDigits = findNumbers_withEvenNumbers_ofDigits(arr);
        int Number_withEvenNumbers_ofDigits = findNumber_withEvenNumbers_ofDigits(arr);

        System.out.println("Using Log Method: " + Numbers_withEvenNumber_ofDigits + " numbers have even digits.");
        System.out.println(
                "Using String Length Method: " + Numbers_withEvenNumber_ofDigit + " numbers have even digits.");
        System.out.println(
                "Using Division (/10) Method: " + Numbers_withEvenNumbers_ofDigits + " numbers have even digits.");

                System.out.println("Using Method: " + Number_withEvenNumbers_ofDigits + " numbers have even digits.");

                System.out.println(digits(arr[4]));
                // System.out.println(digits2(arr[4]));
                System.out.println(digits2(-7896));

    }

    // find number of numbers that have even number of digits using linear search
    public static int findNumbers_withEvenNumber_ofDigits(int[] nums) {

        int count = 0; // we are counting the even digits of numbers
        // Loop through each number in nums
        // first we need to find each element containing how many digits
        // Increase count if the number has an even number of digits.
        // After checking all numbers, return the final count of even-digit numbers.

        /*
         * Method 1: Math.log10(num) + 1 (Efficient)
         * Math.log10(num) gives the logarithm of num base 10, which tells us how many
         * digits there are.
         * We add 1 because logs are zero-based.
         * The result is cast to int because Math.log10() returns a decimal value.
         * 
         * Example:
         * num = 12
         * Math.log10(12) = 1.08
         * (int) 1.08 + 1 = 2
         * 
         * So, digits = 2.
         * 
         * ⌊ log10(7896) ⌋ + 1 = 3 + 1 = 4
         * 
         */

        for (int num : nums) {

            int digits = (int) Math.log10(num) + 1;

            if (digits % 2 == 0) {
                count++;
            }

        }

        /*
         * Method 2: Keep dividing by 10 (Traditional way)
         * 
         * anything devide by 10 removes the last element(digit) of the number.
         * 
         * Iteration temp Digits Count
         * 1st 7896 / 10 = 789 1
         * 2nd 789 / 10 = 78 2
         * 3rd 78 / 10 = 7 3
         * 4th 7 / 10 = 0 4
         */

        /*
         * Another approach can be like see here we are counting the digits of each
         * element
         * which is basically the length of each element/number
         * so, if we convert each element of the array into string then we find out its
         * length
         * if its length devisible by 2 count++ else lets remain it to be the same.
         * 
         * Number String.valueOf(num) length() Even or Odd?
         * 12 "12" 2 ✔ Even
         * 345 "345" 3 ✖ Odd
         * 2 "2" 1 ✖ Odd
         * 6 "6" 1 ✖ Odd
         * 7896 "7896" 4 ✔ Even
         * 
         * it doesn't require mathematical operations
         * 
         * Time Complexity Analysis
         * Approach Time Complexity Space Complexity
         * Math.log10(num) + 1 O(n) O(1)
         * Division (/10) O(n log m) O(1)
         * String.valueOf(num).length() O(n) O(1)
         * 
         * However, this method may be slightly slower than log10() because string
         * conversion is a bit more expensive in terms of computation.
         * 
         */

        return count;

    }

    public static int findNumbers_withEvenNumber_ofDigit(int[] arr) {
        /*
         * Another approach can be like see here we are counting the digits of each
         * element
         * which is basically the length of each element/number
         * so, if we convert each element of the array into string then we find out its
         * length
         * if its length devisible by 2 count++ else lets remain it to be the same.
         * 
         * // Steps to approach this problem
         * // 1. Convert the number to string to count digits.
         * // 2. Get the length of the string.
         * // 3. Check if the length is even.
         * // 4. Return true if the length is even, false otherwise.
         * 
         * Number String.valueOf(num) length() Even or Odd?
         * 12 "12" 2 ✔ Even
         * 345 "345" 3 ✖ Odd
         * 2 "2" 1 ✖ Odd
         * 6 "6" 1 ✖ Odd
         * 7896 "7896" 4 ✔ Even
         * 
         * it doesn't require mathematical operations
         * 
         * Time Complexity Analysis
         * Approach Time Complexity Space Complexity
         * String.valueOf(num).length() O(n) O(1)
         * 
         * However, this method may be slightly slower than log10() because string
         * conversion is a bit more expensive in terms of computation.
         * 
         * The String conversion method (String.valueOf(num).length()) is generally
         * faster than the Division method (/10) when counting digits.
         * 
         */
        int count = 0;

        for (int num : arr) {

            int digits = String.valueOf(num).length();// String cannot be converted to int for that we .length() make it
                                                      // a intiger

            if (digits % 2 == 0) {// could be digits.length() too
                count++;
            }

        }

        return count;
    }

    private static int findNumbers_withEvenNumbers_ofDigits(int[] arr) {

        /*
         * Method 2: Keep dividing by 10 (Traditional way)
         * 
         * anything devide by 10 removes the last element(digit) of the number.
         * 
         * Iteration temp Digits Count
         * 1st 7896 / 10 = 789 1
         * 2nd 789 / 10 = 78 2
         * 3rd 78 / 10 = 7 3
         * 4th 7 / 10 = 0 4
         * 
         * Time Complexity Analysis
         * Approach Time Complexity Space Complexity
         * Division (/10) O(n log m) O(1)
         * 
         */

        int count = 0;

        for (int num : arr) {
            int digits = 0;
            int temp = num;// integers of numbers now

            // count the digits of each number
            // The variable temp represents each number individually, not the whole array.
            // It checks one number at a time, digit by digit.
            while (temp != 0) {
                temp = temp / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }

        }

        return count;

    }

    private static int findNumber_withEvenNumbers_ofDigits(int[] nums) {

        int count = 0;

        for (int num : nums) {

            if (even(num)) {
                count++;
            }

        }

        return count;

    }

// A non-static method belongs to an instance of the class, while main() does not create an instance of Solution.
// Java does not allow calling a non-static method directly inside a static method (main()).
    private static boolean even(int num) {// here we are passing the num from the findNumbers method

        int numOfDigits = digits(num);

        if(numOfDigits % 2 == 0){
            return true;
        }

        return false;
        // return numOfDigits % 2 == 0;

        /*
         * 
         * while(n > 0){// could be n != 0 too
         * n = n / 2;
         * count++;
         * }
         * 
         * Steps
         * -----
         * 
         * i. count the number of digits
         * ii. convert the the elments of array to a string eg 1769 => "1769"
         * iii. get the length of the string
         * iv. check if the length is even
         * 
         */

        /*
         * Steps
         * 1. Find the last digit of the number.
         * 2. Check if the last digit is 0, 2, 4, 6, or 8.
         * A number has an even number of digits if the last digit is 0, 2, 4, 6, or 8.
         * 3. Return true if the last digit is 0, 2, 4, 6, or 8, false otherwise.
         * We can check this by performing the modulo operation (%) with 2.
         * If the result is 0, the number has an even number of digits.
         * If the result is not 0, the number has an odd number of digits.
         * 
         * For example:
         * 12345 % 2 = 1 (odd)
         * 12340 % 2 = 0 (even)
         * 1234 % 2 = 1 (odd)
         * 123400 % 2 = 0 (even)
         * 
         * The modulo operation is used here to get the last digit of the number.
         * Then, we compare this digit with 2.
         */

        // this method tells this element contains a even number of digits or not

    }

    // count number of digits in n number
    static int digits(int nums) {

        if(nums < 0){
            nums = nums * -1; // to make it a positive value
        }

        // nums = Math.abs(nums); // Handle negative numbers automatically

        if(nums == 0){
            return 1; // for single digit number
        }

        int count = 0;

        // int digits = String.valueOf(i).length(); // String cannot be converted to int so we used length() to make upto an integer
        // int digits = (int) Math.log10(nums) + 1;

        while (nums > 0) {
            count++;
            nums = nums / 10; // num /=10
            // count++;
        }

        /*
         If count++ is before division → It correctly counts each digit.
         If count++ is after division → It increments count one extra time after num becomes 0, leading to an off-by-one error.
         */

        return count;

    }

    static int digits2(int num){
        // int count = 0;

        num = Math.abs(num); // Handle negative numbers automatically

        if (num == 0) return 1; // Special case for 0

        return (int) Math.log10(num) + 1;

    }

}

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/


/*

class Solution {

    public static void main(String [] args){

        int [] arr = {12,345,2,6,7896};

        int result = findNumbers(arr);

        System.out.println(result);

    }

    public static int findNumbers(int[] nums) {

        int count = 0;


        for(int i : nums){

           int digits = String.valueOf(i).length(); 

           if(digits % 2 == 0){

               count++;
             
           }

        }

        return count;

    }
}

 */

 /*

 class Solution {

    public static void main(String [] args){

        int [] arr = {12,345,2,6,7896};

        int result = findNumbers(arr);

        System.out.println(result);

    }

    public static int findNumbers(int[] nums) {

        int count = 0;


        for(int num : nums){

           if(even(num)){
            count++;
           }

        }

        return count;

    }

    public static boolean even(int nums) {// here we are passing the num from the findNumbers method
    // to check it has a even number of digits or not
    
       int numOfDigits = digits(nums);

       return numOfDigits % 2 == 0;



    }

    public static int digits(int nums){

        if(nums < 0){
            nums = nums * -1; // to make it a positive value
        }

        if(nums == 0){
            return 1;
        }

        int count = 0;

        while(nums > 0){

            count++;

            nums = nums / 10;

        }

        return count;

    }

}

  */