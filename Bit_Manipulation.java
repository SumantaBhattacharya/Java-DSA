/*
 After Time Complexity, we will learn about Bit Manipulation.
 This involves manipulating bits, which are fundamental units of data in computers.
 Bitwise operations perform operations on individual bits of a number.
 Bitwise operations are faster than arithmetic operations and are used in many algorithms.
 Bitwise operations include AND, OR, XOR, NOT, and SHIFT.
 Bitwise AND (&) : The result is 1 if both bits are 1, otherwise 0.
 Bitwise OR (|) : The result is 1 if either bit is 1, otherwise 0.
 Bitwise XOR (^) : The result is 1 if the bits are different, otherwise 0.
 Bitwise NOT (~) : The result is the complement of the bit.
 Bitwise SHIFT (<<, >>, >>>) : Shifts the bits to the left or right by a specified number of positions.
 Bitwise operations are used in many algorithms to optimize code and reduce time complexity.
 Bitwise operations are also used in algorithms for bit manipulation, such as finding the maximum or minimum value in an array, or performing bitwise operations on numbers in a computer program.
    
 - Bitwise operations in Java
    - Bitwise AND (&)
    - Bitwise OR (|)
    - Bitwise XOR (^)
    - Bitwise NOT (~)
    - Bitwise SHIFT (<<, >>, >>>)

    1. Get
    to know the bit value at a specific position in a number, whether its 0 or 1.
    2. Set
    to set a bit at a specific position in a number to 1.(0-1, 1-1)
    3. Clear
    to set a bit at a specific position in a number to 0.(0 to 0, 1 to 0)
    4. Update
    to update a bit at a specific position in a number to a given value.(0 to 1, 1 to 0)

    Set Bit

    Set the 2nd bit (position = 1) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10
    Bit Mask : 1<<i
    Operation : OR

    1 << 1
    0001 << 1 = 0010(Bit mask)

    0010 | 0101 = 0111 base 2 -> (7) of decimal number system base 10


 */

//  package bit_manipulation;
//  import java.util.Scanner;
//  import java.lang.*;
 // Java program to demonstrate Bitwise operations in Java
 // Get, Set, Clear, Update of a Bit in a Number
 // Set the 2nd bit (position = 1) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10
public class Bit_Manipulation  {
    public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int position = 1; // 2nd bit

        // Set the 2nd bit of n

        // Bit Mask : 1<<i
        int bitMask = 1 << position;

        // Operation : OR
        int result = n | bitMask;
        System.out.println("After setting the " + position + " bit, the number becomes: " + result); // Output: After setting the 2 bit, the number becomes: 7

    }}