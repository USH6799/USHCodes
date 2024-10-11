// -----------------------------------------------------------------------------
// SOME PRACTICE QUESTIONS
// -----------------------------------------------------------------------------

/*

    // Question 1.

      int x = -15, y = 8;
      System.out.println(Math.abs(x) + Math.abs(y) - Math.abs(x - y));


*/

/*

    // Question 2.

      double a = 3.0, b = 4.0, c = 5.0;
      System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)));


*/

/*

    // Question 3.

      double randomValue = Math.random() * 100 - 50; 
      System.out.println(Math.ceil(randomValue));


*/

public class MathClass_Practice {
    
    public static void main(String[] args) {
        
        // Question 1.

        int x = -15, y = 8;
        System.out.println(Math.abs(x) + Math.abs(y) - Math.abs(x - y));

        // Lets Break it Down, and Understand the Output:

        // A Variable 'x' of Datatype Integer storing -15.

        // A Variable 'y' of Datatype Integer storing 8.

        // Lets See the println() statement,

        // According to java Associativity and Precedence, we will solve from left to right.

        // First math fnc is Math.abs(x)

        // .abs() function is used to find the Absolute value of any integer,

        // I.e. the absolute of any positive number or zero is always that number.

        // But in case of Negative Number, the absolute value of negative is its additive inverse, means negative number is multiplied by -1 and becomes positive.

        // Here Math.abs(x) -> Math.abs(-15) -> 15

        // Next Math fnc, Math.abs(y)

        // Math.abs(y) -> Math.abs(8) -> 8

        // Next Math fnc, Math.abs(x - y)

        // Math.abs(x - y) -> Math.abs(-15 - 8) -> Math.abs(-23) -> 23

        // Lets solve the print statement now,

        // Math.abs(x) + Math.abs(y) - Math.abs(x - y)

        // 15 + 8 - 23

        // 23 - 23 -> 0

        // OUTPUT: 0


         // Question 2.

        double a = 3.0, b = 4.0, c = 5.0;
        System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)));

        // A Variable 'a' of Datatype Double Storing value 3.0

        // A Variable 'b' of Datatype Double Storing value 4.0

        // A Variable 'c' of Datatype Double Storing value 5.0

        // Lets interpret the println() statement,

        // According to java Associativity and Precedence, we will solve from left to right.

        // We will solve the brackets first.

        // We will solve this first: Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))

        // Inside this we will solve Math.pow(a , 2) first due to Java Associativity.

        // Math.pow(x , n), takes two parameter and returns the base 'x' raised to power 'n'.

        // It returns a Double Value.

        // Math.pow(a , 2) -> Math.pow(3.0 , 2) -> 9.0

        // Now, lets move to the next math fnc,

        // Math.pow(b , 2) -> Math.pow(4.0 , 2) -> 16.0

        // Now, lets move to the next math fnc,

        // Math.pow(c , 2) -> Math.pow(5.0 , 2) -> 25.0

        // Now, we can put the returned value in place of fncs, and solve the last math fnc.

        // Math.sqrt(x); returns the Square root of the given number 'x' as the parameter, it returns double datatype value.

        // Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))

        // Math.sqrt(9.0 + 16.0 - 25.0) -> Math.sqrt(0.0);

        // The Value of Sqrt of 0 is itself 0.

        // So, OUTPUT:- 0.0

        // Because it returns a double datatype value.



        // Question 3.

        double randomValue = Math.random() * 100 - 50; 
        System.out.println(Math.ceil(randomValue));

        // A Variable 'randomValue' of Datatype double storing Math.random() * 100 - 50;

        // Math.random() is the function which generates a random number between 0 and 1.

        // Now, you may think what random is between 0 and 1.

        // The random values which lie between 0 and 1 are decimal values od Double datatype Values.

        // Lets Suppose the Math.random() generates any number between 0 and 1.

        // Then it is Multiplied with 100 which means the random number now lies between 0 and 100.

        // Because, if random number between 0 and 1 be 0.0000

        // Then when is multiplied by 100 then also it will be 0.0

        // Then it is Subtracted by 50.

        // so Now our randomValue lies between -50 and 50.

        // so 'randomValue' variable now stores an double datatype random number between -50.0 and 50.0

        // Lets move towards the printing statement,

        // Inside Printing statement it has Math.ceil() fnc which means it is round off the double datatype value to nearest bigger integer.

        // Like Math.ceil(0.2) will return 1.0 as its round off it to nearest bigger integer.

        // So, here Math.ceil(randomValue) will be interpreted.

        // so, Math.ceil( < -50.0 - 50.0 > )

        // This means it will round off the values to nearest bigger integer.

        // so Now, if the Random Value is -49.9999999 as well then it will become -49

        // And if the Random value is 49.99999999999999 as well then it will become 50

        // So, the println() statement will print different values each time because they are random and generated each time.

        // but now, this is fixed that the random number will lie between -49 and 50

        // So OUTPUT:- any number between -49.0 and 50.0(inclusive both end points)

    }

}
