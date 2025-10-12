package JECA_P;

public class JECA_2023_Q9 {
    public static void main(String[] args) {
        // Java does not use malloc, calloc, or free. 
        // It manages memory automatically (Garbage Collection). 
        // Dynamic allocation is done using the new keyword, and array initialization is automatic.

        // C: int *ptr; ptr = (int*) calloc(3, sizeof(int));
        int[] ptr = new int[3]; // It is automatically initialized to 0.

        // C: ptr[2] = 30;
        ptr[2] = 30; 

        // C: printf(“%d”, *ptr);
        System.out.printf("%d%n", ptr[0]);

        // C: free(ptr);
        // Java: Garbage Collector handles deallocation automatically.

    }
}
