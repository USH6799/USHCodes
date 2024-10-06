public class ForLoop {
    public static void main(String[] args) {
        /*
         * Explanation of the `for` loop:
         * 
         * What is a `for` loop?
         * - A `for` loop is a control structure in Java that allows you to repeat a
         * block of code a specific number of times.
         * - Unlike the `while` loop, a `for` loop is usually used when the number of
         * iterations is known beforehand.
         * 
         * Syntax of a `for` loop:
         * for (initialization; condition; update) {
         * // code block to be executed
         * }
         * 
         * - `initialization`: This is executed once at the start of the loop and is
         * typically used to initialize loop control variables.
         * - `condition`: This is a boolean expression that is checked before each
         * iteration. If it's true, the loop runs; if it's false, the loop stops.
         * - `update`: This is executed after every iteration and is generally used to
         * update the loop control variable (like incrementing or decrementing it).
         * 
         * Why use a `for` loop?
         * - A `for` loop is most useful when you know exactly how many times the loop
         * should run (e.g., iterating over an array, or counting from 1 to 10).
         * - It provides a compact structure for loops that require initialization, a
         * condition, and an update in one place.
         * 
         * Difference between `for` and `while` loops:
         * - A `for` loop is generally preferred when the number of iterations is known.
         * - A `while` loop is better when the number of iterations depends on dynamic
         * conditions, such as user input or other unpredictable events.
         */

        // --------------------------------------------------------------------------

        /*
         * 1. **Initialization**: The loop control variable (like `i`) is initialized at
         * the beginning. This happens only once before the loop starts.
         * 
         * 2. **Condition**: The condition is checked at the start of each iteration. If
         * it’s true, the loop runs; if it’s false, the loop stops.
         * 
         * 3. **Update**: After every iteration, the loop control variable is updated.
         * This is important for ensuring the loop doesn’t run forever.
         * 
         * 4. **Use Cases**:
         * - Use a `for` loop when you know in advance how many iterations you need.
         * - It’s especially useful for iterating through arrays, ranges of numbers, and
         * when you need a fixed number of repetitions.
         */

        // --------------------------------------------------------------------------

        /*
         * Example: Counting from 1 to 10 using a `for` loop.
         * 
         * In this example, we use a `for` loop to print the numbers from 1 to 10.
         */

        for (int i = 1; i <= 10; i++) { // Initialization: i = 1, Condition: i <= 10, Update: i++ (i is incremented by 1
                                        // after each iteration)
            System.out.println(i); // Print the current value of i
        }

        /*
         * Dry Run:
         * - Initially, i = 1. The condition (i <= 10) is true, so it prints 1 and
         * increments i to 2.
         * - The condition is checked again (2 <= 10), and since it's true, it prints 2
         * and increments i to 3.
         * - This continues until i becomes 11. At that point, the condition (11 <= 10)
         * is false, so the loop terminates.
         */

        // --------------------------------------------------------------------------

        /*
         * Example: Generating a multiplication table using a nested `for` loop.
         * 
         * In this example, we use nested `for` loops to generate the multiplication
         * table from 1 to 5.
         */

        for (int i = 1; i <= 5; i++) { // Outer loop: Iterates from 1 to 5 (the multiplier)

            for (int j = 1; j <= 5; j++) { // Inner loop: Iterates from 1 to 5 for each number in the table

                System.out.print(i * j + "\t"); // Multiply i by j and print the result (use "\t" for tab space to
                                                // format the output)
            }

            System.out.println(); // Print a new line after each row of the multiplication table
        }

        /*
         * Dry Run:
         * - The outer loop runs for i = 1, then the inner loop runs for j = 1 to 5,
         * printing the first row of the table.
         * - Then the outer loop moves to i = 2, and the inner loop again runs for j = 1
         * to 5, printing the second row, and so on.
         */

        // --------------------------------------------------------------------------

    }
}
