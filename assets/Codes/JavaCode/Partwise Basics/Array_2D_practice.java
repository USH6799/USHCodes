import java.util.Scanner;  // Importing Scanner class for taking input from user.

public class Array_2D_practice {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // SOME PRACTICE QUESTIONS:
        // -------------------------------------------------------------

        // Question 1:
        // Write the code to add two matrices and display the new matrix formed.

        // Question 2:
        // Write the code to subtract two matrices and display the new matrix formed.

        // Question 3:
        // Write the code to transpose a given matrix and display the new matrix.
        // Transpose means if a matrix is of (row X column), then the new matrix will be (column X row).

        // -------------------------------------------------------------

        // Displaying instructions on how to input a matrix.
        System.out.println("How to Input a Matrix:- ");

        System.out.println("If row = 3 and col = 4");

        System.out.println("\nThen input like this: \nEnter the Matrix: ");

        System.out.println("3 4 5 6 ,then press enter [1st row]");
        System.out.println("1 2 7 8 ,then press enter [2nd row]");
        System.out.println("2 2 2 2 ,then press enter [3rd row]\n");

        // IGNORE ABOVE PRINT STATEMENTS. THEY ARE INSTRUCTIONS TO HELP YOU INPUT MATRICES.

        // -------------------------------------------------------------
        // QUESTION 1: Adding two matrices
        // -------------------------------------------------------------

        Scanner sc = new Scanner(System.in);  // Creating 'sc' object of Scanner class for taking user input.

        // Prompting user to enter the number of rows for the matrices.
        System.out.print("Enter the number of Rows (r1): ");

        int r1 = sc.nextInt();  // Reading the number of rows and storing in variable 'r1'.

        // Prompting user to enter the number of columns for the matrices.
        System.out.print("Enter the number of Columns (c1): ");

        int c1 = sc.nextInt();  // Reading the number of columns and storing in variable 'c1'.

        // Declaring two 2D arrays (matrices) of size 'r1' rows and 'c1' columns.

        int[][] mtx1 = new int[r1][c1];  // First matrix.

        int[][] mtx2 = new int[r1][c1];  // Second matrix.

        // Taking input for the first matrix.
        System.out.println("Enter the First Matrix: ");

        for (int i = 0; i < r1; i++) {  // Looping through each row.

            for (int j = 0; j < c1; j++) {  // Looping through each column.

                mtx1[i][j] = sc.nextInt();  // Reading integer input and storing in the first matrix.

            }
        }

        // Taking input for the second matrix.
        System.out.println("Enter the Second Matrix: ");

        for (int i = 0; i < r1; i++) {  // Looping through each row.

            for (int j = 0; j < c1; j++) {  // Looping through each column.

                mtx2[i][j] = sc.nextInt();  // Reading integer input and storing in the second matrix.

            }
        }

        // Adding both matrices and storing the result in a new matrix.

        int[][] sum_mtx = new int[r1][c1];  // Declaring a new matrix to store the sum.

        for (int i = 0; i < r1; i++) {  // Looping through each row.

            for (int j = 0; j < c1; j++) {  // Looping through each column.

                sum_mtx[i][j] = mtx1[i][j] + mtx2[i][j];  // Adding corresponding elements.

            }
        }

        // Printing the final matrix after addition.
        System.out.println("\nFinal Matrix after Addition: ");

        for (int i = 0; i < r1; i++) {  // Looping through each row.

            for (int j = 0; j < c1; j++) {  // Looping through each column.

                System.out.print(sum_mtx[i][j] + " ");  // Printing each element followed by a space.

            }

            System.out.println();  // Moving to the next line after each row.

        }

        // -------------------------------------------------------------
        // DRY RUN FOR QUESTION 1:
        // -------------------------------------------------------------
        /*
        Let's assume the user inputs:

        For the first matrix:
        Enter the number of Rows (r1): 2
        Enter the number of Columns (c1): 2

        Enter the First Matrix:
        1 2    // First row inputs: mtx1[0][0]=1, mtx1[0][1]=2
        3 4    // Second row inputs: mtx1[1][0]=3, mtx1[1][1]=4

        For the second matrix:
        Enter the Second Matrix:
        5 6    // First row inputs: mtx2[0][0]=5, mtx2[0][1]=6
        7 8    // Second row inputs: mtx2[1][0]=7, mtx2[1][1]=8

        Addition Process:
        sum_mtx[0][0] = mtx1[0][0] + mtx2[0][0] = 1 + 5 = 6
        sum_mtx[0][1] = mtx1[0][1] + mtx2[0][1] = 2 + 6 = 8
        sum_mtx[1][0] = mtx1[1][0] + mtx2[1][0] = 3 + 7 = 10
        sum_mtx[1][1] = mtx1[1][1] + mtx2[1][1] = 4 + 8 = 12

        Final Matrix after Addition:
        6 8
        10 12
        */
        // -------------------------------------------------------------

        // -------------------------------------------------------------
        // QUESTION 2: Subtracting two matrices
        // -------------------------------------------------------------

        // Prompting user to enter the number of rows for the matrices.
        System.out.print("\nEnter the number of Rows (r2): ");

        int r2 = sc.nextInt();  // Reading the number of rows and storing in variable 'r2'.

        // Prompting user to enter the number of columns for the matrices.
        System.out.print("Enter the number of Columns (c2): ");

        int c2 = sc.nextInt();  // Reading the number of columns and storing in variable 'c2'.

        // Declaring two 2D arrays (matrices) of size 'r2' rows and 'c2' columns.

        int[][] mtx3 = new int[r2][c2];  // First matrix.

        int[][] mtx4 = new int[r2][c2];  // Second matrix.

        // Taking input for the first matrix.
        System.out.println("Enter the First Matrix: ");

        for (int i = 0; i < r2; i++) {  // Looping through each row.

            for (int j = 0; j < c2; j++) {  // Looping through each column.

                mtx3[i][j] = sc.nextInt();  // Reading integer input and storing in the first matrix.
                
            }
        }

        // Taking input for the second matrix.
        System.out.println("Enter the Second Matrix: ");

        for (int i = 0; i < r2; i++) {  // Looping through each row.

            for (int j = 0; j < c2; j++) {  // Looping through each column.

                mtx4[i][j] = sc.nextInt();  // Reading integer input and storing in the second matrix.

            }
        }

        // Subtracting the second matrix from the first and storing the result.
        int[][] subtract_mtx = new int[r2][c2];  // Declaring a new matrix to store the result.

        for (int i = 0; i < r2; i++) {  // Looping through each row.

            for (int j = 0; j < c2; j++) {  // Looping through each column.

                subtract_mtx[i][j] = mtx3[i][j] - mtx4[i][j];  // Subtracting corresponding elements.

            }
        }

        // Printing the final matrix after subtraction.
        System.out.println("\nFinal Matrix after Subtraction: ");

        for (int i = 0; i < r2; i++) {  // Looping through each row.

            for (int j = 0; j < c2; j++) {  // Looping through each column.

                System.out.print(subtract_mtx[i][j] + " ");  // Printing each element followed by a space.

            }

            System.out.println();  // Moving to the next line after each row.

        }

        // -------------------------------------------------------------
        // DRY RUN FOR QUESTION 2:
        // -------------------------------------------------------------
        /*
        Let's assume the user inputs:

        For the first matrix:
        Enter the number of Rows (r2): 2
        Enter the number of Columns (c2): 2

        Enter the First Matrix:
        9 8    // First row inputs: mtx3[0][0]=9, mtx3[0][1]=8
        7 6    // Second row inputs: mtx3[1][0]=7, mtx3[1][1]=6

        For the second matrix:
        Enter the Second Matrix:
        5 4    // First row inputs: mtx4[0][0]=5, mtx4[0][1]=4
        3 2    // Second row inputs: mtx4[1][0]=3, mtx4[1][1]=2

        Subtraction Process:
        subtract_mtx[0][0] = mtx3[0][0] - mtx4[0][0] = 9 - 5 = 4
        subtract_mtx[0][1] = mtx3[0][1] - mtx4[0][1] = 8 - 4 = 4
        subtract_mtx[1][0] = mtx3[1][0] - mtx4[1][0] = 7 - 3 = 4
        subtract_mtx[1][1] = mtx3[1][1] - mtx4[1][1] = 6 - 2 = 4

        Final Matrix after Subtraction:
        4 4
        4 4

        */
        // -------------------------------------------------------------

        // -------------------------------------------------------------
        // QUESTION 3: Transposing a matrix
        // -------------------------------------------------------------

        // Prompting user to enter the number of rows for the matrix.
        System.out.print("\nEnter the number of Rows (row): ");

        int row = sc.nextInt();  // Reading the number of rows and storing in variable 'row'.

        // Prompting user to enter the number of columns for the matrix.
        System.out.print("Enter the number of Columns (col): ");

        int col = sc.nextInt();  // Reading the number of columns and storing in variable 'col'.

        // Declaring a 2D array (matrix) of size 'row' rows and 'col' columns.

        int[][] mtx = new int[row][col];  // Original matrix.

        // Taking input for the matrix.
        System.out.println("Enter the Matrix: ");

        for (int i = 0; i < row; i++) {  // Looping through each row.

            for (int j = 0; j < col; j++) {  // Looping through each column.

                mtx[i][j] = sc.nextInt();  // Reading integer input and storing in the matrix.

            }
        
        }

        // Transposing the matrix.

        int[][] transpose_mtx = new int[col][row];  // Declaring a new matrix for the transpose.

        for (int i = 0; i < row; i++) {  // Looping through each row.

            for (int j = 0; j < col; j++) {  // Looping through each column.

                transpose_mtx[j][i] = mtx[i][j];  // Swapping rows and columns.

            }

        }

        // Printing the transposed matrix.
        System.out.println("\nFinal Matrix after Transposition: ");

        for (int i = 0; i < col; i++) {  // Looping through each row of the transposed matrix.

            for (int j = 0; j < row; j++) {  // Looping through each column of the transposed matrix.

                System.out.print(transpose_mtx[i][j] + " ");  // Printing each element followed by a space.

            }

            System.out.println();  // Moving to the next line after each row.

        }

        // -------------------------------------------------------------
        // DRY RUN FOR QUESTION 3:
        // -------------------------------------------------------------
        /*
        Let's assume the user inputs:

        Enter the number of Rows (row): 2
        Enter the number of Columns (col): 3

        Enter the Matrix:
        1 2 3    // First row inputs: mtx[0][0]=1, mtx[0][1]=2, mtx[0][2]=3
        4 5 6    // Second row inputs: mtx[1][0]=4, mtx[1][1]=5, mtx[1][2]=6

        Transposition Process:
        transpose_mtx[0][0] = mtx[0][0] = 1
        transpose_mtx[1][0] = mtx[0][1] = 2
        transpose_mtx[2][0] = mtx[0][2] = 3
        transpose_mtx[0][1] = mtx[1][0] = 4
        transpose_mtx[1][1] = mtx[1][1] = 5
        transpose_mtx[2][1] = mtx[1][2] = 6

        Transposed Matrix:
        1 4
        2 5
        3 6
        */
        // -------------------------------------------------------------

    }

}
