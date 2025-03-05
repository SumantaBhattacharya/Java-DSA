// import java.util.*;
import java.util.Scanner;
import java.awt.Point;

// Define a class named Arrays_Exercise2
public class Arrays_Exercise2 {
    
        // EXERCISE
        // Write a program that fills an array with n integers entered by the user
        // Suppose that the user can enter atleast 1 number and at most 20 numbers

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            while (size > 20 || size <= 0) {
                System.out.println("Invalid number, try again: ");
                size = sc.nextInt();
            }

            Point[] arrOf_Points = new Point[size];

            fillArrayOfPoints(arrOf_Points);
            printArrayOfPoints(arrOf_Points);

            sc.close();

        }

        // Method to fill the array with Point objects
        public static void fillArrayOfPoints(Point[] arr) {// arr = arrOf_Points
            Scanner sc = new Scanner(System.in);
            
            
            for (int i = 0; i < arr.length; i++) {
                // int point = sc.nextInt();
                System.out.print("Enter x and y for the points " + (i + 1) + ": ");

                arr[i] = new Point(sc.nextInt(), sc.nextInt());
                
            }

            sc.close();

        }

        // Method to print the array of Point objects
        public static void printArrayOfPoints(Point[] arr) {
            for (int i = 0; i < arr.length; i++) {
                // System.out.println("Point " + (i + 1) + ": (" + arr[i].getX() + ", " + arr[i].getY() + ")");
                System.out.println(("("+ arr[i].x + ", " + arr[i].y + ")"));
            }
        }

}

/*
 PS C:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA>  c:; cd 'c:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA'; & 'C:\Program Files
\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\AppData\Roaming\Code
\User\workspaceStorage\a2f98c90904ed0cbb5cb5c15e30f1d9d\redhat.java\jdt_ws\JAVA-DSA_f3908bcf\bin' 'Arrays_Exercise2'
Enter the size of the array: 3
Enter x and y for the points 1: 1 3
Enter x and y for the points 2: 8 4
Enter x and y for the points 3: 0 1
(1, 3)
(8, 4)
(0, 1)
 */
