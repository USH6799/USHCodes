// imported scanner class for taking input from user.
import java.util.Scanner; 

public class pattern_1 { 
// Declaring the main class named 'Pattern1'

    public static void main(String[] args) { 
    // Main method which is the entry point of the program
        
        Scanner sc = new Scanner(System.in); 
        // Creating a Scanner object 'sc' to take input from the user

        // ---------------------------------------------------------------------------

        // Solid Square Pattern With Nested for loop

        System.out.print("Enter the Side of Square: "); 
        // Asking user to input the side length of the square

        int s = sc.nextInt(); 
        // Storing the side length of the square in variable 's'

        for(int i = 1 ; i <= s ; i++){ 
        // Outer loop, runs 's' times, where 'i' represents the current row number
        // It controls the number of rows printed, from 1 to 's'

            for (int j = 1 ; j <= s ; j++){ 
            // Inner loop, runs 's' times, where 'j' represents the column number
            // It prints '*' in each column for every row
                System.out.print("* "); 
                // Prints a '*' followed by a space, this is executed 's' times per row

            } 

            System.out.println(); 
            // Moves to the next line after printing one complete row of '*'

        } 

        // ---------------------------------------------------------------------------

        // Solid Rectangle Pattern Using Nested for loop

        System.out.print("Enter the Length of Rectangle: "); 
        // Asking user to input the length of the rectangle

        int l = sc.nextInt(); 
        // Storing the length of the rectangle in variable 'l'

        System.out.print("Enter the Breadth of Rectangle: "); 
        // Asking user to input the breadth of the rectangle

        int b = sc.nextInt(); 
        // Storing the breadth of the rectangle in variable 'b'

        for(int i = 1 ; i <= l ; i++){ 
        // Outer loop, runs 'l' times, where 'i' represents the row number for the rectangle
        // It controls the number of rows printed, from 1 to 'l'

            for (int j = 1 ; j <= b ; j++){ 
            // Inner loop, runs 'b' times, where 'j' represents the column number
            // It prints '*' in each column for every row
                System.out.print("* "); 
                // Prints a '*' followed by a space, this is executed 'b' times per row

            } 

            System.out.println(); 
            // Moves to the next line after printing one complete row of '*'

        } 

        // ---------------------------------------------------------------------------
    } 
} 

/*
    Explanation of the logic for both patterns:
    
    1. Solid Square Pattern:
    - The pattern is a square, which means the number of rows is equal to the number of columns.
    - The outer loop is responsible for printing each row, and the inner loop is responsible for printing each '*' in a row.
    - For example, if the user enters 's = 4', it will print:
    
        * * * * 
        * * * * 
        * * * * 
        * * * *
    
    2. Solid Rectangle Pattern:
    - The rectangle has a different number of rows and columns (length and breadth).
    - The outer loop handles the number of rows (length), and the inner loop handles the number of columns (breadth).
    - For example, if the user enters 'l = 3' and 'b = 5', it will print:
    
        * * * * *
        * * * * *
        * * * * *

*/

/*
    Dry run of the code:

    Input:
    Side of Square (s): 3
    Length of Rectangle (l): 3
    Breadth of Rectangle (b): 4
    
    Dry run of Solid Square Pattern:
    
    s = 3
    
    First iteration (i = 1):
    - Inner loop starts, j = 1: print "* "
    - Inner loop continues, j = 2: print "* "
    - Inner loop continues, j = 3: print "* "
    - After inner loop finishes, move to next line (System.out.println())

    Second iteration (i = 2):
    - Inner loop starts, j = 1: print "* "
    - Inner loop continues, j = 2: print "* "
    - Inner loop continues, j = 3: print "* "
    - After inner loop finishes, move to next line (System.out.println())

    Third iteration (i = 3):
    - Inner loop starts, j = 1: print "* "
    - Inner loop continues, j = 2: print "* "
    - Inner loop continues, j = 3: print "* "
    - After inner loop finishes, move to next line (System.out.println())

    Final output for Solid Square Pattern:
    
    * * * 
    * * * 
    * * *

    Dry run of Solid Rectangle Pattern:

    l = 3, b = 4
    
    First iteration (i = 1):
    - Inner loop starts, j = 1: print "* "
    - Inner loop continues, j = 2: print "* "
    - Inner loop continues, j = 3: print "* "
    - Inner loop continues, j = 4: print "* "
    - After inner loop finishes, move to next line (System.out.println())

    Second iteration (i = 2):
    - Inner loop starts, j = 1: print "* "
    - Inner loop continues, j = 2: print "* "
    - Inner loop continues, j = 3: print "* "
    - Inner loop continues, j = 4: print "* "
    - After inner loop finishes, move to next line (System.out.println())

    Third iteration (i = 3):
    - Inner loop starts, j = 1: print "* "
    - Inner loop continues, j = 2: print "* "
    - Inner loop continues, j = 3: print "* "
    - Inner loop continues, j = 4: print "* "
    - After inner loop finishes, move to next line (System.out.println())

    Final output for Solid Rectangle Pattern:
    
    * * * * 
    * * * * 
    * * * *

*/

