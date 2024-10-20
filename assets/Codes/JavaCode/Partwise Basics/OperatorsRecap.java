/**
 * Binary
 */
public class OperatorsRecap {

    public static void main(String[] args) {

        // What are Operators?

        // Operators are the Special symbols which tells the Compiler to perform certain operations.

        // Like a + b

        // here + is an operator and a & b are operands.

        // Operands are those values on which operators and operations are applied.

        // We have mainly three types of Operators depending upon the no. of Operands.

        // 1. Unary Operator:- Applies to only one operand.

        // 2. Binary Operator:- Applies to two operands.

        // 3. Ternary Operator:- Applies to three operands.

        // ---------------------------------------------------------------------------
        // ARITHMETIC OPERATORS
        // ---------------------------------------------------------------------------

        // Unary Arithmetic Operators:- like ++ and --

        // Binary Arithmetic Operators:- like +, -, *, /, %

        // Let suppose two numbers A and B.

        int A = 10; // A Variable 'A' of Datatype int(Integer), Storing 10.

        int B = 5; // A Variable 'B' of Datatype int(Integer), Storing 5.

        // Lets see the Binary Arithmetic Operators.

        // -----------------------------------------------------------------------
        // Addition (+)
        // -----------------------------------------------------------------------

        System.out.println(A + B); // Output: 15

        // It simply adds Two Numbers.
        
        // -----------------------------------------------------------------------
        // Subtraction (-)
        // -----------------------------------------------------------------------

        System.out.println(A - B); // Output: 5

        // It simply subtracts Two Numbers.

        // -----------------------------------------------------------------------
        // Multiplication (*)
        // -----------------------------------------------------------------------

        System.out.println(A * B); // Output: 50

        // It simply multiplies Two Numbers.

        // -----------------------------------------------------------------------
        // Division (/)
        // -----------------------------------------------------------------------

        System.out.println(A / B); // Output: 2

        // It simply divides Two Numbers and returns the Quotient.

        // -----------------------------------------------------------------------
        // Modulus (%)
        // -----------------------------------------------------------------------

        System.out.println(A % B); // Output: 0

        // It simply divides Two Numbers and returns the Remainder.

        // -----------------------------------------------------------------------
        // UNARY ARITHMETIC OPERATORS
        // -----------------------------------------------------------------------

        // Increment Operator (++) and Decrement Operator (--)

        // In Simple words, when we have to add or subtract 1 in any number like,

        // A = A + 1 or B = B - 1 then we simply can write the same thing in the form of a++ and b--

        // -----------------------------------------------------------------------
        // Increment Operator (++)
        // -----------------------------------------------------------------------

        // It has mainly two forms, Prefix and Postfix.

        System.out.println(A++); // Output: 10

        // Because it is in Postfix, means A++ , this means first use then increment.

        // So, firstly we printed the original value of A and then incremented it by 1.

        // Now, if you check internally, The value of A is 11.

        // Lets Confirm,

        System.out.println(A); // Output: 11

        // Here, the value of A is 11.

        System.out.println(++B); // Output: 6

        // Here we used prefix, means ++B , which means first increment the value of B and then use it.

        // So, firstly we incremented the value of B by 1 and then printed it.

        // So, it may print the Incremented value of B.

        // Now, if you check internally, The value of B is 6.

        // -----------------------------------------------------------------------
        // Decrement Operator (--)
        // -----------------------------------------------------------------------

        // It has mainly two forms, Prefix and Postfix.

        System.out.println(A--); // Output: 11

        // Because it is in Postfix, means A-- , this means first use then decrement.

        // So, firstly we printed the original value of A and then decremented it by 1.

        // Now, if you check internally, The value of A is 10.

        // Lets Confirm,

        System.out.println(A); // Output: 10

        // Here, the value of A is 10.

        System.out.println(--B); // Output: 5

        // Here we used prefix, means --B , which means first decrement the value of B and then use it.

        // So, firstly we decremented the value of B by 1 and then printed it.

        // So, it may print the Decremented value of B.

        // Now, if you check internally, The value of B is 5.


        // RELATIONAL OPERATORS

        // Relational Operators:- >, <, >=, <=, ==, !=

        // -----------------------------------------------------------------------
        // Equal To Operator (==)
        // -----------------------------------------------------------------------

        // This Operators is used to check whether the value of A and B are equal or not, or they have same memory location or not.

        System.out.println(A == B); // Output: false

        // Here A = 10 and B = 5.

        // And, 10 is equal to 5.

        // So, it returns the boolean, either true or false.

        // Here, it is false because 10 is not equal to 5.
        
        // -----------------------------------------------------------------------
        // Not Equal To Operator (!=)
        // -----------------------------------------------------------------------

        // This Operators is used to check whether the value of A and B are not equal or not, or they have different memory location or not.

        System.out.println(A != B); // Output: true

        // Here A = 10 and B = 5.

        // And, 10 is not equal to 5.

        // So, it returns the boolean, either true or false.

        // Here, it is true because 10 is not equal to 5.

        // != and == are opposite to each other.

        // -----------------------------------------------------------------------
        // Greater Than Operator (>)
        // -----------------------------------------------------------------------

        // This Operators is used to check whether the value of A is greater than B or not.

        System.out.println(A > B); // Output: true

        // Here A = 10 and B = 5.

        // And, 10 is greater than 5.

        // So, it returns the boolean, either true or false.

        // Here, it is true because 10 is greater than 5.

        // -----------------------------------------------------------------------
        // Less Than Operator (<)
        // -----------------------------------------------------------------------

        // This Operators is used to check whether the value of A is less than B or not.

        System.out.println(A < B); // Output: false

        // Here A = 10 and B = 5.

        // And, 10 is less than 5.

        // So, it returns the boolean, either true or false.

        // Here, it is false because 10 is not less than 5.

        // -----------------------------------------------------------------------
        // Greater Than Or Equal To Operator (>=)
        // -----------------------------------------------------------------------

        // This Operators is used to check whether the value of A is greater than or equal to B or not.

        System.out.println(A >= B); // Output: true

        // Here A = 10 and B = 5.

        // And, 10 is greater than or equal to 5.

        // So, it returns the boolean, either true or false.

        // Here, it is true because 10 is greater than or equal to 5.

        // -----------------------------------------------------------------------
        // Less Than Or Equal To Operator (<=)
        // -----------------------------------------------------------------------

        // This Operators is used to check whether the value of A is less than or equal to B or not.

        System.out.println(A <= B); // Output: false

        // Here A = 10 and B = 5.

        // And, 10 is less than or equal to 5.

        // So, it returns the boolean, either true or false.

        // Here, it is false because 10 is not less than or equal to 5.


        // -----------------------------------------------------------------------
        // LOGICAL OPERATORS
        // -----------------------------------------------------------------------

        // Logical operators are used to perform logical operations. They are used to combine multiple conditions.

        // Logical Operators like && (AND), || (OR), ! (NOT) are used to perform logical operations.

        // -----------------------------------------------------------------------
        // Logical AND (&&)
        // -----------------------------------------------------------------------

        // It is used as an operators between Two Conditions, and it returns true when both the conditions are Satisfied and are true, otherwise it always return false, also if one of the condition is true and another one is false.

        System.out.println(A > B && A < B); // Output: false

        // Here the Output is False, because at the First Condition, A is greater than B is true because A = 10 and B = 5.

        // And, A > B -> 10 > 5 -> true

        // But when we check the Second Condition, A is less than B is false because A = 10 and B = 5.

        // And, A < B -> 10 < 5 -> false

        // So, we applied AND operator, between true and false.

        // So, true && false will return false, because AND operator returns true only if both the conditions are True.

        // true && true -> true

        // false && true -> false

        // true && false -> false

        // false && false -> false  


        // -----------------------------------------------------------------------
        // Logical OR (||)
        // -----------------------------------------------------------------------

        // It is used as an operators between Two Conditions, and it returns true when either one of the condition is true, otherwise it always return false, it returns true if both the condition is true.

        System.out.println(A > B || A < B); // Output: true

        // Here the Output is True, because at the First Condition, A is greater than B is true because A = 10 and B = 5.

        // And, A > B -> 10 > 5 -> true

        // But when we check the Second Condition, A is less than B is false because A = 10 and B = 5.

        // And, A < B -> 10 < 5 -> false

        // So, we applied OR operator, between true and false.

        // So, true || false will return true, because OR operator returns true if either condition is true or i would say if any one is condition than the overall output will be true.

        // true || true -> true

        // true || false -> true

        // false || true -> true

        // false || false -> false


        // -----------------------------------------------------------------------
        // Logical NOT (!)
        // -----------------------------------------------------------------------

        // It is used as an operator at one Condition, and it returns true when the condition is false and it returns false when the condition is true.

        // In clean words, we can say that it reverses the final result.

        System.out.println(!true); // Output: false

        // Here the Output is False, because the condition is true and due to Logical NOT operator, it will reverse the Result and return false.

        System.out.println(!false); // Output: true

        // Here the Output is True, because the condition is false and due to Logical NOT operator, it will reverse the Result and return true.

        
    }

}