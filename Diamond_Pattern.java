public class Diamond_Pattern {
    /*
     14. Print the pattern

     n=4

     here i is decrementing and j is incrementing
                                                                     stars = 2*i-1(The key rule is BODMAS (Brackets, Orders, Division/Multiplication, Addition/Subtraction).)                                                                                                    
       *      n-i = 4 - 1 = 3 spaces                1 star      +2           2*1-1 = 2 - 1 = 1   so, here the multiplication is done first and then the subtraction is done.      
      ***     n-i = 4 - 2 = 2 space                 3 star      +2           2*2-1 = 4 - 1 = 3                                                                  
     *****    n-i = 4 - 3 = 1 spaces                5 star      +2           2*3-1 = 6 - 1 = 5
    *******   n-i = 4 - 4 = 0 spaces                7 star                   2*4-1 = 8 - 1 = 7
    *******   n-i = 4 - 4 = 0 spaces                7 star      -2           2*4-1 = 8 - 1 = 7
     *****    n-i = 4 - 3 = 1 spaces                5 star      -2           2*3-1 = 6 - 1 = 5
      ***     n-i = 4 - 2 = 2 spaces                3 star      -2           2*2-1 = 4 - 1 = 3
       *      n-i = 4 - 1 = 3 spaces                1 star                   2*1-1 = 2 - 1 = 1
    
    Upper Half of the Diamond (i = 1 to n) = 1 to 4 = i runs from 1 through 4, creating 4 rows.
    Lower Half of the Diamond (i = n to 1) = 4 to 1 = i runs from 4 through 1, (creating 4 rows, repeating middle row)

       
   -----------
       *
      ***
     *****
    *******
   -----------
    *******
     *****
      ***
       *
  ------------
       
     */

     public static void main(String[] args) {
        int n = 4;
         // Upper half of the diamond
        for (int i = 1; i <= n ; i++) {
            // spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half of the diamond
        // for (int i = n - 1; i >= 1; i--) { // i = n - 1 (one row before n to avoid repetition of the middle row).
        for (int i = n ; i >= 1; i--) {
            // spaces same logic as above
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // stars same logic as above
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
     }

}

/*
    PS C:\Users\SUDIP BHATTACHARYA\Desktop\advanced-patterns>  c:; cd 'c:\Users\SUDIP BHATTACHARYA\Desktop\advanced-patterns'; &
 'C:\Program Files\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\Ap
pData\Roaming\Code\User\workspaceStorage\e75e112fd5aec8be5dd431ea7fa42275\redhat.java\jdt_ws\advanced-patterns_b9cbd0c6\bin'
 'Diamond_Pattern'
 */

/*
         int n = 4;
        int space = n - 1;
        int i, j;
        
        // Upper half of the diamond
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;// space = space - 1 => 3-1=2,2-1=1,1-1=0,0-1=0
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower half of the diamond
        space = 1;
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

 */