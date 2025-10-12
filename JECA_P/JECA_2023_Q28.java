package JECA_P;

public class JECA_2023_Q28 {

    //  Java does not have pointers (demo *ptr). All object variables (demo ptr; in Java) are implicit reference variables, managing memory automatically.
    public static void main(String[] args) {

        // Java: Object instantiation using 'new'. 'str' is a reference variable.
        demo str = new demo();

        // Java: 'ptr' is another reference variable pointing to the same object as 'str'.
        demo ptr = str;
        
        // Java: Access member using the dot operator.
        str.var = 100;  
        
        // Java: The dot operator acts as the arrow operator in this context.
        System.out.print(ptr.var); 

    }

     // The class (struct equivalent) must be static to be used directly in main
    static class demo {
        int var; 
        
    }

}
