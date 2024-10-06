public class Operators {
    public static void main(String[] args) {
        // Operators are the symbols which are used to perform certain mathematical or logical operations.

        // Arithmetic operators in Java are the same as in Python.

        // These operators are used to perform Mathematical Operations. Such as Addition(+), Subtraction(-), Multiplication(*), Division(/), Modulus(%) , Power (**), Floor Division is achieved using typecasting.

        // The values or variables on which operators are applied are known as operands.


        // -------------------------------------------------------------------------------
        // Addition(+): operand1 + operand2
        // -------------------------------------------------------------------------------


        int operand1 = 10; // Here, a variable 'operand1' is declared as an integer and stores the value 10.

        int operand2 = 3; // Here, a variable 'operand2' is declared as an integer and stores the value 3.

        int sum = operand1 + operand2; // Here a variable 'sum' is storing the addition of 'operand1' and 'operand2', meaning sum = 10 + 3.

        System.out.println(sum); // Output: 13

        // In Java, System.out.println() is used for printing the result on the console.


        // -------------------------------------------------------------------------------
        // Subtraction(-): operand1 - operand2
        // -------------------------------------------------------------------------------


        operand1 = 10; // Reassigning the value of operand1 to 10.

        operand2 = 3; // Reassigning the value of operand2 to 3.

        int sub = operand1 - operand2; // Storing the result of subtraction, meaning sub = 10 - 3.

        System.out.println(sub); // Output: 7
        

        // -------------------------------------------------------------------------------
        // Multiplication(*): operand1 * operand2
        // -------------------------------------------------------------------------------


        operand1 = 10; // Reassigning operand1 to 10.

        operand2 = 3; // Reassigning operand2 to 3.

        int mul = operand1 * operand2; // Storing the multiplication of 'operand1' and 'operand2', meaning mul = 10 * 3.

        System.out.println(mul); // Output: 30


        // -------------------------------------------------------------------------------
        // Division(/): operand1 / operand2
        // -------------------------------------------------------------------------------

        operand1 = 10; // Reassigning operand1 to 10.

        operand2 = 5; // Reassigning operand2 to 5.

        int div = operand1 / operand2; // Storing the division of 'operand1' and 'operand2'. Here, in Java, this division will return an integer result if both operands are integers, meaning div = 10 / 5.

        System.out.println(div); // Output: 2


        // -------------------------------------------------------------------------------
        // Power(**): base ** power
        // -------------------------------------------------------------------------------


        int base = 4; // Declaring a variable 'base' to store the value 4.

        int power = 2; // Declaring a variable 'power' to store the value 2.

        int pow = (int) Math.pow(base, power); // In Java, we use Math.pow() to calculate the power. The result is typecasts to int as Math.pow() returns a double.

        System.out.println(pow); // Output: 16


        // -------------------------------------------------------------------------------
        // Modulus(%): operand1 % operand2
        // -------------------------------------------------------------------------------


        operand1 = 10; // Reassigning operand1 to 10.

        operand2 = 3; // Reassigning operand2 to 3.

        int mod = operand1 % operand2; // Storing the remainder of 'operand1' divided by 'operand2', meaning mod = 10 % 3.

        System.out.println(mod); // Output: 1


        // -------------------------------------------------------------------------------
        // Arithmetic Operators on Strings in Java
        // -------------------------------------------------------------------------------

        // In Java, arithmetic operators are not directly used on strings, except for concatenation with the + operator.

        
        // -------------------------------------------------------------------------------
        // Concatenation(+): str1 + str2
        // -------------------------------------------------------------------------------


        String str1 = "First "; // Declaring and initializing a string variable 'str1' with the value "First ".

        String str2 = "Second"; // Declaring and initializing a string variable 'str2' with the value "Second".

        System.out.println(str1 + str2); // The above code concatenates and prints "First Second".

        // In Java, the + operator is used for concatenation of string values.


        // -------------------------------------------------------------------------------
        // Subtraction(-): str1 - str2
        // -------------------------------------------------------------------------------


        str1 = "First "; // Reassigning the value of str1.

        str2 = "Second"; // Reassigning the value of str2.

        // Java does not support subtraction of string values. The following line would result in a compilation error.

        // System.out.println(str1 - str2);


        // -------------------------------------------------------------------------------
        // Multiplication(*): str1 * str2
        // -------------------------------------------------------------------------------


        // Similarly, Java does not support multiplication of string values. The following line would result in a compilation error.

        // System.out.println(str1 * str2);


        // -------------------------------------------------------------------------------
        // Multiplication(*): str1 * num1
        // -------------------------------------------------------------------------------


        str1 = "First "; // Reassigning the value of str1.

        int num1 = 2; // Declaring an integer 'num1' to store 2.

        System.out.println(str1.repeat(num1)); // In Java, we can use the repeat() method from Java 11 onwards to repeat a string.

        // The output will be "First First ".


        // -------------------------------------------------------------------------------
        // Division(/): str1 / str2
        // -------------------------------------------------------------------------------


        str1 = "First "; // Reassigning the value of str1.

        str2 = "Second"; // Reassigning the value of str2.

        // Java does not support division of string values. The following line would result in a compilation error.

        // System.out.println(str1 / str2);


        // -------------------------------------------------------------------------------
        // COMPARISON OPERATORS
        // -------------------------------------------------------------------------------


        // Comparison operators in Java are used to compare two values and return a boolean value: either true or false.

        int a = 10; // Declaring an integer 'a' with value 10.

        int b = 20; // Declaring an integer 'b' with value 20.

        System.out.println(a < b); // Output: true, as 'a' is less than 'b'.

        System.out.println(a > b); // Output: false, as 'a' is not greater than 'b'.


        // -------------------------------------------------------------------------------
        // LOGICAL OPERATORS
        // -------------------------------------------------------------------------------


        // Logical operators in Java return boolean values based on conditions.

        // -------------------------------------------------------------------------------
        // AND Operator (&&)

        // -------------------------------------------------------------------------------

        a = 10; // Reassigning the value of 'a' to 10.

        b = 20; // Reassigning the value of 'b' to 20.

        System.out.println(a > b && a < b); // Output: false, as both conditions are not true.

        // In Java, the '&&' operator returns true only if both conditions are true.


        // -------------------------------------------------------------------------------
        // OR Operator (||)
        // -------------------------------------------------------------------------------

        System.out.println(a > b || a < b); // Output: true, as one of the conditions is true.

        // The '||' operator returns true if at least one condition is true.


        // -------------------------------------------------------------------------------
        // NOT Operator (!)
        // -------------------------------------------------------------------------------


        System.out.println(!(a > b)); // Output: true, as the NOT operator inverts the boolean value.
        

        // ----------------------------------------------------------
        // Addition(+): operand1 + operand2 with float data type
        // -------------------------------------------------------------------------------


        float operand1_float = 10.5f; // Here, a variable 'operand1_float' is storing 10.5 as its value (float type).
        float operand2_float = 3.2f; // Here, a variable 'operand2_float' is storing 3.2 as its value (float type).

        float sum_float = operand1_float + operand2_float; // The sum of two float values is stored in 'sum_float'.

        System.out.println("Float Addition: " + sum_float); // Output: 13.7


        // ----------------------------------------------------------
        // Subtraction(-): operand1 - operand2 with double data type
        // ----------------------------------------------------------

        double operand1_double = 15.56; // Here, a variable 'operand1_double' is storing 15.56 as its value (double type).
        double operand2_double = 5.26; // Here, a variable 'operand2_double' is storing 5.26 as its value (double type).

        double sub_double = operand1_double - operand2_double; // The result of subtracting the double values is stored in 'sub_double'.

        System.out.println("Double Subtraction: " + sub_double); // Output: 10.30


        // ----------------------------------------------------------
        // Multiplication(*): operand1 * operand2 with char data type
        // ----------------------------------------------------------


        char char1 = 'A'; // A character 'A' whose ASCII value is 65.

        char char2 = '2'; // A character type with value 2.

        int mul_char = char1 * char2; // Multiplication of ASCII values of 'char1' and 'char2', resulting in 65 * 2.

        System.out.println("Char Multiplication: " + mul_char); // Output: 130


        // ----------------------------------------------------------
        // Division(/): operand1 / operand2 with double data type
        // ----------------------------------------------------------

        double operand1_double_div = 25.0; // A double variable storing 25.0.

        double operand2_double_div = 4.0; // A double variable storing 4.0.

        double div_double = operand1_double_div / operand2_double_div; // Division of double values.

        System.out.println("Double Division: " + div_double); // Output: 6.25


        // ----------------------------------------------------------
        // Modulus(%): operand1 % operand2 with float data type

        // ----------------------------------------------------------

        float operand1_float_mod = 20.5f; // A float variable storing 20.5.
        float operand2_float_mod = 3.0f; // A float variable storing 3.0.

        float mod_float = operand1_float_mod % operand2_float_mod; // Modulus of two float values.

        System.out.println("Float Modulus: " + mod_float); // Output: 2.5


        // ----------------------------------------------------------
        // Logical AND with boolean data type
        // ----------------------------------------------------------

        boolean bool1 = true; // A boolean variable storing true.
        boolean bool2 = false; // A boolean variable storing false.

        boolean and_bool = bool1 && bool2; // Logical AND between two boolean values.

        System.out.println("Boolean AND: " + and_bool); // Output: false


        // ----------------------------------------------------------
        // Logical OR with boolean data type
        // ----------------------------------------------------------

        boolean or_bool = bool1 || bool2; // Logical OR between two boolean values.

        System.out.println("Boolean OR: " + or_bool); // Output: true


        // ----------------------------------------------------------
        // Logical NOT with boolean data type
        // ----------------------------------------------------------


        boolean not_bool = !bool1; // Logical NOT for a boolean value.

        System.out.println("Boolean NOT: " + not_bool); // Output: false


        // ----------------------------------------------------------
        // Power (** equivalent): Math.pow(base, exponent) with double data type
        // ----------------------------------------------------------

        double base_double = 3.0; // A double variable storing the base 3.0.

        double exponent_double = 4.0; // A double variable storing the exponent 4.0.

        double power_double = Math.pow(base_double, exponent_double); // Using Math.pow() method to compute the power.

        System.out.println("Double Power: " + power_double); // Output: 81.0


        // ----------------------------------------------------------
        // Char Addition (+): char1 + char2 (ASCII values)
        // ----------------------------------------------------------

        char char_add1 = 'B'; // A character 'B' whose ASCII value is 66.

        char char_add2 = 1; // A character type with value 1.

        int sum_char_add = char_add1 + char_add2; // Adding ASCII values of 'char_add1' and 'char_add2'.

        System.out.println("Char Addition (ASCII): " + sum_char_add); // Output: 67 (which is ASCII value of 'C')


        // ----------------------------------------------------------
        // INCREMENT AND DECREMENT OPERATOR
        // ----------------------------------------------------------

        // Increment Operator
        int i = 1;

        System.out.println(i++); // Output: 1

        System.out.println(i); // Output: 2

        // Decrement Operator
        int j = 1;

        System.out.println(j--); // Output: 1

        System.out.println(j); // Output: 0

        // But there are also two types of Increment and Decrement operator.

        // Pre Increment Operator -> Increment then use.

        int k = 1;

        System.out.println(++k); // Output: 2

        System.out.println(k); // Output: 2

        // Post Increment Operator -> Use then increment.

        int l = 1;

        System.out.println(l++); // Output: 1

        System.out.println(l); // Output: 2

        // Pre Decrement Operator -> Decrement then use.

        int m = 1;

        System.out.println(--m); // Output: 0

        System.out.println(m); // Output: 0

        // Post Decrement Operator -> Use then decrement.

        int n = 1;

        System.out.println(n--); // Output: 1

        System.out.println(n); // Output: 0

        // ----------------------------------------------------------
        // SHORTHAND OPERATOR
        // ----------------------------------------------------------

        // We can use shorthand operators to reduce the code length.

        // +=

        int o = 1;

        o += 2; // o += 2 -> o = o + 2

        System.out.println(o); // Output: 3

        // -=

        int p = 1;

        p -= 2; // p -= 2 -> p = p - 2

        System.out.println(p); // Output: -1

        // *=

        int q = 1;

        q *= 2; // q *= 2 -> q = q * 2

        System.out.println(q); // Output: 2

        // /=

        int r = 4;

        r /= 2; // r /= 2 -> r = r / 2

        System.out.println(r); // Output: 2

        // %=

        int s = 3;
        
        s %= 2; // s %= 2 -> s = s % 2

        System.out.println(s); // Output: 1
    }
}
