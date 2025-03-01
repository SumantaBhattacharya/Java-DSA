import java.util.Scanner;

public class BitManipulationU {
    /*
    1. Get
    to know the bit value at a specific position in a number, whether its 0 or 1.
    2. Set
    to set a bit at a specific position in a number to 1.(0-1, 1-1)
    3. Clear
    to set a bit at a specific position in a number to 0.(0 to 0, 1 to 0)
    4. Update
    to update a bit at a specific position in a number to a given value.(0 to 1, 1 to 0)
    

    4. Update
    to update a bit at a specific position in a number to a given value.(0 to 1, 1 to 0)

    Update Bit 
    

    ii.Update the 2nd bit (position = 1) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10

    Bit Mask : 1<<i
    Operation : AND with NOT (~)

    i = 1

    1 << i

    0001 << i
    0001 << 1 => 0010

    ~(0010) = 1101

    1101 & 0101 = 0101 base 2 -> (5) of decimal number system base 10

    

    iv.Update the 2nd bit (position = 1) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10
    for 1 (SET)

    Bit Mask : 1<<i
    Operation : OR

    i = 1
    1 << i
    0001 << i
    0001 << 1 => 0010

    0010 | 0101 = 0111 base 2 -> (7) of decimal number system base 10

    v.Update the 2nd bit (position = 1) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10
    for 1 (SET)

    Bit Mask : 1<<i
    Operation : AND WITH OR

    i = 1
    1 << i
    0001 << i
    0001 << 1 => 0010

0 | 0 → 0
0 | 1 → 1
1 | 0 → 1
1 | 1 → 1

    0010 | 0101 = 0111 base 2 -> (7) of decimal number system base 10

     */

    //  public static void main(String[] args) {
    //      int n = 5; // 0101 in binary
    //      int position = 1; // 2nd bit
    //      int bitMask = 1 << position;
         
    //     // Operation : AND with NOT
    //      int result = (~bitMask & n);
    //      System.out.println("Result of AND with NOT operation: " + result); // Output: Result of AND with NOT operation: 5
    //      // System.out.println("Binary : " + Integer.toBinaryString(result));
    //      System.out.println("Binary : " + String.format("%4s", Integer.toBinaryString(result)).replace(' ', '0')); // '' '' '' 1 to replacing '' to 0 0001 and the 4 format is coming from string format

    //      // Operation : OR
    //      result = (bitMask | n);
    //      System.out.println("Result of OR operation: " + result); // Output: Result of OR operation: 7
    //      // System.out.println("Binary : " + Integer.toBinaryString(result));
    //      System.out.println("Binary : " + String.format("%4s", Integer.toBinaryString(result)).replace(' ', '0')); // '' '' '' 1 to replacing '' to 0 0001 and the 4 format is coming from string format

    //      // Operation : XOR with Bitwise NOT (~)
    //         // result = (~bitMask ^ n);
    //         // System.out.println("Result of XOR with Bitwise NOT operation: " + result); // Output: Result of XOR with Bitwise NOT operation: 8
    //  }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation for 1. set 2. Clear :");
        int oper = sc.nextInt();


        int n = 5; // 0101 in binary
        int position = 1; // 2nd bit
        int bitMask = 1 << position;

        // 5 = 0101 -> position(3)-0, 2-1, 1-0, 0-1 => to convert the first(1st) position to 1 i.e 0 in between 1 1, the result is 0111
        if (oper == 1) { // 1 for set 
            // Operation : OR
            int result = (bitMask | n);
            System.out.println("Result of OR operation: " + result); // Output: Result of OR operation: 7
            // System.out.println("Binary : " + Integer.toBinaryString(result));
            System.out.println("Binary : " + String.format("%4s", Integer.toBinaryString(result)).replace(' ', '0')); // '' '' '' 1 to replacing '' to 0 0001 and the 4 format is coming from string format
        } else{ // 2 for clear 
            // Operation : AND with NOT
            int result = (~bitMask & n);
            System.out.println("Result of AND with NOT operation: " + result); // Output: Result of AND with NOT operation: 5
            // System.out.println("Binary : " + Integer.toBinaryString(result));
            System.out.println("Binary : " + String.format("%4s", Integer.toBinaryString(result)).replace(' ', '0')); // '' '' '' 1 to replacing '' to 0 0001 and the 4 format is coming from string format
            
        }

        sc.close(); // Close the Scanner
        
    }

}

/* 
### 🔹 **Correct Bit Manipulation Operations**
| **Operation**            | **Expression**| **Effect**                                          |
|--------------------------|---------------|-----------------------------------------------------|
| **Toggle (XOR)**         | `n ^ bitMask` | Flips the target bit (0 → 1, 1 → 0)                 |
| **Set (OR)**             | `n | bitMask` | Ensures the target bit is 1 (0 → 1, 1 → 1)          |
| **Clear (AND with NOT)** | `n & ~bitMask`| Ensures the target bit is 0 (0 → 0, 1 → 0)          |

*/

// mistakes
/*
 i.Update the 2nd bit (position = 1) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10

    Bit Mask : 1<<i
    Operation : XOR 

    i = 1

    1 << i

    0001 << i
    0001 << 1 => 0010

    0010 ^(XOR) 0101 = 0111 base 2 -> (7) of decimal number system base 10


    iii.

    Update the 2nd bit (position = 1) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10

    Bit Mask : 1<<i
    Operation : XOR with Bitwise NOT (~)

    Bit Mask : 1<<i
    Operation : XOR with NOT (~)

    i = 1

    1 << i

    0001 << i
    0001 << 1 => 0010

    ~(0010) = 1101

    XOR(similar values - 0(false), different values - 1(true))

    1101 XOR 0101 = 1000 base 2 -> (8) of decimal number system base 10


 */
