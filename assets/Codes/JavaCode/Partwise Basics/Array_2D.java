import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        
        // An array inside another array is called a 2D array or a matrix.
        // In a 2D array, each element itself is an array. Think of it like a grid of rows and columns.
        // We are going to use a 2D array in this program, which will help us store data in a matrix form.

        // Syntax of declaring a 2D array:
        // <datatype>[][] <arrayname> = new <datatype>[rows][columns];
        // This defines an array with a specific number of rows and columns.

        // Let's represent this matrix example visually:
        /*
        
            [ 0,0 | 0,1 | 0,2 | 0,3 ]  -> Row 0
            [ 1,0 | 1,1 | 1,2 | 1,3 ]  -> Row 1
            [ 2,0 | 2,1 | 2,2 | 2,3 ]  -> Row 2
            [ 3,0 | 3,1 | 3,2 | 3,3 ]  -> Row 3
            [ 4,0 | 4,1 | 4,2 | 4,3 ]  -> Row 4

        */
        
        // Now, we will create a 2D array of integers with 5 rows and 4 columns.
        int[][] arr = new int[5][4];

        // 'arr' is a 2D array of integer type with 5 rows and 4 columns.
        // Initially, all values in the array will be set to 0 (the default value for integers in Java).

        // Let's assign a value to the first element at row 0, column 0.
        arr[0][0] = 10;  // Setting the value of the first element to 10.
        
        // ---------------------------------------------------------------------

        // Now, we will take input from the user to create and fill a 2D array.
        
        Scanner sc = new Scanner(System.in); // Scanner object to take input from the user.

        // Asking the user to enter the number of rows for the 2D array.
        System.out.print("Enter the No. of Rows: ");
        int row = sc.nextInt();  // User input for the number of rows.

        // Asking the user to enter the number of columns for the 2D array.
        System.out.print("Enter the No. of Columns: ");
        int column = sc.nextInt();  // User input for the number of columns.

        // Declaring a 2D array called 'numbers' with user-specified rows and columns.
        int[][] numbers = new int[row][column];

        // Now, let's take input for each cell in the 2D array from the user.

        // Outer loop for iterating through each row.
        for(int i = 0; i < row; i++) {
            
            // Inner loop for iterating through each column in the current row.
            for(int j = 0; j < column; j++) {

                // Asking the user to input the value for each cell in the array.
                System.out.print("Enter the Value of [" + i + "] [" + j + "]: ");
                numbers[i][j] = sc.nextInt();  // Assigning the input value to the corresponding cell.
            }
        }

        // Dry run of filling the array:
        
        /*

        Suppose the user inputs a 2x2 matrix.

        Step-by-step execution:
        - i = 0, j = 0 -> Prompt: "Enter the Value of [0][0]:", User enters: 5 -> numbers[0][0] = 5
        - i = 0, j = 1 -> Prompt: "Enter the Value of [0][1]:", User enters: 7 -> numbers[0][1] = 7
        - i = 1, j = 0 -> Prompt: "Enter the Value of [1][0]:", User enters: 9 -> numbers[1][0] = 9
        - i = 1, j = 1 -> Prompt: "Enter the Value of [1][1]:", User enters: 2 -> numbers[1][1] = 2
        
        Final matrix:
        [ 5  7 ]
        [ 9  2 ]

        */

        // -----------------------------------------------------------------------

        // Now let's print the 2D array as a matrix.

        // Outer loop to iterate through each row.
        for(int i = 0; i < row; i++) {

            // Inner loop to iterate through each column in the current row.
            for(int j = 0; j < column; j++) {

                // Print the value at current row and column followed by a space.
                System.out.print(numbers[i][j] + "  ");
            }

            // Print a new line after each row to make it look like a matrix.
            System.out.println();
        }

        // Dry run of printing the array:

        /*

        For the previous 2x2 matrix example:
        Step-by-step execution:

        - i = 0, j = 0 -> print: "5  "

        - i = 0, j = 1 -> print: "7  ", then move to the next line (System.out.println())

        - i = 1, j = 0 -> print: "9  "

        - i = 1, j = 1 -> print: "2  ", then move to the next line (System.out.println())
        
        Final output:
        5  7  
        9  2

        */

        // ------------------------------------------------------------------------

        // Question 1. Take a 2D array as input from the user and search for a number in the array.

        // Prompt the user to enter the number of rows for the matrix
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt(); // Read the number of rows
        
        
        // Prompt the user to enter the number of columns for the matrix
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt(); // Read the number of columns
        
        
        // Create a 2D array (matrix) with the specified number of rows and columns
        int[][] matrix = new int[r][c]; 
        
        // Taking input for the matrix
        for (int i = 0; i < r; i++) { // Loop through each row
            
            for (int j = 0; j < c; j++) { // Loop through each column
                
                // Prompt the user to enter a value for the current position in the matrix
                System.out.print("Enter the value at [" + i + "][" + j + "]: "); 
                matrix[i][j] = sc.nextInt(); // Store the input value in the matrix
            }
        }
        
        // Prompt the user to enter the number to search for in the matrix
        System.out.print("Enter the number you want to search: "); 
        int x = sc.nextInt(); // Read the number to search
        
        
        // Initialize a flag to check if the number is found
        boolean found = false; 
        
        // Loop through each element in the matrix to search for the number
        for (int i = 0; i < r; i++) { // Loop through each row
            
            for (int j = 0; j < c; j++) { // Loop through each column
                
                // Check if the current element matches the number we're searching for
                if (matrix[i][j] == x) { 
                    
                    // If found, print the index and set the flag to true
                    System.out.println("The index of the number " + x + " is " + i + " and " + j);
                    found = true; // Mark as found
                    break; // Exit the inner loop
                }
            }
            
            if (found) {
                break; // Exit the outer loop if the number is found
            }
        }
        
        // If the number was not found, print a message
        if (!found) {
            System.out.println("Number " + x + " not found in the matrix.");
        }
    }
}

/*
Dry Run of the Code:

Let's assume the following input during the execution of the code:

- Number of rows (r): 3
- Number of columns (c): 3
- Matrix values:
    Enter the value at [0][0]: 1
    Enter the value at [0][1]: 2
    Enter the value at [0][2]: 3
    Enter the value at [1][0]: 4
    Enter the value at [1][1]: 5
    Enter the value at [1][2]: 6
    Enter the value at [2][0]: 7
    Enter the value at [2][1]: 8
    Enter the value at [2][2]: 9
- Number to search (x): 5

Step-by-Step Execution:

1. Initialize Scanner.
2. Prompt for rows (r) = 3.
3. Prompt for columns (c) = 3.
4. Create a 2D array: matrix[3][3].
5. Start input loop for matrix:
    - i = 0:
        - j = 0: Enter value 1 → matrix[0][0] = 1
        - j = 1: Enter value 2 → matrix[0][1] = 2
        - j = 2: Enter value 3 → matrix[0][2] = 3
    - i = 1:
        - j = 0: Enter value 4 → matrix[1][0] = 4
        - j = 1: Enter value 5 → matrix[1][1] = 5
        - j = 2: Enter value 6 → matrix[1][2] = 6
    - i = 2:
        - j = 0: Enter value 7 → matrix[2][0] = 7
        - j = 1: Enter value 8 → matrix[2][1] = 8
        - j = 2: Enter value 9 → matrix[2][2] = 9
6. End of input loop.
7. Prompt for number to search (x) = 5.
8. Start search loop:
    - i = 0:
        - j = 0: matrix[0][0] = 1 (not found)
        - j = 1: matrix[0][1] = 2 (not found)
        - j = 2: matrix[0][2] = 3 (not found)
    - i = 1:
        - j = 0: matrix[1][0] = 4 (not found)
        - j = 1: matrix[1][1] = 5 (found)
        - Found at index (1, 1).
9. Print: "The index of the number 5 is 1 and 1".
10. The program exits.
*/


// SOME PRACTICE QUESTIONS:-

// Question 1. Write the Code to Add two Matrix and Display the New Matrix Formed.

/*
    Example:-

    [1  2  4]     [2  3  4]    [3  5  8]
    [3  4  6]  +  [1  3  5] => [4  7 11]
    [2  5  0]     [6  7  8]    [8  12 8] 

*/

// Question 2. Write the Code to Subtract two Matrix and Display the New Matrix Formed.

/*
    Example:-

    [6  5  4]     [2  3  4]    [4  2  0]
    [3  4  6]  -  [1  3  5] => [2  1  1]
    [7  9  9]     [6  7  8]    [1  2  1] 
    
 */


// Question 3. Write the Code to Transpose a Given matrix and Display the New Matrix.
    // Transpose means if a matrix of (row X column) then the new matrix will be (column X row).

    /*
        Example:-

        [6  5  4]       [6  3]
        [3  4  6]  =>   [5  4]
                        [4  6]

 */

// The answers are provided in Next Chapter but first try yourself to Do this.

