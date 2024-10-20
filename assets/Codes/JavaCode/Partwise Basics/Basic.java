/**
 * Basic
 */
public class Basic {

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
}