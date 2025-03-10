/* 

SPACE & TIME COMPLEXITY
-----------------------

Time Complexity
Relation between Input Size & Running Time(Operations)

1. Time Complexity
i. Best Case
ii. Average Case
iii. Worst Case

Public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
        System.out.println("Hello World");
    }

}

Here, the time complexity is O(n) because the loop runs n times.

Best Case Complexity - O(1) 
eg- Ω(1)
Average Case Complexity - O(n)
eg-Ω(n+1)|2

Worst Case Complexity - O(n)
eg- Θ(n)

Space Complexity
Relation between Input Size & Memory
In the given program, the space complexity is O(1) because the program only uses a constant amount of extra space to store the input size and the loop counter.

3. Time Complexity

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<n; i++){ n=5, 0<5, 1<5, 2<5, 3<5, 4<5
        for(int j=0; j<n; j++){ // 0<5, 1<5, 2<5, 3<5, 4<5
            System.out.println("Hello World"); // Hello World 5 times, Hello World 5 times, Hello World 5 times, Hello World 5 times, Hello World 5 times
        }
    }
}

Here, the time complexity is O(n^2) because the outer loop runs n times, and the inner loop runs n times for each iteration of the outer loop.

Best Case Complexity - O(1)
                       inner loop * outer loop
Worst Time Complexity - n * n = O(n^2)

4. Time Complexity

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 4
    int m = sc.nextInt(); // 5

    for(int i=0; i<n; i++){ // 0<4, 1<4, 2<4, 3<4
    // the inner loop will run until the condition is false
        for(int j=0; j<m; j++){ // 0<5, 1<5, 2<5, 3<5, 4<5
            System.out.println("Hello World"); 
        }
    }
}
    
Here, the time complexity is O(n * m) because the outer loop runs n times, and the inner loop runs m times for each iteration of the outer loop.

Best Case Complexity - O(1)
Average Case Complexity - O(n * m)
Worst Case Complexity - O(n * m)

Step-by-step execution:
Outer Loop (for i = 0 to 3)
Iteration 1 (i = 0):
Inner loop runs from j = 0 to 4
Prints "Hello World" 5 times
Iteration 2 (i = 1):
Inner loop runs from j = 0 to 4
Prints "Hello World" 5 times
Iteration 3 (i = 2):
Inner loop runs from j = 0 to 4
Prints "Hello World" 5 times
Iteration 4 (i = 3):
Inner loop runs from j = 0 to 4
Prints "Hello World" 5 times   

5. Time Complexity

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 4
    int m = sc.nextInt(); // 5

    for(int i=0; i<n; i++){ 
            System.out.println("Hello World"); 
    }
    for(int j=0; j<m; j++){ 
            System.out.println("Hello World"); 
    }
}

Here, the time complexity is O(n + m) because the first loop runs n times, and the second loop runs m times.

Best Case Complexity - O(1)
Average Case Complexity - O(n + m)
Worst Case Complexity - O(n + m)

// 7. Time Complexity

Compare: O(n) O(n^2) O(n^3)
n= 1       1      1      1   
n= 2       1      4      8
n= 3       1      9      27
n= 4       1      16     64

n^3 > n^2 > n

1. Space Time Complexity

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 4

    for(int i=0; i<n; i++){ 
            System.out.println("Hello World"); 
    }

}

Here, the space complexity is O(1) because the program only uses a constant amount of extra space to store the input size and the loop counter.

Best Case Complexity - O(1)
Average Case Complexity - O(1)
Worst Case Complexity - O(1)

*/

/*
 BINARY NUMBER SYSTEM 

 4 to Binary (base 2)                    101 to Decimal (base 10)
 0 1                                     0 1 2 3 4 5 6 7 8 9
 
 Other Systems:
    1. Decimal System (base 10)
    2. Binary System (base 2)
    3. Octal System (base 8)
    4. Hexadecimal System (base 16) - memory address, color codes, etc.

    && logical AND 
    & bitwise AND

    ### **Difference Between `&&` (Logical AND) and `&` (Bitwise AND) in Java**  

Feature                                    `&&` (Logical AND)                                                            `&` (Bitwise AND) 
Type                                       Logical operator                                                              Bitwise operator 
Usage                                      Used for boolean (true/false) conditions                                      Used for integer bitwise operations & boolean conditions 
Effect on Numbers                          Not applicable** to integers,Works only with boolean conditions               Performs **bitwise AND** on integer binary representations
Short-circuiting                           Yes                                                                           No
Performance                                Faster                                                                        Slower

    Bitwise Operators
    & (Binary AND)
    | (Binary OR)
    ^ (Binary XOR)
    ~ (Binary NOT(One's Complement))
    << (Binary Left Shift)
    >> (Binary Right Shift)

    A= 0101 B= 0110
    A & B = 0100
    A | B = 0111
    A ^ B = 0011 (similar values - 0(false), different values - 1(true))
    ~A = 1010 
    ~B = 1001
    variable operator     shift
    A         <<            1   = 1010
    B << 1 = 1100 // in left shift take right 3 value then 0
    A >> 1 = 0010  // in right shift take left 3 value before 0
    B >> 1 = 0011  // really right shift

    0101 right shift
     010
    0101 left shift
    101

    1. Get
    to know the bit value at a specific position in a number, whether its 0 or 1.
    2. Set
    to set a bit at a specific position in a number to 1.(0-1, 1-1)
    3. Clear
    to set a bit at a specific position in a number to 0.(0 to 0, 1 to 0)
    4. Update
    to update a bit at a specific position in a number to a given value.(0 to 1, 1 to 0)

    1. Get
    Get the 3rd bit (position = 2) of a number n. (n = 0101)base 2
    Bit Mask : 1<<i
    Operation : AND

    // POSITIONS
    // 3 2 1 0
    // 0 1 0 1 << 1 = 1010

    step 1,
    3rd bit = position 2 = 1

    i=2
    n= 0101 (5 of decimal number system)

    1 << 2 
    0001 << 2 = 0100(Bit mask)

    step, ii) 

    0100 Bitwise AND(&) 0101 = 0100 

    0100 -> i) non zero -> 1 ✅
    0100 -> ii) zero -> 0 ❌

    Get the 3rd bit (position = 3) of a number n.(n = 0101)
    Bit Mask : 1 << i
    Operation : AND

    i = 3
    n= 0101 (5 of decimal number system)

    1 << 3
    0001 
    -----
    1000

    1000 bit mask

    1000 & 0101 = 0000

    0000 -> i) non zero -> 1 ❌  
    0000 -> ii) zero -> 0 ✅

 */

import java.util.*;

public class Time_Complexity {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Get the bit value at a specific position in a number
        System.out.println("Enter the number:");
        int n = sc.nextInt(); // 5 (0101)

        System.out.println("Enter the number and the position:");
        int position = sc.nextInt(); // 2

        int bitMask = 1 << position;// 0001 << 2 = 0100
        // System.out.print("bitMask:", bitMask);

        if ((bitMask & n) == 0) {// 0100 Bitwise AND(&) 0101 = 0100 
            System.out.println("Zero -> 0");// System.out.println() does not accept multiple arguments like this.
        } else { //  = 0100
            System.out.println("Non Zero -> 1");
            
        }

        // int result = n & bitMask;
        // System.out.println(result > 0); // check if the bit is set or not
        // System.out.println(Integer.bitCount(n) - Integer.bitCount(n & bitMask)); // count the number of set bits in n
        // System.out.println(Integer.bitCount(n ^ bitMask)); // count the number of set bits in n ^ bitMask
        // System.out.println(Integer.bitCount(n | bitMask)); // count the number of set bits in n | bitMask
        // System.out.println(Integer.bitCount(n >> position)); // count the number of set bits in n >> position
        // System.out.println(Integer.bitCount(n >>> position)); // count the number of set bits in n >>> position
        // System.out.println(Integer.bitCount(n << position)); // count the number of set bits in n << position
        // System.out.println(Integer.bitCount(n << position) > 0); // check if the bit is set or not
        // System.out.println(Integer.bitCount(n ^ bitMask) > 0); // check if the bit is set or not
        // System.out.println(Integer.bitCount(n | bitMask) > 0); // check if the bit is set or not
        // System.out.println(Integer.bitCount(n >> position) > 0); // check if the bit is set or not
        // System.out.println(Integer.bitCount(n >>> position) > 0); // check if the bit is set or not

        // System.out.println(Integer.bitCount(n & bitMask) > 0); // check if the bit is set or not

         
        sc.close();
    }
}