// class 1: Print Fibonacci Sequence till nth term using recursion

//  To print the Fibonacci sequence till nth term using recursion, you can define a recursive function that calls itself with smaller values of n until n reaches the desired value.
//  Here's an example implementation of a recursive function to print the Fibonacci sequence till the 10th term:
// eg- 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
public class FibonacciSequence {

    public static void main(String[] args) {
        
        int n = 6;

        int fibonacci = fibo(n);
        System.out.println(fibonacci);
        
    }

    public static int fibo(int n){

        if(n < 2){// so that 0 and 1 gets printed first
            return n;
        }else{

            return fibo(n-1) + fibo(n-2);

        }

    }

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

- The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.

- Fibonacci numbers are defined as follows: F(0) = 0, F(1) = 1, and F(n) = F(n-1) + F(n-2) for n > 1.

- For example, the first few Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc.

- The Fibonacci sequence is often used in various applications, including computer science, mathematics, and biology.

- The Fibonacci sequence has various interesting properties, such as its golden ratio, which is approximately 1.6180339887.

- Recursive solutions to the Fibonacci sequence often have a time complexity of O(2^n), which means the number of recursive calls grows exponentially with the input value.

 */

 /*
PS C:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA>  c:; cd 'c:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA'; & 'C:\Program Files\Java\jdk-22\bin\
java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\AppData\Roaming\Code\User\workspaceStorage\a2f98c90904
ed0cbb5cb5c15e30f1d9d\redhat.java\jdt_ws\JAVA-DSA_f3908bcf\bin' 'FibonacciSequence'
  */