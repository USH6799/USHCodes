import java.util.Scanner;  
// Importing the Scanner class to take input from the user.

public class pattern_5 {  
// Declaring the class 'pattern5'.

    public static void main(String[] args) {  
    // The main method, which is the entry point of the program.

        Scanner sc = new Scanner(System.in);  
        // Creating a Scanner object 'sc' to allow user input.

        System.out.print("Enter the number of rows(n): ");  
        // Asking the user to input the number of rows for the first pattern.

        int n = sc.nextInt();  
        // Storing the user input for the number of rows in variable 'n'.

        // Number Pattern

        for(int i = 1 ; i <= n ; i++){  
        // Outer loop to control the rows for the number pattern. Runs from 1 to 'n'.

            for(int j = 1 ; j <= i ; j++){  
            // Inner loop to print numbers from 1 to the current row number (i). 
            // In each row, 'j' runs from 1 to 'i', printing numbers.

                System.out.print(j + " ");  
                // Printing the current number 'j' followed by a space to create the number pattern.

            }

            System.out.println();  
            // Moving to the next line after printing each row.

        }

        // Inverted Number Pattern

        System.out.print("Enter the No. of Rows in Inverted Number Pattern(m): ");  
        // Asking the user to input the number of rows for the inverted number pattern.

        int m = sc.nextInt();  
        // Storing the user input for the number of rows in variable 'm'.

        for(int i = m ; i >= 1 ; i--){  
        // Outer loop to control the rows for the inverted number pattern. Runs from 'm' down to 1.
        // The number of rows decreases as 'i' decreases.

            for(int j = 1 ; j <= i ; j++){  
            // Inner loop to print numbers from 1 to the current row number (i). 
            // The number of numbers printed decreases with each row.

                System.out.print(j + " ");  
                // Printing the current number 'j' followed by a space to create the inverted number pattern.

            }

            System.out.println();  
            // Moving to the next line after printing each row of the inverted number pattern.

        }

    }

}

/*
    Explanation:

    1. The program prints two patterns: a number pattern and an inverted number pattern.
    2. For the number pattern:
        - The number of rows is determined by the user input 'n'.
        - In each row, the program prints numbers starting from 1 and ending at the current row number.
    3. For the inverted number pattern:
        - The number of rows is determined by the user input 'm'.
        - In each row, the program prints numbers starting from 1 and ending at the current row number, 
          but the rows decrease as the loop progresses.
*/

/*
    Dry Run of the Code:

    Example 1: Number Pattern

    Input:
    n = 4

    First iteration (i = 1):
    - j loop: print "1"
    Output: 
    1 

    Second iteration (i = 2):
    - j loop: print "1 2"
    Output: 
    1 
    1 2 

    Third iteration (i = 3):
    - j loop: print "1 2 3"
    Output: 
    1 
    1 2 
    1 2 3 

    Fourth iteration (i = 4):
    - j loop: print "1 2 3 4"
    Output: 
    1 
    1 2 
    1 2 3 
    1 2 3 4 

    Full Output of Number Pattern:
    1 
    1 2 
    1 2 3 
    1 2 3 4 

    Example 2: Inverted Number Pattern

    Input:
    m = 4

    First iteration (i = 4):
    - j loop: print "1 2 3 4"
    Output: 
    1 2 3 4 

    Second iteration (i = 3):
    - j loop: print "1 2 3"
    Output: 
    1 2 3 4 
    1 2 3 

    Third iteration (i = 2):
    - j loop: print "1 2"
    Output: 
    1 2 3 4 
    1 2 3 
    1 2 

    Fourth iteration (i = 1):
    - j loop: print "1"
    Output: 
    1 2 3 4 
    1 2 3 
    1 2 
    1 

    Full Output of Inverted Number Pattern:
    1 2 3 4 
    1 2 3 
    1 2 
    1 
*/

