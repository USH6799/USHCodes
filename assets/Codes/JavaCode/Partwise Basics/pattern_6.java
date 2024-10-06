import java.util.Scanner;  
// Importing the Scanner class to take input from the user.

public class pattern_6 {  
// Declaring the class 'pattern6'.

    public static void main(String[] args) {  
    // The main method, which is the entry point of the program.

        Scanner sc = new Scanner(System.in);  
        // Creating a Scanner object 'sc' to allow user input.

        // Floyd Triangle

        System.out.print("Enter the Number of Rows: ");  
        // Asking the user to input the number of rows for Floyd's Triangle.

        int n = sc.nextInt();  
        // Storing the user input for the number of rows in variable 'n'.

        int a = 1;  
        // Initializing the integer 'a' to 1. This will be the first number in Floyd's Triangle.

        for(int i = 1 ; i <= n ; i++){  
        // Outer loop to control the number of rows for Floyd's Triangle. Runs from 1 to 'n'.

            for(int j = 1; j <= i ; j++){  
            // Inner loop to print numbers in each row. The number of columns (numbers) increases with each row.

                System.out.print(a++ + " ");  
                // Printing the value of 'a' and then incrementing it by 1 for the next position.

            }

            System.out.println();  
            // Moving to the next line after printing each row of Floyd's Triangle.

        }

        // Binary Pattern

        System.out.print("Enter the Number of Rows: ");  
        // Asking the user to input the number of rows for the binary pattern.

        int m = sc.nextInt();  
        // Storing the user input for the number of rows in variable 'm'.

        for(int i = 1 ; i <= m ; i++){  
        // Outer loop to control the number of rows for the binary pattern. Runs from 1 to 'm'.

            for(int j = 1; j <= i ; j++){  
            // Inner loop to print either 1 or 0 based on the current value of 'j' and 'i'.

                int num = ((j + i) % 2 == 0) ? 1 : 0;  
                // Calculating the binary value based on both row (i) and column (j). 
                // When the sum of 'i' and 'j' is even, it prints '1', otherwise '0'.

                System.out.print(num + " ");  
                // Printing the calculated binary value.

            }

            System.out.println();  
            // Moving to the next line after printing each row of the binary pattern.

        }

    }

}

/*
    Explanation:

    1. Floyd's Triangle:
        - The number of rows is determined by user input 'n'.
        - Floyd's Triangle starts with 1 and continues sequentially, increasing by 1 with each number.
        - The number of numbers in each row increases as you go down the triangle.

    2. Binary Pattern:
        - The number of rows is determined by user input 'm'.
        - For each row, the numbers alternate between 1 and 0 based on both the row and column index.
        - If the sum of the row number 'i' and column number 'j' is even, it prints 1; if odd, it prints 0.
*/

/*
    Dry Run of the Code:

    Example 1: Floyd's Triangle

    Input:
    n = 4

    First iteration (i = 1):
    - j loop: print "1"
    a is incremented to 2
    Output: 
    1 

    Second iteration (i = 2):
    - j loop: print "2 3"
    a is incremented to 4
    Output: 
    1 
    2 3 

    Third iteration (i = 3):
    - j loop: print "4 5 6"
    a is incremented to 7
    Output: 
    1 
    2 3 
    4 5 6 

    Fourth iteration (i = 4):
    - j loop: print "7 8 9 10"
    a is incremented to 11
    Output: 
    1 
    2 3 
    4 5 6 
    7 8 9 10 

    Full Output of Floyd's Triangle:
    1 
    2 3 
    4 5 6 
    7 8 9 10 

    Example 2: Binary Pattern

    Input:
    m = 4

    First iteration (i = 1):
    - j loop: print "1"
    Output: 
    1 

    Second iteration (i = 2):
    - j loop: print "0 1"
    Output: 
    1 
    0 1 

    Third iteration (i = 3):
    - j loop: print "1 0 1"
    Output: 
    1 
    0 1 
    1 0 1 

    Fourth iteration (i = 4):
    - j loop: print "0 1 0 1"
    Output: 
    1 
    0 1 
    1 0 1 
    0 1 0 1 

    Full Output of Binary Pattern:
    1 
    0 1 
    1 0 1 
    0 1 0 1 
*/
