// -----------------------------------------------------------------------------
// SOME PRACTICE QUESTIONS
// -----------------------------------------------------------------------------

/*

    // Question 1.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
            System.out.print("Enter another number: ");
            int anotherNum = sc.nextInt();
            System.out.println("Sum: " + (num + anotherNum));
        } else {
            System.out.println("Negative or Zero");
        } 

*/

/*

    // Question 2.

    // What will happen if the user inputs 'Hello World' for the character input in the following code?

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Character Value: ");
        char ch = sc.next().charAt(0);
        
        System.out.println("Character: " + ch);
    
}


*/

/*

    // Question 3.

    Write a program that reads a single line of input containing an integer, a double, and a string, separated by spaces. After reading the input, output the integer multiplied by 2, the double divided by 2, and the string input Concatenated with double value and then Integer value.

    // Ex:- input: 45 92.4 tame2 

    // output: 90 46.2 tame246.290

*/

import java.util.Scanner;

public class Input_Practice {

    public static void main(String[] args) {
        
        // Question 1.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
            System.out.print("Enter another number: ");
            int anotherNum = sc.nextInt();
            System.out.println("Sum: " + (num + anotherNum));
        } else {
            System.out.println("Negative or Zero");
        } 


        // Lets Solve,

        // Firstly, create an object of Scanner class 'sc' to take input from user.

        // Then, Asked the user to input a number.

        // Then taken an Integer Input using .nextInt() fnc, and stored it in variable 'num'.

        // Then Checking the if Block, condition: (num > 0)

        // lets assume that input is -2.

        // Condition: (num > 0) -> -2 > 0 -> false.

        // So, if block will not be executed and it will move to else block.

        // else block, runs when the above if blocks doesn't satisfy the condition.

        // So, else block has a print statement.

        // OUTPUT:- Negative or Zero

        // Lets see the Second Approach, in which user enters 4.

        // Condition: (num > 0) -> 4 > 0 -> true.

        // So, if block will be executed, and inside if block,

        // it has a print statement,

        // OUTPUT:- Positive

        // Then it again asks user to input another number.

        // The another number taken input from user is also of Integer datatype ans Stored in variable 'anotherNum'.

        // Then, it has a print statement,

        // Which gives the Sum of both inputs or numbers given by the user.

        // Let assume the input for the second number is -3.

        // System.out.println("Sum: " + (num + anotherNum));

        // System.out.println("Sum: " + ( 4 + -3 ));

        // System.out.println("Sum: " + 1);

        // OUTPUT:- Sum: 1



        // Question 2.

        // What will happen if the user inputs 'Hello World' for the character input in the following code?

        // Scanner sc = new Scanner(System.in); It is already written in previous Question
            
        System.out.print("Enter a Character Value: ");
        char ch = sc.next().charAt(0);
        
        System.out.println("Character: " + ch);

        // Lets Solve,

        // Firstly, create an object of Scanner class 'sc' to take input from user.

        // It ask the user to input a character value but user can enter a String also.

        // sc.next() is used to take input from user.

        // It will take the String as input from user and returns the first word only.

        // Like input is "Hello World"

        // Then sc.next() will return only "Hello", it won't interpret or return the Second Word.

        // Then It uses a String function .charAt(index) to take the character at given index and return it.

        // Lets do the indexing First,

        // String -> H e l l o
        // Index  -> 0 1 2 3 4 

        // Because sc.next() has taken only the first word from input.

        // ch = "Hello".charAt(0);

        // So, character at index 0 in "Hello" is "H".

        // so, it will return 'H' and stores it in variable 'ch' of Datatype char.

        // System.out.println("Character: " + ch);

        // OUTPUT:- Character: H



        sc.nextLine(); // Ignore this!



        // Question 3.

         
        // Write a program that reads a single line of input containing an integer, a double, and a string, separated by spaces. After reading the input, output the integer multiplied by 2, the double divided by 2, and the string input Concatenated with double value and then Integer value.

        // Ex:- input: 45 92.4 tame2 

        // output: 90 46.2 tame292.445


        // Lets create an object of Scanner class 'sc' to take input from user.

        // Scanner sc = new Scanner(System.in); 

        // I had commented it out, because it is already written in previous Questions.

        System.out.print("Input: "); // Asking the user to input.

        // Then We will Take an Integer Input using .nextInt() fnc, and store it in variable 'intval'.

        int intval = sc.nextInt();

        // Then We will Take a Double Input using .nextDouble() fnc, and store it in variable 'doubleval'.

        double doubleval = sc.nextDouble();

        // Then We will Take a String Input using .nextLine() fnc, and store it in variable 'str'.

        String str = sc.nextLine();

        System.out.print("Output: "); // Asking the user to output.

        // Then We will print the Integer Input multiplied by 2, the Double Input divided by 2, and the String Input Concatenated with double value and then Integer value.

        System.out.print(intval * 2 + " "); // Printing the Integer Input multiplied by 2.

        // Used print() so, that it will print in the same line and no extra line will be added.

        // And hence, the next Input will be printed in the same line.

        // Added " ", so that it will be clear between the two inputs.

        System.out.print(doubleval / 2); // Printing the Double Input divided by 2.

        // Used print() so, that it will print in the same line and no extra line will be added.

        // And hence, the next Input will be printed in the same line.

        System.out.print(str + doubleval + intval); // Printing the String Input Concatenated with double value and then Integer value.

        // Used print() so, that it will print in the same line and no extra line will be added.

        // And hence, the next Input will be printed in the same line.


    }
    
}
