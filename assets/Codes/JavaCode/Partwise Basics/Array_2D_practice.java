// SOME PRACTICE QUESTIONS:-

// Question 1. Write the Code to Add two Matrix and Display the New Matrix Formed.

// Question 2. Write the Code to Subtract two Matrix and Display the New Matrix Formed.

// Question 3. Write the Code to Transpose a Given matrix and Display the New Matrix.
    // Transpose means if a matrix of (row X column) then the new matrix will be (column X row).

import java.util.Scanner;
// imported scanner class for taking input from user.

public class Array_2D_practice {

    public static void main(String[] args) {

        // ---------------------------------------------------------------------

        System.out.println("How to Input a Matrix:- ");

        System.out.println("if row = 3 and col = 4");

        System.out.println("\nThen Input like this: \nEnter the Matrix: ");

        System.out.println("3 4 5 6 ,then press enter[1st row]");
        System.out.println("1 2 7 8 ,then press enter[2nd row]");
        System.out.println("2 2 2 2 ,then press enter[3rd row]\n");

        // IGNORE ABOVE PRINT STATEMENT THEY ARE INSTRUCTION WHICH HELP YOU IN INPUTTING MATRICES.


        // ---------------------------------------------------------------------

        // QUESTION 1

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.
        
        System.out.print("Enter the no. of Rows(r1): ");
        int r1 = sc.nextInt();
        
        System.out.print("Enter the no. of columns(c1): ");
        int c1 = sc.nextInt();
        
        int[][] mtx1 = new int[r1][c1];

        int[][] mtx2 = new int[r1][c1];
        
        // Input for first Matrix
        System.out.println("Enter the First Matrix: ");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                mtx1[i][j] = sc.nextInt();
            }
        }
        
        // Input for Second Matrix
        System.out.println("Enter the Second Matrix: ");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                mtx2[i][j] = sc.nextInt();
            }
        }
        
        // Adding Both Matrix
        int[][] sum_mtx = new int[r1][c1];
        
        System.out.println("\nFinal Matrix: ");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                sum_mtx[i][j] = mtx1[i][j] + mtx2[i][j];
            }
        }
        
        // Printing Final Matrix
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                System.out.print(sum_mtx[i][j] + " ");
            }
            System.out.println();
        }
        
        // ----------------------------------------------------------------------

        // QUESTION 2

        System.out.print("Enter the no. of Rows(r2): ");
        int r2 = sc.nextInt();
        
        System.out.print("Enter the no. of columns(c2): ");
        int c2 = sc.nextInt();
        
        int[][] mtx3 = new int[r2][c2];

        int[][] mtx4 = new int[r2][c2];
        
        // Input for first Matrix
        System.out.println("Enter the First Matrix: ");
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                mtx3[i][j] = sc.nextInt();
            }
        }
        
        // Input for Second Matrix
        System.out.println("Enter the Second Matrix: ");
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                mtx4[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        
        // Subtracting Both Matrix
        int[][] subtract_mtx = new int[r2][c2];
        
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                subtract_mtx[i][j] = mtx3[i][j] - mtx4[i][j];
            }
        }
        
        // Printing Final Matrix
        System.out.println("\nFinal Matrix: ");
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                System.out.print(subtract_mtx[i][j] + " ");
            }
            System.out.println();
        }

        // ----------------------------------------------------------------------

        // QUESTION 3

        System.out.print("Enter the no. of Rows(row): ");
        int row = sc.nextInt();
        
        System.out.print("Enter the no. of columns(col): ");
        int col = sc.nextInt();
        
        int[][] mtx = new int[row][col];

        
        // Input for first Matrix
        System.out.println("Enter the Matrix: ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                mtx[i][j] = sc.nextInt();
            }
        }
        
        // Transposing.
        int[][] transpose_mtx = new int[col][row];
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                transpose_mtx[j][i] = mtx[i][j];
            }
        }

        // Printing Final Matrix
        System.out.println("\nFinal Matrix: ");
        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < row ; j++){
                System.out.print(transpose_mtx[i][j] + " ");
            }
            System.out.println();
        }


    }
    
}