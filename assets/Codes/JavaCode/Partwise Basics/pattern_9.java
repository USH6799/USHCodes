import java.util.Scanner;  
// Importing the Scanner class, which is part of the Java utility library, to enable us to take input from the user.

public class pattern_9 {  
// Declaring the class 'pattern_9'. In Java, all programs are written inside classes.

    public static void main(String[] args) {  
    // The main method is the entry point of the program. It's where the program starts running.

        Scanner sc = new Scanner(System.in);  
        // Creating a new Scanner object 'sc'. This object will help us to read input from the user via the console.
        
        // First Pattern: Number Pyramid
        
        System.out.print("Enter the No. of rows(n): ");  
        // Prompting the user to enter the number of rows for the number pyramid.
        
        int n = sc.nextInt();  
        // Reading the integer value entered by the user and storing it in the variable 'n'. 
        // This 'n' will represent the number of rows for our number pyramid pattern.

        // Outer loop to manage the rows of the number pyramid.
        for(int i = 1 ; i <= n ; i++){  
        // 'i' starts from 1 and increases with each iteration of the loop until it reaches 'n'.
        // This loop runs 'n' times, which means it controls the number of rows in the pyramid.
        // For example, if n = 4, this loop will run 4 times for i = 1, 2, 3, and 4.

            // Inner loop to print spaces before the numbers in each row.
            for(int j = 1 ; j <= n - i ; j++){  
            // 'j' is used to print spaces. The number of spaces decreases as 'i' increases.
            // For example, when i = 1, it prints n-1 spaces, and when i = 2, it prints n-2 spaces, and so on.

                System.out.print(" ");  
                // Print a space to shift the numbers to the right, creating the pyramid shape.

            } // End of the inner loop for spaces.

            // Inner loop to print the numbers in each row.
            for(int k = 1 ; k <= i ; k++){  
            // 'k' starts from 1 and runs 'i' times. 
            // This loop prints the current value of 'i' multiple times in each row.
            // For example, when i = 2, it will print '2' twice.

                System.out.print(i + " ");  
                // Printing the current value of 'i' followed by a space. 
                // This gives the pyramid its number pattern.

            } // End of the inner loop for printing numbers.

            System.out.println();  
            // After completing one row, move the cursor to the next line for the next row.

        } // End of the outer loop for the number pyramid.

        // Second Pattern: Palindrome Pyramid

        System.out.print("Enter the No. of rows(m): ");  
        // Asking the user to input the number of rows for the palindrome pyramid.

        int m = sc.nextInt();  
        // Reading the integer value entered by the user and storing it in the variable 'm'. 
        // This 'm' will represent the number of rows for the palindrome pyramid pattern.

        // Outer loop for the Palindrome Pyramid.
        for(int i = 1 ; i <= m ; i++){  
        // The outer loop runs 'm' times, controlling the number of rows in the palindrome pyramid.

            // Inner loop to print spaces for aligning the pyramid.
            for(int j = 1 ; j <= m - i ; j++){  
            // The number of spaces decreases as 'i' increases, creating the pyramid shape.

                System.out.print("  ");  
                // Print two spaces to shift the numbers to the right, aligning the pyramid correctly.

            } // End of the inner loop for spaces.

            // Inner loop to print decreasing numbers in each row (left side of the pyramid).
            for(int k = i ; k >= 1 ; k--){  
            // 'k' starts from 'i' and decreases to 1. This prints numbers in descending order.

                System.out.print(k + " ");  
                // Printing the current value of 'k', followed by a space. 
                // This creates the left half of the palindrome.

            } // End of the inner loop for printing descending numbers.

            // Inner loop to print increasing numbers in each row (right side of the pyramid).
            for(int l = 2 ; l <= i ; l++){  
            // 'l' starts from 2 and goes up to 'i'. This prints numbers in ascending order after the first column.

                System.out.print(l + " ");  
                // Printing the current value of 'l', followed by a space. 
                // This creates the right half of the palindrome.

            } // End of the inner loop for printing ascending numbers.

            System.out.println();  
            // After completing one row, move the cursor to the next line for the next row.

        } // End of the outer loop for the palindrome pyramid.

    } // End of the main method.
} // End of the class.

/*
    Dry Run of the Code:
    
    Example 1: Number Pyramid
    
    Input:
    n = 4
    
    First iteration (i = 1):
    - j loop: print " " 3 times (as 4 - 1 = 3)
    - k loop: print "1 " once
    Output: 
       1 
    
    Second iteration (i = 2):
    - j loop: print " " 2 times (as 4 - 2 = 2)
    - k loop: print "2 " twice
    Output: 
       1 
      2 2 
    
    Third iteration (i = 3):
    - j loop: print " " 1 time (as 4 - 3 = 1)
    - k loop: print "3 " three times
    Output: 
       1 
      2 2 
     3 3 3 
    
    Fourth iteration (i = 4):
    - j loop: print " " 0 times (as 4 - 4 = 0)
    - k loop: print "4 " four times
    Output: 
       1 
      2 2 
     3 3 3 
    4 4 4 4 
    
    Full Output of Number Pyramid:
       1 
      2 2 
     3 3 3 
    4 4 4 4 

    Example 2: Palindrome Pyramid
    
    Input:
    m = 4
    
    First iteration (i = 1):
    - j loop: print " " 3 times (as 4 - 1 = 3)
    - k loop: print "1 "
    - l loop: no action (since l starts from 2)
    Output: 
       1 
    
    Second iteration (i = 2):
    - j loop: print " " 2 times (as 4 - 2 = 2)
    - k loop: print "2 1 "
    - l loop: print "2 "
    Output: 
        1 
      2 1 2 
    
    Third iteration (i = 3):
    - j loop: print " " 1 time (as 4 - 3 = 1)
    - k loop: print "3 2 1 "
    - l loop: print "2 3 "
    Output: 
         1 
       2 1 2 
     3 2 1 2 3 
    
    Fourth iteration (i = 4):
    - j loop: print " " 0 times (as 4 - 4 = 0)
    - k loop: print "4 3 2 1 "
    - l loop: print "2 3 4 "
    Output: 
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
    
    Full Output of Palindrome Pyramid:
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
*/
