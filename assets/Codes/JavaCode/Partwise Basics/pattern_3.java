import java.util.Scanner;  
// Importing the Scanner class to take input from the user.

public class pattern_3 {  
// Declaring the class 'pattern3'.

    public static void main(String[] args) {  
    // Main method, the entry point of the program.

        Scanner sc = new Scanner(System.in);  
        // Creating a Scanner object 'sc' to capture user input.

        // Right-Angled Triangle Pattern.

        System.out.print("Enter the side length of the triangle: ");  
        // Asking the user to input the side length of the triangle (height of the triangle).

        int n = sc.nextInt();  
        // Storing the user's input for the triangle's height in variable 'n'.

        for(int i = 1 ; i <= n ; i++){  
        // Outer loop to control the number of rows for the triangle. Runs from 1 to 'n'.
        
            for(int j = 1 ; j <= i ; j++){  
            // Inner loop to control the number of '*' in each row. It runs from 1 to 'i'.

                System.out.print("* ");  
                // Prints '*' followed by a space, forming the triangle pattern.
            }

            System.out.println();  
            // After printing a row of '*', it moves to the next line to start the next row.

        }

        // Inverted Triangle Pattern.

        System.out.print("Enter the side length of the Inverted triangle: ");  
        // Asking the user to input the side length of the inverted triangle (height of the triangle).

        int m = sc.nextInt();  
        // Storing the user's input for the height of the inverted triangle in variable 'm'.

        for(int i = 0 ; i < m ; i++){  
        // Outer loop controls the number of rows for the inverted triangle.

            for(int j = 0 ; j < m - i ; j++){  
            // Inner loop controls the number of '*' in each row.
            // Prints 'm - i' stars for each row.

                System.out.print("* ");  
                // Prints '*' followed by a space to form the inverted triangle pattern.
            }

            System.out.println();  
            // After printing a row, it moves to the next line to start the next row.

        }

        // Rotated (180°) Right-Angled Triangle.

        System.out.print("Enter the side length of the Triangle: ");   
        // Asking for user input for the height of the rotated triangle.

        int x = sc.nextInt();  
        // Storing the side length of the triangle in variable 'x'.

        for(int i = 1 ; i <= x ; i++){  
        // Outer loop for the number of rows of the rotated triangle.

            for(int j = 0 ; j <= x - i ; j++){  
            // Inner loop to print spaces before the '*'. It prints 'x - i' spaces for each row.

                System.out.print("  ");  
                // Printing two spaces to align the triangle to the right.

            }

            for(int k = 1 ; k <= i ; k++){  
            // Another inner loop to print the '*' for each row. The number of '*' increases with each row.

                System.out.print("* ");  
                // Printing '* ' for each iteration of 'k'.

            }

            System.out.println();  
            // Moving to the next line after each row is printed.

        }

        // Rotated (180°) Inverted Triangle.

        System.out.print("Enter the side length of the Triangle: ");   
        // Asking for user input for the height of the rotated inverted triangle.

        int y = sc.nextInt();  
        // Storing the side length of the triangle in variable 'y'.

        for(int i = 1 ; i <= y ; i++){  
        // Outer loop for the number of rows for the rotated inverted triangle.

            for(int j = 1 ; j < i ; j++){  
            // Inner loop to print spaces before the '*'. It prints 'i - 1' spaces for each row.

                System.out.print("  ");  
                // Printing two spaces to align the triangle to the right.

            }

            for(int k = 0 ; k <= y - i ; k++){  
            // Another inner loop to print the '*' for each row. The number of '*' decreases with each row.

                System.out.print("* ");  
                // Printing '* ' for each iteration of 'k'.

            }

            System.out.println();  
            // Moving to the next line after each row is printed.

        }
    }
}

/*
    Explanation:

    1. This program prints four patterns: a right-angled triangle, an inverted triangle, a rotated (180°) triangle, and a rotated inverted triangle.
    2. The user is first prompted to enter the height 'n' for the right-angled triangle.
    3. For the right-angled triangle, the number of stars increases with each row, starting from 1 star to 'n' stars.
    4. Then, the user is asked to input the height 'm' for the inverted triangle, where the number of stars decreases with each row.
    5. Next, the user is prompted to input 'x', the height of the rotated (180°) triangle, which prints a right-angled triangle aligned to the right.
    6. Finally, the user inputs 'y', the height of the rotated inverted triangle, which prints a right-aligned inverted triangle.
*/

/*
    Dry run of the code:

    Example 1: Right-Angled Triangle

    Input:
    n = 3

    First iteration (i = 1):
    - j = 1: print "*"
    - Move to the next line.

    Second iteration (i = 2):
    - j = 1: print "*"
    - j = 2: print "*"
    - Move to the next line.

    Third iteration (i = 3):
    - j = 1: print "*"
    - j = 2: print "*"
    - j = 3: print "*"
    - Move to the next line.

    Output:

    * 
    * * 
    * * * 

    Example 2: Inverted Triangle

    Input:
    m = 3

    First iteration (i = 0):
    - j = 0, 1, 2: print "* * *"
    - Move to the next line.

    Second iteration (i = 1):
    - j = 0, 1: print "* *"
    - Move to the next line.

    Third iteration (i = 2):
    - j = 0: print "*"
    - Move to the next line.

    Output:

    * * * 
    * * 
    * 

    Example 3: Rotated (180°) Right-Angled Triangle

    Input:
    x = 3

    First iteration (i = 1):
    - j = 1, 2: print "  "
    - k = 1: print "*"
    - Move to the next line.

    Second iteration (i = 2):
    - j = 1: print "  "
    - k = 1, 2: print "* *"
    - Move to the next line.

    Third iteration (i = 3):
    - k = 1, 2, 3: print "* * *"
    - Move to the next line.

    Output:

        * 
      * * 
    * * * 

    Example 4: Rotated (180°) Inverted Triangle

    Input:
    y = 3

    First iteration (i = 1):
    - k = 0, 1, 2: print "* * *"
    - Move to the next line.

    Second iteration (i = 2):
    - j = 1: print "  "
    - k = 0, 1: print "* *"
    - Move to the next line.

    Third iteration (i = 3):
    - j = 1, 2: print "  "
    - k = 0: print "*"
    - Move to the next line.

    Output:

    * * * 
      * * 
        * 
*/
