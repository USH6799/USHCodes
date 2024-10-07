import java.util.Scanner; // Importing the Scanner class for user input.

public class PracticeFnc { // The class "PracticeFnc" is declared, where all the functions will be defined.

    // --------------------------------------------------------------------------
    // Question 1: Enter 3 numbers from the user and print their average.
    // --------------------------------------------------------------------------

    // Function declaration for calculating the average of three numbers.
    // 1. "static" means the function belongs to the class, so we can call it without creating an object.
    // 2. "void" indicates that this function does not return any value.
    // 3. The function name is "Average".
    // 4. The parameters are "int a", "int b", and "int c", which represent the three numbers.

    static void Average(int a, int b, int c) { 
        
        // Calculate the sum of the three input numbers.
        int sum = a + b + c;
        
        // Calculate the average by dividing the sum by 3.
        int avg = sum / 3; 

        // Print the result in the specified format.
        System.out.println("Average of " + a + ", " + b + ", " + c + " is " + avg); 

    }

    // Dry Run of Average:
    // Input: a = 2, b = 4, c = 6
    // Step 1: sum = 2 + 4 = 6
    // Step 2: sum = 6 + 6 = 12
    // Step 3: avg = 12 / 3 = 4
    // Output: "Average of 2, 4, 6 is 4"


    // --------------------------------------------------------------------------
    // Question 2: Print the sum of all odd numbers from 1 to n.
    // --------------------------------------------------------------------------

    // Function to calculate the sum of all odd numbers from 1 to a given number 'n'.

    static void PrintOdd(int n) {

        int sum = 0; // Variable to store the sum of odd numbers.

        // Loop through all numbers from 1 to 'n'.
        for (int i = 1; i <= n; i++) {

            // Check if the current number 'i' is odd.
            if (i % 2 == 1) { 

                sum += i; // Add the odd number to the sum.

            }

        }

        // Print the sum of all odd numbers.
        System.out.println("Sum of all odd numbers from 1 to " + n + " is " + sum); 

    }

    // Dry Run of PrintOdd:
    // Input: n = 5
    // Step 1: i = 1 (odd) -> sum = 0 + 1 = 1
    // Step 2: i = 2 (even) -> skip
    // Step 3: i = 3 (odd) -> sum = 1 + 3 = 4
    // Step 4: i = 4 (even) -> skip
    // Step 5: i = 5 (odd) -> sum = 4 + 5 = 9
    // Output: "Sum of all odd numbers from 1 to 5 is 9"


    // --------------------------------------------------------------------------
    // Question 3: Take two numbers and find the greatest among them.
    // --------------------------------------------------------------------------

    // Function to find and print the greatest of two numbers.
    static void FindGreatest(int x, int y) {

        // Check if the first number 'x' is greater than the second number 'y'.
        if (x > y) { 

            // Print that 'x' is the greatest.
            System.out.println(x + " is the greatest number"); 

        } 
        else {

            // Otherwise, print that 'y' is the greatest.
            System.out.println(y + " is the greatest number"); 

        }

    }

    // Dry Run of FindGreatest:
    // Input: x = 4, y = 9
    // Step 1: 4 > 9 -> false
    // Step 2: Else statement is executed -> "9 is the greatest number"
    // Output: "9 is the greatest number"

    
    // --------------------------------------------------------------------------
    // Question 4: Check if a person is eligible to vote based on their age.
    // --------------------------------------------------------------------------

    // Function to check if a person is eligible to vote based on their age.
    static void VoteChecking(int age) {

        // Check if the person's age is 18 or above.
        if (age >= 18) { 

            // If true, print that they are eligible to vote.
            System.out.println("You are eligible to vote"); 

        } 
        else {

            // Otherwise, print that they are not eligible to vote.
            System.out.println("You are not eligible to vote"); 

        }
    }

    // Dry Run of VoteChecking:
    // Input: age = 20
    // Step 1: 20 >= 18 -> true
    // Output: "You are eligible to vote"

    // --------------------------------------------------------------------------
    // Question 5: Calculate the area and circumference of a circle given its radius.
    // --------------------------------------------------------------------------

    // Function to calculate the area and circumference of a circle.
    static void Circle(double r) {

        // Calculate the area using the formula π * r^2.
        double area = Math.PI * r * r; 
        
        // Calculate the circumference using the formula 2 * π * r.
        double circumference = 2 * Math.PI * r; 

        // Print the calculated area and circumference.
        System.out.println("Area of the circle is " + area + " and Circumference of the circle is " + circumference); 

    }

    // Dry Run of Circle:
    // Input: r = 5
    // Step 1: area = 3.14159 * 5 * 5 = 78.53975
    // Step 2: circumference = 2 * 3.14159 * 5 = 31.4159
    // Output: "Area of the circle is 78.53975 and Circumference of the circle is 31.4159"


    // --------------------------------------------------------------------------
    // Question 6: Ask the user to enter numbers until they stop, and count how many positive, negative, and zero numbers were entered.
    // --------------------------------------------------------------------------

    // Function to count positive, negative, and zero numbers entered by the user.
    static void PositiveNegativeZero() {

        Scanner input = new Scanner(System.in); // Scanner for user input.

        int num = 0; // Variable to store the user's input.
        
        int positive = 0; // Counter for positive numbers.
        int negative = 0; // Counter for negative numbers.
        int zero = 0;     // Counter for zero numbers.

        // Loop until the user enters -1, which means they want to exit.
        while (num != -1) {

            // Ask the user to input a number, or enter -1 to stop.
            System.out.print("Enter any number or Enter -1 to Exit: "); 

            num = input.nextInt(); // Get the user's input.

            // Check if the number is positive.
            if (num > 0) { 

                positive++; // Increase the positive counter.

            }

            // Check if the number is negative (but not -1).
            else if (num < 0 && num != -1) {

                negative++; // Increase the negative counter.

            }

            // Check if the number is zero.

            else if (num == 0) {

                zero++; // Increase the zero counter.

            }
            
        }

        // Print the total counts of positive, negative, and zero numbers.
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zero Numbers: " + zero);

        // Special case to include -1 in the negative count.
        System.out.println("Negative Numbers Including -1: " + (negative + 1)); 
    }

    // Dry Run of PositiveNegativeZero:
    // Input: 1, 2, -1 (Exit)
    // Step 1: positive = 2, negative = 0, zero = 0
    // Output:
    // "Positive Numbers: 2"
    // "Negative Numbers: 0"
    // "Zero Numbers: 0"
    // "Negative Numbers Including -1: 1"

    // Question 7: Calculate the result of x^n (x raised to the power of n).

    // Function to calculate x raised to the power of n.
    static void Power(int x, int n) {

        // Use the Math.pow() method to calculate x raised to the power of n.
        int result = (int)Math.pow(x, n); // The result is cast to an integer because Math.pow() returns a double.

        // Print the result.
        System.out.println("Result: " + result); 
    }

    // Dry Run of Power:
    // Input: x = 2, n = 3
    // Step 1: result = 2^3 = 8
    // Output: "Result: 8"

    // Question 8: Find the greatest common divisor (GCD) of two numbers.

    // Function to calculate the GCD of two numbers.
    static void GCD(int x, int y) {

        // If both numbers are equal, the GCD is that number.
        if (x == y) { 

            System.out.println("GCD of " + x + " and " + y + " is " + x);

        } 
        else if (x > y) { // If x is greater than y, find GCD by iterating down from y.

            for (int i = y; i >= 1; i--) { // Start from y and go down to 1.

                // Check if both x and y are divisible by i.

                if (x % i == 0 && y % i == 0) { 

                    System.out.println("GCD of " + x + " and " + y + " is " + i); // Print the GCD found.

                    break; // Exit the loop after finding the GCD.

                }

            }

        } 
        else { // If y is greater than x, find GCD by iterating down from x.

            for (int i = x; i >= 1; i--) { // Start from x and go down to 1.

                // Check if both x and y are divisible by i.

                if (x % i == 0 && y % i == 0) {

                    System.out.println("GCD of " + x + " and " + y + " is " + i); // Print the GCD found.

                    break; // Exit the loop after finding the GCD.

                }


            }

        }
    }

    // Dry Run of GCD:
    // Input: x = 12, y = 16
    // Step 1: x == y -> false, so go to else if block.
    // Step 2: x > y -> false, so go to else block.
    // Step 3: Check GCD by iterating down from 12(x).
    // Step 4: GCD found is 4.
    // Output: "GCD of 12 and 16 is 4"

    // Question 9: Print the Fibonacci series till n.

    // Function to print the Fibonacci series up to the n-th number.
    static void Fibonacci(int n) {

        int a = 0; // The first number in the Fibonacci series.

        int b = 1; // The second number in the Fibonacci series.

        // Print the first two numbers of the Fibonacci series.
        System.out.print(a + " "); 
        System.out.print(b + " ");

        // Loop to generate and print the Fibonacci series.
        for (int i = 1; i <= n; i++) { // Loop from 1 to n (inclusive).

            int c = a + b; // Calculate the next number in the series.

            System.out.print(c + " "); // Print the next number.

            a = b; // Update 'a' to be the second last number.

            b = c; // Update 'b' to be the latest number.

        }

    }

    // Dry Run of Fibonacci:
    // Input: n = 5
    // Step 1: Print a = 0 and b = 1.
    // Step 2: i = 1 -> c = 0 + 1 = 1 -> Print 1
    // Step 3: when c = 1 , a = b -> 1 , b = c -> 1.
    // Step 4: i = 2 -> c = 1 + 1 = 2 -> Print 2
    // Step 5: when c = 2 , a = b -> 1 , b = c -> 2.
    // Step 6: i = 3 -> c = 1 + 2 = 3 -> Print 3
    // Step 7: when c = 3 , a = b -> 2 , b = c -> 3.
    // Step 8: i = 4 -> c = 2 + 3 = 5 -> Print 5
    // Step 9: when c = 5 , a = b -> 3 , b = c -> 5.
    // Step 10: i = 5 -> c = 3 + 5 = 8 -> Print 8
    // Step 11: when c = 8 , a = b -> 5 , b = c -> 8.
    // Output: "0 1 1 2 3 5 8"

    // Main method to run the functions.
    public static void main(String[] args) {
        
        // Call the Average function with example inputs.
        Average(2, 4, 6); 

        // Call the PrintOdd function with example input.
        PrintOdd(5); 

        // Call the FindGreatest function with example inputs.
        FindGreatest(4, 9); 

        // Call the VoteChecking function with an example input.
        VoteChecking(20); 

        // Call the Circle function with an example input.
        Circle(5); 

        // Call the PositiveNegativeZero function to get user input.
        PositiveNegativeZero(); 

        // Call the Power function with example inputs.
        Power(2, 3); 

        // Call the GCD function with example inputs.
        GCD(12, 16); 

        // Call the Fibonacci function with an example input.
        Fibonacci(5); 
    }
}
