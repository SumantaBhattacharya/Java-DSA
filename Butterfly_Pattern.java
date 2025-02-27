public class Butterfly_Pattern {
    /*
     * 10. Print the pattern
     * 
     * n=4
     * 
     * the spaces are multiple of 2
     * 
     * the 2 is constant
     * * 6(2*3(n(4)-1))-spaces in between
     ** ** 4(2*2(n(4)-2))-spaces in between
     *** *** 2(2*1(n(4)-3))-spaces in between
     ******** 0(2*0(n(4)-4)))-spaces in between
     ******** 0(2*0(n(4)-4)))-spaces in between
     *** *** 2(2*1(n(4)-3))-spaces in between
     ** ** 4(2*2(n(4)-2))-spaces in between
     * * 6(2*3(n(4)-1)))-spaces in between
     * 
     * spaces = 2*(n-1)
     * 4 1++
     * 
     * 1-star 6-spaces 1-star
     * 2-stars 4-spaces 2-stars
     * 3-stars 2-spaces 3-stars
     * 4-stars 4-stars
     * 3-stars 2-spaces 3-stars
     * 2-stars 4-spaces 2-stars
     * 1-stars 6-spaces 1-stars
     * 
     * for the first part
     * In the first part, i starts at 1 and increments to n.
     * The number of spaces in the middle decreases as i increases.
     * Row (i) Left Stars Spaces (Middle) Right Stars
     * 1 * 6 spaces *
     * 2 ** 4 spaces **
     * 3 *** 2 spaces ***
     * 4 **** 0 spaces ****
     * 
     * In the second part, i starts at n and decrements to 1.
     * The number of spaces in the middle should increase as i decreases.
     * 
     * Row (i) Left Stars Spaces (Middle) Right Stars
     * 4 **** 0 spaces ****
     * 3 *** 2 spaces ***
     * 2 ** 4 spaces **
     * 1 * 6 spaces *
     * 
     * The number of stars in the first part is the same as the number of stars in
     * the last part
     * 
     * -----------
     * * i=1, 2*(n-i), j=1,
     ** ** i=2, 2*(n-i), j=2
     *** *** i=3, 2*(n-i), j=2
     ******** i=4, 2*(n-i), j=4
     * -----------
     ******** i=4, 2*(n-i), j=4
     *** *** i=3, 2*(n-i), j=2
     ** ** i=2, 2*(n-i), j=4
     * * i=1, 2*(n-i), j=6
     * -----------
     * 
     * for the first part
     * -------------------
     * 
     * 1-n(4)
     * 
     * The formula for spaces should be:
     * 
     * spaces=2×(𝑛−𝑖)
     * 
     * 
     * here i is incrementing
     * 
     * i = 1 → 2 * (4 - 1) = 2 * 3 = 6 spaces
     * i = 2 → 2 * (4 - 2) = 2 * 2 = 4 spaces
     * i = 3 → 2 * (4 - 3) = 2 * 1 = 2 spaces
     * i = 4 → 2 * (4 - 4) = 2 * 0 = 0 spaces
     * 
     * for i=1 to n
     * for j=1 to i
     * print *
     * for j=1 to 2*(n-i)(spaces)
     * print " "
     * for j=1 to i
     * print *
     * print new line
     * 
     * 
     * for the second part
     * ----------------------
     * spaces=2×(n−i)
     * 
     * i=n=4=rows
     * for i=n to 1
     * here i is decrementing
     * i = 4 → 2 * (4 - 4) = 2 * 0 = 0 spaces
     * i = 3 → 2 * (4 - 3) = 2 * 1 = 2 spaces
     * i = 2 → 2 * (4 - 2) = 2 * 2 = 4 spaces
     * i = 1 → 2 * (4 - 1) = 2 * 3 = 6 spaces
     * 
     * Explanation of the Code
     * First Half (Top Part)
     * i = 1: 1 star, 6 spaces, 1 star
     * i = 2: 2 stars, 4 spaces, 2 stars
     * i = 3: 3 stars, 2 spaces, 3 stars
     * i = 4: 4 stars, 0 spaces, 4 stars
     * Second Half (Bottom Part)
     * i = 4: 4 stars, 0 spaces, 4 stars
     * i = 3: 3 stars, 2 spaces, 3 stars
     * i = 2: 2 stars, 4 spaces, 2 stars
     * i = 1: 1 star, 6 spaces, 1 star
     * 
     * 
     */

    public static void main(String[] args) {
        int n = 4;
        // Upper half of the butterfly
        // O(n)
        for (int i = 1; i <= n; i++) { // means the number of rows is equal to the stars-
            // Upper half of the butterfly
            for (int j = 1; j <= i; j++) { // O(i)  → Left stars
                System.out.print("*");
            } // different j from the next scope

            // calculation for the spaces, 2 here is constant
            for (int j = 1; j <= 2 * (n - i); j++) {// O(n)  → Spaces
                System.out.print(" ");
            }

            // calculation for the left stars
            for (int j = 1; j <= i; j++) { // O(i)  → Right stars
                System.out.print("*");
            }
            
            System.out.println();// to go for the next line each iteration
        }
        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}

// Time Complexity Analysis:
// The program uses two nested loops to print the pattern.
// The outer loop runs n times, and the inner loops run in O(n) time.
// The total time complexity is O(n) * O(n) = O(n^2).
// Thus, the time complexity for the upper half:
//        inner loops
//       O(i)+O(n)+O(i) =O(2i+n)=O(i+n)
// outer loops * inner loops 
// O(n)×(O(i)+O(n)+O(i))=O(n)×O(n)=O(n^2)

// Space Complexity Analysis:

/*
 * Ensure that the entire command is written in a single line:
 * & 'C:\Program Files\Java\jdk-22\bin\java.exe'
 * '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\SUDIP
 * BHATTACHARYA\AppData\Roaming\Code\User\workspaceStorage\
 * e75e112fd5aec8be5dd431ea7fa42275\redhat.java\jdt_ws\advanced-
 * patterns_b9cbd0c6\bin' 'Butterfly_Pattern'
 * If PowerShell splits the command into multiple lines, try using backticks (`)
 * to manually break the line correctly:
 * & 'C:\Program Files\Java\jdk-22\bin\java.exe' `
 * '-XX:+ShowCodeDetailsInExceptionMessages' `
 * '-cp' 'C:\Users\SUDIP
 * BHATTACHARYA\AppData\Roaming\Code\User\workspaceStorage\
 * e75e112fd5aec8be5dd431ea7fa42275\redhat.java\jdt_ws\advanced-
 * patterns_b9cbd0c6\bin' `
 * 'Butterfly_Pattern'
 * 
 */