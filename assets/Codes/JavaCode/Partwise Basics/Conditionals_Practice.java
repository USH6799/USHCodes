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

public class Conditionals_Practice {

    public static void main(String[] args) {

        // Question 1.

        int a = 5, b = 10, c = 15;  

        if (a < b && b < c)  
            System.out.print("A");  
        else if (a > b || b > c)  
            System.out.print("B");  
        else  
            System.out.print("C");
            
        // Lets Start,

        // Variable 'a' of datatype Integer Storing value 5.

        // Variable 'b' of datatype Integer Storing value 10.

        // Variable 'c' of datatype Integer Storing value 15.

        // First if Statement, has Condition: (a < b && b < c)

        // Which has two Conditions related by AND(&&) Operator.

        // Which means both the Conditions should be true to run the if block.

        // Otherwise it won't run the if block.

        // Condition 1: a < b -> 5 < 10 -> true

        // Condition 2: b < c -> 10 < 15 -> true

        // so Both the conditions here are true, hence the if block will be Executed.

        // Under if block it has a print Statement.

        // OUTPUT: A

        // then it wont check the else if or else part , because if condition is already met.

        // Final Output: A


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
        

        // Lets start,

        // A Variable 'x' of datatype Integer Storing value 20.

        // checking the 1st if block.

        // Has Condition: (x < 10) -> 20 < 10 -> false

        // So If block will not be executed, and we will move to else if block,

        // Else if block has Condition: (x < 30) -> 20 < 30 -> true

        // So else if block will be executed.

        // Under else if block it has a print Statement.

        // OUTPUT: Medium

        // Now, it won't check the else part because else if condition is already met.

        // Then it is written x += 15;

        // Which means, x = x + 15;

        // So, x = 20 + 15;

        // So, new value of x is 35.

        // checking the 2nd if block.

        // Has Condition: (x > 30) -> 35 > 30 -> true

        // So if block will be executed.

        // Under if block it has a print Statement.

        // OUTPUT: and High

        // Now, lets check the final output.

        // OUTPUT:- Medium and High


    // Question 3.

    int n = 0;  
    if (n == 0)  
        System.out.print("Zero");  
    if (n < 5)  
        System.out.print(" Less than five");  
    else  
        System.out.print(" Greater than or equal to five");  


    // Lets Break it down,

    // A variable 'n' of datatype Integer Storing value 0.

    // Checking the 1st if block.

    // Has Condition: (n == 0) -> 0 == 0 -> true

    // So if block will be executed.

    // Under if block it has a print Statement.
    
    // OUTPUT: Zero

    // Now, that if block doesn't has any other else if or else block, so we will move to the next or 2nd if block.

    // Checking the 2nd if block.

    // Has Condition: (n < 5) -> 0 < 5 -> true

    // So if block will be executed.

    // Under if block it has a print Statement.

    // OUTPUT: Less than five

    // Now, It won't check the else block because if condition is already met.

    // Final Output: Zero Less than five

    }


}
