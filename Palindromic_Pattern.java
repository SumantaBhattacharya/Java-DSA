import java.util.Scanner;

public class Palindromic_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        /*
         palindrome example:- sos, Bob, Dada,
                
        1XXXX      4 spaces = (n-1) = (5-1) | i(no of rows)= 1
       212XXX      3 spaces = (n-1) = (5-2) | i(no of rows)= 2 
      32123XX      2 spaces = (n-1) = (5-3) | i(no of rows)= 3
     4321234X      1 spaces = (n-1) = (5-4) | i(no of rows)= 4
    543212345      0 spaces = (n-1) = (5-5) | i(no of rows)= 5

    part-1  part-2                             first part(for(j=i to 1))(backwards/decrement)     secons half(for(j=2 to 1))(forwards\increments)
        1 | XXXX      i(no of rows)= 1          1             
       21 | 2XXX      i(no of rows)= 2          2-1             2
      321 | 23XX      i(no of rows)= 3          3-2-1           2-3
     4321 | 234X      i(no of rows)= 4          4-3-2-1         2-3-4
    54321 | 2345      i(no of rows)= 5          5-4-3-2-1       2-3-4-5

         */

        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            // for spaces
            for (int j = 1; j <=(n-i); j++) {
                System.err.print(" ");
            }
            // 1st half numbers
            for (int j = i; j >= 1; j--) {// suppose i = 2(2nd row) so then j = also 1 then it will decrement 1,2-1,3-1,4-1,5-1
                System.out.print(j);
            }
            // 2nd half numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
}
}

/* 

PS C:\Users\SUDIP BHATTACHARYA\Desktop\advanced-patterns>  & 'C:\Program Files\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetai
lsInExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\AppData\Roaming\Code\User\workspaceStorage\e75e112fd5aec8be5dd431e
a7fa42275\redhat.java\jdt_ws\advanced-patterns_b9cbd0c6\bin' 'Palindromic_Pattern'

Output:
Enter the number of rows: 5
        1
       212
      32123
     4321234
    543212345

*/
