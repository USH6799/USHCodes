import java.util.Scanner;
// imported scanner class for taking input from user.

public class DoWhile {
    
    public static void main(String[] args) {
        /*
         * Explanation of the `do-while` loop:
         * 
         * What is a `do-while` loop?
         * - A `do-while` loop is similar to a `while` loop, but there is one key
         * difference: the condition is checked after the loop body is executed, not
         * before.
         * - This means that the code inside the loop will run at least once, even if
         * the condition is false from the start.
         * 
         * Syntax of a `do-while` loop:
         * do {
         * // code block to be executed
         * } while (condition);
         * 
         * - The `do` keyword starts the loop, and the code inside the curly braces is
         * executed.
         * - After the code runs once, the `condition` is checked. If it's true, the
         * loop repeats. If it's false, the loop stops.
         * 
         * Why use a `do-while` loop?
         * - A `do-while` loop is useful when you need to guarantee that the loop body
         * is executed at least once, regardless of whether the condition is true or
         * false at the start.
         */

        // --------------------------------------------------------------------------

        /*
         * 1. **Guaranteed Execution**: The code inside the loop will always run at
         * least once, no matter what the initial condition is.
         * 
         * 2. **Post-Condition Check**: The condition is checked after the loop body is
         * executed. This is different from a `while` loop where the condition is
         * checked before.
         * 
         * 3. **Use Cases**:
         * - A `do-while` loop is ideal for situations where you need the loop to
         * execute at least once, such as asking for user input or providing a menu
         * selection.
         */

        // --------------------------------------------------------------------------

        /*
         * Example: Input validation using a `do-while` loop.
         * 
         * In this example, we ask the user to enter a positive number.
         * The loop will keep asking for input until the user enters a positive number.
         */

        int number;

        Scanner scanner = new Scanner(System.in); // Create a scanner object for user input

        do {
            System.out.println("Please enter a positive number:"); // Prompt the user for input
            number = scanner.nextInt(); // Read the user's input
        } while (number <= 0); // Condition: The loop will repeat if the number is 0 or negative

        System.out.println("You entered: " + number); // After a valid number is entered, print it

        /*
         * Dry Run:
         * - The loop asks the user for input. If the user enters a negative number or
         * zero, the loop repeats.
         * - Once the user enters a positive number, the condition becomes false, and
         * the loop stops.
         */

        // --------------------------------------------------------------------------

        /*
         * Example: Simple menu selection using a `do-while` loop.
         * 
         * In this example, we display a menu to the user and let them choose an option.
         * The loop continues until the user selects the option to quit.
         */

        int choice;

        do {
            // Display the menu options
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Quit");

            // Prompt the user to choose an option
            System.out.println("Enter your choice:");
            choice = scanner.nextInt(); // Read the user's choice

            // Respond to the user's choice
            switch (choice) {
                case 1:
                    System.out.println("You chose Option 1");
                    break;
                case 2:
                    System.out.println("You chose Option 2");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 3); // Condition: Keep showing the menu until the user chooses to quit (option 3)

        /*
         * Dry Run:
         * - Initially, the menu is displayed, and the user is prompted for input.
         * - If the user chooses 1 or 2, a corresponding message is displayed, and the
         * loop repeats.
         * - If the user chooses 3, the loop ends and the program prints "Goodbye!".
         */

        // --------------------------------------------------------------------------

    }
}
