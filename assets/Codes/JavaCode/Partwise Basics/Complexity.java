import java.util.Scanner;

/**
 * Complexity
 */
public class Complexity {

    public static void main(String[] args) {
        // --------------------------------------------------------------------------
        //  TIME AND SPACE COMPLEXITY
        // --------------------------------------------------------------------------

        // this time and space complexity means a way to calculate the time and space complexity of a program.

        // How much space will it take in memory and how much time will it take to execute.

        // Finding time and space Complexity can help us in various ways:-

        // Like help us to find the shortest and simplest way to write our code, so that it take less memory and run fast.

        // --------------------------------------------------------------------------

        // TIME COMPLEXITY means the relation between the input size and Running time(operations).

        // Time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input. 

        // Notations are the representation of the time complexity. 

        /*
            Types of notations:-

            -------------------------------------------------------------------------   

            1. O-notation: It is used to denote asymptotic upper bound. 
        
            For a given function g(n), we denote it by O(g(n)). Pronounced as “big-oh of g of n”. 
        
            It is also known as worst case time complexity as it denotes the upper bound in which the algorithm terminates.
        
            -------------------------------------------------------------------------   

            2. Ω-notation: It is used to denote asymptotic lower bound. 
        
            For a given function g(n), we denote it by Ω(g(n)). Pronounced as “big-omega of g of n”.

            It is also known as best case time complexity as it denotes the lower bound in which the algorithm terminates. 

            -------------------------------------------------------------------------
           
            3. 𝚯-notation: It is used to denote the average time of a program. 

        */

        // -------------------------------------------------------------------------

        // Lets Understand the Time Complexity with coding,

        Scanner sc = new Scanner(System.in); // Creating Scanner Object.

        int n = sc.nextInt(); // Taking input from user.

        for(int i = 1 ; i <= n ; i++){ // Looping from 1 to n.

            System.out.println("hello " + i); // Printing the statement.

        }// End of For Loop.

        // In this lets understand our time Complexity,

        // Input size: n

        // No. of Operations: also 'n' because, loops runs from 1 to 'n' or 'n' times.

        // This is Known as linear Relation, means the time complexity is linear.

        // If Input size increases by X then time Complexity also increases by X.

        // Hence time complexity is O(n).

        // -------------------------------------------------------------------------

        // Lets Suppose We have a list of Numbers and We have to Find a specific number in that,

        // numbers: {1 , 2 , 3 , 4 , 5}

        // lets find '1' in this.

        // There are three approaches to calculate time complexity of a program.

        // -------------------------------------------------------------------------

        // Best Case Approach:-

        // In best case approach, we find the minimum no. of operations to find '1' in the list.

        // So we can think that if the numbers are arranged in any order, the best case is that in 1 times.

        // So the time complexity is Ω(1).

        // Means For any Input Size like here 5 numbers, the no. of operations will remain same and equal to 1.

        // -------------------------------------------------------------------------

        // Average Case Approach:-

        // In this we will find the average no. of operations to find '1' in the list.

        // if list = {1 , 2 , 3 , 4 , 5} then no. of operations needed to find '1' will be 1.
        // if list = {2 , 1 , 3 , 4 , 5} then no. of operations needed to find '1' will be 2.
        // if list = {2 , 3 , 1 , 4 , 5} then no. of operations needed to find '1' will be 3.
        // if list = {2 , 3 , 4 , 1 , 5} then no. of operations needed to find '1' will be 4.
        // if list = {2 , 3 , 4 , 5 , 1} then no. of operations needed to find '1' will be 5.

        // Hence we can see that each time no. of operations are increasing till n.

        // So the average time complexity will be (total no. of operations / n).

        // total no. of operations = 1 + 2 + 3 + .... + n

        // So in maths we have a formula: (n * (n + 1)) / 2

        // Putting it in that will be (n * (n + 1)) / 2 = (n^2 + n) / 2 

        // Further Solving will result in (no. of operations = (n^2 + n) / 2).

        // (no. of operations / n) -> ((n^2 + n) / 2) / n) -> (n + 1) / 2
        
        // So the average time complexity will be (n + 1) / 2.
        
        // Average Time Complexity: 𝚯(n + 1 / 2)

        // -------------------------------------------------------------------------
        
        // Worst Case Approach:-

        // In this we have to find the maximum no. of operations to find '1' in the list.

        // We can see that the maximum no. of operations will be n.

        // So the time complexity is O(n).

        // We always try to find the Worst Case time complexity in most of the problems.

        // -------------------------------------------------------------------------

        // Another Example of Time Complexity:-

        int m = sc.nextInt();

        for(int i = 1 ; i <= m ; i++){ // Looping from 1 to m.

            for(int j = 1 ; j <= m ; j++){ // Looping from 1 to m.

                System.out.println("hello "); // Printing the statement.

            }

        }

        // Lets do a dry run,

        // for the value of m = 5,

        // When i = 1, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5. 

        // No. of operations = 5

        // When i = 2, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5.

        // No. of operations = 5 + 5

        // When i = 3, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5.

        // No. of operations = 5 + 5 + 5

        // When i = 4, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5.
        
        // No. of operations = 5 + 5 + 5 + 5

        // When i = 5, then inner loop run for j = 1, j = 2, j = 3, j = 4, j = 5.

        // No. of operations = 5 + 5 + 5 + 5 + 5

        // Total no. of operations = 5 + 5 + 5 + 5 + 5 = 25 or m + m + m + m + m -> m * m

        // So for Outer loop running m times,

        // Each time inner loop will run m times.

        // So the Worst Case time complexity is O(m * m).

        // Lets take the Same Example,

        int x = sc.nextInt();

        int y = sc.nextInt();

        for (int i = 1 ; i <= x ; i++){ // Looping from 1 to x.

            for (int j = 1 ; j <= y ; j++){ // Looping from 1 to y.

                System.out.println("hello "); // Printing the statement.

            }

        }

        // Lets do a dry run,

        // for the value of x = 5 and y = 4,

        // When i = 1, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4

        // When i = 2, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4 + 4

        // When i = 3, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4 + 4 + 4

        // When i = 4, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4 + 4 + 4 + 4

        // When i = 5, then inner loop run for j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4 + 4 + 4 + 4 + 4

        // Total no. of operations = 4 + 4 + 4 + 4 + 4 = 20 or y + y + y + y + y -> 5 * y -> x * y

        // Worst Case time complexity is O(x * y).

        // -------------------------------------------------------------------------

        int p = sc.nextInt();

        int q = sc.nextInt();

        for(int i = 1 ; i <= p ; i++){ // Looping from 1 to p.

            System.out.println("hello "); // Printing the statement.

        }

        for(int j = 1 ; j <= q ; j++){ // Looping from 1 to q.

            System.out.println("hello "); // Printing the statement.

        }

        // Lets do a dry run,

        // for the value of p = 5 and q = 4,

        // For the First loop, i = 1, i = 2, i = 3, i = 4, i = 5.

        // No. of operations = 5

        // For the Second loop, j = 1, j = 2, j = 3, j = 4.

        // No. of operations = 4

        // Total no. of operations = 5 + 4 -> p + q

        // Worst Case time complexity is O(p + q).


        // Now imagine if value of n = 10^6 and m = 3, then 

        // The Worst Case time complexity is O(n).

        // Because n is very huge and bigger than m, so we can ignore m , and its no. of operations.

        // -------------------------------------------------------------------------

        // Lets compare three Different Worst Case Time Complexity.

        // 1. O(n)

        // 2. O(n * n) or O(n^2)

        // 3. O(n * n * n) or (On^3)

        // When n = 1,

        // No. of Operations for O(n) is 1.

        // No. of Operations for O(n * n) is 1.

        // No. of Operations for O(n * n * n) is 1.

        // When n = 2,

        // No. of Operations for O(n) is 2.

        // No. of Operations for O(n * n) is 4.

        // No. of Operations for O(n * n * n) is 8.

        // When n = 10^5,

        // No. of Operations for O(n) is 10^5.

        // No. of Operations for O(n * n) is 10^10.

        // No. of Operations for O(n * n * n) is 10^15.

        // In this we can observer than O(n) is very less than O(n^3),

        // So we can say the Best Case Time Complexity is O(n).

        // And the Worst Case Time Complexity is O(n^3).

    }
}