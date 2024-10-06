public class WhileLoop {
    public static void main() {

        // Lets understand the while loop.

        // We use while loop when we have an Indefinite amount or number of times, the
        // loop runs.

        // Let us understand the Syntax:-

        /*
         * 
         * while(<condition>){
         * <code>
         * }
         * 
         */

        /*
         * Explanation of the `while` loop:
         * 
         * What is a `while` loop?
         * - A `while` loop is a control flow statement in Java that allows code to be
         * executed repeatedly based on a given condition.
         * - It checks the condition before each iteration of the loop, and if the
         * condition is true, it executes the code block inside the loop.
         * - The loop will continue until the condition becomes false.
         * 
         * Syntax of a `while` loop:
         * while (condition) {
         * // code block to be executed repeatedly
         * }
         * 
         * - `condition`: This is a boolean expression (true or false) that controls how
         * long the loop will run.
         * - The loop will execute the code inside its block as long as the condition is
         * true.
         * - Once the condition becomes false, the loop stops.
         * 
         * Why use a `while` loop?
         * - When we don’t know in advance how many times a piece of code needs to run,
         * we can use a `while` loop.
         * - For example, if you want to repeat a task until a certain condition is met
         * (like counting until a certain number or waiting for a user input), a `while`
         * loop is perfect for that.
         * 
         * When to use a `while` loop over a `for` loop?
         * - Use `while` loops when you don’t know the number of iterations beforehand,
         * or when the stopping condition depends on user input or other unpredictable
         * factors.
         * - A `for` loop is typically used when you know exactly how many iterations
         * you need (like looping through an array or a fixed range of numbers).
         * 
         * Important points:
         * - Be careful with the condition; if the condition never becomes false, the
         * loop will run forever. This is called an "infinite loop."
         * - The condition must change within the loop (typically by updating
         * variables), or the loop will never terminate.
         */

        // --------------------------------------------------------------------------

        /*
         * 1. **Initialization**: Before the loop starts, you typically initialize
         * variables that control the loop (like counters or user input).
         * 
         * 2. **Condition**: The loop checks the condition at the beginning of each
         * iteration. If the condition is true, the loop body runs.
         * 
         * 3. **Update/Change**: Inside the loop, you should change something (like
         * incrementing a counter or receiving input) to make sure the condition
         * eventually becomes false. If you forget this, you might end up with an
         * infinite loop!
         * 
         * 4. **Infinite Loops**: An infinite loop runs forever because the condition
         * never becomes false. Always ensure your loop has a way to stop.
         * 
         * 5. **Use Cases**:
         * - Use a `while` loop when you don't know how many iterations you need
         * beforehand.
         * - It's useful for waiting for user input, repeating tasks based on
         * conditions, and any situation where the stopping condition isn't fixed.
         */

        // --------------------------------------------------------------------------

        /*
         * Example: Counting down from a user-defined number to 1.
         * 
         * In this example, we use a `while` loop to count down from a number that the
         * user gives us.
         * The loop will continue until it reaches 1, and then it will stop.
         */

        int n = 10; // Let's assume the user inputs the number 10.

        System.out.println("Counting down from " + n + ":"); // Inform the user of the countdown start.

        while (n > 0) { // Condition: Run the loop as long as n is greater than 0.

            System.out.println(n); // Print the current value of n.

            n--; // Decrease n by 1 with each iteration (this is important to eventually stop the
                 // loop).
        }

        System.out.println("Done!"); // After the loop ends, print "Done!"

        /*
         * Dry Run:
         * - Initially, n = 10. Since n > 0, it prints 10 and then decreases n to 9.
         * - The condition (n > 0) is checked again, and since 9 > 0, it prints 9 and
         * decreases n to 8.
         * - This process continues until n becomes 0.
         * - At n = 0, the condition (0 > 0) is false, so the loop stops, and "Done!" is
         * printed.
         */

        // --------------------------------------------------------------------------

        /*
         * Warning: Be careful with conditions that never change, as it could lead to an
         * infinite loop.
         * 
         * Example of an infinite loop:
         */

        int i = 1;

        while (i > 0) { // Condition: This loop will run forever because i is always greater than 0.
            System.out.println(i); // It will keep printing the value of i.
            i++; // Since i keeps increasing, the condition will always be true.
        }

        /*
         * In the above example, the loop will run infinitely because the condition (i >
         * 0) will never become false.
         * i keeps increasing, and as long as i is greater than 0, the loop will
         * continue running forever.
         * 
         * Infinite loops can cause your program to freeze or crash, so it's important
         * to ensure that your loop has a clear stopping point.
         */

        // --------------------------------------------------------------------------

        /*
         * Example: Simple guessing game using a `while` loop.
         * 
         * In this example, a secret number is stored, and the user has to guess it.
         * The `while` loop keeps running until the user guesses the correct number.
         */

        int secretNumber = 7; // Define a secret number (the number to be guessed).

        int userGuess = -1; // Initialize the user's guess to an invalid number.

        Input scanner = new Input(System.in); // Create a Scanner object to take input from the user.

        System.out.println("Guess the secret number (between 1 and 10):"); // Prompt the user to guess.

        while (userGuess != secretNumber) { // The loop will keep running as long as the guess is incorrect.

            userGuess = scanner.nextInt(); // Read the user's guess.

            if (userGuess < secretNumber) { // Check if the guess is too low.
                System.out.println("Too low, try again!");
            } else if (userGuess > secretNumber) { // Check if the guess is too high.
                System.out.println("Too high, try again!");
            }
        }

        System.out.println("Congratulations! You've guessed the secret number!"); // Once the correct guess is made,
                                                                                  // print a congratulatory message.

        /*
         * Dry Run:
         * - Initially, userGuess = -1. Since userGuess != secretNumber, the loop
         * begins.
         * - If the user guesses 3, the loop checks the condition (3 != 7), and since
         * the guess is too low, it asks the user to try again.
         * - The loop continues until the user guesses 7, at which point the condition
         * (7 != 7) is false, and the loop ends.
         * - The program then prints "Congratulations!"
         */

        // --------------------------------------------------------------------------

        /*
         * Example: Find the first 10 multiples of 7 using a `while` loop.
         * 
         * This example shows how we can use a `while` loop to find the multiples of a
         * number.
         * The loop will run until we've found 10 multiples of 7.
         */

        int number = 7; // The number for which we want to find multiples.

        int count = 0; // Variable to keep track of how many multiples have been printed.

        int currentMultiple = number; // Start with the first multiple of 7, which is 7 itself.

        System.out.println("The first 10 multiples of 7 are:");

        while (count < 10) { // Condition: The loop will run until we've printed 10 multiples.

            System.out.println(currentMultiple); // Print the current multiple.

            currentMultiple += number; // Calculate the next multiple by adding 7 to the current multiple.

            count++; // Increment the count, as one more multiple has been printed.
        }

        /*
         * Dry Run:
         * - Initially, count = 0 and currentMultiple = 7.
         * - The condition (count < 10) is true, so it prints 7 and increments count to
         * 1.
         * - The next multiple is calculated as 14 (7 + 7). It prints 14 and increments
         * count to 2.
         * - This process repeats until count = 10, at which point the loop terminates.
         */

        // --------------------------------------------------------------------------

    }
}
