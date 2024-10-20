public class EscapeSequences {
   
    public static void main(String[] args) {
        
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
}
