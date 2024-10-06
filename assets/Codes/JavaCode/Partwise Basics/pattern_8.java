import java.util.Scanner;  
// Importing the Scanner class from the java.util package to allow us to take input from the user.

public class pattern_8 {  
// Declaring a public class named 'pattern_8'. In Java, all code resides inside classes.

    public static void main(String[] args) {  
    // The main method is the entry point of the program, where execution begins.

        Scanner sc = new Scanner(System.in);  
        // Creating a new Scanner object 'sc' to read input from the console.
        
        // ------------- RHOMBUS Pattern -------------

        System.out.print("Enter the Height of Rhombus: ");  
        // Asking the user to input the height of the rhombus.

        int n = sc.nextInt();  
        // Reading the user's input (an integer) and storing it in the variable 'n'.
        // This variable 'n' represents the height of the rhombus, which will be used for the number of rows and columns.

        // Outer loop controlling the number of rows in the rhombus.
        for(int i = 1 ; i <= n ; i++){  
        // 'i' starts from 1 and increments by 1 with each iteration until it reaches 'n'. 
        // This loop controls the rows of the rhombus, so it runs 'n' times.

            // Inner loop for printing spaces before the stars in each row.
            for(int j = 1 ; j <= n - i ; j++){  
            // The loop prints spaces. Initially, it prints 'n - 1' spaces and decreases with each row.
            // This loop ensures that the stars shift to the right, creating the rhombus shape.

                System.out.print("  ");  
                // Printing two spaces. Each pair of spaces helps shift the stars to the right to align them into the shape of a rhombus.

            } // End of the inner loop for spaces.

            // Inner loop for printing stars in each row.
            for(int k = 1 ; k <= n ; k++){  
            // This loop prints stars ('*'). The number of stars in each row remains constant and equals 'n', giving a rectangular look to the rhombus.
            
                System.out.print("* ");  
                // Printing the star ('*') followed by a space for better formatting and alignment.

            } // End of the inner loop for stars.

            System.out.println();  
            // Moves the cursor to the next line after printing one complete row of the rhombus.

        } // End of the outer loop for the rhombus.

        // ------------- DIAMOND Pattern -------------

        System.out.print("Enter the Height of Diamond(m): ");  
        // Asking the user to input the height of the diamond.

        int m = sc.nextInt();  
        // Reading the user's input (an integer) and storing it in the variable 'm'.
        // This variable 'm' will control the number of rows in the top and bottom halves of the diamond.

        // Outer loop for the top half of the diamond.
        for(int i = 1 ; i <= m ; i++){  
        // The loop controls the rows of the top half of the diamond. It runs from 1 to 'm', meaning it runs 'm' times.
        
          // Inner loop for printing spaces before the stars in each row.
          for(int j = 1 ; j <= m - i ; j++){  
          // This loop prints spaces. Initially, it prints 'm - 1' spaces, decreasing with each row.
          // This creates the triangle-like alignment for the top half of the diamond.

              System.out.print("  ");  
              // Print two spaces to align the stars in the center, creating the diamond shape.

          } // End of the inner loop for spaces.

          // Inner loop for printing stars in each row.
          for(int k = (i * 2) - 1 ; k > 0 ; k--){  
          // The number of stars in each row increases in an odd-numbered sequence (1, 3, 5, ...). 
          // This formula ((i * 2) - 1) generates the required number of stars for each row. The loop counts down, so it prints stars in decreasing order.

              System.out.print("* ");  
              // Printing a star ('*') followed by a space for formatting.

          } // End of the inner loop for stars.

          System.out.println();  
          // Moving to the next line after one row is printed.

        } // End of the outer loop for the top half of the diamond.

        // Outer loop for the bottom half of the diamond.
        for(int i = m - 1 ; i >= 1 ; i--){  
        // This loop controls the rows for the bottom half. It starts from 'm-1' and decrements with each iteration, forming the lower half of the diamond.

          // Inner loop for printing spaces before the stars in each row.
          for(int j = 1 ; j <= m - i ; j++){  
          // This loop prints the spaces before the stars. The number of spaces increases with each row, aligning the stars correctly for the bottom half.

            System.out.print("  ");  
            // Printing two spaces for proper alignment of the stars.

          } // End of the inner loop for spaces.

          // Inner loop for printing stars in each row.
          for(int k = (i * 2) - 1 ; k > 0 ; k--){  
          // The formula ((i * 2) - 1) controls the number of stars in each row. 
          // The number of stars decreases in an odd-numbered sequence (m-1 stars, m-3 stars, etc.).

            System.out.print("* ");  
            // Printing a star ('*') followed by a space for formatting.

          } // End of the inner loop for stars.

          System.out.println();  
          // Moving to the next line after one row of stars is printed.

        } // End of the outer loop for the bottom half of the diamond.

    } // End of the main method.

} // End of the class.

/*
    Dry Run of the Code:
    
    Example 1: Rhombus Pattern
    
    Input:
    n = 4

    First iteration (i = 1):
    - j loop: print " " 3 times (because n - i = 4 - 1 = 3)
    - k loop: print "* " 4 times (since 'n' stars are printed per row)
    Output: 
       * * * * 
    
    Second iteration (i = 2):
    - j loop: print " " 2 times (because n - i = 4 - 2 = 2)
    - k loop: print "* " 4 times
    Output: 
       * * * * 
      * * * * 
    
    Third iteration (i = 3):
    - j loop: print " " 1 time (because n - i = 4 - 3 = 1)
    - k loop: print "* " 4 times
    Output: 
       * * * * 
      * * * * 
     * * * * 
    
    Fourth iteration (i = 4):
    - j loop: print " " 0 times (because n - i = 4 - 4 = 0)
    - k loop: print "* " 4 times
    Output: 
       * * * * 
      * * * * 
     * * * * 
    * * * * 

    Full Output of Rhombus Pattern:
       * * * * 
      * * * * 
     * * * * 
    * * * * 

    Example 2: Diamond Pattern
    
    Input:
    m = 3
    
    First iteration (i = 1):
    - j loop: print " " 2 times (because m - i = 3 - 1 = 2)
    - k loop: print "* " 1 time (since (1 * 2) - 1 = 1 star)
    Output: 
        * 
    
    Second iteration (i = 2):
    - j loop: print " " 1 time (because m - i = 3 - 2 = 1)
    - k loop: print "* " 3 times (since (2 * 2) - 1 = 3 stars)
    Output: 
        * 
      * * * 
    
    Third iteration (i = 3):
    - j loop: print " " 0 times (because m - i = 3 - 3 = 0)
    - k loop: print "* " 5 times (since (3 * 2) - 1 = 5 stars)
    Output: 
         * 
       * * * 
     * * * * * 
    
    Bottom half of the diamond:
    
    First iteration (i = 2):
    - j loop: print " " 1 time (because m - i = 3 - 2 = 1)
    - k loop: print "* " 3 times (since (2 * 2) - 1 = 3 stars)
    Output: 
         * 
       * * * 
     * * * * * 
       * * * 
    
    Second iteration (i = 1):
    - j loop: print " " 2 times (because m - i = 3 - 1 = 2)
    - k loop: print "* " 1 time (since (1 * 2) - 1 = 1 star)
    Output: 
         * 
       * * * 
     * * * * * 
       * * * 
         * 
    
    Full Output of Diamond Pattern:
         * 
       * * * 
     * * * * * 
       * * * 
         * 
*/
