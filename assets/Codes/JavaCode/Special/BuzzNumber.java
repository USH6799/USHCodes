import java.util.Scanner;
// Importing the Scanner class from the java.util package to take input from the user.

public class BuzzNumber { 
// Declaring a public class named 'BuzzNumber' which contains the main method and logic for checking Buzz Numbers.

    public static void main() { 
    // The 'main' method is the starting point of the program. It is where the execution begins.
        
        Scanner sc = new Scanner(System.in); 
        // Creating a 'Scanner' object named 'sc' to read user input from the console.

        System.out.print("Enter the Number: "); 
        // Asking the user to input a number. The text "Enter the Number: " will be displayed on the screen.

        int num = sc.nextInt(); 
        // Using the 'nextInt()' method to read an integer from the user and storing it in the variable 'num'.
        // This is the number the user wants to check if it's a Buzz Number or not.

        int last_digit = num % 10; 
        // Calculating the last digit of the number by using the modulus operator (%) with 10.
        // 'num % 10' gives the remainder when 'num' is divided by 10, which is always the last digit of the number.
        // The result is stored in 'last_digit'.

        if(num % 7 == 0 && last_digit == 7){ 
        // The 'if' statement checks if both conditions are true:
        // 1. 'num % 7 == 0': This checks if 'num' is divisible by 7 without a remainder (i.e., 'num' is a multiple of 7).
        // 2. 'last_digit == 7': This checks if the last digit of the number is 7.
        // If both conditions are true, then the number is a Buzz Number.

            System.out.println(num + " is a Buzz Number."); 
            // If the conditions in the 'if' statement are true, it prints that the number is a Buzz Number.

        } else { 
        // If any of the conditions are false, the 'else' block will be executed.

            System.out.println(num + " is Not a Buzz Number."); 
            // If the number is not divisible by 7 or its last digit is not 7, the program prints that the number is not a Buzz Number.
        }

    } // End of the 'main' method.
    
} // End of the 'BuzzNumber' class.

/* 
   What is a Buzz Number? 
   A Buzz Number is a number that either:
   - Ends with the digit 7, or
   - Is divisible by 7.
   
   For example, 7, 17, 21, 37, and 49 are all Buzz Numbers.
   
   Explanation of the Program:
   - The program checks both conditions: 
     1. If the number is divisible by 7.
     2. If the number ends with the digit 7.
   - If both conditions are true, it prints that the number is a Buzz Number. 
   - Otherwise, it prints that the number is not a Buzz Number.
   
   Dry Run Example:
   Input: 
   49

   Initial Values:
   num = 49
   last_digit = num % 10 = 49 % 10 = 9

   Steps:
   1. First, the number (49) is input by the user.
   2. The last digit of the number is calculated using 'num % 10', which gives 9. So, last_digit = 9.
   3. The 'if' condition checks whether 'num % 7 == 0'. Since 49 is divisible by 7 (49 % 7 == 0), the first part of the condition is true.
   4. However, the second condition checks if 'last_digit == 7'. Since the last digit is 9, this condition is false.
   5. Because both conditions are not true (second condition is false), the 'else' block is executed, and it prints:
      "49 is Not a Buzz Number."

   Final Output: 
   49 is Not a Buzz Number.
   
   Dry Run 2:
   Input:
   77

   Initial Values:
   num = 77
   last_digit = num % 10 = 77 % 10 = 7

   Steps:
   1. The number 77 is entered by the user.
   2. The last digit of the number is calculated using 'num % 10', which gives 7. So, last_digit = 7.
   3. The 'if' condition checks whether 'num % 7 == 0'. Since 77 is divisible by 7 (77 % 7 == 0), the first part of the condition is true.
   4. The second condition checks if 'last_digit == 7'. Since the last digit is indeed 7, this condition is also true.
   5. Since both conditions are true, the 'if' block is executed, and it prints:
      "77 is a Buzz Number."

   Final Output:
   77 is a Buzz Number.
*/
