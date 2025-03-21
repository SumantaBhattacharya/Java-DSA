public class RichestCustomerWealth {
    /* 
https://leetcode.com/problems/richest-customer-wealth/

1672. Richest Customer Wealth
Easy
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 1:

Input: accounts = [[1,2,3],[3,2,1]] 
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.

Example 3:

Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17

Constraints:

m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100

Topics i. Array ii. Matrix

Hint 1
Calculate the wealth of each customer
Hint 2
Find the maximum element in array.

*/

// each inner array considered as the individual person

public static void main(String[] args) {

    int [][] arr = {
        // cols - inside loop going through every column of that row
    //    0 1 2
        {2,8,7}, // rows 0 (the outside loop going through every row)
        {7,1,3}, //      1
        {1,9,5}  //      2
    };

    System.out.println(maximumWealth(arr));

}

public static int maximumWealth(int[][] arr) {// arr here is accounts
    // we want the sum of every of row then check which one is the greatest.

    /*
    int max = 0;
    for (int[] account : accounts) {
        int sum = 0;
        for (int money : account) {
            sum += money;
        }
        max = Math.max(max, sum);
    }
    return max;
    */

    int maxWealth = 0; // Initialize maxWealth to 0.
    // int maxWealth = Integer.MIN_VALUE;

    // Loop through each customer's accounts
    // the outside loop going through every row
    for (int i = 0; i < arr.length; i++) {// rows = customer/persons
/*
For each row, find the sum of money and compare it with maxWealth.
We use a variable maxWealth to keep track of the maximum sum encountered.
If the sum of the current row is greater than maxWealth, update maxWealth.
This ensures that by the end of the loop, maxWealth holds the maximum wealth among all customers.
Time Complexity: O(m × n), where m is the number of customers (rows) and n is the number of banks (columns).*/
          
          int sum = 0; // sum of row

        // when you start a new column take a new sum of that row
        // inside loop going through every column of each row
       for (int j = 0; j < arr[i].length; j++) {// j is column representing money in this scenario
        // here we are not calculating the maximum element of all but calculation the maximum sum of rows of all.
        // Sum up their total wealth of each row

        sum += arr[i][j];// array of row and column
        // one row is finished we will have the sum of that row

       }// going to the next row after this loop

       // maxWealth > sum ✖
       if (sum > maxWealth) { // maxWealth > sum ? maxWealth = sum : maxWealth;
        maxWealth = sum;
       };

     // maxWealth = Math.max(maxWealth, sum); // Update maxWealth if this customer is richer
       
    };

    return maxWealth; // Return the maximum wealth.

};

};