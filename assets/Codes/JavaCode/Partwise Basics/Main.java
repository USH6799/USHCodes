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
        //
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


        Basic(); // Ignore this.
        EscapeSequences(); // Ignore this.
        Variables(); // Ignore this.
        Datatypes(); // Ignore this.
        Operators(); // Ignore this.
        JAVA_BODMAS(); // Ignore this.
        ScannerInput(); // Ignore this.
        Conditionals(); // Ignore this.
        Looping(); // Ignore this.
        Functions(); // Ignore this.
        MathClass(); // Ignore this.
        TypeConversion(); // Ignore this.
        Complexity(); // Ignore this.
        Arrays(); // Ignore this.
        Array_2D(); // Ignore this.
        StringManipulation(); // Ignore this.
        buildString(); // Ignore this.
        Operators_Overview(); // Ignore this.
        BinaryFusion(); // Ignore this.

        

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
         
         
         // -------------------------------------------------------------------
         // SOME PRACTICE QUESTIONS
         // -------------------------------------------------------------------
 
         // Question 1.
 
         
         /* What will be the Output.
 
             System.out.println("a");
             System.out.print("b");
             System.out.print("c");
             System.out.println("d");
 
         */
 
         // You will get the answer of This code in next chapter[Ch.1.2] but try to do it first.

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

        // Try to check all options and their outputs, you may get the Solution and Its Explanations in next Chapter[Ch.2.2]

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

        int ans = 10; // A Variable 'ans' of datatype int(Integer), Storing Result.

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

        // You will get the Solutions and Explanations of These Codes in the Next Chapter[ch.4.2]

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


        // -----------------------------------------------------------------------------
        // SOME PRACTICE QUESTIONS
        // -----------------------------------------------------------------------------

        /*

            // Question 1.

                int a = 7;
                int b = 3;
                int result = ++a - --b + a++ * b-- - --a;
                System.out.println(result);
            

        */

        /*

            // Question 2.

                int x = 15;
                int y = 4;
                int result = x-- / ++y * --x + y++;
                System.out.println(result);


        */

        /*

            // Question 3.

                int p = 8;
                int q = 5;
                int result = --p % q++ + p-- * ++q - q--;
                System.out.println(result);


        */

        // Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.5.2].

    }

    static void JAVA_BODMAS(){

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

        // Difference between next(); and nextLine(); functions.

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


        // -----------------------------------------------------------------------------
        // SOME PRACTICE QUESTIONS
        // -----------------------------------------------------------------------------

        /*

            // Question 1.

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                if (num > 0) {
                    System.out.println("Positive");
                    System.out.print("Enter another number: ");
                    int anotherNum = sc.nextInt();
                    System.out.println("Sum: " + (num + anotherNum));
                } else {
                    System.out.println("Negative or Zero");
                } 

        */

        /*

            // Question 2.

            // What will happen if the user inputs 'Hello World' for the character input in the following code?

                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter a Character Value: ");
                char ch = sc.next().charAt(0);
                
                System.out.println("Character: " + ch);
            
        }


        */

        /*

            // Question 3.

            Write a program that reads a single line of input containing an integer, a double, and a string, separated by spaces. After reading the input, output the integer multiplied by 2, the double divided by 2, and the string input Concatenated with double value and then Integer value.

            // Ex:- input: 45 92.4 tame2 

            // output: 90 46.2 tame246.290

        */

        // Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.6.2].

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


        // I would like to tell more thing regarding if , if else, else statements, that there is no need of Writing {} parenthesis in if , if else, else statements if We are writing only one line of Statement inside them.

        // Like,

        if(true) // if condition is true, then this code will be executed.
        System.out.println("hello"); // OUTPUT:- hello

        // this will run because there is only one statement after if.
        
    

        // -----------------------------------------------------------------------------
        // SOME PRACTICE QUESTIONS
        // -----------------------------------------------------------------------------

        /*

            // Question 1.

            int a = 5, b = 10, c = 15;  

            if (a < b && b < c)  
                System.out.print("A");  
            else if (a > b || b > c)  
                System.out.print("B");  
            else  
                System.out.print("C");  

        */

        /*

            // Question 2.

            int x = 20;  
            if (x < 10)  
                System.out.print("Low");  
            else if (x < 30)  
                System.out.print("Medium");  
            else  
                System.out.print("High");

            x += 15;  

            if (x > 30)  
                System.out.print(" and High");  

        */

        /*

            // Question 3.

            int n = 0;  
            if (n == 0)  
                System.out.print("Zero");  
            if (n < 5)  
                System.out.print(" Less than five");  
            else  
                System.out.print(" Greater than or equal to five");  

        */

        // Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.7.2].

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
       Function1();


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

        // We will Study OOPs in future and there we will study non-static functions but here we are going to understand Static Functions so its compulsory to Write static in Function Prototype.

        // We cannot use keywords in place of Function name, it could be anything but not the Keywords.

        // There are mainly Two Types of Functions in Java:-

        // PURE AND IMPURE FUNCTIONS

        // Pure Function:- A pure function is a function that returns a value, to the caller, it uses the return keyword for returning the value from function and it is compulsory to be used.

        // Pure functions are those which have a desired return type other then void.

        // Impure Function:- An impure function is a function that does not return a value, to the caller, it may use or may not use the return keyword for returning the value from function and it is not compulsory to be used.

        // Impure functions are all those Functions which have their return type as void.

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

    static int AddTwo(int val){ // This is the Prototype of the Function 'AddTwo' taking int 'val' as parameter and returning Integer Value which means it is a pure function.

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


        // ---------------------------------------------------------------------------------------------------
        // TRY SOME PRACTICE questions.
        // ---------------------------------------------------------------------------------------------------

        // create a function to do the following questions.

        // --------------------------------------------------------------------------
            // Question 1: Enter 3 numbers from the user and print their average.
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------
            // Question 2: Print the sum of all odd numbers from 1 to n.
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------
            // Question 3: Take two numbers and find the greatest among them.
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------
            // Question 4: Check if a person is eligible to vote based on their age.
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------
            // Question 5: Calculate the area and circumference of a circle given its radius.
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------
            // Question 6: Ask the user to enter numbers until they stop, and count how many positive, negative, and zero numbers were entered.
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------
            // Question 7: Calculate the result of x^n (x raised to the power of n).
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------
            // Question 8: Find the greatest common divisor (GCD) of two numbers.
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------
            // Question 9: Print the Fibonacci series till n.
            // --------------------------------------------------------------------------
        // --------------------------------------------------------------------------


        // You will get these Functions Programs Solution and explanations in Next Chapter[Ch.10.3]

    }

    // Lets create a Function to Input the Name of the User and greet him.

    static void Greeting(String name){ // A function 'Greeting' take 1 parameter 'name' and returning void which means it is an Impure function.

        System.out.println("Hello " + name); // Printing hello and the value of var 'name';

    }// function 'Greeting' ends here.

    // Lets create One more Function In which it takes the name and its gender and Greet Accordingly.

    static void Greeting(String name , char gender){ // A function 'Greeting' take 2 parameters 'name' and 'gender' and returning void which means it is an Impure function.

    // This is also called an Overloaded Function.

    // Overloaded Functions are the Functions which have same name but have Different Return type and Different type of Parameters, or Different no. of Parameters.

    // Overloading means Creating the same function with different Parameters. 

        if(gender == 'M' || gender == 'm'){ // Checking whether the value of 'gender' is equal to 'M' or 'm', if it is equal to any one then the Condition becomes true and hence if block will run.

            System.out.println("Hello " + name + " Sir"); // Greets the Person according to its gender.
        
        }// if block ends here.

        else if(gender == 'F' || gender == 'f'){ // Checking Whether 'gender' is equal to 'F' or 'f', if it is equal to any one then the Condition becomes true and hence if block will run.

            System.out.println("Hello " + name + " Ma'am"); // Greets the Person according to its gender.

        }// else if block ends here.

        else{ // If none of the above Conditions are true, then this block will run.

            System.out.println("Wrong Gender, Please Enter M for male and F for female."); // Prints this message.

        } // else block ends here.

    }// Function 'Greeting' ends here.

    // Lets try to Call them Both,

    static void Function2(){ // We can Call Any Function Inside another function, hence a Temporary Function is created. Do not Focus on this Function.

        Greeting("Himanshu"); // Calling the Function 'Greeting' with 1 parameter 'Himanshu'.

        // This is the First function, because there is only one parameter during calling.

        // Inside Greeting(name) fnc,

        // Value of name = Himanshu

        // OUTPUT:- Hello Himanshu

        // Lets call the 2nd Function,

        Greeting("Himanshu" , 'M'); // Calling the Function 'Greeting' with 2 parameters 'Himanshu' and 'M'.

        // This time, the second Overloaded Function will execute because this time there are 2 parameters during calling.

        // Inside Greeting(name , gender) fnc,

        // Value of name = Himanshu

        // Checking if Condition, condition:- (gender == 'M' || gender == 'm')

        // According to Calling, value of gender is 'M'.
        
        // (gender == 'M' || gender == 'm') -> (true || false) because gender is equal to 'M' but it is not equal to 'm'.

        // There is an ||(or) between the 2 conditions and or says that it will return true if any one of the condition is true and will return false if both the conditions are false.

        // (true || false) -> returns true, hence the Condition is True so if block will run, and display the OUTPUT.

        // OUTPUT:- Hello Himanshu Sir


    }// Function 'Function2' ends here.


    static void MathClass() {

        // --------------------------------------------------------------------------
        // MATH's CLASS    
        // --------------------------------------------------------------------------

        // Math class is one of the most useful class library in present time, it contains many Mathematical function which helps us to perform various mathematical question easily, like finding absolute value(abs), finding Square Root(sqrt), finding cube root(cbrt) , finding random between 0 and 1(random), and many more.

        //---------------------------------------------------------------------------

        // It is already imported in every Program of Java so u can directly use its function just like Scanner class Functions.

        // It is Another class, so we  will use a Syntax:- for Calling them

        // syntax:- <classname> . <methodname>;

        // Lets Start with our First mathematical Function.

        // --------------------------------------------------------------------------
        // Math.abs(a); (To find the Absolute Value of 'a').
        // --------------------------------------------------------------------------

        // Its return type is same as the Parameter type.

        System.out.println(Math.abs(-10)); // OUTPUT:- 10 (integer)
        
        System.out.println(Math.abs(-1.8)); // OUTPUT:- 1.8 (double)

        System.out.println(Math.abs(-19.878f)); // OUTPUT:- 19.878 (float)

        System.out.println(Math.abs(-13848l)); // OUTPUT:- 13848 (long)

        // -------------------------------------------------------------------------
        // Math.sqrt(a); (to find the Square root of 'a')
        // -------------------------------------------------------------------------

        // Its return type is Always Double for all type of parameters.

        System.out.println(Math.sqrt(64)); // OUTPUT:- 8.0 (double)

        System.out.println(Math.sqrt(9.0)); // OUTPUT:- 3.0 (double)

        // -------------------------------------------------------------------------
        // Math.cbrt(a); (to find the cube root of 'a')
        // -------------------------------------------------------------------------

        // Its return type is Always Double for all type of parameters.

        System.out.println(Math.cbrt(64)); // OUTPUT:- 4.0 (double)

        System.out.println(Math.cbrt(27.0)); // OUTPUT:- 3.0 (double)

        // -------------------------------------------------------------------------
        // Math.floor(a); (to find the floor value of 'a' | the Nearest Lower Whole Number)
        // -------------------------------------------------------------------------

        // Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.

        // Its return type is always Double for all types of Parameters.

        System.out.println(Math.floor(9.7)); // OUTPUT:- 9.0 (double)

        System.out.println(Math.floor(3)); // OUTPUT:- 3.0 (double)

        System.out.println(Math.floor(-8.2f)); // OUTPUT:- -9.0 (double)

        // -------------------------------------------------------------------------
        // Math.ceil(a); (to find the ceil value of 'a' | the Nearest Upper Whole Number)
        // -------------------------------------------------------------------------

        // Returns the largest (closest to positive infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.

        // Its return type is always Double for all types of Parameters.

        System.out.println(Math.ceil(9.7)); // OUTPUT:- 10.0 (double)

        System.out.println(Math.ceil(3)); // OUTPUT:- 3.0 (double)

        System.out.println(Math.ceil(-8.2f)); // OUTPUT:- -8.0 (double)

        // -------------------------------------------------------------------------
        // Math.clamp(val , min , max); (to Clamp a Particular 'val' between the 'min' and 'max' range)
        // -------------------------------------------------------------------------

        // Its return type is same as the Parameter type.

        System.out.println(Math.clamp(45.6 , 20 , 40.0)); // OUTPUT:- 40.0 (double)
        
        System.out.println(Math.clamp(16 , 20 , 40)); // OUTPUT:- 20 (Integer)

        System.out.println(Math.clamp(27.6 , 20 , 40)); // OUTPUT:- 27.6 (double)


        // -------------------------------------------------------------------------
        // Math.min(a , b); (find the minimum Value between a and b)
        // -------------------------------------------------------------------------

        // Its return type is same as the Parameter type.

        System.out.println(Math.min(14.5 , 17)); // OUTPUT:- 14.5 (double)

        System.out.println(Math.min(-10, 4)); // OUTPUT:- -10 (Integer)

        // -------------------------------------------------------------------------
        // Math.max(a , b); (find the maximum Value between a and b)
        // -------------------------------------------------------------------------

        // Its return type is same as the Parameter type.

        System.out.println(Math.max(14.5 , 17)); // OUTPUT:- 17.0 (double)

        System.out.println(Math.max(-10, 4)); // OUTPUT:- 4 (Integer)


        // -------------------------------------------------------------------------
        // Math.random(); (Generate and return a random double value between 0 and 1.)
        // -------------------------------------------------------------------------

        System.out.println(Math.random()); // OUTPUT:- different each time (double)

        // -------------------------------------------------------------------------
        // Math.round(a); (round of 'a' to nearest Integer or Long value.)
        // -------------------------------------------------------------------------

        // Its return type is same for Integer parameter, and long for rest types of Parameter.

        System.out.println(Math.round(56.83764738)); // OUTPUT:- 57 (Long)
 
        System.out.println(Math.round(89)); // OUTPUT:- 89 (Integer)

        System.out.println(Math.round(-8.9)); // OUTPUT:- -9 (Long)

        // -------------------------------------------------------------------------
        // Math.pow(base , power); (returns 'base' raised to the power of 'power' | base^power)
        // -------------------------------------------------------------------------

        // Its return type is Always double for All types of Parameters.

        System.out.println(Math.pow(2, 4)); // OUTPUT:- 16.0 (double)

        System.out.println(Math.pow(3.0, 4)); // OUTPUT:- 81.0 (double)

        // -------------------------------------------------------------------------
        // Math.PI; (return the value of Pi)
        // -------------------------------------------------------------------------

        // The double value that is closer than any other to pi (π), the ratio of the circumference of a circle to its diameter.

        // Its return type is Double

        System.out.println(Math.PI); // OUTPUT:- 3.141592653589793


        // -----------------------------------------------------------------------------
        // SOME PRACTICE QUESTIONS
        // -----------------------------------------------------------------------------

        /*

            // Question 1.

            int x = -15, y = 8;
            System.out.println(Math.abs(x) + Math.abs(y) - Math.abs(x - y));


        */

        /*

            // Question 2.

            double a = 3.0, b = 4.0, c = 5.0;
            System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)));


        */

        /*

            // Question 3.

            double randomValue = Math.random() * 100 - 50; 
            System.out.println(Math.ceil(randomValue));


        */

        // Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.11.2].

    }


    static void TypeConversion(){

        // Type Conversion in java means converting one datatype to another datatype.

        // There are Two types of Type Conversion In java:-

        // -------------------------------------------------------------------------
        // Implicit Type Conversion or Coercion.
        // -------------------------------------------------------------------------

        // In this type of Conversion, the Smaller Datatype Value automatically converts into bigger datatype value to match its surrounding type.

        // this is Automatically Done, hence it is done by computer itself.

        // Like 

        int a = 10; // A Variable 'a' of datatype Integer Storing value 10.

        int b = 5; // A Variable 'b' of datatype Integer Storing value 5.

        double c = 10.0; // A Variable 'c' of datatype double Storing value 10.0

        System.out.println(a + b + c);

        // In this println Statement, Addition(+) goes from left to right and hence,

        // Step 1: a + b, both are of Integer datatype means same datatype so no changes are performed and added.

        // Step 2: (a+b) + c, now the sum of a + b is of Integer datatype but c is of Double datatype.

        // Now Memorize the memory size of Each datatype.

        // Integer has 4 bytes.

        // Double has 8 bytes.

        // So Double > Integer , means double datatype is bigger than Integer datatype.

        // Hence, in Step 3: (a+b) + c -> int + double -> will give double.

        // this is due to Implicit Type Conversion.

        // OUTPUT:- 25.0 (double)

        // Lets take another Example.

        char ch = 'A'; // A character Variable storing 'A'.

        int num = 10; // A Integer Variable Storing 'num'.

        System.out.println(ch + num); 

        // now in this print statement, as we saw (ch + num) -> (char + int)

        // So according to Memory Size, char has 2 bytes and int has 4 bytes so, int > char

        // So Computer does Implicit Type Conversion to convert char into Integer.

        // Now the Question arises how does, character can be converted into integer.

        // this is Due ASCII value of Each character, like

        // 'A' -> 65 as its ASCII value.

        // A - Z -> 65 - 90

        // a - z -> 97 - 122

        // Just remember it, that the codes for alphabets are this.

        // back to Question, ch + num -> 'A' + 10 , so value of 'A' -> 65 so 65 + 10 -> 75

        // OUTPUT:- 75

        // -------------------------------------------------------------------------
        // Explicit Type Conversion or Type Casting.
        // -------------------------------------------------------------------------

        // Explicit Type Conversion or Type Casting is the process of converting from bigger datatype to smaller datatype.

        // this is done by programmer.

        // Because we are reducing the memory size, and converting it into smaller datatype.

        // Syntax:- <target datatype> <variable name>;

        // Like i have a variable 'a' of datatype double Storing 77.0

        double x = 77.0;

        // Now lets convert it into Integer datatype,
        
        int y = (int) x;

        // Hence now when we describe the target datatype as integer , it converts 'x' into integer datatype, and we need any Integer variable to store it.

        // so we created a new variable 'y' and stored the value of 'x' into it.

        System.out.println(y); // OUTPUT:- 77

        // Lets convert this Double value into character.

        char z = (char) x;
        // Hence now when we describe the target datatype as char , it converts 'x' into char datatype, and we need any char variable to store it.

        // so we created a new variable 'z' and stored the value of 'x' into it.

        System.out.println(z); // OUTPUT:- 'M'

        // Because the ASCII value of 'M' is 77

        // This type of Conversion is only possible when the value in bigger datatype can be stored or converted into smaller datatype.

        // Like lets take a double variable and convert it into integer.

        double d = 108.9;

        int i = (int) d; 

        System.out.println(i); // OUTPUT:- 108

        // Here as you saw it ignores the Decimal values and taken The Integral Part of It.

        // Lets try to convert it into Character datatype.

        char dt = (char) d;
        // Converting double d into character datatype, and storing it in variable 'dt' of character datatype.

        System.out.println(dt); // OUTPUT:- l

        // Because ASCII value of 'l' is 108.


        // ------------------------------------------------------------

        double d1 = 10.3;

        System.out.println("Hello" + 12 + d1);

        // Lets Figure Out the Output of this Println() fnc,

        // Remember always, that String datatype or All non-primitive Datatypes have bigger size than Primitive Datatypes.

        // So, print("Hello" + 12 + d1);

        // Remember (+) addition in java goes from left to right.

        // it will be print(String + int + double)

        // so Firstly War between String and Int, and String wins, so int will be Converted into String through Implicit Type Conversion.

        // "Hello" + "12"

        // Now same datatype will Concatenate.

        // Result: "Hello12"

        // Secondly, print("Hello12" + d1) -> (String + double)

        // War Between String and Double Datatype, will result in String Winning.

        // So, Double datatype will be converted into String through implicit type Conversion.
        
        // "Hello12" + d1 -> "Hello12" + "10.3" -> "Hello1210.3"

        // So final Result will be of String datatype.

        // OUTPUT:- Hello1210.3

        // But What if i want to add the numbers first and then do further things.

        System.out.println("Hello" + (12 + d1));

        // In this print statement, numbers are covered by () brackets, so they will be Execute first According to Java Associativity and Precedence.

        // (12 + d1) -> (int + double)

        // So Integer Value will be converted into Double value through implicit Type Conversion.

        // (12 + d1) -> (12.0 + 10.3) -> (22.3)

        // In print() statement, now ("Hello" + 22.3) is left.

        // ("Hello" + 22.3) -> (String + double)

        // So We have to convert double datatype into String Datatype.

        // ("Hello" + 22.3) -> ("Hello" + "22.3") -> "Hello22.3"

        // OUTPUT:- Hello22.3

        // ------------------------------------------------------------

        // Some Practice Questions like, find the Output of:-

        /* Question 1.

            System.out.println('a' + 10 + "Hello" + ('e' + 1.0));

         */

        /* Question 2.

            int v1 = 10;

            int v2 = 11;

            double p1 = v1 + v2 + 'V';

            int c1 = (int)p1;

            System.out.println((char)c1);

        */

        /* Question 3.

            int a1 = 10;

            int b1 = 101;

            double c1 = 5;

            System.out.println(a1 + (int)(b1 + c1) + 0f);
         
        */

         // Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.12.2].


    }


    static void Complexity(){

            
        // --------------------------------------------------------------------------
        //  TIME AND SPACE COMPLEXITY
        // --------------------------------------------------------------------------

        // this time and space complexity means a way to calculate the time and space complexity of a program.

        // How much space will it take in memory and how much time will it take to execute.

        // Finding time and space Complexity can help us in various ways:-

        // Like help us to find the shortest and simplest way to write our code, so that it take less memory and run fast.

        // --------------------------------------------------------------------------

        // TIME COMPLEXITY means the relation between the input size and Running time(operations).

        // Time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input. 

        // Notations are the representation of the time complexity. 

        /*
            Types of notations:-

            -------------------------------------------------------------------------   

            1. O-notation: It is used to denote asymptotic upper bound. 
        
            For a given function g(n), we denote it by O(g(n)). Pronounced as “big-oh of g of n”. 
        
            It is also known as worst case time complexity as it denotes the upper bound in which the algorithm terminates.
        
            -------------------------------------------------------------------------   

            2. Ω-notation: It is used to denote asymptotic lower bound. 
        
            For a given function g(n), we denote it by Ω(g(n)). Pronounced as “big-omega of g of n”.

            It is also known as best case time complexity as it denotes the lower bound in which the algorithm terminates. 

            -------------------------------------------------------------------------
           
            3. 𝚯-notation: It is used to denote the average time of a program. 

        */

        // -------------------------------------------------------------------------

        // Lets Understand the Time Complexity with coding,

        Scanner sc = new Scanner(System.in); // Creating Scanner Object.

        int n = sc.nextInt(); // Taking input from user.

        for(int i = 1 ; i <= n ; i++){ // Looping from 1 to n.

            System.out.println("hello " + i); // Printing the statement.

        }// End of For Loop.

        // In this lets understand our time Complexity,

        // Input size: n

        // No. of Operations: also 'n' because, loops runs from 1 to 'n' or 'n' times.

        // This is Known as linear Relation, means the time complexity is linear.

        // If Input size increases by X then time Complexity also increases by X.

        // Hence time complexity is O(n).

        // -------------------------------------------------------------------------

        // Lets Suppose We have a list of Numbers and We have to Find a specific number in that,

        // numbers: {1 , 2 , 3 , 4 , 5}

        // lets find '1' in this.

        // There are three approaches to calculate time complexity of a program.

        // -------------------------------------------------------------------------

        // Best Case Approach:-

        // In best case approach, we find the minimum no. of operations to find '1' in the list.

        // So we can think that if the numbers are arranged in this order, the best case is that in 1 times.

        // So the time complexity is Ω(1).

        // Means For any Input Size like here 5 numbers, the no. of operations will remain same and equal to 1.

        // -------------------------------------------------------------------------

        // Average Case Approach:-

        // In this we will find the average no. of operations to find '1' in the list.

        // if list = {1 , 2 , 3 , 4 , 5} then no. of operations needed to find '1' will be 1.
        // if list = {2 , 1 , 3 , 4 , 5} then no. of operations needed to find '1' will be 2.
        // if list = {2 , 3 , 1 , 4 , 5} then no. of operations needed to find '1' will be 3.
        // if list = {2 , 3 , 4 , 1 , 5} then no. of operations needed to find '1' will be 4.
        // if list = {2 , 3 , 4 , 5 , 1} then no. of operations needed to find '1' will be 5.

        // Hence we can see that each time no. of operations are increasing till n.

        // So the average time complexity will be (total no. of operations / n).

        // total no. of operations = 1 + 2 + 3 + .... + n

        // So in maths we have a formula: (n * (n + 1)) / 2

        // Putting it in that will be (n * (n + 1)) / 2 = (n^2 + n) / 2 

        // Further Solving will result in (no. of operations = (n^2 + n) / 2).

        // (no. of operations / n) -> ((n^2 + n) / 2) / n) -> (n + 1) / 2
        
        // So the average time complexity will be (n + 1) / 2.
        
        // Average Time Complexity: 𝚯(n + 1 / 2)

        // -------------------------------------------------------------------------
        
        // Worst Case Approach:-

        // In this we have to find the maximum no. of operations to find '1' in the list.

        // We can see that the maximum no. of operations will be n.

        // if list = {2 , 3 , 4 , 5 , 1} then no. of operations needed to find '1' will be 5 or n (maximum).

        // So the time complexity is O(n).

        // We always try to find the Worst Case time complexity in most of the problems.

        // -------------------------------------------------------------------------

        // Another Example of Time Complexity:-

        int m = sc.nextInt();

        for(int i = 1 ; i <= m ; i++){ // Looping from 1 to m.

            for(int j = 1 ; j <= m ; j++){ // Looping from 1 to m.

                System.out.println("hello "); // Printing the statement.

            }

        }

        // Lets do a dry run,

        // for the value of m = 5,

        // When i = 1, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5. 

        // No. of operations = 5

        // When i = 2, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5.

        // No. of operations = 5 + 5

        // When i = 3, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5.

        // No. of operations = 5 + 5 + 5

        // When i = 4, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5.
        
        // No. of operations = 5 + 5 + 5 + 5

        // When i = 5, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5.

        // No. of operations = 5 + 5 + 5 + 5 + 5

        // Total no. of operations = 5 + 5 + 5 + 5 + 5 = 25 or m + m + m + m + m -> m * m

        // So for Outer loop running m times,

        // Each time inner loop will run m times.

        // So the Worst Case time complexity is O(m * m).

        // Lets take the Same Example,

        int x = sc.nextInt();

        int y = sc.nextInt();

        for (int i = 1 ; i <= x ; i++){ // Looping from 1 to x.

            for (int j = 1 ; j <= y ; j++){ // Looping from 1 to y.

                System.out.println("hello "); // Printing the statement.

            }

        }

        // Lets do a dry run,

        // for the value of x = 5 and y = 4,

        // When i = 1, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4

        // When i = 2, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4 + 4

        // When i = 3, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4 + 4 + 4

        // When i = 4, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4 + 4 + 4 + 4

        // When i = 5, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4 + 4 + 4 + 4 + 4

        // Total no. of operations = 4 + 4 + 4 + 4 + 4 = 20 or y + y + y + y + y -> 5 * y -> x * y

        // Worst Case time complexity is O(x * y).

        // -------------------------------------------------------------------------

        int p = sc.nextInt();

        int q = sc.nextInt();

        for(int i = 1 ; i <= p ; i++){ // Looping from 1 to p.

            System.out.println("hello "); // Printing the statement.

        }

        for(int j = 1 ; j <= q ; j++){ // Looping from 1 to q.

            System.out.println("hello "); // Printing the statement.

        }

        // Lets do a dry run,

        // for the value of p = 5 and q = 4,

        // For the First loop, i = 1, i = 2, i = 3, i = 4, i = 5.

        // No. of operations = 5

        // For the Second loop, j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4

        // Total no. of operations = 5 + 4 -> p + q

        // Worst Case time complexity is O(p + q).


        // Now imagine if value of n = 10^6 and m = 3, then 

        // The Worst Case time complexity is O(n).

        // Because n is very huge and bigger than m, so we can ignore m , and its no. of operations.

        // -------------------------------------------------------------------------

        // Lets compare three Different Worst Case Time Complexity.

        // 1. O(n)

        // 2. O(n * n) or O(n^2)

        // 3. O(n * n * n) or (On^3)

        // When n = 1,

        // No. of Operations for O(n) is 1.

        // No. of Operations for O(n * n) is 1.

        // No. of Operations for O(n * n * n) is 1.

        // When n = 2,

        // No. of Operations for O(n) is 2.

        // No. of Operations for O(n * n) is 4.

        // No. of Operations for O(n * n * n) is 8.

        // When n = 10^5,

        // No. of Operations for O(n) is 10^5.

        // No. of Operations for O(n * n) is 10^10.

        // No. of Operations for O(n * n * n) is 10^15.

        // In this we can observer than O(n) is very less than O(n^3),

        // So we can say the Best Case Time Complexity is O(n).

        // And the Worst Case Time Complexity is O(n^3).



        // -----------------------------------------------------------------
        // PRACTICE QUESTIONS
        // -----------------------------------------------------------------

        // Question 1.

        /*  Calculate the Best Case Time Complexity.

            int a = sc.nextInt(); // 'a' should be any positive integer.

            for(int i = 1 ; i <= a ; i++){

                if(i % 2 == 0){
                    continue;
                }
                
            }

        */


        // Question 2.

        /*  Calculate the Worst Case Time Complexity.

            int a = 25;

            for(int i = 1 ; i <= a ; i++){
            
                for(int j = 1 ; j <= a ; j++){

                    System.out.println("hello");

                }

            }

        */

        // Question 3.

        /*  Calculate the Worst Case Time Complexity.

            int a = 10;

            for(int i = 1 ; i <= 15 ; i++){
            
                for(int j = 1 ; j <= a ; j++){

                    if( i == a){
                        break;
                    }

                }

            }

            for(int i = 1 ; i <= a ; i++){
                System.out.println("Hi");
            }

        */

         // Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.13.2].


    }

    static void Arrays(){

        // Array is a Non-Primitive Datatype in Java.

        // Array is also as Reference type in Java because when we copy an array, it copies the memory address of the array.

        // Array means a Variable which can contain more than one value of same datatype.

        // Like i have some numbers (1 , 2 , 4), now i have to store it in memory,

        // So, i will create 3 variables,.

        int a = 1; // a is the name of the variable and 1 is the value of the variable.

        int b = 2; // A variable 'b' of datatype Integer Storing value 2.

        int c = 4; // A variable 'c' of datatype Integer Storing value 4.

        // but what if i have 100 numbers, then how can i store them in memory?

        // I am not going to create 100 variables.

        // There we use Arrays.

        // Example, we have to store some items like Subjects and their marks,

        int eng = 50; // A variable 'eng' of datatype Integer Storing value 50.

        int math = 60; // A variable 'math' of datatype Integer Storing value 60.

        int hindi = 70; // A variable 'hindi' of datatype Integer Storing value 70.

        // to Overcome this problem in java we are going to create a List of items of same datatype.

        // There are also 2 ways to Create an array just like variables.

        // -------------------------------------------------------------------------

        // 1. Only Declaration -> We use this way when we have to add items in the future but not in present.

        // Syntax of 1st:- <datatype>[] <arrayname> = new <datatype>[size]; this is compulsory.

        // Initialization Syntax(in future): <arrayname>[<index>] = <value>;    

        // Lets Store my marks, using both ways:-

        int[] marks = new int[3]; // We created an Empty array of type int with size 3.

        // We can't store any value in an array without giving it a size.

        // Lets set its value.

        marks[0] = 50; // We set value 50 in index 0.

        marks[1] = 60; // We set value 60 in index 1.

        marks[2] = 70; // We set value 70 in index 2.

        // Lets Know about Indexing which is important before knowing array,

        // You have noticed in your question paper, that each question is indexed starting from 1 or maybe a.

        // Like 1 then 2 then 3.

        // but In java, indexing begins from 0.

        // Like 1st question in your question paper is indexed as 1.

        // But in java 1st Item, is indexed as 0.

        // In real life:- 1 , 2 , 3 , 4 , 5 , 6 , 7 , ... , n.

        // In Java:-      0 , 1 , 2 , 3 , 4 , 5 , 6 , ... , n - 1.
        
        // now here marks = { 0 , 0 , 0 };

        // this is an empty array of type int with size 3.

        // Empty array is filled with null values, like 0.

        // After filling the values at each index, 

        // For marks[0] at index 0, we set value 50.

        // marks = { 50 , 0 , 0 };

        // For marks[1] at index 1, we set value 60.

        // marks = { 50 , 60 , 0 };

        // For marks[2] at index 2, we set value 70.

        // marks = { 50 , 60 , 70 };

        System.out.println(marks); // OUTPUT:- this will give the memory address of the array.
        // you cannot see array like this.


        System.out.println(marks[0]); // OUTPUT:- 50

        System.out.println(marks[1]); // OUTPUT:- 60

        System.out.println(marks[2]); // OUTPUT:- 70

        // this is the poor way to print the array.

        // Because for large arrays, it will take a lot of time to print them.

        // You need to set a loop,

        for(int i = 0 ; i < marks.length ; i++){ // A For loop runs from 0 to the length of the array.

            System.out.println("marks[" + i + "] = " + marks[i]); // We print the value of each index.

        }// for loop ends here.

        // Lets do a Dry Run of above code.

        // for i = 0,

        // OUTPUT:- marks[0] = 50

        // for i = 1, 

        // OUTPUT:- marks[1] = 60

        // for i = 2,

        // OUTPUT:- marks[2] = 70

        // Loop terminates.

        // For loop of Array:-

        for(int j : marks){ // A for Loop Running on Each item of Array and returning it in int j, for each item.

            // int j because marks is an array of Integer datatype.

            // Remember j do not store index, but it store the actual value.

            System.out.println(j); 

        }

        // Lets do A dry run,

        // for j = 50 or marks[0] = 50,

        // OUTPUT:- 50

        // for j = 60 or marks[1] = 60,

        // OUTPUT:- 60

        // for j = 70 or marks[2] = 70,

        // OUTPUT:- 70

        // --------------------------------------------------------------------------

        // Lets understand about the 2nd way of Creating Arrays,

        // 2. Declaration and Initialization -> We use this way when we have to add items in the present.

        // Syntax of 2nd:- <datatype>[] <arrayname> = { <value1> , <value2> , <value3> }; this is compulsory.

        int[] numbers = {10 , 56 , 3 , 5 , 6 , 23 , 543};

        // Here we created an array of type int with size 7.

        // And we have filled it with the values 10 , 56 , 3 , 5 , 6 , 23 , 543.

        // Now lets print it out.

        for (int i : numbers) { // For Loop Running on Each item of Array and returning it in int i, for each item.

            System.out.println(i); // We print the value of each index.

        }

        // Lets do A dry run,

        // for i = 10 or numbers[0] = 10,

        // OUTPUT:- 10

        // for i = 56 or numbers[1] = 56,

        // OUTPUT:- 56

        // for i = 3 or numbers[2] = 3,

        // OUTPUT:- 3

        // for i = 5 or numbers[3] = 5,

        // OUTPUT:- 5

        // for i = 6 or numbers[4] = 6,

        // OUTPUT:- 6

        // for i = 23 or numbers[5] = 23,

        // OUTPUT:- 23

        // for i = 543 or numbers[6] = 543,

        // OUTPUT:- 543

        // Loop terminates.


        // Lets Create a user Driven Array.

        Scanner sc = new Scanner(System.in); // To take input from user.
        

        System.out.println("Enter the size of array: "); // Enter the size of array.

        int size = sc.nextInt(); // A variable to store the size of array.

        int[] array = new int[size]; // A new array of type int with size 'size'.

        for(int i = 0 ; i < size ; i++){ // For Loop Running on Each index of Array.

            System.out.print("Enter the value at index " + i + ": "); // Enter the value at each index.

            array[i] = sc.nextInt(); // Taking Input from user and storing it in array at index i.

        }// for loop ends here.

        // Lets try to Print the Array,

        for(int j : array){ // For Loop Running on Each item of Array and returning it in int j, for each item.

            System.out.println(j); // We print the value of each index.

        }

        // Lets assume the size of array is 3.

        // Now, it creates an array of type int with size 3.

        // array = { 0 , 0 , 0 }

        // Empty Array created in memory so array is filled with null values ie. 0.

        // Looping on Each Index of Array,

        // for i = 0,

        // Taken input from user and stored it in array[0].

        // Lets think that user enters 5.

        // array[0] = 5

        // array = { 5 , 0 , 0 }

        // for i = 1,

        // Taken input from user and stored it in array[1].

        // Lets think that user enters 12.

        // array[0] = 12

        // array = { 5 , 12 , 0 }

        // for i = 2,

        // Taken input from user and stored it in array[2].

        // Lets think that user enters 15.

        // array[2] = 15

        // array = { 5 , 12 , 15 }

        // Moving Towards the next loop, for printing the value of Arrayay.

        // when int j = 5, array[0] = 5,

        // OUTPUT:- 5

        // when int j = 12, array[1] = 12,

        // OUTPUT:- 12

        // when int j = 15, array[2] = 15,

        // OUTPUT:- 15

        // ----------------------------------------------------------------------

        // Declare an integer array with a size of 4
        // The 'new int[4]' initializes an array with four elements.
        // By default, each element of an int array is set to 0.
        int[] emp_arr = new int[4];

        // Loop through each item in the integer array 'emp_arr'
        // 'item' will hold the value of each element as we loop through the array.
        for(int item : emp_arr) {

            // Print each element followed by a space
            // Since all elements are initially set to 0, it will print "0 0 0 0"
            System.out.print(item + " ");
        }

        // OUTPUT:- 0 0 0 0
        System.out.println(); // Move to the next line after printing the int array


        // Dry Run for emp_arr:
        // -------------------------------------
        // emp_arr = [0, 0, 0, 0]   // Default int array values
        // Iteration 1: item = 0 -> prints "0 "
        // Iteration 2: item = 0 -> prints "0 "
        // Iteration 3: item = 0 -> prints "0 "
        // Iteration 4: item = 0 -> prints "0 "
        // Final output: "0 0 0 0"
        // -------------------------------------


        // ----------------------------------------------------------------------

        // Declare a double array with a size of 3
        // The 'new double[3]' initializes an array with three elements.
        // By default, each element of a double array is set to 0.0.
        double[] double_arr = new double[3];

        // Loop through each item in the double array 'double_arr'
        for(double item : double_arr) {

            // Print each element followed by a space
            // Since all elements are initially set to 0.0, it will print "0.0 0.0 0.0"
            System.out.print(item + " ");
        }

        // OUTPUT:- 0.0 0.0 0.0
        System.out.println(); // Move to the next line after printing the double array


        // Dry Run for double_arr:
        // -------------------------------------
        // double_arr = [0.0, 0.0, 0.0]   // Default double array values
        // Iteration 1: item = 0.0 -> prints "0.0 "
        // Iteration 2: item = 0.0 -> prints "0.0 "
        // Iteration 3: item = 0.0 -> prints "0.0 "
        // Final output: "0.0 0.0 0.0"
        // -------------------------------------

        // ----------------------------------------------------------------------

        // Declare a boolean array with a size of 3
        // The 'new boolean[3]' initializes an array with three elements.
        // By default, each element of a boolean array is set to false.
        boolean[] bool_arr = new boolean[3];

        // Loop through each item in the boolean array 'bool_arr'
        for(boolean item : bool_arr) {

            // Print each element followed by a space
            // Since all elements are initially set to false, it will print "false false false"
            System.out.print(item + " ");
        }

        // OUTPUT:- false false false
        System.out.println(); // Move to the next line after printing the boolean array


        // Dry Run for bool_arr:
        // -------------------------------------
        // bool_arr = [false, false, false]   // Default boolean array values
        // Iteration 1: item = false -> prints "false "
        // Iteration 2: item = false -> prints "false "
        // Iteration 3: item = false -> prints "false "
        // Final output: "false false false"
        // -------------------------------------


        // -----------------------------------------------------------------
        // Question: Take an array input from the user. Search for a Number 'x' in that array and return its index.
        // -----------------------------------------------------------------

        System.out.print("Enter the size of the array: "); 
        // Asking the user to input the size of the array.

        int n = sc.nextInt(); 
        // 'n' is assigned the value that the user enters.
        // Let's assume the user enters 5.
        // Now: n = 5

        int[] arr = new int[n]; 
        // Declaring an integer array of size 'n'. 
        // Now, 'arr' is an array of size 5, i.e., it can hold 5 integers.

        System.out.println("Enter the elements of the array: "); 
        // Prompting the user to enter elements for the array.

        for (int i = 0; i < n; i++) { 
            // This loop will run 'n' times (5 times in this case), asking the user to input array elements.

            arr[i] = sc.nextInt(); 
            // Inside the loop, the user inputs an integer at index 'i'.
            // Example: Let's assume user inputs: 3, 7, 8, 12, 5.
            // After each iteration:
            // i = 0, arr[0] = 3
            // i = 1, arr[1] = 7
            // i = 2, arr[2] = 8
            // i = 3, arr[3] = 12
            // i = 4, arr[4] = 5
            // Final state of array: arr = [3, 7, 8, 12, 5]
        }

        System.out.print("Enter the number you want to search: "); 
        // Asking the user to input the number to search in the array.

        int x = sc.nextInt(); 
        // 'x' is assigned the value that the user enters.
        // Let's assume the user enters 12.
        // Now: x = 12

        int index = -1; 
        // Initializing 'index' with -1, assuming that the number is not found initially.
        // Now: index = -1

        for (int i = 0; i < n; i++) { 
            // Loop to traverse each element of the array.
            // The loop runs from i = 0 to i < n (i.e., i < 5).
            
            if (arr[i] == x) { 
                // Inside the loop, we check if the current array element (arr[i]) matches 'x'.

                index = i; 
                // If the element matches 'x', we store the index of the found element in 'index'.
                // Then we break out of the loop since we found the element.
                break;
            }
        }

        if(index == -1){ 
            // If 'index' remains -1, that means 'x' was not found in the array.

            System.out.println("Number not found"); 
            // Output a message that the number was not found.
        }
        else{ 
            // If 'index' is updated, then the number 'x' was found.

            System.out.println("The index of the number you searched is: " + index); 
            // Output the index where the number was found.
        }

        // *****************************************
        // Dry Run: (Assuming user inputs 5 elements: [3, 7, 8, 12, 5] and searches for 12.)
        // *****************************************

        /*

        Iteration-wise breakdown:

        1. User inputs the size of the array 'n = 5'.
        2. The user then inputs 5 elements for the array: [3, 7, 8, 12, 5].
        Array at this stage: arr = [3, 7, 8, 12, 5]

        3. User inputs the number 'x = 12' to search in the array.

        4. The 'for' loop begins to traverse each element of the array to check if 'arr[i] == x'.

            - Iteration 1: 
            i = 0, arr[0] = 3 (3 != 12), so loop continues.

            - Iteration 2: 
            i = 1, arr[1] = 7 (7 != 12), so loop continues.

            - Iteration 3: 
            i = 2, arr[2] = 8 (8 != 12), so loop continues.

            - Iteration 4: 
            i = 3, arr[3] = 12 (12 == 12), condition satisfied.
            
            'index' is set to 3.
            The loop breaks since the element is found.

        5. Since the 'index' is not -1, the final output is:
        "The index of the number you searched is: 3".

        */

        // In case the user searched for a number that is not present (e.g., 15):
        /*

        1. The loop would have gone through all the iterations without finding the number, and 'index' would remain -1.
        2. The output would have been:
        "Number not found".
        */

        // -------------------------------------------------------------
        // PRACTICE QUESTIONS
        // -------------------------------------------------------------

        //  Question 1. Ask the marks of Student(from user) in 3 Subject and Calculate the total Marks he got.
        //  
        //  Show the Marks of Each subject, and the Total Marks 


        /*

            Question 2. Ask the marks of Student(from user) for 'n' Subjects(take n as input from user) and Calculate the total Marks he got and find the Average Marks he Got.

            Name the Subjects as Subject 1 , Subject 2 , ... , Subject n.

            Display the Marks got in each Subject, total marks, and the Average marks.

        */


        /*

            Question 3. Ask the marks of Student(from user) for 'n' Subjects(take n as input from user) and Calculate the total Marks he got and find the Average Marks he Got, also calculate the Percentage, 

            if Percentage is below 34% -> fail,
            if Percentage is between 35% to 90% -> Pass,
            if Percentage is Above 90% -> topper

            Name of Each Subject should be taken input from user.

            Show the Complete Result at last.

        */

        // You will get the Codes of this Programs, in The Next Chapter[Ch.14.3].
        // Before that ,try to do this Program and figure out what You have Studied till now.

    }
   
    static void Array_2D(){

        // An array inside another array is called a 2D array or a matrix.
        // In a 2D array, each element itself is an array. Think of it like a grid of rows and columns.
        // We are going to use a 2D array in this program, which will help us store data in a matrix form.

        // Syntax of declaring a 2D array:
        // <datatype>[][] <arrayname> = new <datatype>[rows][columns];
        // This defines an array with a specific number of rows and columns.

        // Let's represent this matrix example visually:
        /*
        
            [ 0,0 | 0,1 | 0,2 | 0,3 ]  -> Row 0
            [ 1,0 | 1,1 | 1,2 | 1,3 ]  -> Row 1
            [ 2,0 | 2,1 | 2,2 | 2,3 ]  -> Row 2
            [ 3,0 | 3,1 | 3,2 | 3,3 ]  -> Row 3
            [ 4,0 | 4,1 | 4,2 | 4,3 ]  -> Row 4

        */
        
        // Now, we will create a 2D array of integers with 5 rows and 4 columns.
        int[][] arr = new int[5][4];

        // 'arr' is a 2D array of integer type with 5 rows and 4 columns.
        // Initially, all values in the array will be set to 0 (the default value for integers in Java).

        // Let's assign a value to the first element at row 0, column 0.
        arr[0][0] = 10;  // Setting the value of the first element to 10.
        
        // ---------------------------------------------------------------------

        // Now, we will take input from the user to create and fill a 2D array.
        
        Scanner sc = new Scanner(System.in); // Scanner object to take input from the user.

        // Asking the user to enter the number of rows for the 2D array.
        System.out.print("Enter the No. of Rows: ");
        int row = sc.nextInt();  // User input for the number of rows.

        // Asking the user to enter the number of columns for the 2D array.
        System.out.print("Enter the No. of Columns: ");
        int column = sc.nextInt();  // User input for the number of columns.

        // Declaring a 2D array called 'numbers' with user-specified rows and columns.
        int[][] numbers = new int[row][column];

        // Now, let's take input for each cell in the 2D array from the user.

        // Outer loop for iterating through each row.
        for(int i = 0; i < row; i++) {
            
            // Inner loop for iterating through each column in the current row.
            for(int j = 0; j < column; j++) {

                // Asking the user to input the value for each cell in the array.
                System.out.print("Enter the Value of [" + i + "] [" + j + "]: ");
                numbers[i][j] = sc.nextInt();  // Assigning the input value to the corresponding cell.
            }
        }

        // Dry run of filling the array:
        
        /*

        Suppose the user inputs a 2x2 matrix.

        Step-by-step execution:
        - i = 0, j = 0 -> Prompt: "Enter the Value of [0][0]:", User enters: 5 -> numbers[0][0] = 5
        - i = 0, j = 1 -> Prompt: "Enter the Value of [0][1]:", User enters: 7 -> numbers[0][1] = 7
        - i = 1, j = 0 -> Prompt: "Enter the Value of [1][0]:", User enters: 9 -> numbers[1][0] = 9
        - i = 1, j = 1 -> Prompt: "Enter the Value of [1][1]:", User enters: 2 -> numbers[1][1] = 2
        
        Final matrix:
        [ 5  7 ]
        [ 9  2 ]

        */

        // -----------------------------------------------------------------------

        // Now let's print the 2D array as a matrix.

        // Outer loop to iterate through each row.
        for(int i = 0; i < row; i++) {

            // Inner loop to iterate through each column in the current row.
            for(int j = 0; j < column; j++) {

                // Print the value at current row and column followed by a space.
                System.out.print(numbers[i][j] + "  ");
            }

            // Print a new line after each row to make it look like a matrix.
            System.out.println();
        }

        // Dry run of printing the array:

        /*

        For the previous 2x2 matrix example:
        Step-by-step execution:

        - i = 0, j = 0 -> print: "5  "

        - i = 0, j = 1 -> print: "7  ", then move to the next line (System.out.println())

        - i = 1, j = 0 -> print: "9  "

        - i = 1, j = 1 -> print: "2  ", then move to the next line (System.out.println())
        
        Final output:
        5  7  
        9  2

        */

        // ------------------------------------------------------------------------

        // Question 1. Take a 2D array as input from the user and search for a number in the array.

        // Prompt the user to enter the number of rows for the matrix
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt(); // Read the number of rows
        
        
        // Prompt the user to enter the number of columns for the matrix
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt(); // Read the number of columns
        
        
        // Create a 2D array (matrix) with the specified number of rows and columns
        int[][] matrix = new int[r][c]; 
        
        // Taking input for the matrix
        for (int i = 0; i < r; i++) { // Loop through each row
            
            for (int j = 0; j < c; j++) { // Loop through each column
                
                // Prompt the user to enter a value for the current position in the matrix
                System.out.print("Enter the value at [" + i + "][" + j + "]: "); 
                matrix[i][j] = sc.nextInt(); // Store the input value in the matrix
            }
        }
        
        // Prompt the user to enter the number to search for in the matrix
        System.out.print("Enter the number you want to search: "); 
        int x = sc.nextInt(); // Read the number to search
        
        
        // Initialize a flag to check if the number is found
        boolean found = false; 
        
        // Loop through each element in the matrix to search for the number
        for (int i = 0; i < r; i++) { // Loop through each row
            
            for (int j = 0; j < c; j++) { // Loop through each column
                
                // Check if the current element matches the number we're searching for
                if (matrix[i][j] == x) { 
                    
                    // If found, print the index and set the flag to true
                    System.out.println("The index of the number " + x + " is " + i + " and " + j);
                    found = true; // Mark as found
                    break; // Exit the inner loop
                }
            }
            
            if (found) {
                break; // Exit the outer loop if the number is found
            }
        }
        
        // If the number was not found, print a message
        if (!found) {
            System.out.println("Number " + x + " not found in the matrix.");
        }

        /*
        Dry Run of the Code:

        Let's assume the following input during the execution of the code:

        - Number of rows (r): 3
        - Number of columns (c): 3
        - Matrix values:
            Enter the value at [0][0]: 1
            Enter the value at [0][1]: 2
            Enter the value at [0][2]: 3
            Enter the value at [1][0]: 4
            Enter the value at [1][1]: 5
            Enter the value at [1][2]: 6
            Enter the value at [2][0]: 7
            Enter the value at [2][1]: 8
            Enter the value at [2][2]: 9
        - Number to search (x): 5

        Step-by-Step Execution:

        1. Initialize Scanner.
        2. Prompt for rows (r) = 3.
        3. Prompt for columns (c) = 3.
        4. Create a 2D array: matrix[3][3].
        5. Start input loop for matrix:
            - i = 0:
                - j = 0: Enter value 1 → matrix[0][0] = 1
                - j = 1: Enter value 2 → matrix[0][1] = 2
                - j = 2: Enter value 3 → matrix[0][2] = 3
            - i = 1:
                - j = 0: Enter value 4 → matrix[1][0] = 4
                - j = 1: Enter value 5 → matrix[1][1] = 5
                - j = 2: Enter value 6 → matrix[1][2] = 6
            - i = 2:
                - j = 0: Enter value 7 → matrix[2][0] = 7
                - j = 1: Enter value 8 → matrix[2][1] = 8
                - j = 2: Enter value 9 → matrix[2][2] = 9
        6. End of input loop.
        7. Prompt for number to search (x) = 5.
        8. Start search loop:
            - i = 0:
                - j = 0: matrix[0][0] = 1 (not found)
                - j = 1: matrix[0][1] = 2 (not found)
                - j = 2: matrix[0][2] = 3 (not found)
            - i = 1:
                - j = 0: matrix[1][0] = 4 (not found)
                - j = 1: matrix[1][1] = 5 (found)
                - Found at index (1, 1).
        9. Print: "The index of the number 5 is 1 and 1".
        10. The program exits.
        */


        // SOME PRACTICE QUESTIONS:-

        // Question 1. Write the Code to Add two Matrix and Display the New Matrix Formed.

        /*
            Example:-

            [1  2  4]     [2  3  4]    [3  5  8]
            [3  4  6]  +  [1  3  5] => [4  7 11]
            [2  5  0]     [6  7  8]    [8  12 8] 

        */

        // Question 2. Write the Code to Subtract two Matrix and Display the New Matrix Formed.

        /*
            Example:-

            [6  5  4]     [2  3  4]    [4  2  0]
            [3  4  6]  -  [1  3  5] => [2  1  1]
            [7  9  9]     [6  7  8]    [1  2  1] 
            
        */


        // Question 3. Write the Code to Transpose a Given matrix and Display the New Matrix.
            // Transpose means if a matrix of (row X column) then the new matrix will be (column X row).

            /*
                Example:-

                [6  5  4]       [6  3]
                [3  4  6]  =>   [5  4]
                                [4  6]

        */

        // The answers are provided in Next Chapter[Ch.14.4] but first try yourself to Do this.


    }    

    static void StringManipulation(){

        // String is a non-primitive datatype value.

        // It is the Collection of Characters, or the Sequence of Characters.

        // like "hello123", it is a string which has 'h' , 'e' , 'l' , 'o' , '1' , '2' , '3' as its characters.

        // It is non-primitive hence its memory size is not fixed but we can find through total no. of characters in it.

        // Because each character is of 2 Byte in size.

        // So, String will take memory of character size * total no. of characters

        // -------------------------------------------------------------------
        // String Declaration
        // -------------------------------------------------------------------

        // Through Wrapper Class, or its Primitive class.

        String st = new String("Hello123 Sir");

        System.out.println(st); // OUTPUT:- Hello123 Sir

        // Through simple variables.

        String str = "Hello123 Sir";

        System.out.println(str); // OUTPUT:- Hello123 Sir

        // We will study about the 1st way in future so no need of thinking about it.

        // -------------------------------------------------------------------
        // Taking String Input
        // -------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input functions.

        String name = sc.next(); // This will take only the first word of the String and Store it in variable 'name';

        // Like input is "Hi god".

        // In this input 'Hi' and 'god' are two separate words.

        // But name will store only the first word and ignore the rest.

        System.out.println(name); // OUTPUT:- Hi

        // How to take whole String as input and Store it?

        String fullname = sc.nextLine(); // This will take the Whole String and Store it in variable 'fullname';

        // Like input is "Hi god".

        // In this input 'Hi' and 'god' are two separate words.

        // fullname = "Hi god"

        System.out.println(fullname); // OUTPUT:- Hi god

        // -------------------------------------------------------------------
        // Concatenation
        // -------------------------------------------------------------------

        // Concatenation is the process of joining two or more strings together.
        
        String a = "hello "; // A String Variable 'a' Stored the value "hello "

        String b = "world"; // A String Variable 'b' Stored the value "world"

        // Here we concatenate both Strings using the '+' operator.

        System.out.println(a + b); // OUTPUT:- hello world

        // -------------------------------------------------------------------
        // Finding the Length of String
        // -------------------------------------------------------------------

        String x = "hello what is my length?"; // A String Variable 'x' Stored the value "hello what is my length?"

        System.out.println(x.length()); // OUTPUT:- 26

        // <str>.length() fnc is used to find the length of the String.


        // -------------------------------------------------------------------
        // charAt(finding the character at particular index)
        // -------------------------------------------------------------------

        String y = "hello"; // A String Variable 'y' Stored the value "hello"

        // Here we find the character at particular index using charAt() fnc.

        // Lets find the Character at index 3.

        System.out.println(y.charAt(3)); // OUTPUT:- l

        // <str>.charAt() fnc is used to find the character at particular index.

        // here Java Indexing begins from 0.

        //  String ->  h e l l o
        //  Index  ->  0 1 2 3 4

        // Now i want to Split each Character of this String,

        // Lets put an loop to take each Character one by one and print it.

        for(int i = 0 ; i < y.length() ; i++){ // A for loop running on variable 'i' which is iterating from 0 to y.length().

            System.out.print(y.charAt(i) + " , "); // Printing Character at index 'i' in the String 'y' one by one.

        }// for loop ends here.

        System.out.println(); // Empty print statement to add extra line so that further input may continue from next line.

        // Lets perform a dry run and check the output.

        // y.length() -> 5 

        //  String ->  h e l l o
        //  Index  ->  0 1 2 3 4

        // For i = 0, (i < 5) -> true,

        // So, i = 0 and y.charAt(0) -> h

        // For i = 1, (i < 5) -> true,

        // So, i = 1 and y.charAt(1) -> e

        // For i = 2, (i < 5) -> true,

        // So, i = 2 and y.charAt(2) -> l

        // For i = 3, (i < 5) -> true,

        // So, i = 3 and y.charAt(3) -> l

        // For i = 4, (i < 5) -> true,

        // So, i = 4 and y.charAt(4) -> o

        // So, i = 5, (i < 5) -> false, so, loop ends here.

        // OUTPUT:- h , e , l , l , o ,

        // -------------------------------------------------------------------
        // .indexOf (used to find the index of given Character or String in another String.)
        // -------------------------------------------------------------------

        // indexOf() fnc is used to find the index of given String or Character in a Particular String,

        // In case of Multiple Occurrences of Character in String then it will run the first Occurrence index of that String.

        String str13 = "Hello World i hope it is well"; // A String variable 'str13' Storing 'Hello World i hope it is well'.

        int index = str13.indexOf('e'); // This will return the index of first Character found in the string 'str13'.

        // Lets understand Its Indexing first.

        // String -> H e l l o   W o r l d     i     h  o  p  e     i  t     i  s     w  e  l  l
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28

        // According to above Statement, it will return the first Occurrence of 'e' in String "hello World i hope it is well".

        // It will check the Whole String, starting from 0 index till last index.

        // 'e' is founded at index 1.

        // 'index1' variable will Store 1 because 'e' is found at index 1.

        System.out.println(index); // OUTPUT:- 1

        // lets find 'o'

        int index1 = str13.indexOf('o'); // This will return the index of first Character found in the string 'str13'.

        // According to above Statement, it will return the first Occurrence of 'o' in String "hello World i hope it is well".

        // It will check the Whole String, starting from 0 index till last index.

        // 'o' is founded at index 4 and at index 7.

        // 'index' variable will Store 4 because first Occurrence of 'o' is found at index 4 not 7.

        // This will only return the first occurrence and then do not check further String.

        System.out.println(index1); // OUTPUT:- 4

        // But what if i want to Know the index of 2nd Occurrence of 'o' in the String.

        // Here we can also set the Starting and Ending Index, from where search will start.

        int index2 = str13.indexOf('o' , 5); // This will return the index of first Character found in the string 'str13'.

        // According to above Statement, it will return the first Occurrence of 'o' in String "hello World i hope it is well".

        // It will not check the Whole String, it will start searching from index 5 till last index because last index is not specified and by default it is length of String.

        // It will search in only " World i hope it is well".

        
        // 'o' is founded at index 7 in this new range of String.
        
        // 'index2' variable will Store 7 because first Occurrence of 'o' is found at index 7 according to new String.
        
        // This will only return the first occurrence and then do not check further String.

        System.out.println(index2); // OUTPUT:- 7

        // Now i wanted to find index of i in 'hope it is'.

        // This time we need to enter both beginning and ending index of the String, in which it will search for i.

        // So lets try to find 'i'.

        int index3 = str13.indexOf('i' , 14 , 24); // This will return the index of first Character found in the string 'str13'.

        // According to above Statement, it will return the first Occurrence of 'i' in String "hello World i hope it is well".

        // It will not check the Whole String, it will start searching from index 14 till index 24 because starting and ending index for the Searching is Provided by the user in the function.

        // It will search in only "hope it is".I  

        
        // 'i' is founded at index 19 in this new range of String.
        
        // 'index3' variable will Store 19 because first Occurrence of 'o' is found at index 19 according to new String.

        System.out.println(index3); // OUTPUT:- 19



        // -------------------------------------------------------------------
        // .lastIndexOf (used to find the last index of a given Character or String in another String.)
        // -------------------------------------------------------------------

        // lastIndexOf() function is used to find the last occurrence of a given String or Character in a Particular String,

        // In case of Multiple Occurrences of Character or String, it will return the index of the last occurrence.

        // Let's take a new example String.

        String str14 = "This is a simple example of lastIndexOf function in Java."; // A String variable 'str14' storing 'This is a simple example of lastIndexOf function in Java.'.

        int lastIndex = str14.lastIndexOf('i'); // This will return the last index of the Character 'i' found in the string 'str14'.

        // According to the above statement, it will return the last occurrence of 'i' in the String "This is a simple example of lastIndexOf function in Java."

        // It will check the whole String, starting from the last index and moving backward.

        // The last occurrence of 'i' is found at index 54.

        // The 'lastIndex' variable will store 54 because 'i' is found at index 54 in the backward search.

        System.out.println(lastIndex); // OUTPUT:- 54

        // Let's find 'e'

        int lastIndex1 = str14.lastIndexOf('e'); // This will return the last index of Character 'e' found in the string 'str14'.

        // According to the above statement, it will return the last occurrence of 'e' in the String "This is a simple example of lastIndexOf function in Java."

        // It will check the whole String, starting from the last index and moving backward.

        // 'e' is found at index 39 as the last occurrence, though 'e' also appears earlier.

        // The 'lastIndex1' variable will store 39 because 'e' is found at index 39 in the backward search.

        System.out.println(lastIndex1); // OUTPUT:- 39

        // But what if I want to know the index of the second-last occurrence of 'e' in the String?

        // We can also set the starting index, indicating from where the backward search will start.

        int lastIndex2 = str14.lastIndexOf('e', 38); // This will return the last index of Character 'e' found in the string 'str14', but starting the backward search from index 38.

        // According to the above statement, it will start searching from index 38 and move backward, so the second-last 'e' will be located.

        // It will find 'e' at index 25 in this backward search from index 38.

        // The 'lastIndex2' variable will store 25 because the second-last 'e' is found at index 25.

        System.out.println(lastIndex2); // OUTPUT:- 25

        // Now I want to find the last index of 'n' in a specific range of the String.

        // This time, we will enter both the beginning and ending index of the String within which it will search for 'n'.

        // Let's try to find 'n'.

        int lastIndex3 = str14.lastIndexOf('n', 50); // This will return the last index of Character 'n' found in the string 'str14', searching backward from index 50.

        // According to the above statement, it will return the last occurrence of 'n' in the range "This is a simple example of lastIndexOf function in Jav".

        // It will search backward starting from index 50, but it will not check beyond index 0.

        // 'n' is found at index 46 in this range.

        // The 'lastIndex3' variable will store 46 because 'n' is found at index 46 according to the backward search in the specified range.

        System.out.println(lastIndex3); // OUTPUT:- 46

        // -------------------------------------------------------------------
        // .lastIndexOf (used to find the last index of a given String in another String.)
        // -------------------------------------------------------------------

        // In this example, we will use 'lastIndexOf()' to find the last occurrence of a substring in a String.

        String str15 = "This example is a good example of how to use the lastIndexOf function."; // A String variable 'str15' storing 'This example is a good example of how to use the lastIndexOf function.'.

        int lastIndexSubstring = str15.lastIndexOf("example"); // This will return the last index of the substring 'example' found in the string 'str15'.

        // According to the above statement, it will return the last occurrence of the substring 'example' in the String "This example is a good example of how to use the lastIndexOf function."

        // It will check the whole String, starting from the last index and moving backward.

        // The last occurrence of 'example' is found at index 28.

        // The 'lastIndexSubstring' variable will store 28 because the substring 'example' is found at index 28 in the backward search.

        System.out.println(lastIndexSubstring); // OUTPUT:- 28

        // -------------------------------------------------------------------
        // lastIndexOf with a starting index to search backward from
        // -------------------------------------------------------------------

        // Let's take another example to search for the last occurrence of a character starting from a specific index.

        String str16 = "I will practice Java regularly to improve my skills in Java."; // A String variable 'str16' storing 'I will practice Java regularly to improve my skills in Java.'.

        int lastIndexFromStart = str16.lastIndexOf('a', 40); // This will return the last index of the character 'a' found in the string 'str16', but starting the backward search from index 40.

        // Let's understand its indexing first.

        // String -> I     w  i  l  l     p  r  a  c  t  i  c  e     J  a  v  a     r  e  g  u  l  a  r  l  y     t  o     i  m  p  r  o  v  e     m  y     s  k  i  l  l  s     i  n     J  a  v  a  .
        // Index  -> 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69

        // According to the above statement, it will return the last occurrence of 'a' before or at index 40 in the String "I will practice Java regularly to improve my skills in Java."

        // It will start searching backward from index 40. The character 'a' is found at index 35 in this range.

        // The 'lastIndexFromStart' variable will store 35 because 'a' is found at index 35 in the backward search starting from index 40.

        System.out.println(lastIndexFromStart); // OUTPUT:- 35

        // -------------------------------------------------------------------
        // lastIndexOf with a starting index to search for a substring
        // -------------------------------------------------------------------

        // In this example, we will search for a substring 'Java' from a specific index.

        String str17 = "Learning Java is fun. Java helps in building strong programming skills."; // A String variable 'str17' storing 'Learning Java is fun. Java helps in building strong programming skills.'.

        int lastIndexOfSubstringFromStart = str17.lastIndexOf("Java", 30); // This will return the last index of the substring 'Java' found in the string 'str17', but starting the backward search from index 30.

        // Let's understand its indexing first.

        // String -> L  e  a  r  n  i  n  g     J  a  v  a     i  s     f  u  n  .     J  a  v  a     h  e  l  p  s     i  n     b  u  i  l  d  i  n  g     s  t  r  o  n  g     p  r  o  g  r  a  m  m  i  n  g     s  k  i  l  l  s  .
        // Index  -> 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69

        // According to the above statement, it will return the last occurrence of 'Java' before or at index 30 in the String "Learning Java is fun. Java helps in building strong programming skills."

        // It will search backward starting from index 30. The substring 'Java' is found at index 8 in this range.

        // The 'lastIndexOfSubstringFromStart' variable will store 8 because 'Java' is found at index 8 in the backward search starting from index 30.

        System.out.println(lastIndexOfSubstringFromStart); // OUTPUT:- 8

        // -------------------------------------------------------------------
        // lastIndexOf with both start and end index for character search
        // -------------------------------------------------------------------

        // Now we will specify both the starting and ending index to search for the character 'o' in a substring range.

        String str18 = "Programming is all about solving problems with logic."; // A String variable 'str18' storing 'Programming is all about solving problems with logic.'.

        int lastIndexCharInRange = str18.lastIndexOf('o', 40); // This will return the last index of the character 'o' found in the string 'str18', starting the backward search from index 40.

        // Let's understand its indexing first.

        // String -> P  r  o  g  r  a  m  m  i  n  g     i  s     a  l  l     a  b  o  u  t     s  o  l  v  i  n  g     p  r  o  b  l  e  m  s     w  i  t  h     l  o  g  i  c  .
        // Index  -> 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58

        // According to the above statement, it will return the last occurrence of 'o' in the range from index 0 to 40 in the String "Programming is all about solving problems with logic."

        // It will search backward starting from index 40. The character 'o' is found at index 32 in this range.

        // The 'lastIndexCharInRange' variable will store 32 because 'o' is found at index 32 in the backward search in the given range.

        System.out.println(lastIndexCharInRange); // OUTPUT:- 32


        // -------------------------------------------------------------------
        // .compareTo() (Used to Compare two String graphically)
        // -------------------------------------------------------------------

        // In this it will compare the ASCII values of two Strings.

        String st1 = "Hello"; // A String Variable 'st1' Stored the value "Hello"

        String st2 = "Hi"; // A String Variable 'st2' Stored the value "Hi"

        int result = st1.compareTo(st2); // Here we compare the ASCII values of two Strings.

        // In this the first String 'st1' will be compared with the second String 'st2'.

        // Lets do A dry run and understand how it works.

        // st1 -> Hello
        // st2 -> Hi

        // So, it will start comparing the ASCII values of the first Character of both Strings.

        // Since, st1.charAt(0) -> H is same as st2.charAt(0) -> H,

        // So it won't do anything, and move to the next character.

        // This time, st1.charAt(1) -> e is different from st2.charAt(1) -> i.

        // So it will subtract st1.charAt(1) - st2.charAt(1) -> e - i.

        // but it is not possible to subtract two Characters.
        
        // so firstly it will convert and get the ASCII value of st1.charAt(1) -> e and st2.charAt(1) -> i.

        // ASCII code of 'e' -> 101

        // ASCII code of 'i' -> 105

        // Now, (e - i) -> 101 - 105 -> -4

        // So the value Stored in 'result' will be -4.

        System.out.println(result); // OUTPUT:- -4

        // -------------------------------------------------------------------
        // .compareToIgnoreCase() (Used to Compare two String graphically)
        // -------------------------------------------------------------------

        // In this also, it will compare two Strings, but it won't compare strings According to case.

        String st3 = "Hello"; // A String Variable 'st3' Stored the value "Hello"

        String st4 = "wello"; // A String Variable 'st3' Stored the value "Hello"

        int result1 = st3.compareTo(st4); // Here we compare the ASCII values of two Strings.

        // Here When we start comparing the first Character of both Strings,

        // Since, st3.charAt(0) -> H is different from st4.charAt(0) -> w,

        // We will Compare the ASCII values of st3.charAt(0) -> H and st4.charAt(0) -> w.

        // ASCII code of 'H' -> 72

        // ASCII code of 'w' -> 119

        // Now, (H - w) -> 72 - 119 -> -47

        // Now the value Stored in 'result1' will be -47.

        System.out.println(result1); // OUTPUT:- -47

        // Now, lets use compareToIgnoreCase() function.

        int result2 = st3.compareToIgnoreCase(st4);

        // Here When we Start comparing the first Character of both Strings,

        // Since, st3.charAt(0) -> H is different from st4.charAt(0) -> w,

        // We will Compare the ASCII values of st3.charAt(0) -> H and st4.charAt(0) -> w.

        // ASCII code of 'H' -> 72

        // ASCII code of 'w' -> 119

        // But in this we are Ignoring Case, so will find the ASCII value of 'W' instead of 'w' because 'H' is an uppercase letter.

        // ASCII code of 'W' -> 87

        // Now, (H - W) -> 72 - 87 -> -15

        System.out.println(result2); // OUTPUT:- -15

        // -------------------------------------------------------------------
        // .substring() (Used to get a substring from a String)
        // -------------------------------------------------------------------

        // It is used to get a part of String or its substring.

        String str1 = "Hello I am good"; // A String Variable 'str1' Stored the value "Hello I am good"

        // Now first lets us understand the Indexing of String.

        // String -> H e l l o   I   a m    g  o  o  d
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14

        // I want to extract everything till I.

        String ext1 = str1.substring(0,5); // This will extract everything till I.

        // Here in subString fnc, we have given two parameters, first is beginning Index and 2nd parameter is Ending Index.

        // The Extracted String will include the beginning Index Character but do not Include Ending Index Character.

        // Lets understand, str1.substring(0,5) -> "hello I am good".substring(0,5).
        
        // Hence, it will extract everything till 5th index.

        System.out.println(ext1); // OUTPUT:- hello


        // I want to Extract good from the String.

        String ext2 = str1.substring(6); // This will extract everything till end.

        // Here in subString fnc, we have given one parameter, only the beginning Index is given, this will extract everything inside a String from beginning index till end, including the last character of String as well.

        System.out.println(ext2); // OUTPUT:- good

        // Strings are immutable means unplayable.

        // You cannot change any character, nor add any character, nor delete any character.

        // -------------------------------------------------------------------
        // .equals() (Used to check whether two Strings are equal or not)
        // -------------------------------------------------------------------

        // It is used to check whether two Strings are equal or not, by Its characters.

        String str2 = "Hello"; // A String Variable 'str2' Stored the value "Hello"

        String str3 = "Hello"; // A String Variable 'str3' Stored the value "Hello"

        String str4 = "hello"; // A String Variable 'str4' Stored the value "hello"

        System.out.println(str2.equals(str3)); // OUTPUT:- true

        // Because when str2 is equal to str3, it will return true.

        // Because str2 and str3 are equal, "Hello" and "Hello" are equal.

        System.out.println(str2.equals(str4)); // OUTPUT:- false

        // This will return false because "Hello" and "hello" are not equal.

        // Yes, the Words are Equal but there Case is different.

        // Like in "Hello", H is Uppercase and in "hello", h is Lowercase.

        // So it will return false.

        // -------------------------------------------------------------------
        // .equalsIgnoreCase() (Used to check whether two Strings are equal or not, ignoring case)
        // -------------------------------------------------------------------

        // It is used to check whether two Strings are equal or not, by Its characters.

        String str5 = "Hello"; // A String Variable 'str5' Stored the value "Hello"

        String str6 = "Hello"; // A String Variable 'str6' Stored the value "Hello"

        String str7 = "hello"; // A String Variable 'str7' Stored the value "hello"

        System.out.println(str5.equalsIgnoreCase(str6)); // OUTPUT:- true

        // Because when str5 is equal to str6, it will return true.

        // Because str5 and str6 are equal, "Hello" and "Hello" are equal.

        System.out.println(str5.equalsIgnoreCase(str7)); // OUTPUT:- true

        // This will return true because "Hello" and "hello" are equal.

        // The Case is Ignored, so 'H' and 'h' are treated as equal.

        // -------------------------------------------------------------------
        // .split() (Used to split a String into an array of Strings)
        // -------------------------------------------------------------------

        // It is the function to split a String into an array of Strings, by using the delimiter.

        // Delimiter is the character which will be used to split the String.

        String str8 = "Hello I am good"; // A String Variable 'str8' Stored the value "Hello I am good"

        String[] arr = str8.split("o"); // A String Array 'arr' will store the value after splitting.

        // Now lets understand the Indexing of String.

        // Indexing starts from 0.

        // So, this is the String, "Hello I am good".

        // In this, String it will split by the delimiter "o" or the Character "o".

        // So, it will split it in "hell" , " I am g" , "d".

        // Because delimiter is "o" and it doesn't count himself in array.

        // First split occurs in "hello I am good" at point o of 'hello'

        // So the before String of 'o' is "hell".

        // Remaining String is " I am good"

        // Next 'o' is at 'good' , and it will return the before String which is "I am g"

        // Remaining String is "od" , and Now 'o' is at 'od' , so it will split before String and return it.

        // Remaining String is "d", and no more delimiter is found.

        // So the last remaining String is "d", which we will be returning as an array.

        for(String word : arr) { // This will Iterate through the array of String and Store each item of the array in the String variable 'word'.

            System.out.println(word); // This will print each item of the array.

        }// for loop ends here.

        // OUTPUT:- 
        //
        //      hell
        //       I am g
        //
        //      d


        // -------------------------------------------------------------------
        // .startswith() (Used to check whether a String starts with another String)
        // -------------------------------------------------------------------

        // It is used to check whether a String starts with the parameter, or not.

        // It will return boolean either true or false.

        String str9 = "Hello"; // A String Variable 'str9' Stored the value "Hello"

        String str10 = "Hello I am good"; // A String Variable 'str10' Stored the value "Hello I am good"

        System.out.println(str9.startsWith("i")); // OUTPUT:- false

        // Because 'str9' which is 'Hello' do not start with 'i'.

        System.out.println(str10.startsWith(str9)); // OUTPUT:- true

        // This output will be true because 'str10' which is "Hello I am good", starts with 'str9' which is 'Hello'.

        // -------------------------------------------------------------------
        // .endswith() (Used to check whether a String ends with another String)
        // -------------------------------------------------------------------

        // It is used to check whether a String ends with the parameter, or not.

        // It will return boolean either true or false.

        String str11 = "good"; // A String Variable 'str11' Stored the value "good"

        String str12 = "Hello I am good"; // A String Variable 'str12' Stored the value "Hello I am good"

        System.out.println(str11.endsWith("H")); // OUTPUT:- false

        // Because 'str11' which is 'good' do not end with 'i'.

        System.out.println(str12.endsWith(str9)); // OUTPUT:- true

        // This output will be true because 'str12' which is "Hello I am good", ends with 'str11' which is 'good'.


        // -------------------------------------------------------------------
        // .replace() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The replace() function is used to replace ALL occurrences of a given character or substring in the original string.
        // Syntax: 
        // String newStr = originalString.replace(oldChar/oldSubStr, newChar/newSubStr);

        // It does NOT modify the original string but returns a new string with the replacements.

        String Str1 = "banana"; // A String variable 'Str1' storing 'banana'.

        // Using replace() to replace all occurrences of 'a' with 'o'.
        String replacedStr1 = Str1.replace('a', 'o'); // Replaces all 'a' with 'o'.

        // Dry Run:
        // Initial String -> b a n a n a
        // After Replacement -> b o n o n o
        // All 'a' characters are replaced with 'o'.

        System.out.println(replacedStr1); // OUTPUT: "bonono"


        // -------------------------------------------------------------------
        // Example 2: Replacing all occurrences of a substring
        // -------------------------------------------------------------------

        String Str2 = "abcabc"; // A String variable 'Str2' storing 'abcabc'.

        // Using replace() to replace all occurrences of "abc" with "xyz".
        String replacedStr2 = Str2.replace("abc", "xyz"); // Replaces all "abc" with "xyz".

        // Dry Run:
        // Initial String -> a b c a b c
        // After Replacement -> x y z x y z
        // All "abc" substrings are replaced with "xyz".

        System.out.println(replacedStr2); // OUTPUT: "xyzxyz"


        // -------------------------------------------------------------------
        // Example 3: Replacing digits with letters
        // -------------------------------------------------------------------

        String Str3 = "123123"; // A String variable 'Str3' storing '123123'.

        // Using replace() to replace all occurrences of '1' with 'A'.
        String replacedStr3 = Str3.replace('1', 'A'); // Replaces all '1' with 'A'.

        // Dry Run:
        // Initial String -> 1 2 3 1 2 3
        // After Replacement -> A 2 3 A 2 3
        // All '1' digits are replaced with 'A'.

        System.out.println(replacedStr3); // OUTPUT: "A23A23"


        // -------------------------------------------------------------------
        // .replaceFirst() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The replaceFirst() function is used to replace ONLY the FIRST occurrence of a given character or substring.
        // Syntax: 
        // String newStr = originalString.replaceFirst(oldSubStr, newSubStr);

        // It returns a new string where only the first occurrence is replaced.


        // -------------------------------------------------------------------
        // Example 1: Replacing the first occurrence of a substring
        // -------------------------------------------------------------------

        String Str4 = "hellohello"; // A String variable 'Str4' storing 'hellohello'.

        // Using replaceFirst() to replace the first occurrence of "hello" with "hi".
        String replacedStr4 = Str4.replaceFirst("hello", "hi"); // Replaces the first "hello" with "hi".

        // Dry Run:
        // Initial String -> h e l l o h e l l o
        // After Replacement -> h i h e l l o
        // Only the first "hello" is replaced with "hi".

        System.out.println(replacedStr4); // OUTPUT: "hihello"


        // -------------------------------------------------------------------
        // Example 2: Replacing the first occurrence of a character
        // -------------------------------------------------------------------

        String Str5 = "abracadabra"; // A String variable 'Str5' storing 'abracadabra'.

        // Using replaceFirst() to replace the first occurrence of 'a' with 'o'.
        String replacedStr5 = Str5.replaceFirst("a", "o"); // Replaces the first 'a' with 'o'.

        // Dry Run:
        // Initial String -> a b r a c a d a b r a
        // After Replacement -> o b r a c a d a b r a
        // Only the first 'a' is replaced with 'o'.

        System.out.println(replacedStr5); // OUTPUT: "obracadabra"


        // -------------------------------------------------------------------
        // Example 3: Replacing the first occurrence of a digit
        // -------------------------------------------------------------------

        String Str6 = "123123"; // A String variable 'Str6' storing '123123'.

        // Using replaceFirst() to replace the first occurrence of "12" with "45".
        String replacedStr6 = Str6.replaceFirst("12", "45"); // Replaces the first "12" with "45".

        // Dry Run:
        // Initial String -> 1 2 3 1 2 3
        // After Replacement -> 4 5 3 1 2 3
        // Only the first "12" is replaced with "45".

        System.out.println(replacedStr6); // OUTPUT: "453123"

        // -------------------------------------------------------------------
        // String Functions Overview (trim(), strip(), concat(), toUpperCase(), toLowerCase())
        // -------------------------------------------------------------------

        // Java provides various string functions to manipulate or modify strings effectively.
        // These functions return a new string since strings are immutable in Java.

        // -------------------------------------------------------------------
        // .trim() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The trim() function is used to remove any leading and trailing spaces from a string.
        // It does NOT remove spaces in between words or characters.
        // Syntax: 
        // String newStr = originalString.trim();


        // -------------------------------------------------------------------
        // Example 1: Using trim() to remove leading and trailing spaces
        // -------------------------------------------------------------------

        String Str7 = "  hello world  "; // A String variable 'Str7' storing '  hello world  ' (with spaces).

        // Using trim() to remove spaces from the beginning and end of the string.
        String trimmedStr = Str7.trim(); // Removes the leading and trailing spaces.

        // Dry Run:
        // Initial String -> "  hello world  "
        // After trim() -> "hello world"
        // The spaces before 'hello' and after 'world' are removed.

        System.out.println(trimmedStr); // OUTPUT: "hello world"

        // -------------------------------------------------------------------
        // .strip() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The strip() function is similar to trim(), but it also removes Unicode white spaces.
        // Unicode whitespace are wider and not covered by the regular trim() function.
        // Syntax: 
        // String newStr = originalString.strip();

        // -------------------------------------------------------------------
        // Example 2: Using strip() to remove leading and trailing spaces (including Unicode spaces)
        // -------------------------------------------------------------------

        String Str8 = "   hello world   "; // A String variable 'Str8' storing '   hello world   ' (with spaces).

        // Using strip() to remove spaces (including Unicode whitespace).
        String strippedStr = Str8.strip(); // Removes leading and trailing spaces.

        // Dry Run:
        // Initial String -> "   hello world   "
        // After strip() -> "hello world"
        // The spaces (including Unicode whitespace) are removed.

        System.out.println(strippedStr); // OUTPUT: "hello world"


        // -------------------------------------------------------------------
        // .concat() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The concat() function is used to concatenate (join) two strings together.
        // It joins the specified string to the end of the original string.
        // Syntax: 
        // String newStr = originalString.concat(anotherString);


        // -------------------------------------------------------------------
        // Example 3: Using concat() to join two strings
        // -------------------------------------------------------------------

        String Str9 = "Hello"; // A String variable 'Str9' storing 'Hello'.
        String Str10 = " World"; // A String variable 'Str10' storing ' World'.

        // Using concat() to join 'Str9' and 'Str10'.
        String combinedStr = Str9.concat(Str10); // Joins 'Hello' and ' World'.

        // Dry Run:
        // Initial String -> "Hello"
        // Concatenated String -> "Hello World"
        // The two strings are combined into a single string.

        System.out.println(combinedStr); // OUTPUT: "Hello World"


        // -------------------------------------------------------------------
        // .toUpperCase() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The toUpperCase() function converts all characters in the string to uppercase.
        // Syntax: 
        // String upperStr = originalString.toUpperCase();

        // -------------------------------------------------------------------
        // Example 4: Using toUpperCase() to convert all characters to uppercase
        // -------------------------------------------------------------------

        String Str11 = "hello"; // A String variable 'Str11' storing 'hello'.

        // Using toUpperCase() to convert all characters to uppercase.
        String upperStr = Str11.toUpperCase(); // Converts 'hello' to 'HELLO'.

        // Dry Run:
        // Initial String -> "hello"
        // After Conversion -> "HELLO"
        // All lowercase letters are changed to uppercase.

        System.out.println(upperStr); // OUTPUT: "HELLO"


        // -------------------------------------------------------------------
        // .toLowerCase() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The toLowerCase() function converts all characters in the string to lowercase.
        // Syntax: 
        // String lowerStr = originalString.toLowerCase();

        // -------------------------------------------------------------------
        // Example 5: Using toLowerCase() to convert all characters to lowercase
        // -------------------------------------------------------------------

        String Str12 = "WORLD"; // A String variable 'Str12' storing 'WORLD'.

        // Using toLowerCase() to convert all characters to lowercase.
        String lowerStr = Str12.toLowerCase(); // Converts 'WORLD' to 'world'.

        // Dry Run:
        // Initial String -> "WORLD"
        // After Conversion -> "world"
        // All uppercase letters are changed to lowercase.

        System.out.println(lowerStr); // OUTPUT: "world"

        // -----------------------------------------------------------------------------
        // SOME PRACTICE QUESTIONS
        // -----------------------------------------------------------------------------

        /*

            // Question 1.

                String str = "Data Science is the future.";
                String result = str.replace("future", "now").substring(5, 15).trim();
                System.out.println(result.charAt(0) + "" + result.indexOf('c') + result.length());


        */

        /*

            // Question 2.

                String str1 = "Java";
                String str2 = "java";
                String result = (str1.equals(str2) ? str1 : str2).toLowerCase();
                System.out.println(result.substring(0, 2).concat(result.substring(2).toUpperCase()));

        */

        /*

            // Question 3.

            String str = "Split,This,String,Complexity";
            String[] parts = str.split(",");
            String result = String.join(" ", parts);
            System.out.println(result.substring(0, 5).toUpperCase() + parts[2].length());

        */

        // Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.15.3].

    }

    static void buildString(){

        // We know, from Earlier Chapters, that Strings are Immutable, that cannot be edited, nor the characters deleted or Changed.

        // This is due to Heap Memory in which our all String data Get Stored.

        // There are mainly Two Spaces of Memory:

        // Stack Memory:- In which all the data, are Stacked one Upon another and Executed from top to Bottom.

        // like i have created some variables.

        int a = 13; // A variable 'a' of datatype Integer Storing Integer.

        double b = 1.3; // A variable 'b' of datatype Double Storing double.

        boolean c = true; // A variable 'c' of datatype boolean Storing true.

        // In the Stack Memory, they are Stored like this.

        /* STACK MEMORY and Heap memory

            |        |
            ----------
            |   c    | --------> Inside heap memory 13 is Stored and c is pointing towards 13 as its Value.
            ----------
            |   b    | --------> Inside heap memory 1.3 is Stored and b is pointing towards 1.3 as its Value.
            ----------
            |   a    | --------> Inside heap memory 13 is Stored and a is pointing towards 13 as its Value.
            ----------

            This is know as Stack Memory in which data is arranged in form of Stacks,


            // Heap Memory is the type of Memory in which data are not arranged in form of Stacks or any order, it is just an empty space, where the values are stored, and reference are passed to Variables.

            // It first Stores a then b then c, from down to top.

            // but during Operations, firstly the Upper Stack will be removed then lower Stacks are Removed.
         
         */

        // Whenever we add, something in String, that it doesn't change the value of That String, but created a new value and Start pointing towards it. and Deletes the Old value.

        String str = "h";  // Inside Stack Memory, str is Stored.

        // Inside heap memory, "h" is Stored and str is pointing towards it[referencing].

        str = str + "e"; // Inside Stack Memory, str is Stored Already so no new data is created.

        // Inside heap memory, "h" data is Deleted, and new data "he" is Created and Now str is pointing towards it[referencing].

        str = str + "l"; // Inside Stack Memory, str is Stored Already so no new data is created.

        // Inside heap memory, "he" data is Deleted, and new data "hel" is Created and Now str is pointing towards it[referencing].

        str = str + "l"; // Inside Stack Memory, str is Stored Already so no new data is created.

        // Inside heap memory, "hel" data is Deleted, and new data "hell" is Created and Now str is pointing towards it[referencing].

        str = str + "o"; // Inside Stack Memory, str is Stored Already so no new data is created.

        // Inside heap memory, "hell" data is Deleted, and new data "hello" is Created and Now str is pointing towards it[referencing].

        // Here due to this Deletion and Recreation of values, this might take some time, in ms, which is negligible for us but when we want to manipulate String at high level, or in big Software, this might take time in Seconds, which is not good for user and reduces its Experience.

        // For this, Solution formed and Know as StringBuilder, which manipulates and Change the data rather Then deleting and Recreating.

        // Lets Understand About String Builder class.

        // Syntax will be same as Syntax of Object Creation.

        // Here the StringBuilder class do not Create variable, but creates Objects.

        // Syntax:- <className> <object name> = new <className> ();

        // className: StringBuilder

        // Syntax for StringBuilder:- StringBuilder <object name> = new StringBuilder(<value>);

        // Lets create our 1st Variable sb.
    
        StringBuilder sb = new StringBuilder("Hello Guys"); // Here we are Creating Object of String Builder.

        // The variable 'sb' is Storing the value "Hello Guys"

        System.out.println(sb); // OUTPUT:- Hello Guys

        // Lets know about Some functions of String Builder class Which is used to manipulate String.

        // -----------------------------------------------------------------------------
        // <string>.charAt(<index>); To get the character at given index.
        // -----------------------------------------------------------------------------

        // Lets get the First Character of the String.

        // Lets do the Indexing First.

        // String -> H e l l o   G u y s
        // Index  -> 0 1 2 3 4 5 6 7 8 9

        // So, lets get the first Character means the Character at index 0.

        System.out.println(sb.charAt(0)); // OUTPUT:- H

        // -----------------------------------------------------------------------------
        // <string>.setCharAt(<old index>, <new char>); To set the character at given index.
        // -----------------------------------------------------------------------------

        // Now lets Understand to Set characters or Change Characters at a Given Index.

        // Lets do the Indexing First.

        // String -> H e l l o   G u y s
        // Index  -> 0 1 2 3 4 5 6 7 8 9

        // I want to Change this "Hello guys" to "Hello boys"

        // so to do that i have to Change two characters ie. "G" and "u".

        // So, index of 'G' is 6.
        // So, index of 'u' is 7.

        sb.setCharAt(6, 'B'); // Changing the value of 'G' to 'B'

        // This function will change the Character at given index (index 6) by the new Character 'B'.

        System.out.println(sb); // OUTPUT:- Hello Buys

        // this is not that i wanted, so lets claim it.

        // I want to Change one more Character at index 7.

        sb.setCharAt(7, 'o'); // Changing the value of 'u' to 'o'

        // This function will change the Character at index 7 by the new Character 'o'.

        System.out.println(sb); // OUTPUT:- Hello Boys

        // ------------------------------------------------------------------------------
        // <string>.insert(<index>, <value>); To Insert the value at given index.
        // -----------------------------------------------------------------------------

        // This Function is used to add new Characters in the String.

        // Here "Hello Boys" look incomplete due to full stop(.), so lets add it.

        // Lets do the Indexing First.

        // String -> H e l l o   B o y s
        // Index  -> 0 1 2 3 4 5 6 7 8 9

        // Here i want to add a new Character at last means after 9th index, or i mean at 10th index.

        sb.insert(10, '.'); // Adding a new Character at 10th index

        // Here This function will add a new Character '.' at Given Index (10th index).

        System.out.println(sb); // OUTPUT:- Hello Boys.

        // I want to add an Extra 's' before full Stop(.)

        // Lets do the Indexing First,

        // String -> H e l l o   B o y s .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10

        // So this means I want to add an Extra character at 9th Index.

        sb.insert(9, 's'); // Adding a new Character at 9th index

        // Here This function will add a new Character 's' at Given Index (9th index).

        System.out.println(sb); // OUTPUT:- Hello Boyss.

        // Now, see the Indexing:-

        // String -> H e l l o   B o y s s  .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11

        // Here we have added a new character 's' at index 9 and shifted the rest string part forward.


        // ------------------------------------------------------------------------------
        // <string>.delete(<start index>, <end index>); To delete the characters between start and end index.
        // ------------------------------------------------------------------------------

        // Lets delete "llo" from "hello Boyss.".

        // Lets do the indexing first,

        // String -> H e l l o   B o y s s  .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11

        // So i want to delete from index 2 till index 4.

        sb.delete(2, 5); // Deleting the characters between 2nd and 5th index.

        // I had written 2nd Index because it is inclusive, or included in deleting, means the Character at index 2 will be deleted.

        // I had written 5th index because it is exclusive, or not included in deleting, means the Character at index 5 will not be deleted.

        // It will delete everything from 2nd Index till 5th Index.

        // but not include the 5th index or you can say till 4th index.

        System.out.println(sb); // OUTPUT:- He Boyss.

        // I also wanted to Delete that extra 's'.

        // Lets do the Indexing first,

        // String -> H e   B o y s s .
        // Index  -> 0 1 2 3 4 5 6 7 8 

        // So i want to delete extra 's' i can pick any 's', so lets pick the last 's' at index 7.

        sb.delete(7 , 8); // Deleting the Characters between 7th and 8th index.

        // As i said starting index is inclusive an Ending index in exclusive, so i won't delete the 8th index Character.

        // but it will the 7th index Character as it is Inclusive.

        System.out.println(sb); // OUTPUT:- He Boys.

        // ------------------------------------------------------------------------------
        // <string>.append(<substring>); Use to add a Substring at the Last of the String.
        // ------------------------------------------------------------------------------

        // I also wanted to add "He Boys and she Girls", but it is only "He Boys".

        // I am not going to add Each character using insert() fnc, nor i am going to simply use concatenation, as it is not the Correct way.

        // So, lets use the append() fnc which will add the sub String at the last of the String.

        sb.append("and she Girls."); // Here we appended the sub String at the last of the String.
        
        // By this we have added "and she Girls" at the last of the String.

        System.out.println(sb); // OUTPUT:- He Boys.and she Girls.

        // Lets remove the extra full stop in between the String.

        // Lets do the Indexing first,

        // String -> H e   B o y s . a n d     s  h  e     G  i  r  l  s  .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21

        // So we have to delete the extra full stop at index 7.

        sb.delete(7 , 8); // Deleting the Characters between 7th and 8th index.

        // Here 7th index is inclusive and 8th index is exclusive, so i won't delete the 8th index Character.

        // but it will the 7th index Character as it is Inclusive.

        System.out.println(sb); // OUTPUT:- He Boysand she Girls.

        // Now, there is no space and 'Boysand'

        // So lets fix it by inserting an space character.

        // Lets do the Indexing first,

        // String -> H e   B o y s a n d     s  h  e     G  i  r  l  s  .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

        sb.insert(7, " "); // Inserting the space character at 7th index.

        // This will add the space character at the 7th index.

        System.out.println(sb); // OUTPUT:- He Boys and she Girls.

        // Now we have perfectly manipulated the String from "Hello Guys" to "He Boys and she Girls."

        // by learning different StringBuilder functions.


        // --------------------------------------------------------------------------------
        // SOME PRACTICE QUESTIONS
        // --------------------------------------------------------------------------------

        // --------------------------------------------------------------------------------
        // QUESTION 1. Reverse a given String and store the Reverse into new String, do not use StringBuilder class functions.
        // --------------------------------------------------------------------------------

        // --------------------------------------------------------------------------------
        // QUESTION 2. Reverse a given String Through String Builder Class functions.
        // --------------------------------------------------------------------------------

        // --------------------------------------------------------------------------------
        // QUESTION 3. Compare the Time Complexity of Both the Cases.
        // if Q.1 case has less time complexity than Q.2 , then make the new logic to reverse a String using String Builder class functions, with less Time complexity than Q.1 .
        // --------------------------------------------------------------------------------    

        // Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.15.4].

    }

    static void Operators_Overview(){

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

    
    static void BinaryFusion(){

         // What is Number System?

        // Number System is a way of writing numbers, like 0, 1, 2, 3, 4, 5, etc.

        // It is the System of writing numbers in a specific base.

        // A number system is defined as a system of writing to express numbers. It is the mathematical notation for representing numbers of a given set by using digits or other symbols in a consistent manner.

        // There are three number systems in Java.

        // 1. Binary Number System is the base-2 number system. (Include 0 and 1)
        
        // 2. Decimal Number System is the base-10 number system. (Include 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

        // 3. Hexadecimal Number System is the base-16 number system. (Include 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)

        // --------------------------------------------------------------------------

        // Base-2 means it has only two possible values 0 and 1.

        // In Java and many Programming Languages, There is no math number System or Decimal Number System.

        // They all follow the Binary Number System.

        // In Decimal Number System, we have 10 digits, 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9.

        // All the numbers is Decimal Number System are Represented by 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.

        // Like small number 57.

        // It Included 5 and 7 which are the Digits of Decimal Number System.

        // Like Big number 239374983469.

        // It also the Same Digits of Decimal Number System.

        // Means any number formed or Written in Decimal Number System is Represented by 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.

        // Hence it is also known as base-10 Number System.

        // And on the other Side, Binary Number System or the Number System of Computer, is known as base-2 Number System.

        // Because it only has two possible values, 0 and 1.

        // All the Numbers, either big or small, are Represented by 0 and 1.

        // Like 4 in Decimal Number System is represented by 0100 in Binary Number System.

        // Now, you may think that they also include the Same Digits of Decimal Number System.

        // But In Binary Number System, we can use only this 2 Digits, ie. 0 and 1.

        // Lets Understand how to Write Decimal Number System in Binary Number System.

        // Lets Suppose we have to convert 4 in Decimal Number System to Binary Number System.

        // First we have to keep dividing 4 by 2 till we reach 1.

        // 4 / 2 -> 2 and remainder is 0.

        // We Count the Remainder of Each Step as the Binary Numbers, because any number divided by 2 will give either 1 or 0 as the remainder.

        // Binary Format: 0

        // 2 / 2 -> 1 and remainder is 0.

        // Remember, we have to keep writing the Remainder from right to left.

        // Binary Format: 0 0

        // 1 / 2 -> 0 and remainder is 1.

        // Binary Format: 1 0 0 

        // Now, we finally Converted 4 into binary Format, which is 100 .

        // Now, when we have to represent it then we say,

        // Now, lets convert a Binary Number into Decimal Number System.

        // Lets Suppose we have to convert 1101 in Binary Number System to Decimal Number System.

        // So, firstly we have to pick each digit from right to left, and keep multiplying it by powers of 2, starting from power 0 till last digit.

        // Like, here the Digits are 1, 1, 0, 1.

        // So, firstly 1 * 2^0 = 1 * 1 = 1

        // Decimal Format: 1

        // Then 0 * 2^1 = 0 * 2 = 0

        // Decimal Format: 1 + 0 

        // Here we have to Keep Adding the Result at each Step.

        // Then 1 * 2^2 = 1 * 4 = 4

        // Decimal Format: 1 + 0 + 4

        // Then 1 * 2^3 = 1 * 8 = 8

        // Decimal Format: 1 + 0 + 4 + 8

        // Here we have to keep increasing the power of 2 by 1. starting from power 0.

        // Decimal Format: 1 + 0 + 4 + 8 = 13

        // So, 1101 in Binary Number System is equal to 13 in Decimal Number System.


        // Lets Know, some Starting values of Decimal Number System,

        // 0 -> 000

        // 1 -> 001

        // 2 -> 010

        // 3 -> 011

        // 4 -> 100

        // 5 -> 101

        // 6 -> 110

        // 7 -> 111

        // 8 -> 1000

        // 9 -> 1001

        // 10 -> 1010



        // -------------------------------------------------------------------
        // BITWISE OPERATORS
        // -------------------------------------------------------------------

        // Some Bitwise Operators like & , | , ^ , ~ , << , >>

        // -------------------------------------------------------------------
        // Binary AND Operator
        // -------------------------------------------------------------------

        // It is Used to check the Logical relation between Two Binary Numbers.

        // In Java, 0 is Represented as false, and 1 is represented as true.

        // Lets Assume, we have two Binary Numbers.

        int A = 101; // A Variable 'A' of Datatype Integer, storing 101.

        int B = 111;

    



    }

}    

