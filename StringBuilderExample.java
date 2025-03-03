// string is an immutable object
// String object is created, its value cannot be changed. Any operation that appears to modify a String (such as concatenation, replacement, or substring) actually creates a new String object, leaving the original unchanged.

// import java.util.Stack;

public class StringBuilderExample {
    public static void main(String[] args) {
        /*
         * Some Java functions/operations are stored in stack memory and some are stored
         * in heap memory.
         * In Java, memory is divided into Stack Memory and Heap Memory, and different
         * types of data are stored in each.
         * Stack Memory is used for static memory allocation and contains primitive data
         * types, method calls, local variables, and reference variables.
         * Heap Memory is used for dynamic memory allocation and contains objects,
         * arrays, and other data structures.
         * Stack Memory is faster than Heap Memory because it is allocated in a
         * contiguous block of memory and is accessed directly by the CPU.
         * Heap Memory is slower than Stack Memory because it is allocated in a
         * non-contiguous block of memory and is accessed indirectly through pointers.
         * Stack Memory is limited in size and is used for short-lived data, while Heap
         * Memory is larger and is used for long-lived data.
         * Stack Memory is automatically managed by the JVM, while Heap Memory is
         * managed by the Garbage Collector.
         * Stack Memory is thread-safe as each thread has its own stack, while Heap
         * Memory is shared among threads and requires synchronization to prevent data
         * corruption.
         */

        // string str = "Hello, World!";
        // str + "Welcome to Java Programming!"; // This operation creates a new String
        // object in the Heap Memory.
        // str + "Sumanta Bhattacharya"
        // System.out.println(str); // Output: Hello, World!
        // System.out.println(str + "Welcome to Java Programming!"); // Output: Hello,
        // World!Welcome to Java Programming!

        /*
         * Stack Memory 🏗️ Heap Memory 📦
         * -----------------------------------------------------------------------------
         * ----------------------------------------------------
         * str (reference) --/-> "H̶e̶l̶l̶o̶,̶ ̶W̶o̶r̶l̶d̶!̶" (String Object)
         * str (updated) --/->
         * "H̶̶̶e̶̶̶l̶̶̶l̶̶̶o̶̶̶,̶̶̶ ̶̶̶W̶̶̶o̶̶̶r̶̶̶l̶̶̶d̶̶̶!̶̶̶W̶̶̶e̶̶̶l̶̶̶c̶̶̶o̶̶̶m̶̶̶e̶̶̶ ̶̶̶t̶̶̶o̶̶̶ ̶̶̶J̶̶̶a̶̶̶v̶̶̶a̶̶̶ ̶̶̶P̶̶̶r̶̶̶o̶̶̶g̶̶̶r̶̶̶a̶̶̶m̶̶̶m̶̶̶i̶̶̶n̶̶̶g̶̶̶!̶̶̶"
         * (New String Object)
         * str (updated again) ---->
         * "Hello, World!Welcome to Java Programming!Sumanta Bhattacharya" (New String
         * Object)
         * -----------------------------------------------------------------------------
         * ----------------------------------------------------
         */

        String originalString = "Hello, World!";

        StringBuilder sb = new StringBuilder(originalString); // we could have direclty used the methods if we didnt
                                                               // have used the seni-colon just with the .append
        sb.append("Welcome to Java Programming!");
        sb.append("Sumanta Bhattacharya");
        /*
         * -----------------------------------------------------------------------------
         * --------------------
         * sb (reference) ---> StringBuilder Object
         * ["Hello, World!"](Modified in place to append new text)
         * ["Hello, World!Welcome to Java Programming!"]
         * ["Hello, World!Welcome to Java Programming!Sumanta Bhattacharya"]
         * -----------------------------------------------------------------------------
         * --------------------
         */

        // Insert a space after '!'
        sb.insert(sb.indexOf("!") + 1, " ");// Without +1: it would insert the space before !, which is incorrect.
        sb.insert(sb.lastIndexOf("!") + 1, " ");
        
        // sb.indexOf("!") + 1: Finds the first "!" and inserts a space after it.
        // sb.lastIndexOf("!") + 1: Finds the last "!" (after "Programming!") and
        // inserts a space after it.
        // sb.insert(sb.indexOf("!") + 1, " ") // Space after first "!"
        // .insert(sb.lastIndexOf("!") + 1, " "); // Space after "Programming!"

        // character at index 0
        System.out.println(sb.charAt(0));

        // set character at index
        sb.setCharAt(0, 'h'); // Corrects the issue
        System.out.println(sb); // Print updated StringBuilder

        sb.replace(30, 42, "greetings!");
        sb.insert(0, "->"); // Use double quotes for a string

        // Removing a character 
        System.out.println(sb.deleteCharAt(0));// Removes the character at index 10
        
        System.out.println(sb.delete(0, 15));
        // ending index is non inclusive

        System.out.println(sb.length());

        int indexOfGreeting = sb.indexOf("greetings!");
        int greetingLength = "greeting!".length();   // Fixed length since it's a known string
        System.out.println("Index of 'greeting!': " + indexOfGreeting);
        System.out.println("Length of 'greeting!': " + greetingLength);

        if (indexOfGreeting != -1) {
            System.out.println("Found 'greetings!' at index " + indexOfGreeting);

            for (int i = 0; i < indexOfGreeting; i++) { 
                System.out.println("Hello World");
            }

        }else{
            System.out.println("'greetings!' not found");
        }

        System.out.println(sb.capacity()); // Returns the current capacity of the StringBuilder.

        // System.out.println(sb.ensureCapacity(100)); // Increases the capacity if necessary.
        // System.out.println(sb.trim()); // Removes leading and trailing whitespace from the string.
        // System.out.println(sb.substring(10)); // Extracts a substring from the StringBuilder.

        for (int i = 0; i < sb.length() / 2; i++) {
            // hello -> ol l eh
            int front = i;
            int back = sb.length() - 1 - i;
            //             5 - 1 - 0 = 4 means 'h' to 4th position , 5 - 1 - 1 = 5 - 2 = 3 means 'e' to 3rd position  , 5 - 1 - 2 = 5 - 3 = 2 means 'l' to 2nd position , 5 - 1 - 3 = 5 - 4 = 1 means 'l' to 1st position , 5 - 1 - 4 = 5 - 5 = 0 means 'o' to 0th position
            
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);// O(n/2) -> O(n)

        }

        System.out.println( "The reverse of a string: "+ sb); 

        System.out.println("Reversed:- " + sb.reverse()); // System.out.println("Reversed:- " + sb.reverse()); reversed the string again. It reversed the already reversed string back to its original form.

        // System.out.println("Reverse of string convert to string" + sb.reverse().toString()); // ❌
        // String reversed = new StringBuilder(sb).reverse().toString();
        // System.out.println("Reversed String: " + reversed);

        String reversed = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed String: " + reversed);
        
        // sb.insert(sb.indexOf("!") + 1, " ").insert(sb.lastIndexOf("!") + 1, " ");
        System.out.println(sb.toString()); // Output: Hello, World!Welcome to Java Programming!Sumanta Bhattacharya
        // sb.toString() converts the StringBuilder object into a regular String to
        // ensures the output is in String format.

        for (int index = 0; index < sb.length(); index++) {
            // System.out.println("Index " + index + ": " + sb.charAt(index));
            System.out.print("[" + index + ":" + sb.charAt(index) + "] ");
        }
        
    }
}

/*
 * Difference between stack memory and heap memory
 * Feature **Stack Memory** 🏗️ **Heap Memory** 📦
 * -----------------------------------------------------------------------------
 * -------------------------------------
 ** Speed** Faster Slower
 ** Storage** Method calls & Local variables & references to objects, primitive
 * variables. Objects(created using new keyword (like arrays, String,
 * StringBuilder, etc.)) & instance variables(fields of objects),Large data
 * structures (like arrays, lists)
 ** Access** LIFO (Last In, First Out) Random access
 ** Memory Management** Automatic (removed after method execution) Managed by
 * Garbage Collector
 ** Scope** Limited to the method Heap objects exists until no reference is left
 * and Garbage Collector eventually frees them the memory.
 ** Shared** No (Each thread has its own Stack) Yes (Heap is shared across
 * threads)
 */

/*
 * StringBuilder is a mutable sequence of characters.
 * This means that the value of a StringBuilder object can be changed after it
 * is created.
 * StringBuilder objects are similar to String objects, but they can be
 * modified.
 * StringBuilder objects are used when you need to modify the value of a string
 * frequently.
 * StringBuilder objects are more efficient than String objects when you need to
 * modify the value of a string multiple times.
 * StringBuilder objects are used in situations where you need to build a string
 * by appending characters or other strings together.
 * StringBuilder objects are used in algorithms that require frequent
 * modifications to a string, such as sorting or searching algorithms.
 * StringBuilder objects are used in algorithms that require efficient memory
 * usage, as they can be modified in place without creating new objects.
 * StringBuilder objects are used in algorithms that require efficient string
 * manipulation, such as reversing a string or removing characters from a
 * string.
 * StringBuilder objects are used in algorithms that require efficient string
 * concatenation, as they can be modified in place without creating new objects.
 */