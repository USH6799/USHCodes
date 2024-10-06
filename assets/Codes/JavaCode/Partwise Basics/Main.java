import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // -------------------------------------------------------------------

        // Java is a high-level language, which has both a compiler and an interpreter.

        // It is first compiled into bytecode and then executed.

        // Bytecode is a special type of code that is created by the compiler after compiling the high-level Java code.

        // This bytecode is later executed by the interpreter, which comes with Java.

        // It converts the bytecode into binary code according to the OS.

        // Hence, Java provides the feature of Write Once, Run Anywhere.

        // Java has a JDK (Java Development Kit), which contains a JRE (Java Runtime Environment).

        // JVM (Java Virtual Machine) is part of the JRE and provides the capability of executing Java code.

        // -------------------------------------------------------------------

        // class classname {
        //     public static void main(String[] args) {

        //     }
        // }

        // This is the boilerplate code of Java.

        // Boilerplate means the compulsory code that must be written before further coding.

        // The compiler tries to find the main function in the class to compile the code. It is required to have a main function.

        // The main function helps to call all other functions in the class and access other data members.

        // -------------------------------------------------------------------

        // Source code (.java) is converted into bytecode (.class) by the compiler, which comes with the JDK.

        // Later, according to the OS, bytecode (.class) is converted into binary or native code (0s and 1s) by the JVM (Java Virtual Machine).

        // -------------------------------------------------------------------

        // Any code written in Java must be inside a function or a method, like the main method in the boilerplate example.

        // All functions and data members must be enclosed within a class.

        // A class is a blueprint of an object that contains all the properties and methods.

        // -------------------------------------------------------------------

        Basic();
        EscapeSequences();
        Variables();
        Datatypes();
        Operators();
        ScannerInput();
        Conditionals();
        Looping();
        Functions();
        Function1();

        // Ignore this all things.

    }

    static void Basic() {
        // To print or display any output on the screen, we use a print statement.

        System.out.println("Hello World");
        // Output: Hello World

        // In this, we access the System class, then its object `out`, and call the function `println()` to print the output or value.

        // Remember, all statements in Java end with a terminating symbol or a semicolon (;).

        // Java also uses various brackets: parentheses (()), square brackets ([]), and braces ({}), for different purposes like defining scopes.

        // -------------------------------------------------------------------

        // Difference Between println() and print()

        System.out.println("I am on the Same line"); // Here, `println()` adds a new line after printing its statement.

        System.out.println("I am on the next Line due to the above println() statement"); // Here, `println()` adds a new line after printing its statement.

        System.out.print("I am also on the next Line due to the above print() statement"); // Here, `print()` does not add a new line after printing its statement.

        System.out.println(", I am on the same line due to the above print() statement"); // Here, `println()` adds a new line after printing its statement.

        /*
        OUTPUT:
        I am on the Same line
        I am on the next Line due to the above println() statement
        I am also on the next Line due to the above print() statement, I am on the same line due to the above print() statement
        */

        // -------------------------------------------------------------------

        // <- This is a comment. It is not compiled by the compiler and is used to make notes, mark important points, or explain changes for readers.

        /*
        This is
        a
        multiline
        comment, which means you can write as many lines as you want inside this comment without causing an error.
        */

        // The smallest individual unit of code is called a token.

        // Java has tokens such as keywords, operators, identifiers, literals, and comments.

        // Keywords or reserved words in Java have special meanings and cannot be used as variable names, function names, or in other contexts.

        // For example, words like `default`, `void`, `Integer`, `System`, and `class` are reserved and hold special meanings in Java.

        // -------------------------------------------------------------------
    }

    static void EscapeSequences() {
        
        // Escape Sequences are special character values that have a definite function or a specific constant value.

        // For example, if I want to print two statements using the print() function only but on different lines:

        // Before using escape sequences:
        System.out.print("I am on the same line, doesn't create a new line");
        System.out.print("I am also on the same line, doesn't create a new line");

        /*
           OUTPUT:-
           
           I am on the same line, doesn't create a new lineI am also on the same line, doesn't create a new line
         */

        // -------------------------------------------------------------------

        // After using escape sequences:

        System.out.print("I am on the same line, doesn't create a new line but added new line due to this \n");
        System.out.print("I am on the new line due to escape sequence, doesn't create a new line");

        /*
           OUTPUT:-
           
           I am on the same line, doesn't create a new line
           I am on the new line due to escape sequence, doesn't create a new line
         */

        // Here I used the \n escape sequence, which adds a new line after it.

        // \n - Adds a new line
        // \t - Adds a tab space (4 spaces or variable spaces)
        // \\ - Adds a backslash (\)
        // \" - Adds a double quote (")
        // \' - Adds a single quote (')

        // -------------------------------------------------------------------

        // Let's try to print this pattern using different print methods:

        /*

            *
            * *
            * * *
            * * * *
            * * * * *

         */

        // -------------------------------------------------------------------

        // Using println() function:

        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

        /*
           OUTPUT:-
           
            * 
            * *
            * * *
            * * * *
            * * * * *

         */

        // -------------------------------------------------------------------

        // Using print() function & escape sequences:

        System.out.print("*\n");
        System.out.print("* *\n");
        System.out.print("* * *\n");
        System.out.print("* * * *\n");
        System.out.print("* * * * *\n");

        /*
           OUTPUT:-
           
            * 
            * *
            * * *
            * * * *
            * * * * *

         */

        // -------------------------------------------------------------------

        // Using a single print() function & escape sequences:

        System.out.print("*\n* *\n* * *\n* * * *\n* * * * *\n");

        /*
           OUTPUT:-
           
            * 
            * *
            * * *
            * * * *
            * * * * *

         */

        // -------------------------------------------------------------------

        // Let's try to check your IQ. Tell which statement will display the following output:

        // OUTPUT should be:

        // *
        // * *
        // *

        /*
           OPTION A:-
           System.out.println("*\n");
           System.out.print("* *\n *");
         */

        /*
           OPTION B:-
           System.out.print("*\n* *");
           System.out.println("*");
         */

        /*
           OPTION C:-
           System.out.println("*\n* *\n*");
         */

        // Try to check all options and their outputs.
    }


    static void Variables() {
        // Variables are like Containers to Store some value in memory or Storage.

        // Like lets go in maths, Geometry, the most hatred Chapter.

        // In Rectangle When i want to calculate Perimeter of the Rectangle, we need 2 values ies. length(l) and Breadth(b).

        // Formula:- 2 X (l + b)

        // Here you can see that we don't know the value of l and b but we not whatever value, l and b holds will be put here to find the parameters.

        // Hence l and b are called Variables.

        // Variable word means Can Change or Vary.

        // Means its value can alter or change.

        // Imagine, i have a rectangle of length(l) 4 and breadth(b) 5.

        // Then its Perimeter: 2 X (l + b), where l = 4 and b = 5

        // Perimeter = 2 * (4 + 5) => 2 * 9 => 18

        // Now take an Example of Another Rectangle of length(l) 6 and breadth(b) 7.

        // Then its Perimeter: 2 X (l + b), where l = 6 and b = 7

        // Perimeter = 2 * (6 + 7) => 2 * 13 => 26

        // Here you can see that the values of variable l and b changes with respect of dimensions of Rectangle.

        // But did you notice that in both the cases the 2 inside the formula remains same or does't change.

        // This means 2 is a Constant.

        // Constant words means Constant, or which doesn't change.

        // -------------------------------------------------------------------

        // Require Another Example, now lets go towards Circle, and its area formula,

        // Area = pi * r * r , where r = Radius of Circle and pi = 22/7 or 3.14 approx.

        // Here you can see 2 variables ies. pi and r but what if i would say that pi is not a variable but a constant.

        // Lets Imagine a Big circle of radius(r) 10.

        // Area = pi * r * r , where r = 10 and pi = 22/7 or 3.14 approx.

        // Area = 3.14 * 10 * 10 => 314.0

        // -------------------------------------------------------------------

        // Lets Take another Circle of radius(r) 5.

        // Area = pi * r * r , where r = 5 and pi = 22/7 or 3.14 approx.

        // Area = 3.14 * 5 * 5 => 78.5

        // Now you can find that value of variable r alters or changes with respect to Circle, but value of pi remains same and hence it is known as Constant Variable or Just Constant.

        // -------------------------------------------------------------------

        // Variables in Java are written in following Syntax:-

        // There are two different ways to declare a variable in Java.

        // Only Declaration:- <Datatype> <VariableName>;

        // Example:- int a;

        // Where a is a variable of DataType Integer.

        // We don't know what value is Stored in it.

        // -------------------------------------------------------------------

        // Both Declaration and Initialization:- <Datatype> <VariableName> = <value>;

        // Example:- int a = 10;

        // Where a is a variable of DataType Integer and its value is 10.

        // Lets Try to find area of Rectangle of length(l) 4 and breadth(b) 5 using java.

        int l = 4; // Length
        int b = 5; // Breadth

        int area = l * b; // Area = length * breadth

        System.out.println("area"); // this will not print the result but print just area.
        // OUTPUT:- area

        System.out.println(area); // printing the variable without double quotes means printing its value.
        // OUTPUT:- 20

        // Let Understand the Important Rules for Writing a Variable.

        // 1. It Shouldn't Start with Numbers.

        // Ex:- int 1a = 10; , this is Wrong and Shows an error.

        // Correct Way:- int a1 = 10; , this is Correct and Doesn't Show any error.

        // 2. Java is Case Sensitive, Lowercase and Uppercase are treated differently.

        // like int x = 5; & int X = 10;

        // both are X but due to Case they are treated as different Variables.

        // On printing there values:-

        // System.out.println("x = " + x); OUTPUT:- x = 5

        // System.out.println("X = " + X); OUTPUT:- X = 10

        // 3. It Cannot Contain Spaces instead it may Contain Underscore(_).

        // String My Name = "USH"; this is InCorrect and throws an error.

        // String My_Name = "USH"; this is Correct and doesn't throws any error.

        // 4. It cannot Contain Special characters and Operators.
    }

    static void Datatypes() {
        // Let us understand about datatypes before Starting Variables.

        // Datatypes are just used to Specify the Type of Data, so that computer can understand it and use it properly.

        // Like if you want to use any numbers, than you have to specify the Datatype of that number like Integer, Float, Double , Short or Long.

        // Before Starting Datatypes let us know something about memory, like each value takes some space in our memory in form of bits and bytes.

        // 1 bit => (0 or 1)

        // 1 byte => 8 bits
        // 1 kilobyte(kb) => 1024 bytes
        // 1 megabyte(mb) => 1024 kilobytes
        // 1 gigabyte(gb) => 1024 megabytes
        // 1 terabyte(tb) => 1024 gigabytes
        // 1 petabyte(pb) => 1024 terabytes
        // 1 exabyte(eb) => 1024 petabytes
        // 1 zettabyte(zb) => 1024 exabytes
        // 1 yottabyte(yb) => 1024 zettabytes

        // Each Datatype have different Memory Size.

        // --------------------------------------------------------------------------

        // There are Mainly 2 types of Datatypes in Java:-

        // 1. Primitive Datatypes
        // 2. Non-Primitive Datatypes

        // Primitive Datatypes:-

        // Byte => Space: 1 byte or 8 bits
        // Range:- -128 to 127

        // Boolean(True or False) => Space: 1 byte or 8 bits
        // Range:- true(1) or false(0)

        // short => Space: 2 bytes or 16 bits
        // Range:- -32,768 to 32,767 / -2^15 to 2^15 - 1

        // char(Character) => Space: 2 bytes or 16 bits
        // Range:- 0 to 65535

        // int(Integer) => Space: 4 bytes or 32 bits
        // Range:- -2,147,483,648 to 2,147,483,647 / -2^31 to 2^31 - 1

        // float(Float or Decimal Values) => Space: 4 bytes or 32 bits
        // Range:- Can Store about 6-7 decimal digits

        // Long(Long or big integer values) => Space: 8 bytes or 64 bits
        // Range:- -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 / -2^63 to 2^63 - 1

        // double(Double or Big Decimal Values) => Space: 8 bytes or 64 bits
        // Range:- Can Store about 15 decimal digits

        // Non-Primitive Datatypes:-
        // there memory size is not fixed and can change according to the values Stored in it.

        // They are the Set of Different Primitive datatypes or more than one Primitive Datatype.

        // In My words, all Non-Primitive Datatypes are formed by some Primitive Datatypes and have Storage size according to them.

        // String
        // Array
        // Object
        // Class
        // Interface

        // -----------------------------------------------------------------------------

        // Lets do Some Coding.

        Byte a = 12; // A variable 'a' of Datatype Byte Storing the value 12.

        char ch = 'a'; // A variable 'ch' of Datatype char Storing the value 'a'.
        // Character values are always enclosed with Single Quotes 'char'.

        short b = 112; // A variable 'b' of Datatype short Storing the value 12.

        Boolean flag = true; // A variable 'flag' of Datatype Boolean Storing the value true.

        int c = 1234567890; // A variable 'c' of Datatype int Storing the value 1234567890.

        long d = 3456789L; // A variable 'd' of Datatype long Storing the value 3456789L.

        // We have to Specify the 'L' at the end of the number to show them as long values because by default in java all decimal numbers are int.

        float e = 12.34f; // A variable 'e' of Datatype float Storing the value 12.34.
        // We have to Specify the Decimal number by f at last to show them as float values because by default in java all decimal numbers are double.

        double f = 12.34; // A variable 'f' of Datatype double Storing the value 12.34.

        System.out.println(a);
        // OUTPUT:- 12

        System.out.println(ch);
        // OUTPUT:- a

        System.out.println(b);
        // OUTPUT:- 112

        System.out.println(flag);
        // OUTPUT:- true

        System.out.println(c);
        // OUTPUT:- 1234567890

        System.out.println(d);
        // OUTPUT:- 3456789

        System.out.println(e);
        // OUTPUT:- 12.34

        System.out.println(f);
        // OUTPUT:- 12.34

        // Lets add two Numbers:-

        int x = 4; // A variable 'x' of Datatype int Storing the value 4.

        int y = 10; // A variable 'y' of Datatype int Storing the value 10.

        int sum = x + y; // A variable 'sum' of Datatype int Storing the value of x + y.

        // Adding two Numbers or Integer values using + operator is known as Adding, FUN FACT. have use in future.

        System.out.println(sum);
        // OUTPUT:- 14

        // -----------------------------------------------------------

        // Lets Move towards Non Primitive Datatypes:

        // String:-

        String str = "Hello I am String i can store 233 and also 2.4 and anything else";
        // String values are always Enclosed with double Quotes "String".

        // String values can contain anything, and i would say anything, it can either a char or nu,be ror decimal values or Boolean, anything.

        // But do you Know that all the things written inside the String str are neither Of Integer datatype, nor any other primitive datatype, but in reality they are of char datatype.

        // In Other words, U can Say that Strings are the Set of different Characters.

        // Like here 'H' is a char, '2' is also a char, '.' is also a char, and everything else are of Character Datatype.

        System.out.println("str");
        // Here we are directly printing the String value.

        // OUTPUT:- str

        System.out.println(str);
        // But here we are printing the value of Variable str which stores some String value.

        // OUTPUT:- Hello I am String i can store 233 and also 2.4 and anything else.

        // We will learn about other Non-Primitive Datatypes in Upcoming Chapters, till we only require to know about main primitive datatype and String Datatype.

        // ------------------------------------------------------------------------

        // NevertheLess, Additional Knowledge about Strings,

        // Concatenation(or Addition of String using + Operator).

        // There are Two ways to Concatenate Strings or Add Strings, ies. Using + Operator or .concat() fnc.

        // But here we will understand about + Operator Only:

        String str_1 = "1"; // A Variable str_1 storing Some String values.

        String str_2 = "1"; // A Variable str_2 storing Some String values.

        String str3 = str_1 + str_2; // Adding Both Strings and Storing it in Variable str3.

        System.out.println(str3); // printing the value Stores in Variable str3.

        // OUTPUT:- 11

        // Hence they are joined not Added and i have also Proved that 1 and 1 is Equal to 11 not 2,😂😂.

        // Concatenation works only in string values where using + operator it attaches both values as a single unit.

        // Ex:- In integer, 1 + 1 = 2, like math toppers says 1 + 1 is 2.

        // Ex:- In string, "1" + "1" = "11", like Legends says 1 + 1 is 11.

        // So there is different fnc of Operators with resect of Different Datatypes.

        // -------------------------------------------------------------------------

        // Lets Do Some Practice and Check Your Understanding:-

        /*
           How to Calculate the Below thing:-
           
           a1 X b1
           ---------
           a1 - b1
           
         */

        int a1  = 10; // A Variable 'a1' of Datatype int(Integer), Storing 10.
        
        int b1 = 5; // A Variable 'b1' of Datatype int(Integer), Storing 5.

        int ans = 10; // A Variable 'ans' of datatype int(Integer, Storing Result.

        // which Option will give the Same value of ans.

        /*
           OPTION 1:
           ans = a1 * b1 / a1 - b1;
         */

        /*
           OPTION 2:
           ans = (a1 * b1) / a1 - b1;
         */

        /*
           OPTION 3:
           ans = (a1 * b1) / (a1 - b1);
         */

        // Try to Copy my Code and Run it in your System and Understand the OUTPUTS.

        // ----------------------------------------------------------------------

    }


    static void Operators() {
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

    static void ScannerInput() {

        // Let us understand how To take input from user.

        // For that we have to right two things or statements which are compulsory.

        // First Step: Import Scanner class

        // Syntax:- import java.util.Scanner; this is compulsory.

        // It should be written above the class or outside the class.

        // By this we are taking the Scanner class from utility(util) package.

        // data Members and Variables together make a Method or Function.

        // Various types of Similar data methods and functions make a Class.

        // Various Similar Class makes a Package.

        // -----------------------------------------------------------------------

        // Next Step: Creating an Object of Scanner Class.

        // For this we have to know the basic Syntax of Creating an Object of Any class.

        // Syntax:- <classname> <objectname> = new <classname> (); this are compulsory

        // In our Case, we have the classname 'Scanner'.

        // And we can give any object name of our choice.

        // Lets create an object of Scanner Class.

        Scanner sc = new Scanner(System.in); // this are compulsory

        // In this sc is the objectname. or you can give any name to it.

        // -----------------------------------------------------------------------

        // As we have studied different Datatypes, so don't you think the way of taking input from user is also different according to Datatype.

        // Yes, you are current there are different functions in Scanner class for Different Datatypes.

        // Lets start from Integer, then String and then char, at last Float and Double, or Boolean as well.

        System.out.print("Enter the Integer Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        int x = sc.nextInt(); // Taking input from user and storing it in variable x of type int.

        // Here we called the nextInt(); fnc of Scanner class through its object 'sc'.

        // Remember whenever We take input from user, after that this fnc leaves an extra line after it just like println();.

        System.out.println("Integer: " + x); // lets check the value of x.

        // -------------------------------------------------------------------------

        System.out.print("Enter the String Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        String y = sc.next(); // Taking input from user and storing it in variable y of type String.

        // Here we called the next(); fnc of Scanner class through its object 'sc'.

        // Remember whenever We take input from user, after that this fnc leaves an extra line after it just like println();.

        System.out.println("String: " + y); // lets check the value of y.

        // Difference between next(); and nextLine(); fncs.

        // This both associate with String datatype.

        // next(); fnc takes only the first word as its input and save it in desired location or variable.

        // nextLine(); fnc takes all the words as its input and save it in desired location or variable.

        String z = sc.nextLine(); // Taking input from user and storing it in variable z of type String.

        // Here we called the nextLine(); fnc of Scanner class through its object 'sc'.

        System.out.println("String: " + z); // lets check the value of z.

        // Lets us take an example that input is "Hello World" by the user.

        // So the value Stored in variable y will be "Hello".

        // And the value Stored in variable z will be "Hello World".

        // Here you can see that next(); fnc takes only a word not the whole sentence.

        // -------------------------------------------------------------------------

        System.out.print("Enter the Character Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        char ch = sc.next().charAt(0); // Taking input from user and storing it in variable ch of type char.

        // Here we called the next(); fnc of Scanner class through its object 'sc'.

        // Actually there is no primary fnc for taking Character as input from user.

        // So we use a String fnc called charAt(index); which picks the Character at desired index or position.

        // So After taking a Word as input using next(); fnc then we pick the first character of that word and store it in 'ch'.

        // Remember next(); fnc takes only the first word as its input and save it in desired location or variable.

        // Take an Example as input "hello" and input "e".

        // So in first case when input is "hello",

        // then the value in ch will be "hello".charAt(0);

        // In Index it begins not from 1 but 0.

        // so in Word -> "h e l l o"
        // Index will be: 0 1 2 3 4

        // Which will be there position.

        // So we picked the Character at position 0 or index 0 which is 'h'.

        // Hence charAt(index); fnc picks a char so it needs a char datatype variable, here 'ch'.

        // In Second Case also when input is "e".

        // so in Word "e" Index will be: 0

        // Which will be there position.

        // So we picked the Character at position 0 or index 0 which is 'e'.

        // Hence charAt(index); fnc picks a char so it needs a char datatype variable, here 'ch'.

        // Remember whenever We take input from user, after that this fnc leaves an extra line after it just like println();.

        System.out.println("Character: " + ch); // lets check the value of ch.

        // -------------------------------------------------------------------------

        System.out.print("Enter the Float Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        Float f = sc.nextFloat(); // Taking input from user and storing it in variable f of type Float.

        // Here we called the nextFloat(); fnc of Scanner class through its object 'sc'.

        // Remember whenever We take input from user, after that this fnc leaves an extra line after it just like println();.

        System.out.println("Float: " + f); // lets check the value of f.

        // -------------------------------------------------------------------------

        System.out.print("Enter the Double Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        Double d = sc.nextDouble(); // Taking input from user and storing it in variable d of type Double.

        // Here we called the nextDouble(); fnc of Scanner class through its object 'sc'.

        System.out.println("Double: " + d); // lets check the value of d.

        // -------------------------------------------------------------------------

        System.out.print("Enter the Boolean Value(true or false): "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        Boolean b = sc.nextBoolean(); // Taking input from user and storing it in variable b of type Boolean.

        // Here we called the nextBoolean(); fnc of Scanner class through its object 'sc'.

        System.out.println("Boolean: " + b); // lets check the value of b.

        // -------------------------------------------------------------------------

        // Lets Try to take input for Two numbers and do Different Arithmetic Operations:-

        // Firstly, import java.util.Scanner;

        // Second, Scanner sc = new Scanner(System.in);

        // Then lets take input.

        System.out.print("Enter the Number 1: ");
        int num1 = sc.nextInt(); // Taking Input and Storing it in 'num1' variable of datatype Integer.

        System.out.print("Enter the Number 2: ");
        int num2 = sc.nextInt(); // Taking Input and Storing it in 'num2' variable of datatype Integer.

        System.out.println("Sum = " + (num1 + num2)); // Printing the sum of num1 and num2

        System.out.println("Product = " + (num1 * num2)); // Printing the product of num1 and num2

        System.out.println("Quotient = " + (num1 / num2)); // Printing the Quotient when num1 is divided by num2

        System.out.println("Remainder = " + (num1 % num2)); // Printing the Remainder when num1 is divided by num2
    }

    static void Conditionals() {

        // Conditional Statements are the Statements which are used to make decisions or execute certain code based on certain conditions.

        // Like if a number is positive or negative or even or odd.

        // Some conditionals Statements are:-

        // 1. if

        // 2. if , else

        // 3. if , else if , else

        // 4. nested if , else

        // 5. ternary operator

        // 6. Switch case

        // -------------------------------------------------------------------------

        // Lets start with 1. if conditional, which means if.

        // like i have a question, i want to ask the user, his age as input and check whether it is greater than 18 or not. if he is greater than 18 then he is eligible to vote.

        // For Taking Input we have to write above the class 'import java.util.Scanner;'.

        // And create an Object of Scanner class.

        Scanner input = new Scanner(System.in); // Creating an object 'input' of Scanner class.

        System.out.print("Enter the Age: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        int age = input.nextInt(); // Taking input from user and storing it in variable age of type Integer.

        // Firstly lets understand the syntax of if Statement.

        /*
           
            if (condition) {

                // code to be executed if the condition is true

            }
           
         */

        // Lets Implement it,

        if (age >= 18) { // Here, if the value of 'age' is greater than or equal to 18, it gives the output as True and the if block is executed.

            System.out.println("You are eligible to vote."); // Output: You are eligible to vote.

        } // if block ends here.

        // But we have a Problem like if user inputs age less than 18 then no output will be displayed, and cannot find whether he is eligible to vote or not.

        // -----------------------------------------------------------------------

        // Lets try 2. if , else conditional, which means if , else.

        // Syntax of If else block is:-

        /*
           
            if (condition){
                // code to be executed if the condition is true
            }
            else{
                // code to be executed if the condition is false
            }

         */

        if (age >= 18) { // Here, if the value of 'age' is greater than or equal to 18, it gives the output as True and the if block is executed.

            System.out.println("You are eligible to vote."); // Output: You are eligible to vote.

        } // if block ends here.

        else { // Here, if the value of 'age' is less than 18, it gives the output as False and the else block is executed.

            // it will only if above if block is false means the condition is false or not Satisfied.

            System.out.println("You are not eligible to vote."); // Output: You are not eligible to vote.

        } // else block ends here.

        // -----------------------------------------------------------------------

        // Next Question i have Some data and i want to print according to it.

        /*
         
                age     |   Output
              ----------------------
                <10     |   "Kid"
                <20     |   "Young"
                <30     |   "Adult"
            30 or above |   "Old"

         */

        // In this Case i have more than 1 condition or i would say more than 1 if Statements.

        // If i would write many if statements like this:

        if (age < 10) { // if the value of 'age' is less than 10, it gives the output as True and the if block is executed.

            System.out.println("Kid"); // Output: "Kid"

        } // if block ends here.

        if (age < 20) { // if the value of 'age' is less than 20, it gives the output as True and the if block is executed.

            System.out.println("Young"); // Output: "Young"

        } // if block ends here.

        if (age < 30) { // if the value of 'age' is less than 30, it gives the output as True and the if block is executed.

            System.out.println("Adult"); // Output: "Adult"

        } // if block ends here.

        if (age >= 30) { // if the value of 'age' is greater than or equal to 30, it gives the output as True and the if block is executed.

            System.out.println("Old"); // Output: "Old"

        } // if block ends here.

        // this is not the correct way to do this, because if input will be 16,

        // then age = 16,

        // for the 1st if statement, where condition is (age < 10), will be (16 < 10) -> false.

        // Hence nothing is Printed or the if block doesn't Execute.

        // Then for the 2nd if statement, where condition is (age < 20), will be (16 < 20) -> true.

        // Hence "Young" will be Printed or the if block Executes.

        // Then for the 3rd if statement, where condition is (age < 30), will be (16 < 30) -> true.

        // Hence "Adult" will be Printed or the if block Executes.

        // Then for the 4th if statement, where condition is (age >= 30), will be (16 >= 30) -> false.

        // Nothing will be Printed or the if block doesn't Execute.

        // For above we saw that it prints both young and adult but its quite Wrong.

        // There we use our 3rd Conditional: if , else if , else.

        if (age < 10) { // if the value of 'age' is less than 10, it gives the output as True and the if block is executed.

            System.out.println("Kid"); // Output: "Kid"

        } // if block ends here.

        else if (age < 20) { // if the above if statements are false, then only it checks and run this if block , Condition: if the value of 'age' is less than 20, it gives the output as True and the else if block is executed.

            System.out.println("Young"); // Output: "Young"

        } // if block ends here.

        else if (age < 30) { // if the above if statements are false, then only it checks and run this if block , Condition: if the value of 'age' is less than 30, it gives the output as True and the else if block is executed.

            System.out.println("Adult"); // Output: "Adult"

        } // if block ends here.

        else { // if the above all conditions are false then only the if block will execute.

            System.out.println("Old"); // Output: "Old"

        } // else block ends here.

        // Now if the input is 16.

        // then age = 16

        // Checking 1st if condition (age < 10) -> (16 < 10) -> false.

        // Hence the condition is false, so the if block will not execute and we move to next if condition.

        // Checking 2nd if condition (age < 20) -> (16 < 20) -> true.

        // Hence the Condition is true, so the else if block will execute and display Young, then it won't check any further conditions because condition already met.

        // -----------------------------------------------------------------------

        // What if i wanted to print hello if age is between 14 to 18.

        // I can do 2 things, 1. Using nested if 2. Using conditional operators.

        // Using Nested if:

        if (age >= 14) { // if the value of 'age' is greater than 14, it gives the output as True and the if block is executed.

            if (age <= 18) { // if the value of 'age' is greater than 14, it gives the output as True and the if block is executed.

                System.out.println("Hello"); // Output: "Hello"

            } // nested if block ends here.

        } // if block ends here.

        // -------------------------------------------------------------------------

        // Conditional Operators are the operators which are used to check the relation between two or more conditions.

        // && (and)

        // || (or)

        // ! (not)

        if (age >= 14 && age <= 18) { // if the value of 'age' is greater than 14 and less than 18, it gives the output as True and the if block is executed.

            // Here we used && (and) operator so the if block will be executed only if both conditions are true.

            System.out.println("Hello"); // Output: "Hello"

        } // if block ends here.

        // lets check more about && (and) operator.

        System.out.println(true && true); // Output: true

        System.out.println(true && false); // Output: false

        System.out.println(false && true); // Output: false

        System.out.println(false && false); // Output: false

        // -------------------------------------------------------------------------

        // Lets check more about || (or) operator.

        System.out.println(true || true); // Output: true

        System.out.println(true || false); // Output: true

        System.out.println(false || true); // Output: true

        System.out.println(false || false); // Output: false

        // -------------------------------------------------------------------------

        // Lets check more about ! (not) operator.

        System.out.println(!true); // Output: false

        System.out.println(!false); // Output: true

        // it means it just reverses the result.

        // -------------------------------------------------------------------------

        // Ternary Operator is a very useful operator which helps us to write if else statement in one statement.

        // Syntax:- <condition> ? <true value> : <false value>;

        // In above syntax if the condition is true then true value is returned and if the condition is false then false value is returned.

        String result = (10 < 6) ? "yes" : "no"; // In this we used a ternary operator( ? : ) , in which it checks the condition and returns the value according to it. like here (10 < 6) is the condition which is false, so (10 < 6) -> false.

        // If the condition is true then it may return "yes".

        // If the condition is false then it returns "no".

        // the returned value is Stored in result variable of datatype String.

        System.out.println(result); // OUTPUT:- no

        // Lets rewrite that age concept of voting using ternary operator.

        String res = (age < 18) ? "You Cannot Vote" : "You Can Vote"; // In this we used a ternary operator( ? : ) , in which it checks the condition and returns the value according to it. like here (age < 18) if the condition is false, so (age < 18) -> false.

        // If the condition is true then it may return "You Cannot Vote".

        // If the condition is false then it returns "You Can Vote".

        System.out.println(res); // OUTPUT:- You Can Vote

        // -------------------------------------------------------------------------

        // Switch Case is a very useful way to work with conditions of one variable, or the same condition.

        // Syntax for Switch case:

        /*
            switch(variable){

            case value1:
            // code if case matches
            break

            case value2:
            // code if case matches
            break

            default:
            // code if no case matches
            break

            }

         */

        // Lets break it down, firstly we have to use a variable and check the condition.

        // like if variable is equal to value1, then code will be executed for that case.

        // and then break statement is written that will stop the execution further and do not check rest conditions.

        // IF we skip writing break then we will go in fall through.

        // in fall through if the case matches and do not contain break, then code of next case is also executed till it met the break statement.

        // lets see an example.

        int var = 5; // A variable is declared and initialized with value 5.

        switch (var) { // Checking the value of var using switch case.

            case 2: // If the value of var is 2, then code will be executed for that case.

                System.out.println(2); // Output: 2

                break; // breaking the switch case and stops the further execution.

            case 5: // If the value of var is 5, then code will be executed for that case.

                System.out.println(5); // Output: 5

                break; // breaking the switch case and stops the further execution.

            default: // If the value of var is not 2 or 5, then code will be executed for that case.

                System.out.println(0); // Output: 0

                break; // breaking the switch case and stops the further execution.

        }// switch case ends here.

        // OUTPUT for this Switch case will be 5 because case 5 is matched and it contains the break statement which stops the further execution.

        // Lets check the Same without break statement.

        switch (var) { // Checking the value of var using switch case.

            case 2: // If the value of var is 2, then code will be executed for that case.

                System.out.println(2); // Output: 2

            case 5: // If the value of var is 5, then code will be executed for that case.

                System.out.println(5); // Output: 5

            default: // If the value of var is not 2 or 5, then code will be executed for that case.

                System.out.println(0); // Output: 0

        }// switch case ends here.

        // OUTPUT for this Switch case will be 5 and then 0 because case 5 is matched and hence it prints 5 and then no break statement is written so it will move to next case which is default and prints 0.

        // --------------------------------------------------------------------------

        /*
         * 
         * Day | in Words
         * -----------------------------
         * 1 | Monday
         * 2 | Tuesday
         * 3 | Wednesday
         * 4 | Thursday
         * 5 | Friday
         * 6 | Saturday
         * 7 | Sunday
         * 
         * 
         */

        System.out.print("Enter the Day Number: "); // Asking for input from user.

        int day = input.nextInt(); // Taking input from user and storing it in variable age.

        // Variable age is already declared and initialized before so no need to declare again.

        // Scanner class is already imported and object is already created.

        String Day_inWords = ""; // A variable 'Day_inWords' to Store the Day of datatype String, Declared and initialized with "" empty quotes.

        switch (day) { // Checking the value of age using switch case.

            case 1: // If the value of day is 1, then code will be executed for that case.

                Day_inWords = "Monday"; // Storing 'Monday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 2: // If the value of day is 2, then code will be executed for that case.

                Day_inWords = "Tuesday"; // Storing 'Tuesday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 3: // If the value of day is 3, then code will be executed for that case.

                Day_inWords = "Wednesday"; // Storing 'Wednesday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 4: // If the value of day is 4, then code will be executed for that case.

                Day_inWords = "Thursday"; // Storing 'Thursday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 5: // If the value of day is 5, then code will be executed for that case.

                Day_inWords = "Friday"; // Storing 'Friday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 6: // If the value of day is 6, then code will be executed for that case.

                Day_inWords = "Saturday"; // Storing 'Saturday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 7: // If the value of day is 7, then code will be executed for that case.

                Day_inWords = "Sunday"; // Storing 'Sunday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            default: // if no case matches , then default case will be executed.

                Day_inWords = "Wrong Input"; // Storing 'Wrong Input' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

        }// Switch block ends here.

        System.out.println(Day_inWords);

        // Lets try final Practice Question to find whether the number is even or odd.

        // Using if else,

        System.out.print("Enter the Number to Check whether it is Even or Odd: "); // Asking the user for inputting a Number to Check whether the Number is Even or Odd.

        int x = input.nextInt(); // Taking Input from the user and Storing it in var 'x' of Datatype Integer.

        if (x % 2 == 0) { // Checking whether the Remainder received when x is divided by 2 is equal to 0 or not, if it is Equal to 0 then the Condition becomes true and if part runs.

            System.out.println(x + " is Even"); // prints that x is Even.

        } // if Block ends here.

        else { // if the Above Condition is False, then else part will run.

            System.out.println(x + " is Odd"); // prints that x is odd.

        } // else block ends here.

        // Using ternary operator,

        String ans = (x % 2 == 0) ? (x + " is Even") : (x + " is Odd"); // Ternary operator to check whether the number is Even or Odd.

        // if the condition is true, then 1st Expression will be executed else 2nd Expression will be executed.

        System.out.println(ans); // prints the result.

        // ---------------------------------------------------------------
    }

    static void Looping() {
        // Lets take an Example and understand looping.

        // Think i want to print this statement 100 times.

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        // and so on, 100 times.

        // Don't you think this makes our code difficult and Complex.

        // To solve this Problem We have a Loops Concept.

        // There are mainly three types of Loops:-

        // 1. For loop
        // 2. While loop
        // 3. Do-While loop

        // ------------------------------------------------------------------------

        /*
            Explanation of the `for` loop:

            What is a `for` loop?

            - A `for` loop is a control structure in Java that allows you to repeat a
            block of code a specific number of times.

            - Unlike the `while` loop, a `for` loop is usually used when the number of
            iterations is known beforehand.

            Syntax of a `for` loop:
            for (initialization; condition; update) {
             // code block to be executed
            }

            - `initialization`: This is executed once at the start of the loop and is
            typically used to initialize loop control variables.

            - `condition`: This is a boolean expression that is checked before each
            iteration. If it's true, the loop runs; if it's false, the loop stops.

            - `update`: This is executed after every iteration and is generally used to
            update the loop control variable (like incrementing or decrementing it).

            Why use a `for` loop?
            - A `for` loop is most useful when you know exactly how many times the loop
            should run (e.g., iterating over an array, or counting from 1 to 10).

            - It provides a compact structure for loops that require initialization, a
            condition, and an update in one place.

            Difference between `for` and `while` loops:
            - A `for` loop is generally preferred when the number of iterations is known.

            - A `while` loop is better when the number of iterations depends on dynamic
            conditions, such as user input or other unpredictable events.
         */

        // --------------------------------------------------------------------------

        // Lets Start With for loop, we use for loop when we have a Definite amount or number of times, the loop runs.

        // Let us understand the Syntax:-

        /*

            for(<initialization>; <condition>; <increment/decrement>){
                <code>
            }

         */

        // It may look Complex but let short it out.

        // Firstly we have to create a for loop block, in the we have to initialize any temporary variable on which loop counts and then condition, on which loop terminates and the changes with variables values.

        // Let print 'hello' 100 times using loop.

        for (int i = 1; i <= 100; i++) {
            // Initialized a Variable 'i' of Datatype Integer, as value 1, and the Condition is (i <= 100) -> (1 < 100) which is true so Gone inside the loop and then run the code inside the loop, prints the statement, then update the Value of i by 1.

            // Next time value of i becomes 2 then 3 and so on till 100, because after 100 when value of i becomes 101 then the Condition (i <= 100) -> (101 <= 100) becomes false and the loop terminates.

            System.out.println("hello"); // OUTPUT:- hello

        } // for loop ends here.

        // Lets Now see another Example where loop is going 3 times printing the value of 'j'.

        int j; // Initializing a Variable 'j' of Datatype Integer.

        for (j = 0; j < 3; j++) { // for loop starts here.

            System.out.print(j); // OUTPUT:- 0 1 2

        } // for loop ends here.

        System.out.println(j); // OUTPUT:- 3

        // Lets do a Dry run of this.

        // Inside the loop when value of j = 0, checking Condition (j < 3) -> (0 < 3) which is true, then the code inside the loop will run.

        // OUTPUT:- 0

        // Then increment the value of j by 1, so new value of j becomes 1.

        // Inside the loop when value of j = 1, checking Condition (j < 3) -> (1 < 3) which is true, then the code inside the loop will run.

        // OUTPUT:- 1

        // Then increment the value of j by 1, so new value of j becomes 2.

        // Inside the loop when value of j = 2, checking Condition (j < 3) -> (2 < 3) which is true, then the code inside the loop will run.

        // OUTPUT:- 2

        // Then increment the value of j by 1, so new value of j becomes 3.

        // Inside the loop when value of j = 3, checking Condition (j < 3) -> (3 < 3) which is false, then the code inside the loop will not run and terminate the loop.

        // When comes out of the loop it may print the value of j.

        // OUTPUT:- 3

        // Its how the for loop works.

        // ------------------------------------------------------------------------

        // Lets understand continue and break statement in for loop.

        // We use continue statement when we want to skip the current iteration of the loop.

        // Like i want to print the numbers from 1 to 10 but do not want to print the multiple of 3.

        // Then i can set a for loop from 1 to 10 and place an if condition on it to check if the number is divisible by 3 or not, and if it is divisible by 3 then i can skip that number and continue with the next number.

        for (int i = 1; i <= 10; i++) { // A for loop running on Variable i from 1 to 10.

            if (i % 3 == 0) { // Checking if the number is divisible by 3 or not.

                continue; // If it is divisible then i can skip that number and continue with the next number or skip this iteration.

                // Now no further loop will run and increment the value of i and move to next Iteration.

            } // if block ends here.

            System.out.println(i); // printing the value of i.

        } // for loop ends here.

        // ------------------------------------------------------------------------

        // Lets Understand this with a Dry run.

        // Inside the Loop when value of i is 1 and checking Condition (i <= 10) -> (1 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (1 % 3 == 0) -> (3 == 0) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 1

        // Then increment the value of i by 1, so new value of i becomes 2.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 2 and checking Condition (i <= 10) -> (2 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (2 % 3 == 0) -> (3 == 0) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 2

        // Then increment the value of i by 1, so new value of i becomes 3.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 3 and checking Condition (i <= 10) -> (3 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (3 % 3 == 0) -> (0 == 0) -> true.

        // Hence the if block condition is True so it will run and not go to next line of the loop and due to continue keyword it skips the iteration of the loop.

        // Then increment the value of i by 1, so new value of i becomes 4.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 4 and checking Condition (i <= 10) -> (4 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (4 % 3 == 0) -> (1 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 4

        // Then increment the value of i by 1, so new value of i becomes 5.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 5 and checking Condition (i <= 10) -> (5 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (5 % 3 == 0) -> (2 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 5

        // Then increment the value of i by 1, so new value of i becomes 6.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 6 and checking Condition (i <= 10) -> (6 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (6 % 3 == 0) -> (0 == 0) -> true.

        // Hence the if block condition is True so it will run and not go to next line of the loop and due to continue keyword it skips the iteration of the loop.

        // Then increment the value of i by 1, so new value of i becomes 7.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 7 and checking Condition (i <= 10) -> (7 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (7 % 3 == 0) -> (1 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 7

        // Then increment the value of i by 1, so new value of i becomes 8.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 8 and checking Condition (i <= 10) -> (8 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (8 % 3 == 0) -> (2 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 8

        // Then increment the value of i by 1, so new value of i becomes 9.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 9 and checking Condition (i <= 10) -> (9 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (9 % 3 == 0) -> (0 == 0) -> true.

        // Hence the if block condition is True so it will run and not go to next line of the loop and due to continue keyword it skips the iteration of the loop.

        // Then increment the value of i by 1, so new value of i becomes 10.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 10 and checking Condition (i <= 10) -> (10 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (10 % 3 == 0) -> (1 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.
        
        // OUTPUT:- 10

        // Then increment the value of i by 1, so new value of i becomes 11.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 11 and checking Condition (i <= 10) -> (11 <= 10) which becomes false, then the code inside the loop will not run and the loop terminates.

        // ------------------------------------------------------------------------

        // BREAK in for loop.

        // break keyword is used to terminate the whole loop at once.

        // Like a for loop running from 1 to 10 should stop when it gets to 5.

        for (int i = 1; i <= 10; i++) { // i = 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10

            if (i == 5) { // Checking if the value of i is 5 or not.

                break; // if the value of i is 5 then if block runs and break the whole loop.

            } // if block ends here.

            System.out.println(i); // prints the value of i.

        } // for loop ends here.

        // Lets Do a Dry Run.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 1 and checking Condition (i <= 10) -> (1 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (1 == 5) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 1

        // Then increment the value of i by 1, so new value of i becomes 2.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 2 and checking Condition (i <= 10) -> (2 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (2 == 5) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 2

        // Then increment the value of i by 1, so new value of i becomes 3.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 3 and checking Condition (i <= 10) -> (3 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (3 == 5) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 3

        // Then increment the value of i by 1, so new value of i becomes 4.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 4 and checking Condition (i <= 10) -> (4 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (4 == 5) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 4

        // Then increment the value of i by 1, so new value of i becomes 5.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 5 and checking Condition (i <= 10) -> (5 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (5 == 5) -> true.

        // Hence the if block condition is True so it will run and inside the if block there is a break keyword which breaks the whole loop.

        // Hence loop terminates and no further Iteration will run.

        // ------------------------------------------------------------------------

        // Lets understand the while loop.

        // We use while loop when we have an Indefinite amount or number of times, the loop runs.

        // Let us understand the Syntax:-

        /*

            while(<condition>){
                <code>
            }

         */

        /*
            Explanation of the `while` loop:
            
            What is a `while` loop?
            - A `while` loop is a control flow statement in Java that allows code to be
            executed repeatedly based on a given condition.

            - It checks the condition before each iteration of the loop, and if the
            condition is true, it executes the code block inside the loop.

            - The loop will continue until the condition becomes false.
            
            Syntax of a `while` loop:
            while (condition) {
                // code block to be executed repeatedly
            }
            
            - `condition`: This is a boolean expression (true or false) that controls how
            long the loop will run.

            - The loop will execute the code inside its block as long as the condition is
            true.

            - Once the condition becomes false, the loop stops.
            
            Why use a `while` loop?
            - When we don’t know in advance how many times a piece of code needs to run,
            we can use a `while` loop.

            - For example, if you want to repeat a task until a certain condition is met
            (like counting until a certain number or waiting for a user input), a `while`
            loop is perfect for that.
            
            When to use a `while` loop over a `for` loop?
            - Use `while` loops when you don’t know the number of iterations beforehand,
            or when the stopping condition depends on user input or other unpredictable
            factors.

            - A `for` loop is typically used when you know exactly how many iterations
            you need (like looping through an array or a fixed range of numbers).
            
            Important points:
            - Be careful with the condition; if the condition never becomes false, the
            loop will run forever. This is called an "infinite loop."

            - The condition must change within the loop (typically by updating
            variables), or the loop will never terminate.
         */

        // --------------------------------------------------------------------------

        /*
            1. **Initialization**: Before the loop starts, you typically initialize
            variables that control the loop (like counters or user input).

            2. **Condition**: The loop checks the condition at the beginning of each
            iteration. If the condition is true, the loop body runs.

            3. **Update/Change**: Inside the loop, you should change something (like
            incrementing a counter or receiving input) to make sure the condition
            eventually becomes false. If you forget this, you might end up with an
            infinite loop!

            4. **Infinite Loops**: An infinite loop runs forever because the condition
            never becomes false. Always ensure your loop has a way to stop.

            5. **Use Cases**:
            - Use a `while` loop when you don't know how many iterations you need
            beforehand.

            - It's useful for waiting for user input, repeating tasks based on
            conditions, and any situation where the stopping condition isn't fixed.
         */

        // --------------------------------------------------------------------------

        /*
            Example: Counting down from a user-defined number to 1.

            In this example, we use a `while` loop to count down from a number that the
            user gives us.
            The loop will continue until it reaches 1, and then it will stop.
         */

        int n = 10; // Let's assume the user inputs the number 10.

        System.out.println("Counting down from " + n + ":"); // Inform the user of the countdown start.

        while (n > 0) { // Condition: Run the loop as long as n is greater than 0.

            System.out.println(n); // Print the current value of n.

            n--; // Decrease n by 1 with each iteration (this is important to eventually stop the loop).
        }

        System.out.println("Done!"); // After the loop ends, print "Done!"

        /*
            Dry Run:
            - Initially, n = 10. Since n > 0, it prints 10 and then decreases n to 9.

            - The condition (n > 0) is checked again, and since 9 > 0, it prints 9 and
            decreases n to 8.

            - This process continues until n becomes 0.
            
            - At n = 0, the condition (0 > 0) is false, so the loop stops, and "Done!" is
            printed.
         */

        // --------------------------------------------------------------------------

        /*
            Explanation of the `do-while` loop:
            
            What is a `do-while` loop?
            - A `do-while` loop is similar to a `while` loop, but there is one key
            difference: the condition is checked after the loop body is executed, not
            before.

            - This means that the code inside the loop will run at least once, even if
            the condition is false from the start.
            
            Syntax of a `do-while` loop:
            do {
                // code block to be executed
            } while (condition);
            
            - The `do` keyword starts the loop, and the code inside the curly braces is
            executed.

            - After the code runs once, the `condition` is checked. If it's true, the
            loop repeats. If it's false, the loop stops.
            
            Why use a `do-while` loop?
            - A `do-while` loop is useful when you need to guarantee that the loop body
            is executed at least once, regardless of whether the condition is true or
            false at the start.
         */

        // --------------------------------------------------------------------------

        /*
            1. **Guaranteed Execution**: The code inside the loop will always run at
            least once, no matter what the initial condition is.

            2. **Post-Condition Check**: The condition is checked after the loop body is
            executed. This is different from a `while` loop where the condition is
            checked before.

            3. **Use Cases**:
            - A `do-while` loop is ideal for situations where you need the loop to
            execute at least once, such as asking for user input or providing a menu
            selection.
         */

        // --------------------------------------------------------------------------

        /*
            Example: Input validation using a `do-while` loop.

            In this example, we ask the user to enter a positive number.
            The loop will keep asking for input until the user enters a positive number.
         */

        int number;

        Scanner scanner = new Scanner(System.in); // Create a scanner object for user input

        do {
            System.out.println("Please enter a positive number:"); // Prompt the user for input

            number = scanner.nextInt(); // Read the user's input

        } while (number <= 0); // Condition: The loop will repeat if the number is 0 or negative

        System.out.println("You entered: " + number); // After a valid number is entered, print it

        /*
            Dry Run:
            - The loop asks the user for input. If the user enters a negative number or
            zero, the loop repeats.
            - Once the user enters a positive number, the condition becomes false, and
            the loop stops.
         */

        // --------------------------------------------------------------------------

    }
        
    static void Functions() {
        
        // FUNCTIONS:- THE REUSABLE BLOCK OF CODE

        // By its name, u can understand in Short about Functions, actually functions are the part of code which have a specific task to perform by taking some input and providing some output.

        // Function is a block of Code which takes Some input, process it and Provide us the Desired Output.

        // Mainly we Use functions dur to 3 reasons:-

        // It creates our code reusable and hence by writing the code once, we can use it many times and also improve our code readability.

        // We can call functions with different parameters and perform different tasks on them.

        // It makes our code more modular and easier to maintain.

        // Syntax of a Function is Divided into Two parts:- Its Prototype and Its Calling.

        // Prototype:- <return type> <function name> (<parameters>) { <code> }

        // Calling:- <function name> (<parameters>)

        // Lets pick up the nasty code, like find whether the number is Even or odd.

        int num1 = 10;

        if(num1 % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // I have one more number to be checked then i would write the code again.

        int num2 = 7;

        if(num2 % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // Now i want to do this with 10 more numbers, should i now copy this code again and again to check whether the number is even or odd which makes our code very lengthy and unreadable.

        // Here we can fix the Problem by Wrapping this Code inside the Functions.

        // The function is the Separate thing like main function , so it should be written inside the class but not inside other functions.

        // If you use the Static Keyword in the Function Prototype which makes it a Static fnc and then the function do not need any object for Calling it.

        // We will Study OOPs in future and there we will study non-static fncs but here we are going to understand Static Functions so its compulsory to Write static in Function Prototype.

        // We cannot use keywords in place of Function name, it could be anything but not the Keywords.

        // There are mainly Two Types of Functions in Java:-

        // PURE AND IMPURE FNCS

        // Pure Function:- A pure function is a function that returns a value, to the caller, it uses the return keyword for returning the value from function and it is compulsory to be used.

        // Pure fncs are those which have a desired return type other then void.

        // Impure Function:- An impure function is a function that does not return a value, to the caller, it may use or may not use the return keyword for returning the value from function and it is not compulsory to be used.

        // Impure fncs are all those Functions which have their return type as void.


    }

    static void OddOrEven(int var) { // This is the Prototype of the Function 'OddOrEven' taking int 'var' as parameter and returning void which means it is a impure function.

        if(var % 2 == 0) { // Here we are checking whether the number is even or odd.
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }// function 'OddOrEven' ends here.

    // Now we do not Require to Write that codes repeatedly again and again.

    // Now we create a Function 'OddOrEven' which takes int 'var' as parameter and returning void which means it is a impure function so Now lets call it.

    static int AddTwo(int val){ // This is the Prototype of the Function 'AddTwo' taking int 'val' as parameter and returning Integr Value which means it is a pure function.

        return val + 2; // adds 2 in the Original Value of 'val' and return it to the caller.

    }// Function 'AddTwo' ends here.

    static void Function1(){ // We can Call Any Function Inside another function, hence a Temporary Function is created. Do not Focus on this Function.

        OddOrEven(10); // Calling the Function 'OddOrEven' with 10 as parameter.

        // Here when we call the Function we have passed 10 as the value for var.

        // Now Inside the function,

        // var = 10

        // Then if else block will Check whether the number is even or odd and print the result.

        // OUTPUT:- Even

        // Lets try with more numbers.

        OddOrEven(4); // OUTPUT:- Even

        OddOrEven(7); // OUTPUT:- Odd

        OddOrEven(8); // OUTPUT:- Even

        OddOrEven(9); // OUTPUT:- Odd

        // Here You saw that by just wrapping our Even Odd Checker Code inside the Function, we are able to Find it many times without any Further Problem and we also Do not Have to Write more Codes, which make the Code Readable and maintainable.

        int x1 = AddTwo(10); // Calling the Pure function 'AddTwo()' with a Argument 10.

        // Argument is the Value which Goes in the Parameter inside the Function like here 10 is the argument which get Stored in var 'val' inside the Function.

        // Inside the Fnc, it returns (val + 2) -> which means (10 + 2) -> 12
        
        // So, to Store the Returned Value by the Function, we Created a Variable x1 of Same Return Type(Integer).

        // So Now the value of x1 becomes 12.

        int y1 = AddTwo(13);

        // In the Same way, y1 becomes 15.

        // You can say this variables are the callers of the Functions.

        // Lets check their Value.

        System.out.println(x1); // OUTPUT:- 12

        System.out.println(y1); // OUTPUT:- 15
    }


    // --------------------------------------------------------------------------

}
