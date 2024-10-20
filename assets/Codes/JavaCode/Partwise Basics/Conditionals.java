import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        // Conditional Statements are the Statements which are used to make decisions or execute certain code based on certain conditions.

        // Like if a number is positive or negative or even or odd.

        // Some conditionals Statements are:-

        // 1. if

        // 2. if , else

        // 3. if , else if , else

        // 4. nested if , else

        // 5. ternary operator

        // 6. Switch case

        // -------------------------------------------------------------------------

        // Lets start with 1. if conditional, which means if.

        // like i have a question, i want to ask the user, his age as input and check whether it is greater than 18 or not. if he is greater than 18 then he is eligible to vote.

        // For Taking Input we have to write above the class 'import java.util.Scanner;'.

        // And create an Object of Scanner class.

        Scanner input = new Scanner(System.in); // Creating an object 'input' of Scanner class.

        System.out.print("Enter the Age: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        int age = input.nextInt(); // Taking input from user and storing it in variable age of type Integer.

        // Firstly lets understand the syntax of if Statement.

        /*
           
            if (condition) {

                // code to be executed if the condition is true

            }
           
         */

        // Lets Implement it,

        if (age >= 18) { // Here, if the value of 'age' is greater than or equal to 18, it gives the output as True and the if block is executed.

            System.out.println("You are eligible to vote."); // Output: You are eligible to vote.

        } // if block ends here.

        // But we have a Problem like if user inputs age less than 18 then no output will be displayed, and cannot find whether he is eligible to vote or not.

        // -----------------------------------------------------------------------

        // Lets try 2. if , else conditional, which means if , else.

        // Syntax of If else block is:-

        /*
           
            if (condition){
                // code to be executed if the condition is true
            }
            else{
                // code to be executed if the condition is false
            }

         */

        if (age >= 18) { // Here, if the value of 'age' is greater than or equal to 18, it gives the output as True and the if block is executed.

            System.out.println("You are eligible to vote."); // Output: You are eligible to vote.

        } // if block ends here.

        else { // Here, if the value of 'age' is less than 18, it gives the output as False and the else block is executed.

            // it will only if above if block is false means the condition is false or not Satisfied.

            System.out.println("You are not eligible to vote."); // Output: You are not eligible to vote.

        } // else block ends here.

        // -----------------------------------------------------------------------

        // Next Question i have Some data and i want to print according to it.

        /*
         
                age     |   Output
              ----------------------
                <10     |   "Kid"
                <20     |   "Young"
                <30     |   "Adult"
            30 or above |   "Old"

         */

        // In this Case i have more than 1 condition or i would say more than 1 if Statements.

        // If i would write many if statements like this:

        if (age < 10) { // if the value of 'age' is less than 10, it gives the output as True and the if block is executed.

            System.out.println("Kid"); // Output: "Kid"

        } // if block ends here.

        if (age < 20) { // if the value of 'age' is less than 20, it gives the output as True and the if block is executed.

            System.out.println("Young"); // Output: "Young"

        } // if block ends here.

        if (age < 30) { // if the value of 'age' is less than 30, it gives the output as True and the if block is executed.

            System.out.println("Adult"); // Output: "Adult"

        } // if block ends here.

        if (age >= 30) { // if the value of 'age' is greater than or equal to 30, it gives the output as True and the if block is executed.

            System.out.println("Old"); // Output: "Old"

        } // if block ends here.

        // this is not the correct way to do this, because if input will be 16,

        // then age = 16,

        // for the 1st if statement, where condition is (age < 10), will be (16 < 10) -> false.

        // Hence nothing is Printed or the if block doesn't Execute.

        // Then for the 2nd if statement, where condition is (age < 20), will be (16 < 20) -> true.

        // Hence "Young" will be Printed or the if block Executes.

        // Then for the 3rd if statement, where condition is (age < 30), will be (16 < 30) -> true.

        // Hence "Adult" will be Printed or the if block Executes.

        // Then for the 4th if statement, where condition is (age >= 30), will be (16 >= 30) -> false.

        // Nothing will be Printed or the if block doesn't Execute.

        // For above we saw that it prints both young and adult but its quite Wrong.

        // There we use our 3rd Conditional: if , else if , else.

        if (age < 10) { // if the value of 'age' is less than 10, it gives the output as True and the if block is executed.

            System.out.println("Kid"); // Output: "Kid"

        } // if block ends here.

        else if (age < 20) { // if the above if statements are false, then only it checks and run this if block , Condition: if the value of 'age' is less than 20, it gives the output as True and the else if block is executed.

            System.out.println("Young"); // Output: "Young"

        } // if block ends here.

        else if (age < 30) { // if the above if statements are false, then only it checks and run this if block , Condition: if the value of 'age' is less than 30, it gives the output as True and the else if block is executed.

            System.out.println("Adult"); // Output: "Adult"

        } // if block ends here.

        else { // if the above all conditions are false then only the if block will execute.

            System.out.println("Old"); // Output: "Old"

        } // else block ends here.

        // Now if the input is 16.

        // then age = 16

        // Checking 1st if condition (age < 10) -> (16 < 10) -> false.

        // Hence the condition is false, so the if block will not execute and we move to next if condition.

        // Checking 2nd if condition (age < 20) -> (16 < 20) -> true.

        // Hence the Condition is true, so the else if block will execute and display Young, then it won't check any further conditions because condition already met.

        // -----------------------------------------------------------------------

        // What if i wanted to print hello if age is between 14 to 18.

        // I can do 2 things, 1. Using nested if 2. Using conditional operators.

        // Using Nested if:

        if (age >= 14) { // if the value of 'age' is greater than 14, it gives the output as True and the if block is executed.

            if (age <= 18) { // if the value of 'age' is greater than 14, it gives the output as True and the if block is executed.

                System.out.println("Hello"); // Output: "Hello"

            } // nested if block ends here.

        } // if block ends here.

        // -------------------------------------------------------------------------

        // Conditional Operators are the operators which are used to check the relation between two or more conditions.

        // && (and)

        // || (or)

        // ! (not)

        if (age >= 14 && age <= 18) { // if the value of 'age' is greater than 14 and less than 18, it gives the output as True and the if block is executed.

            // Here we used && (and) operator so the if block will be executed only if both conditions are true.

            System.out.println("Hello"); // Output: "Hello"

        } // if block ends here.

        // lets check more about && (and) operator.

        System.out.println(true && true); // Output: true

        System.out.println(true && false); // Output: false

        System.out.println(false && true); // Output: false

        System.out.println(false && false); // Output: false

        // -------------------------------------------------------------------------

        // Lets check more about || (or) operator.

        System.out.println(true || true); // Output: true

        System.out.println(true || false); // Output: true

        System.out.println(false || true); // Output: true

        System.out.println(false || false); // Output: false

        // -------------------------------------------------------------------------

        // Lets check more about ! (not) operator.

        System.out.println(!true); // Output: false

        System.out.println(!false); // Output: true

        // it means it just reverses the result.

        // -------------------------------------------------------------------------

        // Ternary Operator is a very useful operator which helps us to write if else statement in one statement.

        // Syntax:- <condition> ? <true value> : <false value>;

        // In above syntax if the condition is true then true value is returned and if the condition is false then false value is returned.

        String result = (10 < 6) ? "yes" : "no"; // In this we used a ternary operator( ? : ) , in which it checks the condition and returns the value according to it. like here (10 < 6) is the condition which is false, so (10 < 6) -> false.

        // If the condition is true then it may return "yes".

        // If the condition is false then it returns "no".

        // the returned value is Stored in result variable of datatype String.

        System.out.println(result); // OUTPUT:- no

        // Lets rewrite that age concept of voting using ternary operator.

        String res = (age < 18) ? "You Cannot Vote" : "You Can Vote"; // In this we used a ternary operator( ? : ) , in which it checks the condition and returns the value according to it. like here (age < 18) if the condition is false, so (age < 18) -> false.

        // If the condition is true then it may return "You Cannot Vote".

        // If the condition is false then it returns "You Can Vote".

        System.out.println(res); // OUTPUT:- You Can Vote

        // -------------------------------------------------------------------------

        // Switch Case is a very useful way to work with conditions of one variable, or the same condition.

        // Syntax for Switch case:

        /*
            switch(variable){

            case value1:
            // code if case matches
            break

            case value2:
            // code if case matches
            break

            default:
            // code if no case matches
            break

            }

         */

        // Lets break it down, firstly we have to use a variable and check the condition.

        // like if variable is equal to value1, then code will be executed for that case.

        // and then break statement is written that will stop the execution further and do not check rest conditions.

        // IF we skip writing break then we will go in fall through.

        // in fall through if the case matches and do not contain break, then code of next case is also executed till it met the break statement.

        // lets see an example.

        int var = 5; // A variable is declared and initialized with value 5.

        switch (var) { // Checking the value of var using switch case.

            case 2: // If the value of var is 2, then code will be executed for that case.

                System.out.println(2); // Output: 2

                break; // breaking the switch case and stops the further execution.

            case 5: // If the value of var is 5, then code will be executed for that case.

                System.out.println(5); // Output: 5

                break; // breaking the switch case and stops the further execution.

            default: // If the value of var is not 2 or 5, then code will be executed for that case.

                System.out.println(0); // Output: 0

                break; // breaking the switch case and stops the further execution.

        }// switch case ends here.

        // OUTPUT for this Switch case will be 5 because case 5 is matched and it contains the break statement which stops the further execution.

        // Lets check the Same without break statement.

        switch (var) { // Checking the value of var using switch case.

            case 2: // If the value of var is 2, then code will be executed for that case.

                System.out.println(2); // Output: 2

            case 5: // If the value of var is 5, then code will be executed for that case.

                System.out.println(5); // Output: 5

            default: // If the value of var is not 2 or 5, then code will be executed for that case.

                System.out.println(0); // Output: 0

        }// switch case ends here.

        // OUTPUT for this Switch case will be 5 and then 0 because case 5 is matched and hence it prints 5 and then no break statement is written so it will move to next case which is default and prints 0.

        // --------------------------------------------------------------------------

        /*
         * 
         * Day | in Words
         * -----------------------------
         * 1 | Monday
         * 2 | Tuesday
         * 3 | Wednesday
         * 4 | Thursday
         * 5 | Friday
         * 6 | Saturday
         * 7 | Sunday
         * 
         * 
         */

        System.out.print("Enter the Day Number: "); // Asking for input from user.

        int day = input.nextInt(); // Taking input from user and storing it in variable age.

        // Variable age is already declared and initialized before so no need to declare again.

        // Scanner class is already imported and object is already created.

        String Day_inWords = ""; // A variable 'Day_inWords' to Store the Day of datatype String, Declared and initialized with "" empty quotes.

        switch (day) { // Checking the value of age using switch case.

            case 1: // If the value of day is 1, then code will be executed for that case.

                Day_inWords = "Monday"; // Storing 'Monday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 2: // If the value of day is 2, then code will be executed for that case.

                Day_inWords = "Tuesday"; // Storing 'Tuesday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 3: // If the value of day is 3, then code will be executed for that case.

                Day_inWords = "Wednesday"; // Storing 'Wednesday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 4: // If the value of day is 4, then code will be executed for that case.

                Day_inWords = "Thursday"; // Storing 'Thursday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 5: // If the value of day is 5, then code will be executed for that case.

                Day_inWords = "Friday"; // Storing 'Friday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 6: // If the value of day is 6, then code will be executed for that case.

                Day_inWords = "Saturday"; // Storing 'Saturday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            case 7: // If the value of day is 7, then code will be executed for that case.

                Day_inWords = "Sunday"; // Storing 'Sunday' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

            default: // if no case matches , then default case will be executed.

                Day_inWords = "Wrong Input"; // Storing 'Wrong Input' in Variable 'Day_inWords'.

                break; // Breaking the Switch case so that no further Checking would happen.

        }// Switch block ends here.

        System.out.println(Day_inWords);

        // Lets try final Practice Question to find whether the number is even or odd.

        // Using if else,

        System.out.print("Enter the Number to Check whether it is Even or Odd: "); // Asking the user for inputting a Number to Check whether the Number is Even or Odd.

        int x = input.nextInt(); // Taking Input from the user and Storing it in var 'x' of Datatype Integer.

        if (x % 2 == 0) { // Checking whether the Remainder received when x is divided by 2 is equal to 0 or not, if it is Equal to 0 then the Condition becomes true and if part runs.

            System.out.println(x + " is Even"); // prints that x is Even.

        } // if Block ends here.

        else { // if the Above Condition is False, then else part will run.

            System.out.println(x + " is Odd"); // prints that x is odd.

        } // else block ends here.

        // Using ternary operator,

        String ans = (x % 2 == 0) ? (x + " is Even") : (x + " is Odd"); // Ternary operator to check whether the number is Even or Odd.

        // if the condition is true, then 1st Expression will be executed else 2nd Expression will be executed.

        System.out.println(ans); // prints the result.

        // ---------------------------------------------------------------


        // I would like to tell more thing regarding if , if else, else statements, that there is no need of Writing {} parenthesis in if , if else, else statements if We are writing only one line of Statement inside them.

        // Like,

        if(true) // if condition is true, then this code will be executed.
        System.out.println("hello"); // OUTPUT:- hello

        // this will run because there is only one statement after if.
        
    }

}


// -----------------------------------------------------------------------------
// SOME PRACTICE QUESTIONS
// -----------------------------------------------------------------------------

/*

    // Question 1.

    int a = 5, b = 10, c = 15;  

    if (a < b && b < c)  
        System.out.print("A");  
    else if (a > b || b > c)  
        System.out.print("B");  
    else  
        System.out.print("C");  

*/

/*

    // Question 2.

    int x = 20;  
    if (x < 10)  
        System.out.print("Low");  
    else if (x < 30)  
        System.out.print("Medium");  
    else  
        System.out.print("High");

    x += 15;  

    if (x > 30)  
        System.out.print(" and High");  

*/

/*

    // Question 3.

    int n = 0;  
    if (n == 0)  
        System.out.print("Zero");  
    if (n < 5)  
        System.out.print(" Less than five");  
    else  
        System.out.print(" Greater than or equal to five");  

*/

// Try to Solve this Problems, you will get the Solution of this Questions in next Chapter[Ch.7.2].
