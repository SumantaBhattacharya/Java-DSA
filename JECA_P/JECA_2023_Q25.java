package JECA_P;

public class JECA_2023_Q25 {
    public static void main(String[] args) {

        // System.out.print(addition(35, 20) + ";" + addition(34.1, 12.7));
        
        System.out.print(addition(35, 20));
        System.out.print(";");
        System.out.print(addition(34.1, 12.7));
        
    }

    // // Static methods are required to be called directly from the static main
    // method.
    public static int addition(int a, int b) {
        return a + b;
    }

    static double addition(double a, double b) {
        return a + b;
    }

}
