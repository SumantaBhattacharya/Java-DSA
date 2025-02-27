public class Solid_Rhombus {
    public static void main(String[] args) {
        // 11.Print the pattern
        // given n=5 means 5 rows that is i = 5

        /*
last part '0' space             *****    last part '0' space
last part '1' space            *****     last part '1' space
last part '2' space           *****      last part '2' space
last part '1' space          *****       last part '3' space
last part '0' space         *****        last part '4' space

we dont have to count for 'X'
count only the left spaces
                         n*(n-i)=(5-1)=4,(5-2)=3,(5-3)=2,(5-4)=1,(5-5)=0
        *****     <- i=1 4-spaces 5 star
       ***** ̶X̶    <- i=2 3-spaces 5 star
      ***** ̷X̷X̷    <- i=3 2-spaces 5 star
     ***** ̶X̶X̷X̶    <- i=4 1-spaces 5 star
    *****X̷X̷X̷X̷     <- i=5 0-spaces 5 star

    First, print spaces.
    Then, print stars.
    Finally, move to the next line.

         */

         int n = 5;

         for (int i = 1; i <=n ; i++) {
            // calculation for spaces
            for (int j = 1; j <=(n-i)  ; j++) {
                System.err.print(" ");
            }
            // j = n beacuse we want 5 stars in all the rows
            for (int j = 1; j<=n; j++) {
                System.err.print("*");
            }
            System.out.println();
         }


    }
}
/*

Since the two inner loops run in O(n) + O(n) = O(2n) ≈ O(n) for each of the n iterations of the outer loop 
total time complexity is:
O(n)×O(n)=O(n^2)
Space Complexity Analysis:
The program only uses a few integer variables (n, i, j), which take constant space O(1).
No extra data structures are used.
Final Space Complexity: O(1)
 
*/
/*
 PS C:\Users\SUDIP BHATTACHARYA\Desktop\advanced-patterns>  c:; cd 'c:\Users\SUDIP BHATTACHARYA\Desktop\advanced-patterns'; &
 'C:\Program Files\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\Ap
pData\Roaming\Code\User\workspaceStorage\e75e112fd5aec8be5dd431ea7fa42275\redhat.java\jdt_ws\advanced-patterns_b9cbd0c6\bin'
 'Solid_Rhombus'
 */