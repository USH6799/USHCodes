import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        // Lets take an Example and understand looping.

        // Think i want to print this statement 100 times.

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        // and so on, 100 times.

        // Don't you think this makes our code difficult and Complex.

        // To solve this Problem We have a Loops Concept.

        // There are mainly three types of Loops:-

        // 1. For loop
        // 2. While loop
        // 3. Do-While loop

        // ------------------------------------------------------------------------

        /*
            Explanation of the `for` loop:

            What is a `for` loop?

            - A `for` loop is a control structure in Java that allows you to repeat a
            block of code a specific number of times.

            - Unlike the `while` loop, a `for` loop is usually used when the number of
            iterations is known beforehand.

            Syntax of a `for` loop:
            for (initialization; condition; update) {
             // code block to be executed
            }

            - `initialization`: This is executed once at the start of the loop and is
            typically used to initialize loop control variables.

            - `condition`: This is a boolean expression that is checked before each
            iteration. If it's true, the loop runs; if it's false, the loop stops.

            - `update`: This is executed after every iteration and is generally used to
            update the loop control variable (like incrementing or decrementing it).

            Why use a `for` loop?
            - A `for` loop is most useful when you know exactly how many times the loop
            should run (e.g., iterating over an array, or counting from 1 to 10).

            - It provides a compact structure for loops that require initialization, a
            condition, and an update in one place.

            Difference between `for` and `while` loops:
            - A `for` loop is generally preferred when the number of iterations is known.

            - A `while` loop is better when the number of iterations depends on dynamic
            conditions, such as user input or other unpredictable events.
         */

        // --------------------------------------------------------------------------

        // Lets Start With for loop, we use for loop when we have a Definite amount or number of times, the loop runs.

        // Let us understand the Syntax:-

        /*

            for(<initialization>; <condition>; <increment/decrement>){
                <code>
            }

         */

        // It may look Complex but let short it out.

        // Firstly we have to create a for loop block, in the we have to initialize any temporary variable on which loop counts and then condition, on which loop terminates and the changes with variables values.

        // Let print 'hello' 100 times using loop.

        for (int i = 1; i <= 100; i++) {
            // Initialized a Variable 'i' of Datatype Integer, as value 1, and the Condition is (i <= 100) -> (1 < 100) which is true so Gone inside the loop and then run the code inside the loop, prints the statement, then update the Value of i by 1.

            // Next time value of i becomes 2 then 3 and so on till 100, because after 100 when value of i becomes 101 then the Condition (i <= 100) -> (101 <= 100) becomes false and the loop terminates.

            System.out.println("hello"); // OUTPUT:- hello

        } // for loop ends here.

        // Lets Now see another Example where loop is going 3 times printing the value of 'j'.

        int j; // Initializing a Variable 'j' of Datatype Integer.

        for (j = 0; j < 3; j++) { // for loop starts here.

            System.out.print(j); // OUTPUT:- 0 1 2

        } // for loop ends here.

        System.out.println(j); // OUTPUT:- 3

        // Lets do a Dry run of this.

        // Inside the loop when value of j = 0, checking Condition (j < 3) -> (0 < 3) which is true, then the code inside the loop will run.

        // OUTPUT:- 0

        // Then increment the value of j by 1, so new value of j becomes 1.

        // Inside the loop when value of j = 1, checking Condition (j < 3) -> (1 < 3) which is true, then the code inside the loop will run.

        // OUTPUT:- 1

        // Then increment the value of j by 1, so new value of j becomes 2.

        // Inside the loop when value of j = 2, checking Condition (j < 3) -> (2 < 3) which is true, then the code inside the loop will run.

        // OUTPUT:- 2

        // Then increment the value of j by 1, so new value of j becomes 3.

        // Inside the loop when value of j = 3, checking Condition (j < 3) -> (3 < 3) which is false, then the code inside the loop will not run and terminate the loop.

        // When comes out of the loop it may print the value of j.

        // OUTPUT:- 3

        // Its how the for loop works.

        // ------------------------------------------------------------------------

        // Lets understand continue and break statement in for loop.

        // We use continue statement when we want to skip the current iteration of the loop.

        // Like i want to print the numbers from 1 to 10 but do not want to print the multiple of 3.

        // Then i can set a for loop from 1 to 10 and place an if condition on it to check if the number is divisible by 3 or not, and if it is divisible by 3 then i can skip that number and continue with the next number.

        for (int i = 1; i <= 10; i++) { // A for loop running on Variable i from 1 to 10.

            if (i % 3 == 0) { // Checking if the number is divisible by 3 or not.

                continue; // If it is divisible then i can skip that number and continue with the next number or skip this iteration.

                // Now no further loop will run and increment the value of i and move to next Iteration.

            } // if block ends here.

            System.out.println(i); // printing the value of i.

        } // for loop ends here.

        // ------------------------------------------------------------------------

        // Lets Understand this with a Dry run.

        // Inside the Loop when value of i is 1 and checking Condition (i <= 10) -> (1 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (1 % 3 == 0) -> (3 == 0) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 1

        // Then increment the value of i by 1, so new value of i becomes 2.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 2 and checking Condition (i <= 10) -> (2 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (2 % 3 == 0) -> (3 == 0) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 2

        // Then increment the value of i by 1, so new value of i becomes 3.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 3 and checking Condition (i <= 10) -> (3 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (3 % 3 == 0) -> (0 == 0) -> true.

        // Hence the if block condition is True so it will run and not go to next line of the loop and due to continue keyword it skips the iteration of the loop.

        // Then increment the value of i by 1, so new value of i becomes 4.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 4 and checking Condition (i <= 10) -> (4 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (4 % 3 == 0) -> (1 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 4

        // Then increment the value of i by 1, so new value of i becomes 5.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 5 and checking Condition (i <= 10) -> (5 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (5 % 3 == 0) -> (2 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 5

        // Then increment the value of i by 1, so new value of i becomes 6.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 6 and checking Condition (i <= 10) -> (6 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (6 % 3 == 0) -> (0 == 0) -> true.

        // Hence the if block condition is True so it will run and not go to next line of the loop and due to continue keyword it skips the iteration of the loop.

        // Then increment the value of i by 1, so new value of i becomes 7.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 7 and checking Condition (i <= 10) -> (7 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (7 % 3 == 0) -> (1 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 7

        // Then increment the value of i by 1, so new value of i becomes 8.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 8 and checking Condition (i <= 10) -> (8 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (8 % 3 == 0) -> (2 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 8

        // Then increment the value of i by 1, so new value of i becomes 9.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 9 and checking Condition (i <= 10) -> (9 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (9 % 3 == 0) -> (0 == 0) -> true.

        // Hence the if block condition is True so it will run and not go to next line of the loop and due to continue keyword it skips the iteration of the loop.

        // Then increment the value of i by 1, so new value of i becomes 10.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 10 and checking Condition (i <= 10) -> (10 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block, inside the if Block , condition -> (i % 3 == 0), where (10 % 3 == 0) -> (1 == 0) -> true.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.
        
        // OUTPUT:- 10

        // Then increment the value of i by 1, so new value of i becomes 11.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 11 and checking Condition (i <= 10) -> (11 <= 10) which becomes false, then the code inside the loop will not run and the loop terminates.

        // ------------------------------------------------------------------------

        // BREAK in for loop.

        // break keyword is used to terminate the whole loop at once.

        // Like a for loop running from 1 to 10 should stop when it gets to 5.

        for (int i = 1; i <= 10; i++) { // i = 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10

            if (i == 5) { // Checking if the value of i is 5 or not.

                break; // if the value of i is 5 then if block runs and break the whole loop.

            } // if block ends here.

            System.out.println(i); // prints the value of i.

        } // for loop ends here.

        // Lets Do a Dry Run.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 1 and checking Condition (i <= 10) -> (1 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (1 == 5) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 1

        // Then increment the value of i by 1, so new value of i becomes 2.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 2 and checking Condition (i <= 10) -> (2 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (2 == 5) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 2

        // Then increment the value of i by 1, so new value of i becomes 3.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 3 and checking Condition (i <= 10) -> (3 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (3 == 5) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 3

        // Then increment the value of i by 1, so new value of i becomes 4.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 4 and checking Condition (i <= 10) -> (4 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (4 == 5) -> false.

        // Hence the if block condition is False so it will not run and go to next line of the loop where it prints the value of i.

        // OUTPUT:- 4

        // Then increment the value of i by 1, so new value of i becomes 5.

        // ------------------------------------------------------------------------

        // Inside the loop when value of i is 5 and checking Condition (i <= 10) -> (5 <= 10) which is true, then the code inside the loop will run.

        // Inside the loop it will check the if block , condition -> (i == 5), where (5 == 5) -> true.

        // Hence the if block condition is True so it will run and inside the if block there is a break keyword which breaks the whole loop.

        // Hence loop terminates and no further Iteration will run.

        // ------------------------------------------------------------------------

        // Lets understand the while loop.

        // We use while loop when we have an Indefinite amount or number of times, the loop runs.

        // Let us understand the Syntax:-

        /*

            while(<condition>){
                <code>
            }

         */

        /*
            Explanation of the `while` loop:
            
            What is a `while` loop?
            - A `while` loop is a control flow statement in Java that allows code to be
            executed repeatedly based on a given condition.

            - It checks the condition before each iteration of the loop, and if the
            condition is true, it executes the code block inside the loop.

            - The loop will continue until the condition becomes false.
            
            Syntax of a `while` loop:
            while (condition) {
                // code block to be executed repeatedly
            }
            
            - `condition`: This is a boolean expression (true or false) that controls how
            long the loop will run.

            - The loop will execute the code inside its block as long as the condition is
            true.

            - Once the condition becomes false, the loop stops.
            
            Why use a `while` loop?
            - When we don’t know in advance how many times a piece of code needs to run,
            we can use a `while` loop.

            - For example, if you want to repeat a task until a certain condition is met
            (like counting until a certain number or waiting for a user input), a `while`
            loop is perfect for that.
            
            When to use a `while` loop over a `for` loop?
            - Use `while` loops when you don’t know the number of iterations beforehand,
            or when the stopping condition depends on user input or other unpredictable
            factors.

            - A `for` loop is typically used when you know exactly how many iterations
            you need (like looping through an array or a fixed range of numbers).
            
            Important points:
            - Be careful with the condition; if the condition never becomes false, the
            loop will run forever. This is called an "infinite loop."

            - The condition must change within the loop (typically by updating
            variables), or the loop will never terminate.
         */

        // --------------------------------------------------------------------------

        /*
            1. **Initialization**: Before the loop starts, you typically initialize
            variables that control the loop (like counters or user input).

            2. **Condition**: The loop checks the condition at the beginning of each
            iteration. If the condition is true, the loop body runs.

            3. **Update/Change**: Inside the loop, you should change something (like
            incrementing a counter or receiving input) to make sure the condition
            eventually becomes false. If you forget this, you might end up with an
            infinite loop!

            4. **Infinite Loops**: An infinite loop runs forever because the condition
            never becomes false. Always ensure your loop has a way to stop.

            5. **Use Cases**:
            - Use a `while` loop when you don't know how many iterations you need
            beforehand.

            - It's useful for waiting for user input, repeating tasks based on
            conditions, and any situation where the stopping condition isn't fixed.
         */

        // --------------------------------------------------------------------------

        /*
            Example: Counting down from a user-defined number to 1.

            In this example, we use a `while` loop to count down from a number that the
            user gives us.
            The loop will continue until it reaches 1, and then it will stop.
         */

        int n = 10; // Let's assume the user inputs the number 10.

        System.out.println("Counting down from " + n + ":"); // Inform the user of the countdown start.

        while (n > 0) { // Condition: Run the loop as long as n is greater than 0.

            System.out.println(n); // Print the current value of n.

            n--; // Decrease n by 1 with each iteration (this is important to eventually stop the loop).
        }

        System.out.println("Done!"); // After the loop ends, print "Done!"

        /*
            Dry Run:
            - Initially, n = 10. Since n > 0, it prints 10 and then decreases n to 9.

            - The condition (n > 0) is checked again, and since 9 > 0, it prints 9 and
            decreases n to 8.

            - This process continues until n becomes 0.
            
            - At n = 0, the condition (0 > 0) is false, so the loop stops, and "Done!" is
            printed.
         */

        // --------------------------------------------------------------------------

        /*
            Explanation of the `do-while` loop:
            
            What is a `do-while` loop?
            - A `do-while` loop is similar to a `while` loop, but there is one key
            difference: the condition is checked after the loop body is executed, not
            before.

            - This means that the code inside the loop will run at least once, even if
            the condition is false from the start.
            
            Syntax of a `do-while` loop:
            do {
                // code block to be executed
            } while (condition);
            
            - The `do` keyword starts the loop, and the code inside the curly braces is
            executed.

            - After the code runs once, the `condition` is checked. If it's true, the
            loop repeats. If it's false, the loop stops.
            
            Why use a `do-while` loop?
            - A `do-while` loop is useful when you need to guarantee that the loop body
            is executed at least once, regardless of whether the condition is true or
            false at the start.
         */

        // --------------------------------------------------------------------------

        /*
            1. **Guaranteed Execution**: The code inside the loop will always run at
            least once, no matter what the initial condition is.

            2. **Post-Condition Check**: The condition is checked after the loop body is
            executed. This is different from a `while` loop where the condition is
            checked before.

            3. **Use Cases**:
            - A `do-while` loop is ideal for situations where you need the loop to
            execute at least once, such as asking for user input or providing a menu
            selection.
         */

        // --------------------------------------------------------------------------

        /*
            Example: Input validation using a `do-while` loop.

            In this example, we ask the user to enter a positive number.
            The loop will keep asking for input until the user enters a positive number.
         */

        int number;

        Scanner scanner = new Scanner(System.in); // Create a scanner object for user input

        do {
            System.out.println("Please enter a positive number:"); // Prompt the user for input

            number = scanner.nextInt(); // Read the user's input

        } while (number <= 0); // Condition: The loop will repeat if the number is 0 or negative

        System.out.println("You entered: " + number); // After a valid number is entered, print it

        /*
            Dry Run:
            - The loop asks the user for input. If the user enters a negative number or
            zero, the loop repeats.
            - Once the user enters a positive number, the condition becomes false, and
            the loop stops.
         */

        // --------------------------------------------------------------------------
    }
}
