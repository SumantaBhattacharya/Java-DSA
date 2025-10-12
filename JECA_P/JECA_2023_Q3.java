package JECA_P;

public class JECA_2023_Q3 {
    public static void main(String[] args) {
        int i = -1;//// The value is stored, but its size is fixed.

        // Java does not have a 'sizeof' operator.
        // Integer.BYTES is a constant that holds the size of an int in bytes
        int size = Integer.BYTES;

        System.out.printf("sizeof(i) = %d%n", size);
    }
}
