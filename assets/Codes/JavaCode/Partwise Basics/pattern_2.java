import java.util.Scanner;  
// Importing the Scanner class to allow user input.

public class pattern_2 {  
// Declaring the class named 'pattern2'.

    public static void main(String[] args) {  
    // Main method, the entry point of the program.

        Scanner sc = new Scanner(System.in);  
        // Creating a Scanner object 'sc' to capture user input.

        // Hollow Square Pattern.

        System.out.println("Enter the side length of the square: ");  
        // Asking the user to input the side length of the hollow square.

        int s = sc.nextInt();  
        // Storing the user input for the side length in variable 's'.

        for (int i = 1; i <= s; i++) {  
        // Outer loop to handle rows. It runs 's' times (from 1 to 's').

            for (int j = 1; j <= s; j++) {  
            // Inner loop to handle columns. It runs 's' times (from 1 to 's').

                if (i == 1 || i == s || j == 1 || j == s) {  
                // If condition to print '*' on the boundary (top, bottom, left, or right edges).
                // This happens when the row is either the first or last (i == 1 or i == s),
                // or when the column is either the first or last (j == 1 or j == s).

                    System.out.print("* ");  
                    // Printing '*' at the boundary positions.

                } else {  
                // If the current position is not on the boundary, print a space.

                    System.out.print("  ");  
                    // Printing a double space to maintain proper alignment for the hollow part.

                }
            }

            System.out.println();  
            // Move to the next line after completing a row of the square.
        }

        // Hollow Rectangle Pattern.

        System.out.println("Enter the length of the rectangle: ");  
        // Asking the user to input the length of the hollow rectangle.

        int l = sc.nextInt();  
        // Storing the user input for the length in variable 'l'.

        System.out.println("Enter the breadth of the rectangle: ");  
        // Asking the user to input the breadth of the hollow rectangle.

        int b = sc.nextInt();  
        // Storing the user input for the breadth in variable 'b'.

        for (int i = 1; i <= l; i++) {  
        // Outer loop to handle rows, runs 'l' times (from 1 to 'l').

            for (int j = 1; j <= b; j++) {  
            // Inner loop to handle columns, runs 'b' times (from 1 to 'b').

                if (i == 1 || i == l || j == 1 || j == b) {  
                // If condition to print '*' on the boundary (top, bottom, left, or right edges).
                // This happens when the row is either the first or last (i == 1 or i == l),
                // or when the column is either the first or last (j == 1 or j == b).

                    System.out.print("* ");  
                    // Printing '*' at the boundary positions.

                } else {  
                // If the current position is not on the boundary, print a space.

                    System.out.print("  ");  
                    // Printing a double space to maintain proper alignment for the hollow part.

                }
            }

            System.out.println();  
            // Move to the next line after completing a row of the rectangle.
        }
    }
}

/*
    Explanation of the logic:
    
    1. Hollow Square Pattern:
    - The pattern is a square with side length 's', where the boundary is made of '*'
      and the inner area is hollow (spaces).
    - For example, if the user inputs s = 5, the output will be:

        * * * * * 
        *       *
        *       *
        *       *
        * * * * *

    2. Hollow Rectangle Pattern:
    - The pattern is a rectangle with different length 'l' and breadth 'b', where the
      boundary is made of '*' and the inner area is hollow (spaces).
    - For example, if the user inputs l = 4 and b = 6, the output will be:

        * * * * * * 
        *         *
        *         *
        * * * * * *
*/

/*
    Dry run of the code:

    Input:
    - Side of Square (s): 5
    - Length of Rectangle (l): 4
    - Breadth of Rectangle (b): 6

    Dry run of Hollow Square Pattern:
    
    s = 5

    First iteration (i = 1):
    - j = 1: print "*" (boundary)
    - j = 2: print "*" (boundary)
    - j = 3: print "*" (boundary)
    - j = 4: print "*" (boundary)
    - j = 5: print "*" (boundary)
    - Move to the next line.

    Second iteration (i = 2):
    - j = 1: print "*" (left boundary)
    - j = 2: print " " (hollow space)
    - j = 3: print " " (hollow space)
    - j = 4: print " " (hollow space)
    - j = 5: print "*" (right boundary)
    - Move to the next line.

    Third iteration (i = 3):
    - j = 1: print "*" (left boundary)
    - j = 2: print " " (hollow space)
    - j = 3: print " " (hollow space)
    - j = 4: print " " (hollow space)
    - j = 5: print "*" (right boundary)
    - Move to the next line.

    Fourth iteration (i = 4):
    - j = 1: print "*" (left boundary)
    - j = 2: print " " (hollow space)
    - j = 3: print " " (hollow space)
    - j = 4: print " " (hollow space)
    - j = 5: print "*" (right boundary)
    - Move to the next line.

    Fifth iteration (i = 5):
    - j = 1: print "*" (boundary)
    - j = 2: print "*" (boundary)
    - j = 3: print "*" (boundary)
    - j = 4: print "*" (boundary)
    - j = 5: print "*" (boundary)
    - Move to the next line.

    Final output for Hollow Square Pattern:
    
    * * * * *
    *       *
    *       *
    *       *
    * * * * *

    Dry run of Hollow Rectangle Pattern:

    l = 4, b = 6

    First iteration (i = 1):
    - j = 1: print "*" (boundary)
    - j = 2: print "*" (boundary)
    - j = 3: print "*" (boundary)
    - j = 4: print "*" (boundary)
    - j = 5: print "*" (boundary)
    - j = 6: print "*" (boundary)
    - Move to the next line.

    Second iteration (i = 2):
    - j = 1: print "*" (left boundary)
    - j = 2: print " " (hollow space)
    - j = 3: print " " (hollow space)
    - j = 4: print " " (hollow space)
    - j = 5: print " " (hollow space)
    - j = 6: print "*" (right boundary)
    - Move to the next line.

    Third iteration (i = 3):
    - j = 1: print "*" (left boundary)
    - j = 2: print " " (hollow space)
    - j = 3: print " " (hollow space)
    - j = 4: print " " (hollow space)
    - j = 5: print " " (hollow space)
    - j = 6: print "*" (right boundary)
    - Move to the next line.

    Fourth iteration (i = 4):
    - j = 1: print "*" (boundary)
    - j = 2: print "*" (boundary)
    - j = 3: print "*" (boundary)
    - j = 4: print "*" (boundary)
    - j = 5: print "*" (boundary)
    - j = 6: print "*" (boundary)
    - Move to the next line.

    Final output for Hollow Rectangle Pattern:
    
    * * * * * *
    *         *
    *         *
    * * * * * *
*/
