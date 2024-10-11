import java.util.*; // importing the utilities package to use Scanner class

public class StringBuilder_Questions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // creating Scanner object 'sc' to take input from user

        // -------------------------------
        // Question 1: Reverse a given String without using StringBuilder
        // -------------------------------

        System.out.print("Enter the String: "); // Asking user to input a string

        String str = sc.nextLine(); // storing the input string into variable 'str'

        String reverb_str = ""; // initializing an empty string 'reverb_str' to store the reversed string

        // Looping through the string in reverse order (from last index to first index)
        for (int i = str.length() - 1; i >= 0; i--) {

            reverb_str = reverb_str + str.charAt(i); // concatenating the character at position 'i' to 'reverb_str'
            // Explanation: 'charAt(i)' picks the character at index 'i' of the string and adds it to 'reverb_str'
            // The loop runs from the last character to the first, building 'reverb_str' by adding each character to it.
        }

        // Printing the reversed string to the console
        System.out.println("Reversed String: " + reverb_str); 
        // After the loop completes, the string 'reverb_str' will hold the reversed version of 'str'

        // -------------------------------
        // Question 2: Reverse a given String using StringBuilder class functions
        // -------------------------------

        System.out.print("Enter the String: "); // Asking user to input another string

        StringBuilder sb = new StringBuilder(sc.nextLine()); 
        // Creating a StringBuilder object 'sb' and initializing it with user input string
        // StringBuilder is a class that allows us to modify strings directly (efficient for string manipulations)

        // Looping through half of the string, swapping characters from the start and end
        for (int i = 0; i < sb.length() / 2; i++) {
            // Explanation: 'sb.length() / 2' ensures we only loop halfway through the string to swap pairs of characters
            // If we looped through the whole string, we'd swap everything twice, undoing the reversal.

            char front = sb.charAt(i); // Storing the character at index 'i' in variable 'front'
            // This picks the character from the front side of the string to be swapped.

            char back = sb.charAt(sb.length() - 1 - i); // Storing the character at the opposite index (from the back) in variable 'back'
            // Explanation: 'sb.length() - 1 - i' calculates the position of the character from the back.

            sb.setCharAt(i, back); // Setting the character at the front index 'i' to be the character from the back
            // Explanation: This directly replaces the character at index 'i' with 'back' without deleting or inserting.

            sb.setCharAt(sb.length() - 1 - i, front); // Setting the character at the back index to be the front character
            // Explanation: This directly replaces the character at the back with the character from the front
        }

        // Finally, printing the reversed string after swapping characters
        System.out.println("Reversed String using StringBuilder: " + sb.toString());

    }    
}


// --------------------------------------------------------------------------------
// DRY RUN and DEEP EXPLANATION for BOTH Questions
// --------------------------------------------------------------------------------

/* 
Question 1: Reverse without StringBuilder (Input: "HELLO")

Step-by-step Execution:

1. Input: User enters "HELLO".
2. Variable 'str' stores "HELLO".
3. Variable 'reverb_str' is initialized as an empty string "".
4. We start a loop from the last character of 'str' (i = 4, which is 'O'):

   - First iteration (i = 4):
     * 'reverb_str' becomes "" + 'O' → 'O'.
   
   - Second iteration (i = 3):
     * 'reverb_str' becomes "O" + 'L' → 'OL'.
   
   - Third iteration (i = 2):
     * 'reverb_str' becomes "OL" + 'L' → 'OLL'.
   
   - Fourth iteration (i = 1):
     * 'reverb_str' becomes "OLL" + 'E' → 'OLLE'.
   
   - Fifth iteration (i = 0):
     * 'reverb_str' becomes "OLLE" + 'H' → 'OLLEH'.

5. The loop completes, and we print "Reversed String: OLLEH".
Result: The string is reversed without using any advanced classes or functions.

*/

/* 
Question 2: Reverse using StringBuilder (Input: "WORLD")

Step-by-step Execution:

1. Input: User enters "WORLD".
2. StringBuilder 'sb' is initialized with "WORLD".
3. The loop runs from i = 0 to i = (sb.length() / 2) - 1, meaning we swap characters only until the midpoint:

   - First iteration (i = 0):
     * 'front' = 'W' (character at index 0).
     * 'back' = 'D' (character at index 4).
     * 'setCharAt(i, back)' replaces 'W' at index 0 with 'D'.
     * 'setCharAt(4, front)' replaces 'D' at index 4 with 'W'.
     * Now the string becomes "DORLW".

   - Second iteration (i = 1):
     * 'front' = 'O' (character at index 1).
     * 'back' = 'L' (character at index 3).
     * 'setCharAt(i, back)' replaces 'O' at index 1 with 'L'.
     * 'setCharAt(3, front)' replaces 'L' at index 3 with 'O'.
     * Now the string becomes "DLROW".

4. The loop finishes after swapping the front and back characters.
5. The final reversed string is printed: "DLROW".

Result: The string is reversed using the StringBuilder class by directly swapping the characters with `setCharAt()`.

*/

// --------------------------------------------------------------------------------
// QUESTION 3. Compare the Time Complexity of Both the Cases.
// if Q.1 case has less time complexity than Q.2 , then make the new logic to reverse a String using String Builder class Fncs, with less Time complexity than Q.1 .
// --------------------------------------------------------------------------------

// Let's compare the time complexity of both the cases:

// Lets assume that the total length of String in both cases is n.

// --------------------------------------------------------------------------------

// for the Question 1,

// Input size: total length of the string 'str' or str.length()

// Loop is running from i = str.length() - 1 to i = 0;

// So we can determine that the No. of Operations are str.length();

// So the Time Complexity will be O(str.length()) or O(n)

// ------------------------------------------------------------------------------

// for the Question 2,

// Input size: Total length of the string 'sb' or sb.length() or n;

// Loop runs from i = 0 to i = (sb.length() / 2);

// So we can determine that the No. of Operations are sb.length() / 2 or n / 2;

// So the Time Complexity will be O(sb.length() / 2) or O(n / 2)


// --------------------------------------------------------------------------------

// While comparing the Time Complexity of both the cases, we can conclude that the time complexity of Q.1 is more than Q.2.

// Q.2 takes half the time of Q.1.

// Or you can say that it executes twice faster than Q.1.

// So no new logic is required to reverse a String using String Builder class Fncs.


