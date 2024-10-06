import java.util.Scanner;  
// Importing the Scanner class to allow input from the user.

public class pattern_4 {  
// Declaring the class 'pattern4'.

    public static void main(String[] args) {  
    // The main method, which serves as the entry point of the program.

        Scanner sc = new Scanner(System.in);  
        // Creating a Scanner object 'sc' to take user input.

        // Pyramid Pattern

        System.out.print("Enter the side length of the Triangle: ");   
        // Asking the user to input the side length (height) of the pyramid.

        int n = sc.nextInt();  
        // Storing the user input for the pyramid's height in variable 'n'.

        for(int i = 1 ; i <= n ; i++){  
        // Outer loop to control the number of rows for the pyramid. Runs from 1 to 'n' (height of the pyramid).

            for(int j = 0 ; j <= n - i ; j++){  
            // First inner loop to print spaces before the stars. This ensures that the stars are centered.
            // The number of spaces printed decreases as 'i' increases.

                System.out.print(" ");  
                // Printing a single space to create the required spacing before the stars.

            }

            for(int k = 1 ; k <= i ; k++){  
            // Second inner loop to print the stars. The number of stars increases with each row.
            // It prints 'i' stars, so the number of stars in a row equals the row number.

                System.out.print("* ");  
                // Printing '*' followed by a space to create the pyramid shape.

            }

            System.out.println();  
            // Moving to the next line after printing each row of the pyramid.

        }

        // Inverted Pyramid Pattern.

        System.out.print("Enter the side length of the Triangle: ");   
        // Asking the user to input the side length (height) of the inverted pyramid.

        int m = sc.nextInt();  
        // Storing the user input for the inverted pyramid's height in variable 'm'.

        for(int i = 1 ; i <= m ; i++){  
        // Outer loop to control the number of rows for the inverted pyramid. Runs from 1 to 'm'.

            for(int j = 1 ; j < i ; j++){  
            // First inner loop to print spaces before the stars. The number of spaces increases with each row.

                System.out.print(" ");  
                // Printing a single space for alignment.

            }

            for(int k = 0 ; k <= m - i ; k++){  
            // Second inner loop to print the stars. The number of stars decreases with each row.
            // The number of stars printed is 'm - i' for each row.

                System.out.print("* ");  
                // Printing '*' followed by a space to create the inverted pyramid shape.

            }

            System.out.println();  
            // Moving to the next line after printing each row of the inverted pyramid.

        }

    }
}

/*
    Explanation:

    1. The program prints two patterns: a pyramid and an inverted pyramid.
    2. For the pyramid pattern:
        - The number of rows is determined by the user input 'n'.
        - The number of spaces before the stars decreases as you go down each row, creating the shape of a pyramid.
        - The number of stars in each row increases with each row, forming the pyramid structure.
    3. For the inverted pyramid pattern:
        - The number of rows is determined by the user input 'm'.
        - The number of spaces increases with each row to create the alignment for the inverted pyramid.
        - The number of stars decreases with each row, forming the inverted pyramid.

*/

/*
    Dry run of the code:

    Example 1: Pyramid Pattern

    Input:
    n = 4

    First iteration (i = 1):
    - j loop: print "   " (3 spaces)
    - k loop: print "*"
    Output: 
       * 

    Second iteration (i = 2):
    - j loop: print "  " (2 spaces)
    - k loop: print "* *"
    Output: 
      * * 

    Third iteration (i = 3):
    - j loop: print " " (1 space)
    - k loop: print "* * *"
    Output: 
     * * * 

    Fourth iteration (i = 4):
    - j loop: print "" (0 spaces)
    - k loop: print "* * * *"
    Output: 
    * * * * 

    Full Output:
       * 
      * * 
     * * * 
    * * * * 

    Example 2: Inverted Pyramid Pattern

    Input:
    m = 4

    First iteration (i = 1):
    - j loop: no spaces
    - k loop: print "* * * *"
    Output: 
    * * * * 

    Second iteration (i = 2):
    - j loop: print " " (1 space)
    - k loop: print "* * *"
    Output: 
     * * * 

    Third iteration (i = 3):
    - j loop: print "  " (2 spaces)
    - k loop: print "* *"
    Output: 
      * * 

    Fourth iteration (i = 4):
    - j loop: print "   " (3 spaces)
    - k loop: print "*"
    Output: 
       * 

    Full Output:
    * * * * 
     * * * 
      * * 
       * 
*/
