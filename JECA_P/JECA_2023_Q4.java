// ## 4. What is the output of the following program ?

package JECA_P;

public class JECA_2023_Q4 {
    public static void main(String[] args) {
        int x = -1, y = 1, z = 0; 

        // Java doesn't allow integers in if conditions,  Java requires explicit x != 0 comparisons. ii. The comma operator doesn't exist in Java 
        if(x !=0 && y++ != 0 && z != 0) {
            ++x; y++; --z; 
        }

        System.out.printf("%d, %d, %d", x++, y++, z++); 
    }
}
