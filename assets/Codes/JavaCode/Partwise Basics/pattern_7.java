import java.util.Scanner;  
// Importing the Scanner class to take input from the user.

public class pattern_7 {  
// Declaring the class 'pattern7'.

    public static void main(String[] args) {  
    // The main method, which is the entry point of the program.

        Scanner sc = new Scanner(System.in);  
        // Creating a Scanner object 'sc' to allow user input.

        // Butterfly Pattern

        System.out.print("Enter the No. of Rows(n): ");  
        // Asking the user to input the number of rows for the butterfly pattern.

        int n = sc.nextInt();  
        // Storing the user input for the number of rows in variable 'n'.

        // Upper Half of the Butterfly

        for(int i = 0 ; i < n ; i++){  
        // Outer loop to control the number of rows for the upper half of the butterfly pattern.

            // 1st Stars (left wing)
            for(int j = 0 ; j <= i ; j++){  
            // Printing '*' for the left half of the butterfly. 
            // The number of stars increases as the row number increases.

                System.out.print("* ");  
                // Printing a star followed by a space.
            }

            // Spaces in the middle
            for(int k = 1 ; k < n - i ; k++){  
            // Printing spaces between the two wings of the butterfly.
            // The number of spaces decreases as the row number increases.

                System.out.print("    ");  
                // Printing four spaces to create the gap between the two star wings.
            }

            // 2nd Stars (right wing)
            for(int j = 0 ; j <= i ; j++){  
            // Printing '*' for the right half of the butterfly. 
            // The number of stars increases as the row number increases.

                System.out.print("* ");  
                // Printing a star followed by a space.
            }

            System.out.println();  
            // Moving to the next line after completing one row of the butterfly.
        }

        // Lower Half of the Butterfly

        for(int i = 0 ; i < n ; i++){  
        // Outer loop to control the number of rows for the lower half of the butterfly pattern.

            // 1st Stars (left wing)
            for(int j = i ; j < n ; j++){  
            // Printing '*' for the left half of the butterfly. 
            // The number of stars decreases as the row number increases.

                System.out.print("* ");  
                // Printing a star followed by a space.
            }

            // Spaces in the middle
            for(int k = 1 ; k <= i ; k++){  
            // Printing spaces between the two wings of the butterfly.
            // The number of spaces increases as the row number increases.

                System.out.print("    ");  
                // Printing four spaces to create the gap between the two star wings.
            }

            // 2nd Stars (right wing)
            for(int j = i ; j < n ; j++){  
            // Printing '*' for the right half of the butterfly. 
            // The number of stars decreases as the row number increases.

                System.out.print("* ");  
                // Printing a star followed by a space.
            }

            System.out.println();  
            // Moving to the next line after completing one row of the butterfly.
        }

    }
}

/*
    Explanation:
    - The program prints a butterfly pattern based on the number of rows entered by the user.
    - The butterfly consists of two parts: an expanding upper half and a shrinking lower half.
    - In the upper half:
        - The number of stars on the left and right wings increases with each row.
        - The number of spaces between the wings decreases with each row.
    - In the lower half:
        - The number of stars on the left and right wings decreases with each row.
        - The number of spaces between the wings increases with each row.
*/

/*
    Dry Run of the Code:

    Input:
    n = 4

    Upper Half:
    
    First iteration (i = 0):
    - Left wing: print "* "
    - Spaces: print "      " (3 spaces)
    - Right wing: print "* "
    Output: 
    *           *

    Second iteration (i = 1):
    - Left wing: print "* * "
    - Spaces: print "    " (2 spaces)
    - Right wing: print "* * "
    Output: 
    *           *
    * *       * *

    Third iteration (i = 2):
    - Left wing: print "* * * "
    - Spaces: print "  " (1 space)
    - Right wing: print "* * * "
    Output: 
    *           *
    * *       * *
    * * *   * * *

    Fourth iteration (i = 3):
    - Left wing: print "* * * * "
    - Spaces: print "" (no space)
    - Right wing: print "* * * * "
    Output: 
    *           *
    * *       * *
    * * *   * * *
    * * * * * * *

    Lower Half:

    First iteration (i = 0):
    - Left wing: print "* * * * "
    - Spaces: print "" (no space)
    - Right wing: print "* * * * "
    Output: 
    *           *
    * *       * *
    * * *   * * *
    * * * * * * *
    * * * * * * *

    Second iteration (i = 1):
    - Left wing: print "* * * "
    - Spaces: print "  " (1 space)
    - Right wing: print "* * * "
    Output: 
    *           *
    * *       * *
    * * *   * * *
    * * * * * * *
    * * * * * * *
    * * *   * * *

    Third iteration (i = 2):
    - Left wing: print "* * "
    - Spaces: print "    " (2 spaces)
    - Right wing: print "* * "
    Output: 
    *           *
    * *       * *
    * * *   * * *
    * * * * * * *
    * * * * * * *
    * * *   * * *
    * *       * *

    Fourth iteration (i = 3):
    - Left wing: print "* "
    - Spaces: print "      " (3 spaces)
    - Right wing: print "* "
    Output: 
    *           *
    * *       * *
    * * *   * * *
    * * * * * * *
    * * * * * * *
    * * *   * * *
    * *       * *
    *           *

    Final Output:
    *           *
    * *       * *
    * * *   * * *
    * * * * * * *
    * * * * * * *
    * * *   * * *
    * *       * *
    *           *

*/
