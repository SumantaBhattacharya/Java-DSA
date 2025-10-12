package JECA_P;

public class JECA_2023_Q26 {
    public static void main(String[] args) {
       if (is_equal(10, 10.0)) { // Java compiler uses the most appropriate overloaded method
             System.out.print("Equal"); 
        } else {
             System.out.print("Not equal");
        } 
    }
    public static boolean is_equal(int var1, double var2) {
        return (var1 == var2); 
    }
}
