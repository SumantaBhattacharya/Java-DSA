import java.util.Scanner;

public class Number_Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        /*
         12. Print the pattern 

         n=5
                         count
          1   i(row) = 1 one time      | '4' spaces  | (n-i) = 5-(1)=4
         22   i(row) = 2 two time's    | '3' spaces  | (n-i) = 5-(2)=3
        333   i(row) = 3 three time's  | '2' spaces  | (n-i) = 5-(3)=2
       4444   i(row) = 4 four time's   | '1' spaces  | (n-i) = 5-(4)=1
      55555   i(row) = 5 five time's   | '0' spaces  | (n-i) = 5-(5)=0

      
          1   i(row) = 1 one time      | '4' spaces  | (n-i) = 5-(1)=4
         2[]2   i(row) = 2 two time's    | '3' spaces  | (n-i) = 5-(2)=3
        3[]3[]3   i(row) = 3 three time's  | '2' spaces  | (n-i) = 5-(3)=2
       4[]4[]4[]4   i(row) = 4 four time's   | '1' spaces  | (n-i) = 5-(4)=1
      5[]5[]5[]5[]5   i(row) = 5 five time's   | '0' spaces  | (n-i) = 5-(5)=0

         */

         // TODO: Implement the logic to print the number pyramid pattern with n rows.

         for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.err.print(" ");
            }
            // for (int j = 1; j <= (2*i - 1); j++) {
            // for (int j = 1; j <= i; j++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                // System.out.print(i);
                // if (j < i) { // Add space after a number except for the last one in the row
                //     System.out.print(" ");
                // }
            }
            System.out.println();
         }
        sc.close(); // Close the scanner
    }
}
/*

 PS C:\Users\SUDIP BHATTACHARYA\Desktop\advanced-patterns>  c:; cd 'c:\Users\SUDIP BHATTACHARYA\Desktop\advanced-patterns'; &
 'C:\Program Files\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\Ap
pData\Roaming\Code\User\workspaceStorage\e75e112fd5aec8be5dd431ea7fa42275\redhat.java\jdt_ws\advanced-patterns_b9cbd0c6\bin'
 'Number_Pyramid'

Enter the number of rows: 5
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

c:; cd 'c:\Users\SUDIP BHATTACHARYA\Desktop\advanced-patterns'

This ensures that the command runs from the correct directory.
& 'C:\Program Files\Java\jdk-22\bin\java.exe'

This runs the Java application using Java 22 installed in C:\Program Files\Java\jdk-22\bin\java.exe.
'-XX:+ShowCodeDetailsInExceptionMessages'

This is a JVM argument that allows Java to show detailed error messages if something goes wrong.
'-cp' 'C:\Users\SUDIP BHATTACHARYA\...advanced-patterns_b9cbd0c6\bin'

-cp (Classpath flag) tells Java where to find compiled .class files.
The path after -cp is where Java is looking for the compiled class files of your project.

'Number_Pyramid'
This means Java is trying to run the Number_Pyramid class (which should have a main method).
 */