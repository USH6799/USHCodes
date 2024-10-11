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


public class EscapeSequences_Practice {

    public static void main(String[] args) {

        // Lets Check the First Option:

        System.out.println("*\n"); // This is the println() statement which means it adds an extra line after printing.

        // So, it will print the star(*) then it has an Escape Sequence (\n) which means it adds a new line.

        // So, firstly it will print the star on the same line and then add an extra line.

        // After printing due to println() , one more extra line will be added.

        // OUTPUT:- *
        //          <extra line>
        //          <extra line>
        

        System.out.print("* *\n *"); // This is the print() statement which means it won't add any extra line after printing.

        // In this it will print the stars(* *) then it has an escape Sequence character (\n) which adds a new line.

        // So, after printing the stars on the same line, then adding a new line, and then it will print the star(*) in the same new line.

        // After printing it won't add any new line as it do not have println();

        // Final OUTPUT:- 
        //                *
        //
        //                * *
        //                  *

        // This will be the output, which means it is not the Correct Option as the output is different from Desired Output.


        // Lets Check the Second Option:

        
        System.out.print("*\n* *");  /// This is the print() statement which means it won't add any extra line after printing.

        // So, it will print the star(*) then it has an Escape Sequence (\n) which means it adds a new line.

        // So, firstly it will print the star on the same line and then add an extra line.

        // and then again it will print the stars(* *) on the same new line.

        // After printing due to print() , it won't add any extra line.

        // OUTPUT:- *
        //          * *

        System.out.println("*"); // This is the println() statement which means it adds an extra line after printing.

        // So, firstly it will print the star(*) on the same line.

        // After printing due to println() , one more extra line will be added.

        // OUTPUT:

        //      *
        //      * **

        // This will be the output, which means it is not the Correct Option as the output is different from Desired Output.


        // Lets Try for The Third Option:

        System.out.println("*\n* *\n*"); // This is the println() statement which means it adds an extra line after printing.

        // So, it will print the star(*) then it has an Escape Sequence (\n) which means it adds a new line.

        // So, firstly it will print the star(*) on the same line and then add an extra line.

        // After adding an Extra line, it will print stars(* *) on the same extra line, then it has an Escape Sequence (\n) which means it adds a new line again.

        // Now, firstly it will print the stars(* *) then adds a new extra line.

        // Then it will print star(*) on that new extra line.

        // After printing due to println() , one more extra line will be added.

        // OUTPUT:-

        //      *
        //      * *
        //      *
        //      <extra line>

        // Extra line can be ignored in the Output, so this is Option is Correct as we get the Desired Output.










        
    }
}