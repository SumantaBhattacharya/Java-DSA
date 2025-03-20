public class Fibo {
    // eg- 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    // suppose we conside a = 0 and b = 1 then a + b = c then if we swap the value of b to a and c to b means a = b and the b = c then again a + b, this cycle goes go until we reach to the nth term

    /*
    
    Steps-

    i. firstly, conside a = 0 and b = 1. 
    i. secondly, we print the 0 and 1, the first terms of fibonacci number.
    iii. Thirdly, to find the next term, we would add the a and b together to a varalble names c.
    iii.  if we swap the value of b to a and c to b means a = b and the b = c then again a + b.
    iv.  this cycle goes go until we reach to the nth term.
    v. we would need another variable to determien the number of terms, so we would initialise another variable name 'n' which would be the nth term. 
    vi. and make sure that the n is -2 because the first two terms are already printed

     */

    public static void main(String[] args) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print(firstTerm+ " ");
        System.out.print(secondTerm + " ");
        int nth_Term = 7;
        Fib(firstTerm,secondTerm, nth_Term - 2);// as we know the two terms has already been printed.
    }

    public static void Fib(int firstTerm, int secondTerm, int nth_Term) {
        
        if (nth_Term == 0) {
            return;
        }

        int nextTerm = firstTerm + secondTerm;
        System.out.print(nextTerm + " ");// consider a = firstTerm, b = secondTerm and c = nextTerm here.

        Fib(secondTerm, nextTerm, nth_Term - 1); // swap.
       // nth_Term - 1 = 7-1 then 6 - 1 so goes on until it becomes 0 hit the base condition the it will stop

    }

}

// i got, the problem with watching totorials is that suppose we now know this answer but we didnt figure out by our self now if we just change with the question that when n will only the term fibonacci number if it is then print all the fibonacci number before it suppose i said 8 then print the nth term which 8 and before it 0 1 1 2 3 5 like this if just solve this question for the sake of totorials we wont be able to answer that. for that we need figure out/ creaft the logic by our self. which makes the programming defferent from doing maths is that in maths we given to formula to answer the question but in programmimg we need to figure out the formula by our self which builds the logic inside our mind!. 
/*

 java "C:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA\Fibo.java"

 c:; cd 'c:\Users\SUDIP BHATTACHARYA\Desktop\JAVA-DSA'; & 'C:\Program Files
\Java\jdk-22\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\SUDIP BHATTACHARYA\AppData\Roaming\Code
\User\workspaceStorage\a2f98c90904ed0cbb5cb5c15e30f1d9d\redhat.java\jdt_ws\JAVA-DSA_f3908bcf\bin' 'Fibo'

 */