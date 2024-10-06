import java.util.Scanner; 
// Importing the Scanner class to allow user input from the console.

public class DuckNumber { 
// Declaring a public class named 'DuckNumber' which contains the main method to check if a number is a Duck Number.

    public static void main(String[] args) { 
    // The 'main' method is where the program execution begins.
        
        Scanner sc = new Scanner(System.in); 
        // Creating a 'Scanner' object named 'sc' to read input from the user.

        System.out.print("Enter the Number: "); 
        // Prompting the user to enter a number. This will display the message "Enter the Number: " on the screen.

        int num = sc.nextInt(); 
        // Using the 'nextInt()' method to read an integer input from the user and store it in the variable 'num'.
        
        String val = Integer.toString(num); 
        // Converting the integer 'num' to a String using the 'toString()' method of the Integer class.
        // This is done because we need to analyze the number as a sequence of characters (digits).

        if(val.indexOf("0") < 1){ 
        // Checking if the number contains the digit '0', but not at the first position.
        // 'indexOf("0")' finds the position of the first '0' in the string 'val'. 
        // If '0' is found at index 0 (first digit), or if no '0' is found at all (indexOf returns -1), 
        // then the condition will be true, meaning it's not a Duck Number.

            System.out.println(val + " is not a Duck Number"); 
            // If the 'if' condition is true (either no '0' exists or '0' is the first digit), 
            // then it prints that the number is **not** a Duck Number.

        } else { 
        // If the 'if' condition is false (i.e., '0' exists and is not the first digit), 
        // then the 'else' block will be executed.

            System.out.println(val + " is a Duck Number"); 
            // If the number has a '0' in any position other than the first digit, 
            // it prints that the number is a Duck Number.
        }

    } // End of the 'main' method.
    
} // End of the 'DuckNumber' class.

/* 
   What is a Duck Number?
   - A Duck Number is a positive number that contains one or more '0's, but none of those '0's can be the first digit.
   - Example of Duck Numbers: 102, 204, 340, 12045.
   - Example of Non-Duck Numbers: 0345, 405, 670.

   Explanation of the Program:
   - The program reads an integer input from the user and converts it into a String.
   - It checks if the string contains the digit '0' but ensures that the '0' is not the first character.
   - If '0' appears anywhere after the first position, the program identifies the number as a Duck Number.

   Dry Run Example 1:
   Input: 
   1023

   Initial Values:
   num = 1023
   val = "1023"

   Steps:
   1. The number 1023 is entered by the user.
   2. The integer is converted into the string "1023".
   3. The 'indexOf("0")' method checks where the first '0' is found in the string. 
      In this case, the '0' is found at index 1 (the second character).
   4. Since the '0' is not at index 0 (not the first character), the condition in the 'if' statement is false.
   5. Therefore, the 'else' block is executed, and the program prints:
      "1023 is a Duck Number."

   Final Output: 
   1023 is a Duck Number.

   Dry Run Example 2:
   Input: 
   01234

   Initial Values:
   num = 01234
   val = "1234"

   Steps:
   1. The user enters the number 01234 (leading zero is automatically removed in integer input).
   2. The integer is converted into the string "1234".
   3. The 'indexOf("0")' method checks for '0' in the string, but since no '0' is found, 'indexOf("0")' returns -1.
   4. As the condition in the 'if' statement is true (since '0' is not found or is the first character), the program prints:
      "1234 is not a Duck Number."

   Final Output: 
   1234 is not a Duck Number.
*/
