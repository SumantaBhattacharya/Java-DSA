// class 1: Print Fibonacci Sequence till nth term using recursion

//  To print the Fibonacci sequence till nth term using recursion, you can define a recursive function that calls itself with smaller values of n until n reaches the desired value.
//  Here's an example implementation of a recursive function to print the Fibonacci sequence till the 10th term:
// eg- 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
public class FibonacciSequence {

    public static void main(String[] args) {

        int n = 4;

        int fibonacci = fibo(n);
        System.out.println(fibonacci);

    }

    public static int fibo(int n) {

        // Once a base case (n = 0 or n = 1) returns
        if (n < 2) {// so that 0 and 1 gets printed first
            return n; // 1, 0

        } else {// the else part gets executed first 3

            // here the function is getting called twice
            return fibo(n - 1) + fibo(n - 2); // 3, 2, 1

        }

    }
/*
Call: fibo(4) n = 4 → not less than 2 → else part will execute → return fibo(3) + fibo(2) → fibo(3) = 2 and fibo(2) = 1 so 2 + 1 = 3
Call: fibo(3) n = 3 → not less than 2 → else part will execute → return fibo(2) + fibo(1) → fibo(2) = 1 and fibo(1) = 1 so 1 + 1 = 2
Call: fibo(2) n = 2 → not less than 2 → else part will execute → return fibo(1) + fibo(0) → fibo(1) = 1 and fibo(0) = 0 so 1 + 0 = 1
Call: fibo(1) n = 1 → less than 2 → return 1 
Call: fibo(0) n = 0 → less than 2 → return 0 once it react here then the function will start getting execute and get removed from the stack one by one last in first out
*/

}

/*

Fibonacci number                  Devided by one before                    Ratio

5                                          5/3                              1.66
8                                          8/5                              1.60
13                                         13/8                             1.62
21                                         21/13                            1.61
34                                         34/21                            1.61
55                                         55/34                            1.61                       

golden Ration - 1.6180

*/

/*
 * - The Fibonacci sequence is a series of numbers in which each number is the
 * sum of the two preceding ones, usually starting with 0 and 1.
 * - Fibonacci numbers are defined as follows: F(0) = 0, F(1) = 1, and F(n) =
 * F(n-1) + F(n-2) for n > 1.
 * - For example, the first few Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13,
 * 21, 34, 55, 89, 144, etc.
 * - The Fibonacci sequence is often used in various applications, including
 * computer science, mathematics, and biology.
 * - The Fibonacci sequence has various interesting properties, such as its
 * golden ratio, which is approximately 1.6180339887.
 * - Recursive solutions to the Fibonacci sequence often have a time complexity
 * of O(2^n), which means the number of recursive calls grows exponentially with
 * the input value.
 */