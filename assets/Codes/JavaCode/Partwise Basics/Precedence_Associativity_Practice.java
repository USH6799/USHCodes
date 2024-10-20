// Some Practice Questions like, find the Output of:-

        /* Question 1.

            int x = 5, y = 10, z = 15;
            int result = x + y * z / y - z + x * 2;
            System.out.println(result);

         */

        /* Question 2.

            int a = 2, b = 3;
            int res = --a * b++ + a-- / ++b * b-- - ++a;
            System.out.println(res);

        */

        /* Question 3.

            int p = 4, q = 8;
            int ans = p * q / p % q + p % q * p;
            System.out.println(ans);
         
        */

public class Precedence_Associativity_Practice {

   public static void main(String[] args) {

    // Question 1.

    int x = 5, y = 10, z = 15;
    // Variable 'x' , 'y' and 'z' of Datatype Integer storing 5 10 and 15 respectively.

    int result = x + y * z / y - z + x * 2;
    // Variable 'result' of Datatype Integer storing the value of expression 'x + y * z / y - z + x * 2'

    // Lets Solve the Value of Result,

    // Firstly there is no increment and decrement in the expression 'x + y * z / y - z + x * 2'.

    // So, lets put the value of Variables and Simplify the Expression.

    // result = 5 + 10 * 15 / 10 - 15 + 5 * 2;

    // Now, here We do not Follow BODMAS Rule of Mathematics.

    // Here, we will follow the Java Associativity and Precedence Rule.

    // According to Java Precedence,

    // / and * has higher precedence than + and -.

    // So, we will solve / and * first.

    // Now, in this Expression we have multiple Operands of Same Precedence, 

    // So, Now due to Java Associativity Rule, we will solve the Expression from left to right.

    // Firstly we will solve 10 * 15,

    // 10 * 15 -> 150

    // Then, we will solve (10 * 15) / 10 -> (150 / 10)

    // 150 / 10 -> 15

    // Then, we will solve 5 * 2,

    // 5 * 2 -> 10

    // Now the Expression is Simplified,

    // result = 5 + 15 - 15 + 10;

    // Now, we Know + and - have equal Precedence.

    // So, According to Java Associativity, we will solve from left to right.

    // Firstly we will solve 5 + 15,

    // 5 + 15 -> 20

    // result = 20 - 15 + 10;

    // Now, we will solve 20 - 15,

    // 20 - 15 -> 5

    // result = 5 + 10;

    // Then, we will solve 5 + 10

    // 5 + 10 -> 15

    // result = 15

    // Lets Confirm our Output,

    System.out.println(result); // OUTPUT:- 15


    // Question 2.

    int a = 2, b = 3;
    // Variable 'a' & 'b' Of Integer Datatype Storing Value 2 & 3, respectively.

    int res = --a * b++ + a-- / ++b * b-- - ++a;
    // A Variable 'res' of Datatype Integer, Storing expression '--a * b++ + a-- / ++b * b-- - ++a';

    // Let's Solve the Value of res step by step:

    // int res = --a * b++ + a-- / ++b * b-- - ++a;

    // 1. Solve the prefix and postfix increment/decrement operations first based on precedence and associativity:

    // --a (Pre-decrement): Decrement 'a' by 1 first, then use it.
    // Before: a = 2
    // After: a = 1

    // Now the expression becomes:
    // res = 1 * b++ + a-- / ++b * b-- - ++a;

    // b++ (Post-increment): Use 'b' first, then increment it.
    // Before: b = 3
    // Use the value: b = 3
    // After increment: b = 4

    // Now the expression becomes:
    // res = 1 * 3 + a-- / ++b * b-- - ++a;

    // a-- (Post-decrement): Use 'a' first, then decrement it.
    // Before: a = 1
    // Use the value: a = 1
    // After decrement: a = 0

    // Now the expression becomes:
    // res = 1 * 3 + 1 / ++b * b-- - ++a;

    // ++b (Pre-increment): Increment 'b' first, then use it.
    // Before: b = 4
    // After increment: b = 5

    // Now the expression becomes:
    // res = 1 * 3 + 1 / 5 * b-- - ++a;

    // b-- (Post-decrement): Use 'b' first, then decrement it.
    // Before: b = 5
    // Use the value: b = 5
    // After decrement: b = 4

    // Now the expression becomes:
    // res = 1 * 3 + 1 / 5 * 5 - ++a;

    // ++a (Pre-increment): Increment 'a' first, then use it.
    // Before: a = 0
    // After increment: a = 1

    // Now the expression becomes:
    // res = 1 * 3 + 1 / 5 * 5 - 1;

    // 2. Now solve the multiplication (*) and division (/) since they have higher precedence than + and -:

    // 1 * 3 -> 3
    // res = 3 + 1 / 5 * 5 - 1;

    // 1 / 5 -> 0 (Integer division results in 0, not 0.2)
    // res = 3 + 0 * 5 - 1;

    // 0 * 5 -> 0
    // res = 3 + 0 - 1;

    // 3 + 0 -> 3
    // 3 - 1 -> 2

    // Final value of res = 2;

    // Output the result:

    System.out.println(res); // OUTPUT: 2

    // Question 3.

    int p = 4, q = 8;
    int ans = p * q / p % q + p % q * p;

    // Given expression: int ans = p * q / p % q + p % q * p;

    // Let's solve the expression step by step:

    // 1. Variables 'p' and 'q' are initialized:
    // p = 4, q = 8

    // 2. Now, we will solve the expression based on operator precedence and associativity:

    // Precedence order (from highest to lowest):
    // 1. * (Multiplication), / (Division), and % (Modulus) have the same precedence.
    // 2. + (Addition) comes after these operators.
    // According to precedence rules, the operators *, /, and % will be solved first, from left to right, and then +.

    // The expression is:
    // ans = p * q / p % q + p % q * p;

    // 3. Start solving the expression from left to right for *, /, and % operations:

    // Step 1: Solve p * q
    // p = 4, q = 8
    // p * q = 4 * 8 = 32
    // Now the expression becomes:
    // ans = 32 / p % q + p % q * p;

    // Step 2: Solve 32 / p
    // p = 4
    // 32 / 4 = 8 (since it's integer division)
    // Now the expression becomes:
    // ans = 8 % q + p % q * p;

    // Step 3: Solve 8 % q (Modulus operation)
    // q = 8
    // 8 % 8 = 0 (since 8 is exactly divisible by 8, the remainder is 0)
    // Now the expression becomes:
    // ans = 0 + p % q * p;

    // Step 4: Solve p % q (Modulus operation)
    // p = 4, q = 8
    // 4 % 8 = 4 (since 4 is less than 8, the remainder is 4)
    // Now the expression becomes:
    // ans = 0 + 4 * p;

    // Step 5: Solve 4 * p
    // p = 4
    // 4 * 4 = 16
    // Now the expression becomes:
    // ans = 0 + 16;

    // Step 6: Solve 0 + 16
    // 0 + 16 = 16

    // Final result:
    // ans = 16;

    // 4. Output the result:
    System.out.println(ans); // OUTPUT: 16


    
   } 
}
