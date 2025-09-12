import java.util.Scanner;

public class Recursion2 {// main function is the first function that will go into the stack and the last function come out of the the stack, any function that is currently running will go into the stack memory, primitives are also stored in the stack memory, stack follows the policy of last in, first out
    public static void main(String[] args) {// main function is the first function that gets called, all the function calls that happen in a programming language that go into the stack memory

        String msg = message("Apple Doesn't Fall Far From The Tree");
        System.out.println(msg);

        msg(); // when the main function is finished executing the program will be over

        // write a function thjat takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        printn(1);// we only want to call the method once and the output it should to print first five numbers

        int ans = fibo(4);
        System.out.println("fibo: " + ans);

        int result = fiboIterative(4);
        System.out.println("fiboIterative: " + result);


        int[] array = {68, 69, 440, 480};
        Scanner sc = new Scanner(System.in);


        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println("]");


        System.out.print("Enter target to search: ");
        int target = sc.nextInt();

        int BinaryRecursiveSearch_result = BinaryRecursiveSearch(array, target, 0, array.length - 1);
        System.out.println("'BinaryRecursiveSearch' of " + target + " --> index: " + BinaryRecursiveSearch_result);

        sc.close();
    }


    // while the function is not finished executing it will remain in stack
    private static void printn(int n) {// As many times as you call the function, it will memory seperately

        if (n == 5) {// base conditon is a condition where our recursion will stop making new calls
            System.out.println("\tprint-n: " + n);
            return;// it will return to where it was called
        };// No base condition = function call will keep hapenning and stack will not stop getting filled as every call of fucntion takes memory like this one time will come where memory exceeds will give stack overflow error

        // each call is a seperate function call treated in the stack
        System.out.print("\tprint-n: " + n);

        // a function that calls itself, when it became 2 the follow passed to the parent function then checked the base condition then then printed 2
        printn(n+1);// this function will be called multiple times resulting to calling infinite time without a base condition
    }

    // when a function i staying inside the stack it basically means that function call is goin on. it is a function calling another function 
    private static void msg() {// only one function that you have to call and that should print the message five times
    // msg will not done executing until the message function is done executing. when a function inside another function is done excuting and removed from the stack then it can be only removed from the stacked 

        System.err.println("Everybody is a genius, but if you judge a fish by it’s ability to climb a tree, it will live it’s whole life believing it is stupid.");
         
        message("");// when the function is done executing it will come out of the from where it was called. when the function comes out of here then this function is over now
    }

    // when a function is done executing, it is removed from the stacked memory and the flow of program is restored to where where the function is called
    private static String message(String string) {
        System.err.println("you only live once");
        return string;
    }

    private static int fibo(int n) {
        // base condition
        if(n < 2){ // n should be either 0 or 1 
            return n;
        }
        return fibo(n-1) + fibo(n-2);

    }

    public static int fiboIterative(int n) {

        if(n < 2){ 
            return n;
        }

        // initial values
        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            
            int temp = a + b;
            a = b; 
            b = temp; // by this b is always holding the latest value initially like 1
        }

        return b;

    }

    static int BinaryRecursiveSearch(int [] arr, int target, int start, int end){

        if(start > end){
            return -1; // as start cannot be ever greater than end
        }

        int mid = start + (end - start) / 2; // the start and end is for the dynamic devision of the array

        if (target > arr[mid]) {
            // start = mid + 1;
            return BinaryRecursiveSearch(arr, target, start = mid + 1, end);// array, target, end will not change
            // instead of this start = mid + 1, end we could have directly mid + 1 functionally, will be the same
        }else if (target < arr[mid]){
            // end = mid - 1;
            return BinaryRecursiveSearch(arr, target, start, end = mid - 1); // whenever you are any recursion call, make sure you are returning it(the result of a function call of the return type) if there is a return type
        }else{ // target == arr[mid]
            return mid;
        }

    }
    
}

/* i. it helps us in solving the bigger and complex problems in a simpler way. ii. you can convert recorsion solution into iteration and vice versa. iii. space complexity is not constant because of recursive calls. iv. it helps us in braking down bigger problems into smaller problems
   i. comparing ➡ O(1) ii. Pivoting into two halves - F(N) = O(1) + F(N/2) - Recurence relation - Types of recurrence ralations - i. linear recurrence relation -e.g, is Fibonacci number (fibo (N) = fibo (N-1) + fibo (N-2)) - a linear operation is done here, ii. Devide and Conquer relation -e.g, binary search   
                                    takes contant amout of time   deviding in half the array (search space is devided by a fractor 2)     */ 