public class Precedence_Associativity {

    public static void main(String[] args) {

        // In Java, Do You know, that java Arithmetic Operations do not follow the Rule of BODMAS.

        // Java is a language in which each operators have different Precedence, and higher Precedence Operators get Evaluated first, then the lower Precedence Operators are Evaluated.

        // Precedence is the Priority level of any operators which decides which Operator's Operations will be executed first.

        // Like,

        int a = 10 - 5 * 2 + 2; // A Variable 'a' of datatype Integer Storing some Arithmetic Values.

        // Here if you think firstly it will subtract 10 from 5 and then multiply it by 2 then add 2.

        // Then you are Wrong, i know java Sees any expression character-wise and keep Solving,

        // but here * has Higher Precedence than + and -, so It will be Evaluated first.

        // Now the Question, what values will be Evaluated with *.

        // In A Operations, like 1 + 4 , here + is the Operator, 1 and 4 are the Operands.

        // In the Same way here, 5 and 2 are the Operands, and * is the operator.

        // 5 * 2 -> 10

        // a = 10 - 10 + 2;

        // Now, here is the main Case, + and - have equal Precedence.

        // Then the Question is which will be Evaluated first?

        // According to BODMAS, we should solve, addition first.

        // But According to Java Associativity of + and - says that they should be solved from left to right.

        // Associativity is defined as the Property given to each operators of Same Precedence form which direction, it should be start Solving in case of Same operators, or the Operators with same Precedence.

        // Now, lets solve from left to right,

        // We see Moving from left to right, we have to solve - first and + later.

        // 10 - 10 -> 0

        // a = 0 + 2

        // a = 2

        // Hence the final value of a is 2.

        System.out.println(a); // OUTPUT:- 2 

        // Lets take one more Example,

        int x = 1; // A Variable 'a' of datatype Integer Storing 1.

        int y = 2; // A Variable 'b' of datatype Integer Storing 2.

        int z = 3; // A Variable 'c' of datatype Integer Storing 3.

        x += z += ~y; // A complex Expression written.

        // In this Complex Expression, lets firstly find out how many Operators are there.

        // There is +=, or Shorthand Operator.

        // There is ~, or Unary Operator.

        // Now, According to Java Precedence, unary Operator(~) has higher Precedence than Shorthand Operator(+=).

        // So, we will firstly Evaluate (~) then (+=).

        // Now, the Expression is like x += z += (~y);

        // Because Brackets have highest Precedence.

        // Now, we have two Same operators (+=) with same Precedence.

        // Here we take help of Java Associativity of this Shorthand Operator, and it says that they should be Evaluated from right to left.

        // So, the final Expression will be x += (z += (~y));

        // Hence, firstly inner Brackets will be Solved then the Outer one.

        
        // Lets Show you the Chart to Understand it Properly,

        // We are Writing Operators in Decreasing Order of Their Precedence which means the below operator has lower Precedence than Upper Operators.

        // -----------------------------------------------------------------
        // Operators -> []() (Highest Precedence) Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> ++ -- ~ ! instanceof , Associativity -> Right to Left
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> new (type) , Associativity -> Right to Left
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> * / % , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> + - , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> << >> >>> , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> < > <= >= , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> == != , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> & , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> ^ , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> | , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> && , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> || , Associativity -> Left to Right
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> ? :  , Associativity -> Right to Left
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> = += -= *= /= %= ^= , Associativity -> Right to Left
        // -----------------------------------------------------------------
        // -----------------------------------------------------------------
        // Operators -> &= |= >>= <<= >>>= (Least Precedence), Associativity -> Right to Left
        // -----------------------------------------------------------------

        
    }
    
}

 // ------------------------------------------------------------

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

        