public class Recursion {
    // Prerequisites i. Iteration/loops ii. Functions
    // A function that calls an inner function, where the inner function performs a calculation and returns a value to the outer function. 
    // (main function) calls funtions that calls another function this cycle continues until the base condition is reached then function return the value to inner functions to the main function
    /*
    1. Recursive function must call's itself directly or indirectly (A recursive function is a function that calls itself to solve a problem.)
    2. Recursive function must have a base case (Recursion is a method of solving a problem by breaking it down into smaller subproblems of the same type until a base case is reached)
    3. Recursive function must have a change in its input to move towards the
    base case
    4. Recursive function must not lead to a stack overflow
    5. Recursive function should be efficient and avoid redundant calculations
    6. Recursive function should minimize unnecessary additional data structures
    7. Recursive function must not use any global variables
    8. Recursive function must have a clear and concise return statement (The return statement is used to terminate a function and return a value from the function.)
    9. Recursive function should not use any built-in functions or libraries that directly solve the problem (Recursive functions are usually implemented manually to avoid using built-in functions or libraries that have already been optimized for recursion.)
    */

    // Qs. 
    // Print Numbers from 5 to 1
    /*
    for(i=1; i <= 5; i++){
        System.out.println(i);
    }
        or

    for(i=5 ; i>0; i--){
        System.out.println(i);
    }

    or(recursive form)

    // recursion is done in functions
    public static void printNumbers(int n){
        
        if(n == 0){
            return; // base case
        }


        system.out.println(n);
        // assume n-1 values are given by the inner functions
        // assume that 4 and before 4 will all get printed


        printNumbers(n-1);// recursive call
    }

    */

    // main function
    // the main function is the entry point of the program, where the execution starts.

    public static void main(String[] args) {
        int n =5;
        int num = 1;
        int fact = 1;

        printNumbers(n);  // 5-4-3-2-1 decrease by 1
                
                /*printNumbers(4); // 4-3-2-1 decrease by 1
                printNumbers(3); // 3-2-1 decrease by 1
                printNumbers(2); // 2-1 decrease by 1
                printNumbers(1); // 1 decrease by 1
                printNumbers(0); // base case reached, nothing to print so function returns
                base case reached, function returns to the previous function and prints 0
                base case reached, function returns to the previous function and prints 1
                base case reached, function returns to the previous function and prints 2
                base case reached, function returns to the previous function and prints 3
                base case reached, function returns to the previous function and prints 4*/

        printIntegers(num);

        // int i, int n, int sum
        printSumOfNaturalNumbers(1, 5, 0);// 1 to n

        int result = printFactorialOfNumber(n);
        System.out.println("Factorial of number "+n+" is: "+result);   
        
        // Print Fibonacci Series
        printFibonacciSequence(0, num, n-2);// 0, 1, 5-2 = 3, so we need to print 3 terms of fibonacci series
                                        
    }
        
    // methods 
    // A method is a block of code that performs a specific task. It is used to define a function in Java.
    // Print Numbers from 5 to 1
    public static void printNumbers(int n){

        if(n == 0){// variable is created mutiple times in each recursion created a memory space which is not same as in iteration
            return; // base case
        }// if we dont give a base condition to our recursion function, the memory will get full and cause to stack overflow problem raise up to an error

        System.out.println("Print Numbers from 5 to 1: "+n);
        printNumbers(n-1); // 5-4-3-2-1 decrease by 1
        System.out.println();

    }

// javac Recursion.java
// bug
// during recursion, all the function calls(recursive calls) are stored in the form of stack(data-structure).
// main n= 5 -> print number n = 5, based condition is check and it turned out to be be false so -> print numbers n = 4, based condition is check and it turned out to be be false so -> print numbers n = 3, based condition is check and it turned out to be be false so -> print numbers n = 2, based condition is check and it turned out to be be false so -> print numbers n = 1 based condition is check and it iturned out to be true stop(return). then the execution will return to the main function.


    // Print Numbers from 1 to 5
    private static void printIntegers(int n) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'printIntegers'");

        // base condition
        if(n==6){
            return;
        }

        System.out.println("Print Numbers from 1 to 5: "+n);
        printIntegers(n+1);

    }

    // print sum of first n natural numbers
    // sum = {1 + 2 + 3 + 4 + ....n }
    // there are two ways its either can be in assending order(1 to n) or desending order(n to 1)
    // formula n( n + 1) / 2
    private static void printSumOfNaturalNumbers(int i, int n, int sum) {// the first parameter will tell us the current number. the second parameter will tell us the base condition, the third paramter wil tell us the sum of natural numbers
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'printNaturalNumbers'");

        // base condition
        if (i == n) {// Stop when i exceeds n
            sum+=i; // Base case: Add the last number before printing
            System.out.println("Sum of first 'n' natural numbers: "+ sum);// when the base case reached print the sum
            return;
        }

        // print statement
        // we need the sum so we are not printing the sum of in each step.

        sum+=i;

        // Accumulate sum
        // System.out.println("    sum = " + sum + " + " + i + " = " + (sum + i));

        // Recursive call
        printSumOfNaturalNumbers(i+1, n, sum);

        // Backtracking step (optional, to visualize recursion returning)
        System.out.println("Returning from: printSumOfNaturalNumbers(" + i + ", " + n + ", " + sum + ")");
    

/* 
Call Stack Level	                        i	n	sum Before Call	sum After sum+=i(sum = sum + 1)	Recursive Call
printSumOfNaturalNumbers(1,5,0)	            1	5	0	            1(0 + 1)	                    printSumOfNaturalNumbers(2,5,1)
printSumOfNaturalNumbers(2,5,1)	            2	5	1	            3(1 + 2)                         printSumOfNaturalNumbers(3,5,3)
printSumOfNaturalNumbers(3,5,3)	            3	5	3	            6	                            printSumOfNaturalNumbers(4,5,6)
printSumOfNaturalNumbers(4,5,6)	            4	5	6	            10	                            printSumOfNaturalNumbers(5,5,10)

Base Case: printSumOfNaturalNumbers(5,5,10)	5	5	10	15	Print "Sum of first 'n' natural numbers: 15"

    sum = 1 + 1 = 2
    sum = 3 + 2 = 5
    sum = 6 + 3 = 9
    sum = 10 + 4 = 14

                                        i  n  sum
Function Call: printSumOfNaturalNumbers(1, 5, 0)
    sum = 0 + 1 = 1
Function Call: printSumOfNaturalNumbers(2, 5, 1)
    sum = 1 + 2 = 3
Function Call: printSumOfNaturalNumbers(3, 5, 3)
    sum = 3 + 3 = 6
Function Call: printSumOfNaturalNumbers(4, 5, 6)
    sum = 6 + 4 = 10
Function Call: printSumOfNaturalNumbers(5, 5, 10)
    sum = 10 + 5 = 15
    Sum of first 'n' natural numbers: 15
                                         i      previous value's
Returning from: printSumOfNaturalNumbers(4, 5, 10)
Returning from: printSumOfNaturalNumbers(3, 5, 6)
Returning from: printSumOfNaturalNumbers(2, 5, 3)
Returning from: printSumOfNaturalNumbers(1, 5, 1)


*/
    }
/* 
    // print factorial of a number 'n'
    private static void printFactorialOfNumber(int i, int n, int fact) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'printFactorialOfNumber'");

        // base condition
        // if(i > n){
        //     System.out.println("Factorial of "+ n +" is: " + fact);
        //     return;
        // }

        // Base condition: When n reaches 1, print the final factorial value
        // if(n == 1){
        //     // System.out.println("Factorial of "+ i +" is: " + fact);
        //     System.out.println("Factorial of "+ n +" is: " + fact);
        //     return;
        // }

        if(n == 0 || n == 1){
            // System.out.println("Factorial of " + i + " is: " + fact);
            System.out.println("Factorial of " + n + " is: " + fact);
            return;
        }

        // System.out.println("Factorial of "+n+" is: "+n*printFactorialOfNumber(n-1)); // recursive call with n-1
        // instead of this, we can use an iterative approach to calculate factorial
        // long fact = 1;
        // for(int i = 2; i <= n; i++){
        //     fact *= i;
        // }
        // System.out.println("Factorial of "+n+" is: "+fact);

        fact = fact * n;
        // System.out.println("Factorial of "+i+" is: "+fact);

        // n=n-1 = n--
        // printFactorialOfNumber(i++, n-1, fact);
        // The line printFactorialOfNumber(i++, n-1, fact); is incorrect because i++ passes the current value of i and only increments it afterward.
        // Since i is always 1, the function never increments i, leading to confusion.

        printFactorialOfNumber(i, n-1, fact);

        
//          i = number of iterations
//          n = number to calculate factorial

//          Base Case:  
//          if(n == 1)

//          Recursive Call:
//          printFactorialOfNumber(n-1);

//          e.g., 5 * 4 * 3 * 2 * 1 = 120

//          iteration(i)
//             1        fact = n * n-1(5 * 5-1)➡(5 * 4) = 20
//             2        n * (n-i) = 5 * (5 - 5-2)➡(5 * 3) = 15
//             3        n * (n-i) = 5 * (5 - 3)➡ 5 * 2 = 10
//             4        n * (n-i) = 5 * (5-4) ➡ 5 * 1 = 5
        
//         this was my logic which was incorrect ❌


//             fact = fact * n then n-- ✅
// Iteration	Multiplication	Result
// 1	        fact = 1 * 5	5
// 2	        fact = 5 * 4	20
// 3	        fact = 20 * 3	60
// 4           fact = 60 * 2	120
// 5	        fact = 120 * 1	120
            
//         this is correct logic which correctly calculates the factorial of a number.
}
*/

private static int printFactorialOfNumber(int n) {// we are going to return factorial so we dont need to store factorial in an argument
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'printFactorialOfNumber'");

    //          e.g., 5 * 4 * 3 * 2 * 1 = 120
    // 5 * 4! = 5!
    // factorial of n is n * (n-1)!
    //       iteration-1,  step 1. (n-i)= 5-0 = 5 ii. n * (n-1)! = 5 * (5-1)! =  5 * 4! 
    //       iteratiom-2,  step 2, (n-i)= 5-1 = 4 ii. n* (n-1)! = 4 * (4-1)! = 4 * 3!
    //       iteration-3,  step 3, (n-i)= 4-1 = 3 ii. n * (n-1)! = 3 * (3-1)! = 3 * 2!
    //       iteration-4,  step 4, (n-i)= 3-1 = 2 ii. n * (n-1)! = 2 * (2-1)! = 2 * 1!
    //       iteration-5,  step 5, (n-i)= 2-1 = 1 ii. n * (n-1)! = 1 * (1-1)! = 1 * 0! = 1
/*
factorial(5)	5 * factorial(4) => 5 * 24 => 120
factorial(4)	4 * factorial(3) => 4 * 6 => 24
factorial(3)	3 * factorial(2) => 3 * 2 => 6 
factorial(2)	2 * factorial(1) => 2 * 1 => 2
factorial(1)    1 × factorial(0) => 1 * 1 => 1
Base Case Reached:
factorial(1)	1 (Base Case)
factorial(0)=1

Now, multiply the result of each step with the current number:

0!           = 1       
1!           = 1 × 0! = 1 × 1 = 1        
factorial(2) = 2 * 1 = 2
factorial(3) = 3 * 2 = 6
factorial(4) = 4 * 6 = 24(4!)
factorial(5) = 5 * 24 = 120

*/

//          i = number of iterations
//          n = number of calculate factorial

//          Base Case:
if (n == 1 || n ==0) {
    return 1;
}

//          Recursive Call:
// n * (n-1)!
int fact_Ndiff1 = printFactorialOfNumber(n - 1);
int fact_n = n * fact_Ndiff1;

// System.out.println("Factorial of " + n + " is: " + fact_n);

return fact_n;

}

// Print the fibonacci sequence till nth term
// 0 1 1 2 3 5 8 13 21 34 55 ...
// The Fibonacci sequence is a series of numbers in which each number is the sum of the two
// preceding ones, usually starting with 0 and 1. The sequence is defined by the recurrence relation:
// F(n) = F(n-1) + F(n-2) with seed values
// F(0) = 0 and F(1) = 1.

/*
The Fibonacci sequence is defined as follows:

public class Fibonacci {

    public static void main(String[] args) {

    int n = 10; // Number of terms in the Fibonacci sequence
    int a = 0; // First term
    int b = 1; // Second term

    for (int i = 0; i < n; i++) {

    System.out.print(a + " "); // a's value getting update

    // update
        int next = a + b; // Calculate the next term
        a = b; // Update a to the next term
        b = next; // Update b to the next term
    }
}

public class Fibo {

   public static void main (String args[]) {
        int n = 10; // Number of terms in the Fibonacci sequence

        int[] fib = new int[n];

        fib[0] = 0; // First term
        fib[1] = 1; // Second term

        // first two are filled so, start from index 2
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // Calculate the next term
            System.out.print(fib[i] + " ");
        }
        
    }

 
}

 */
// C:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA\FibonacciSequence.java
public static void printFibonacciSequence(int a, int b, int n) {

    if (n==0) {// which nth term becomes 0 it stops
        return;
    }

    // Base case -> nth term
    int c = a + b;// 0 + 1 = 1, 1 + 1 = 2, 
    System.out.println(c);// it printed 1, it printed 2, 

    // 0 1 1 2 3
    // it’s passing values to the next call. n-1 3, 2, 1
    printFibonacciSequence(b, c , n-1); // b = a, c = b, n - 1 (3, 2, 1), now b's value is 1 which becomes a and c's value is 2 which becomes b so addition will be 3
    // The first argument b becomes the new a in the next call.
    // The second argument c becomes the new b in the next call.

}

}


