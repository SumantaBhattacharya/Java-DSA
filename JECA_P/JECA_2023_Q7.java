package JECA_P;

public class JECA_2023_Q7 {
    public static void main(String[] args) {
        int i = -9;// In Java, the order of evaluation is strictly left-to-right.
       System.out.printf("%d %d %d%n", i++, ++i, ++i);
    }
}
