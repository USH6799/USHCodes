import java.util.Scanner;
// imported scanner class for taking input from user.

public class Input {

    public static void main(String[] args) {
        
        
        // Let us understand how To take input from user.

        // For that we have to right two things or statements which are compulsory.

        // First Step: Import Scanner class

        // Syntax:- import java.util.Scanner; this is compulsory.

        // It should be written above the class or outside the class.

        // By this we are taking the Scanner class from utility(util) package.

        // data Members and Variables together make a Method or Function.

        // Various types of Similar data methods and functions make a Class.

        // Various Similar Class makes a Package.

        // -----------------------------------------------------------------------

        // Next Step: Creating an Object of Scanner Class.

        // For this we have to know the basic Syntax of Creating an Object of Any class.

        // Syntax:- <classname> <objectname> = new <classname> (); this are compulsory

        // In our Case, we have the classname 'Scanner'.

        // And we can give any object name of our choice.

        // Lets create an object of Scanner Class.

        Scanner sc = new Scanner(System.in); // this are compulsory

        // In this sc is the objectname. or you can give any name to it.

        // -----------------------------------------------------------------------

        // As we have studied different Datatypes, so don't you think the way of taking input from user is also different according to Datatype.

        // Yes, you are current there are different functions in Scanner class for Different Datatypes.

        // Lets start from Integer, then String and then char, at last Float and Double, or Boolean as well.

        System.out.print("Enter the Integer Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        int x = sc.nextInt(); // Taking input from user and storing it in variable x of type int.

        // Here we called the nextInt(); fnc of Scanner class through its object 'sc'.

        // Remember whenever We take input from user, after that this fnc leaves an extra line after it just like println();.

        System.out.println("Integer: " + x); // lets check the value of x.

        // -------------------------------------------------------------------------

        System.out.print("Enter the String Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        String y = sc.next(); // Taking input from user and storing it in variable y of type String.

        // Here we called the next(); fnc of Scanner class through its object 'sc'.

        // Remember whenever We take input from user, after that this fnc leaves an extra line after it just like println();.

        System.out.println("String: " + y); // lets check the value of y.

        // Difference between next(); and nextLine(); fncs.

        // This both associate with String datatype.

        // next(); fnc takes only the first word as its input and save it in desired location or variable.

        // nextLine(); fnc takes all the words as its input and save it in desired location or variable.

        String z = sc.nextLine(); // Taking input from user and storing it in variable z of type String.

        // Here we called the nextLine(); fnc of Scanner class through its object 'sc'.

        System.out.println("String: " + z); // lets check the value of z.

        // Lets us take an example that input is "Hello World" by the user.

        // So the value Stored in variable y will be "Hello".

        // And the value Stored in variable z will be "Hello World".

        // Here you can see that next(); fnc takes only a word not the whole sentence.

        // -------------------------------------------------------------------------

        System.out.print("Enter the Character Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        char ch = sc.next().charAt(0); // Taking input from user and storing it in variable ch of type char.

        // Here we called the next(); fnc of Scanner class through its object 'sc'.

        // Actually there is no primary fnc for taking Character as input from user.

        // So we use a String fnc called charAt(index); which picks the Character at desired index or position.

        // So After taking a Word as input using next(); fnc then we pick the first character of that word and store it in 'ch'.

        // Remember next(); fnc takes only the first word as its input and save it in desired location or variable.

        // Take an Example as input "hello" and input "e".

        // So in first case when input is "hello",

        // then the value in ch will be "hello".charAt(0);

        // In Index it begins not from 1 but 0.

        // so in Word -> "h e l l o"
        // Index will be: 0 1 2 3 4

        // Which will be there position.

        // So we picked the Character at position 0 or index 0 which is 'h'.

        // Hence charAt(index); fnc picks a char so it needs a char datatype variable, here 'ch'.

        // In Second Case also when input is "e".

        // so in Word "e" Index will be: 0

        // Which will be there position.

        // So we picked the Character at position 0 or index 0 which is 'e'.

        // Hence charAt(index); fnc picks a char so it needs a char datatype variable, here 'ch'.

        // Remember whenever We take input from user, after that this fnc leaves an extra line after it just like println();.

        System.out.println("Character: " + ch); // lets check the value of ch.

        // -------------------------------------------------------------------------

        System.out.print("Enter the Float Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        Float f = sc.nextFloat(); // Taking input from user and storing it in variable f of type Float.

        // Here we called the nextFloat(); fnc of Scanner class through its object 'sc'.

        // Remember whenever We take input from user, after that this fnc leaves an extra line after it just like println();.

        System.out.println("Float: " + f); // lets check the value of f.

        // -------------------------------------------------------------------------

        System.out.print("Enter the Double Value: "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        Double d = sc.nextDouble(); // Taking input from user and storing it in variable d of type Double.

        // Here we called the nextDouble(); fnc of Scanner class through its object 'sc'.

        System.out.println("Double: " + d); // lets check the value of d.

        // -------------------------------------------------------------------------

        System.out.print("Enter the Boolean Value(true or false): "); // This is to display the user and tell what input should be given, not necessary but makes your code readable and better.

        Boolean b = sc.nextBoolean(); // Taking input from user and storing it in variable b of type Boolean.

        // Here we called the nextBoolean(); fnc of Scanner class through its object 'sc'.

        System.out.println("Boolean: " + b); // lets check the value of b.

        // -------------------------------------------------------------------------

        // Lets Try to take input for Two numbers and do Different Arithmetic Operations:-

        // Firstly, import java.util.Scanner;

        // Second, Scanner sc = new Scanner(System.in);

        // Then lets take input.

        System.out.print("Enter the Number 1: ");
        int num1 = sc.nextInt(); // Taking Input and Storing it in 'num1' variable of datatype Integer.

        System.out.print("Enter the Number 2: ");
        int num2 = sc.nextInt(); // Taking Input and Storing it in 'num2' variable of datatype Integer.

        System.out.println("Sum = " + (num1 + num2)); // Printing the sum of num1 and num2

        System.out.println("Product = " + (num1 * num2)); // Printing the product of num1 and num2

        System.out.println("Quotient = " + (num1 / num2)); // Printing the Quotient when num1 is divided by num2

        System.out.println("Remainder = " + (num1 % num2)); // Printing the Remainder when num1 is divided by num2
    }
}


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

// Try to Solve this Problems, you will get the Solution of this Questions in next Chapter.
