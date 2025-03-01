public class BitManipulation_C {
    /*
    3. Clear
    to set a bit at a specific position in a number to 0.(0 to 0, 1 to 0)

     Clear Bit
        Clear the 3rd bit (position = 2) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10
        Bit Mask : 1 << i
        Operation : XOR
                    (similar values - 0(false), different values - 1(true))

        0 1 0 1
        3 2 1 0
          we need make the position 2 which is 1 to 0

        i = 2

        1 << i
        1 << 2
        0001 << 2 = 0100(Bit mask)

        0100 XOR 0101 = 0001 (after clearing the 3rd bit)
                          1 decimal number system base 10


        Clear the 3rd bit (position = 2) of a number n. (n = 0101) base 2 -> (5) of decimal number system base 10
        Bit Mask : 1 << i
        Operation : AND with NOT 

        0 1 0 1
        3 2 1 0
          we need make the position 2 which is 1 to 0(0001)


        i = 2

        1 << i
        1 << 2
        0001 << 2 = 0100(Bit mask)

        NOT -> ~

        ~(0100) = 1011
        1011 AND 0101 = 0001 (after clearing the 3rd bit)

        ANS 0001 which is decimal of 1

     */

     public static void main(String[] args) {
        int n = 5; // 0101 in binary
        int position = 2; // 3rd bit

        // Clear the 3rd bit of n

        // Bit Mask : 1 << i
        int bitMask = 1 << position;

        // Operation : XOR
        int result = (bitMask ^ n);
        System.out.println("After clearing the " + position + " bit, the number becomes: " + result); // Output: After clearing the 2 bit, the number becomes: 1
        // System.out.println("Binary : " + Integer.toBinaryString(result));
        System.out.println("Binary : " + String.format("%4s", Integer.toBinaryString(result)).replace(' ', '0'));
        
        // Operation : AND with NOT
        result = ~bitMask & n;
        System.out.println("After clearing the " + position + " bit, the number becomes: " + result); // Output: After clearing the 2 bit, the number becomes: 1
        // System.out.println("Binary : " + Integer.toBinaryString(result));
        System.out.println("Binary : " + String.format("%4s", Integer.toBinaryString(result)).replace(' ', '0'));
        // '' '' '' 1 to replacing '' to 0 0001 and the 4 format is coming from string format
     }

}
