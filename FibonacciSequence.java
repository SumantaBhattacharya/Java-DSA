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
 if we give input 50 this will result in exponensial time complexity because the recursion tree is re-evaluating the same things over and over again. Refer to C:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA\FibonacciSequence\81a23854-fd88-4fac-b60b-82eb513a0bdf.jpg 
 Time Complexity - i. time complexity is not equal to time taken to run a program. i.i. in a faster machine the slope of the graph is reduced even though the time taken is different but the relationship between the size and the time is same, in both the cases, the time will grow linearly i.ii. time complexity is a function that tells us how the time is going to grow as the input grows (is actually a function that gives us the relationship about how the time wil grow as the input grows). actual time taken is differ from machine to machine
 constant will take O(1) linear, linear search will take O(n), binary search will take O(log(n)). Even though the value of actual time is different they are all growing linearly.
 when the array is starting constant will takes the most amount of time then O(log n) then O(n). 
 considerable things about complexity 
 i. Always look for worst-case complexity. 
 ii. Always look at complexity for large data. 
 iii. Always know time wil grow as the input grows. 
 iv. we ignore all constants (less dominating terms) in time complexity.
 
 O(3 N^3 + 4 N^2 + 5 N + 6)
 O(N^3 +N^2 +N) iv.(remove the constants)
 O(N^3)          v.(remove the less dominating terms)

 Big O notation - describes the upper bound of the growth rate of a function. 
 O(N^3) - Upper bound means the size of the array will grow as the input grows in a n cube passion

 mathametical representation - (O(f(N))/O(g(N)) is understood as the set of functions that are bounded above by f(N)/g(N) in the limit as N→∞)
 f(n) = o(g(n))

 limits 
 N -> ∞ ➡ f(n)/g(n) < ∞

 O(N^3) = O(3 N^3 + 4 N^2 + 5 N + 6)
 f(n)            o(g(n))

 limit (when the value of n reaches close to infinity)
 N -> ∞            O(3 N^3 + 4 N^2 + 5 N + 6) /  O(N^3) = 

 O(3 N^3 + 4 N^2 + 5 N + 6) is equivalent to O(N^3)

 Therefore, the expression becomes:
     O(N^3) / O(N^3)
     O(N^3) / O(N^3)= O(1).

 O(N^3) = O(6 N^3 + 3 N + 5)
 g(N)  =    f(N)

  limit
 N -> ∞           (6 N^3 + 3 N + 5)
 N -> ∞           (6 + 3/N^2 + 5/N^3)
 N -> ∞           6 + 3/∞ + 5/∞ (anything devided by infinity is equal to 0)
 N -> ∞           6 + 0 + 0 
 N -> ∞           6 is the upper bound(our algorithm will never exceed the complexity of this)

 f(n)/g(n) < ∞
 6 < ∞

 But when we use Big 0 notation

 limit
 N -> ∞           O(6 N^3 + 3 N + 5)
 N -> ∞           O(N^3 + N )
 N -> ∞           O(N^3)

 O(N^3) / O(N^3) = O(1).

 O(n^2)
--------

 n = 4

 function sqaure(n){  
   for(int i = 0; i < n; i++){ // each side will be same length  
    for(int j = 0; j < n; i++){ // j will execute 4 times in 4 (0, 1, 2, 3) rows and 4 (0, 1, 2, 3) columns
      System.out.println("i: " + i + "and" + "j " + j); // exch time, j will execute till 4 then i will be incremented the j will execute again this loop will continue until i runs running.
    }// forming a matrix we can look at i as columns and j as rows. "row" is line horijontally and "column" is a line vertically
   }// Area of square = Side length × side length that going to equal number of cells within this matrix that also happens to be the number of times that we have to perform this code. 4 * 4 is 4^2 = 16 cells O(N^2)
 }

 O(N cubed) or O(N^3)
 -------------------

 n = 4

 function cube(n) {
    for(int i = 0; i < n; i++){ // for every iteration of this for loop is going to iterate through the entirity of its inner for loop 
        for(int j = 0; j < n; i++){ // and for every iteration of this for loop will need to iterate though the entirity of inner for loop
            for(int k = 0; k < n; i++){ 
                System.out.println("i: " + i + "and" + "j: " + j + "k: " + k);
            }// i. first the inner most for loop for run 4 times then j will be incremented by 1 then the inner most loop will run again and this cycle will happen until the j becomes 4 the k will execute till Jth 0th iteration j will run 4 time 1th iteration k will run 4 times like this 4 + 4 + 4 + 4 this will result an 4*4 matrix
        }
    }
 }

 Big O notation - describes the upper bound of the growth rate of a function.
 O(f(N))/O(g(N)) is understood as the set of functions that are bounded above by f(N)/g(N) in the limit as N→∞

 Big omega notation 
 its actually opposite of big O notation
 lower bound

 if an algorithm has a complexity of O(N^3) this means it will take atleast N^3 time complexity. it call also take N^4, N^3(Log N) but it will never be less N^3

 limit
 N ➡ ∞         f(n)/g(n) > 0

 what if an alogorithm has upper bound and lower bound as N^2
 Theta notation denotes tight bound
 what this means is that an algorith has worst time complexity and best time complexity O(N^2) means atleast and atmost O(N^2)
 meaning time complexity tightly bounded N^2 that is O(N^2)
 Bubble sort takes O(N^2) in both best and worst time complexity
 when worst and best case matches it refer to as quadratic
 example if your minimum (refer as lower bound) and maximum (refer as upper bound) salary is 50k that means you salary is exactly is 50k

 point to be noted is best case cannot be greater than worst case either it can be less or equal 

 little O notation
 ------------------

 - This is also giving the upper bound.
 
 Big O vs little 0
 - Big O - f = O(g) the growth of f is less than or equal to the growth of g, f <= g. little 0 - f = O(g) the growth of f is strictly less or slower than the growth of g, f < g

    
    limit as N→∞  f(N)/g(N) = 0

    f = N^2, g = N^3
    
    limit as N→∞ N^2/N^3 = limit as N→∞ 1/N = 0

Little Omega Notation 
--------------------

little omega is represented by 'ω'

    - This is also giving the lower bound but it will not be tight/strict
    
    f = ω(g) 

    Big Omega (Ω) vs little omega (ω)
    - Big Omega - f = Ω(g) the growth of f is greater than or equal to the growth of g, f >= g, (giving a lower bound). little omega - f = ω(g) the growth of f is strictly greater than the growth of g, f > g
 
 limit as N→∞ f(N)/g(N) = ∞
 
  limit as N→∞ N^3/N^2 = limit as N→∞ N = ∞

Auxiliary Space is the extra space or temporary space used by an algorithm.
Space Complexity of an algorithm is total space taken by the algorithm with respect to the input size. Space complexity includes both Auxiliary space and space used by input. For example, if we want to compare standard sorting algorithms on the basis of space, then Auxiliary Space would be a better criteria than Space Complexity.
Merge Sort uses O(n) auxiliary space, Insertion sort and Heap Sort use 0(1) auxiliary space. Space complexity of all these sorting algorithms is O(n) though.

Space Complexity =  input Space + Auxiliary Space 
Auxiliary Space - Space which is used by the algorithm apart from the space used by input
Input Space - Space which is used by the inputs to the algorithm

In binary Search, Space Complexity is constant. In Linear Search, Space Complexity is constant. In Bubble Sort, Space Complexity is constant. In Selection Sort, Space Complexity is constant. In Insertion Sort, Space Complexity is constant.

for(int i =1; i <= n){// 
for(int j =1; j <= k; j++){
   // some operation that take time 't'
}
   i = 1+k;// this loop will break when i is greater than n, i+k, i+2k, i+3k, i+4k, i+5k, i+6k, i+7k, i+8k, i+9k ....i+ x'times k 
}

inner loop: O(kt) time (running k time * for every time its running its taking t amount of time)

O(kt) * (n-i)/k (how many time the outer loop is running)
O(kt) * (n-i)/k = O(t(n-i)) - k get's cancelled = O(n) (ignoring the constants and less dominating terms)

(i+ x'th time k) <= n
xk <= n-i
x = (n-i)/k (number of times the outer loop is running)



    */

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