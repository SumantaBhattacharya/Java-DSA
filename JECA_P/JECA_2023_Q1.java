package JECA_P;

public class JECA_2023_Q1 {
    public static void main(String[] args) {
        int a = 40;
        float b;
        b = ++a;
        //  This line fails because System.out.println() only accepts one argument (a String)
        System.out.printf("%d, %f%n", a, ++b); 
    }
}
