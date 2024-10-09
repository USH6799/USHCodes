import java.util.Scanner;
// imported scanner class for taking input from user.

// -----------------------------------------------------------------
// PRACTICE QUESTIONS
// -----------------------------------------------------------------


    // Question 1.

    /*  Calculate the Best Case Time Complexity exclude Ω(1).

        int a = sc.nextInt(); // 'a' should be any positive integer.

        for(int i = 1 ; i <= a ; i++){

            if(i % 2 == 0){
                continue;
            }
            
        }

    */


    // Question 2.

    /*  Calculate the Worst Case Time Complexity.

        int a = 25;

        for(int i = 1 ; i <= a ; i++){
        
            for(int j = 1 ; j <= a ; j++){

                System.out.println("hello");

            }

        }

    */

    // Question 3.

    /*  Calculate the Worst Case Time Complexity.

        int a = 10;

        for(int i = 1 ; i <= 15 ; i++){
        
            for(int j = 1 ; j <= a ; j++){

                if( i == a){
                    break;
                }

            }

        }

        for(int i = 1 ; i <= a ; i++){
            System.out.println("Hi");
        }

    */

public class ComplexityQuestions {
    // classname ComplexityQuestions

    public static void main(String[] args) {
        // main fnc to run the code.

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        // ----------------------------------------------------------------
        // Question 1.

        int a = sc.nextInt(); // 'a' should be any positive integer.

        for(int i = 1 ; i <= a ; i++){

            if(i % 2 == 0){
                continue;
            }

            System.out.println("hello");
            
        }

        // So in this lets find the best case time Complexity.

        // Here we can say that we have the input size of a.

        // Input Size: a (A positive Integer)

        // Inside the for loop, it seems that 'i' iterates from 1 till 'a'

        // It contains an if statement, with condition if 'i' divided by 2 will give remainder as 0 then skip the iteration through continue keyword.

        // So Here we have to find the Best case Time Complexity,

        // Best Case, can be either a = 1 or a = 2

        // Because when a = 1,

        // Inside for loop,

            // i = 1 , condition (i <= a) -> (1 <= 1) -> true
            
            // So loop executes and check the if Statement,

            // Condition: (1 % 2 == 0) -> (1 % 2 == 0) -> (1 == 0) -> false

            // So if statement will not Execute, and 
            
            // It will run the print statement, no. of operations: 1

            // it will move for next Iteration,

            // i = , condition (i <= a) -> (2 <= 1) -> false

            // So for loop terminates and no further operations are performed.

        // Total no. of Operations: 1 or a.

        // Best Case Time Complexity: Ω(1) or Ω(a)

        // Now, when a = 2,

        // Inside for loop,

            // i = 1 , condition (i <= a) -> (1 <= 2) -> true
            
            // So loop executes and check the if Statement,

            // Condition: (1 % 2 == 0) -> (1 % 2 == 0) -> (1 == 0) -> false

            // So if statement will not Execute 

            // It will run the print statement, no. of operations: 1

            // it will move for next Iteration,
            
            // i = 2 , condition (i <= a) -> (2 <= 2) -> true

            // So loop executes and check the if Statement,

            // Condition: (2 % 2 == 0) -> (2 % 2 == 0) -> (0 == 0) -> true

            // So if statement will Execute and it will move for next Iteration without running the print operation,

            // So, total no. of Operations will be still: 1

            // i = 3 , condition (i <= a) -> (3 <= 2) -> false

            // So loop doesn't executes and Loop Terminates.

        // Input size: 2 or a

        // total no. of Operations: 1 or a / 2

        // So, the Best Case Time Complexity: Ω(1) or Ω(a/2)


        // ----------------------------------------------------------------
        // Question 2.

            
            a = 25;

            for(int i = 1 ; i <= a ; i++){
            
                for(int j = 1 ; j <= a ; j++){

                    System.out.println("hello");

                }

            }

        // In this Question we have a fixed input size which is 'a'

        // Input Size: a or 25

        // So, lets try to find the Worst Case Time Complexity.

        // Inside the first loop or Outer loop,

            /*
            
            The variable 'i' iterated from 1 till a.

            So the No. Of Iterations: a or 25

            Inside the Second loop or inner loop,

            when i = 1, 
            'j' iterates from 1 to 'a' and print hello
            so, No. of Operations: a or 25

            when i = 2, 
            'j' iterates from 1 to 'a' and print hello
            so, No. of Operations: a or 25

            When i = a,
            'j' iterates from 1 to 'a' and print hello
            so, No. of Operations: a or 25

            */

            // So total no. of Inputs:- 25 or a.
            // Total no. of Operations:- a * a or 25 * 25 or 625
            // Worst Case Time Complexity: O(a * a)

        // ----------------------------------------------------------------
        // Question 3.

        a = 10;

        for(int i = 1 ; i <= 15 ; i++){
        
            for(int j = 1 ; j <= a ; j++){

                if( i == a){
                    break;
                }

                System.out.println("Hi");

            }

        }

        for(int i = 1 ; i <= a ; i++){
            System.out.println("Hi");
        }


        // Lets break it down and find the Worst Case Time Complexity:-

        // Input size: a or 10.
        // So, in the first Outer loop,

        // 'i' iterates from 1 to 15.
        // So Total no. Iterations: 15

        // Inside the first Inner loop,
        // 'j' iterates from 1 to a, and also checking the if Condition. 

        // When i = 1,
        // 'j' iterates from 1 to a,

        // In each Iteration, it will check the if Condition.
        // Condition: (i == a) -> (1 == 10) -> false

        // So it will keep doing the print operation for each Iteration.
        // No. of Operations: a or 10

        // When i = 2,
        // 'j' iterates from 1 to a,

        // In each Iteration, it will check the if Condition.
        // Condition: (i == a) -> (2 == 10) -> false

        // So it will keep doing the print operation for each Iteration.
        // No. of Operations: a or 10

        // When i = 10,
        // and j = 1 or in the first Iteration,

        // In first Iteration, it will check the if Condition.
        // Condition: (i == a) -> (10 == 10) -> true

        // So if block will run a nd due to break keyword, it will terminate the inner loop without performing the operation and move to next Iteration of Outer loop.

        // No. of Operations: 0

        // When i = 11,
        // 'j' iterates from 1 to a,

        // In each Iteration, it will check the if Condition.
        // Condition: (i == a) -> (11 == 10) -> false

        // So it will keep doing the print operation for each Iteration.
        // No. of Operations: a or 10

        // When i = 15,
        // 'j' iterates from 1 to a,

        // In each Iteration, it will check the if Condition.
        // Condition: (i == a) -> (15 == 10) -> false

        // So it will keep doing the print operation for each Iteration.
        // No. of Operations: a or 10
        // then outer loop terminates,

        // So lets calculate the Total no. of Iterations till now,

        // Total no. of Operations in inner loop: a * 15
        // Because outer loop iterates 15 times.
        // and each time no. of operations is a.

        // but due to Exception, when i = 10, then no operations are performed.
        // So total no. of Operations will be a * 15 - a
        // total no. of Operations: 14 * a

        // Now lets move to Another loop,

        // In this loop , 'i' iterates from 1 till a.

        // so the no. of operations: a or 10.

        // total no. of Operations in this Question will be: 14 * a + a

        // Total no. of Operations: 15 * a

        // Worst Case Time Complexity: O(15 * a)

        // ----------------------------------------------------------------

        
    }
    
}
