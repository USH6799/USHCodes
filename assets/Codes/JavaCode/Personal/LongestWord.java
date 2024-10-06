import java.util.Scanner; 
// Importing the Scanner class to allow us to take input from the user.

public class LongestWord { 
// Declaring the class 'LongestWord'. In Java, all code resides inside classes.

    public static void main() { 
    // The main method, which is the entry point for the program's execution.
        
        Scanner sc = new Scanner(System.in); 
        // Creating a Scanner object 'sc' to read input from the user.

        System.out.print("Enter the String: "); 
        // Prompting the user to enter a sentence or string.

        String str = sc.nextLine(); 
        // Reading the entire line of text entered by the user and storing it in the string variable 'str'.
        // This allows the program to process spaces between words.

        str += " "; 
        // Adding an extra space at the end of the string.
        // This ensures the program considers the last word when it looks for spaces, as spaces separate words.

        int start = 0; 
        // The 'start' variable tracks the beginning index of each word in the string. 
        // Initially, it is set to 0 (the beginning of the string).

        int end = 0; 
        // The 'end' variable tracks the ending index of each word in the string.
        // This will be updated whenever a space is encountered (indicating the end of a word).

        int max = 0; 
        // The 'max' variable keeps track of the length of the longest word found so far.
        // Initially set to 0 because no words have been processed yet.

        String Bigword = ""; 
        // 'Bigword' stores the longest word found so far.
        // Initially an empty string.

        for(int i = 0 ; i < str.length() ; i++){ 
        // This 'for' loop iterates through each character of the string 'str'.
        // 'i' starts from 0 and continues until it reaches the length of the string.

            if(str.charAt(i) == ' '){ 
            // The 'if' statement checks if the current character is a space (' ').
            // A space indicates the end of a word.

                end = i; 
                // If a space is found, 'end' is set to the current index, which marks the end of the word.

                String word = str.substring(start + 1, end); 
                // Extracting the word from the string using the substring method.
                // The word starts from 'start + 1' and goes up to 'end'. 
                // 'start + 1' is used because 'start' is at the index of the space before the word.

                if(max < word.length()){ 
                // Checking if the length of the current word is greater than the current longest word's length.

                    max = word.length(); 
                    // If the current word is longer, update 'max' to the length of this word.

                    Bigword = word; 
                    // Update 'Bigword' to store the current longest word.

                }

                start = i; 
                // Update 'start' to the current index 'i' so that the next word's start can be tracked.
            }

        } // End of the 'for' loop.

        System.out.println("Biggest Word: " + Bigword); 
        // Outputting the longest word found.

        System.out.println("Length: " + max); 
        // Outputting the length of the longest word found.

    } // End of the main method.

} // End of the class.

/* 
   Dry Run Example:
   Input:
   "The quick brown fox jumps over the lazy dog"

   Let's go through the loop step by step:

   Initial string: "The quick brown fox jumps over the lazy dog " (note the extra space at the end).

   Variables:
   str = "The quick brown fox jumps over the lazy dog "
   start = 0
   end = 0
   max = 0
   Bigword = ""

   Loop Iterations:
   
   1st iteration (i = 3, space after 'The'):
   - 'end' is set to 3.
   - Extract substring from index (start + 1) = (0 + 1) to 3 -> "The".
   - Length of "The" = 3, which is greater than 'max' (0), so:
     max = 3
     Bigword = "The"
   - Update 'start' to 3.

   2nd iteration (i = 9, space after 'quick'):
   - 'end' is set to 9.
   - Extract substring from index (start + 1) = (3 + 1) to 9 -> "quick".
   - Length of "quick" = 5, which is greater than 'max' (3), so:
     max = 5
     Bigword = "quick"
   - Update 'start' to 9.

   3rd iteration (i = 15, space after 'brown'):
   - 'end' is set to 15.
   - Extract substring from index (start + 1) = (9 + 1) to 15 -> "brown".
   - Length of "brown" = 5, which is equal to 'max' (5), so no change.
   - Update 'start' to 15.

   4th iteration (i = 19, space after 'fox'):
   - 'end' is set to 19.
   - Extract substring from index (start + 1) = (15 + 1) to 19 -> "fox".
   - Length of "fox" = 3, less than 'max' (5), so no change.
   - Update 'start' to 19.

   5th iteration (i = 25, space after 'jumps'):
   - 'end' is set to 25.
   - Extract substring from index (start + 1) = (19 + 1) to 25 -> "jumps".
   - Length of "jumps" = 5, equal to 'max' (5), so no change.
   - Update 'start' to 25.

   6th iteration (i = 30, space after 'over'):
   - 'end' is set to 30.
   - Extract substring from index (start + 1) = (25 + 1) to 30 -> "over".
   - Length of "over" = 4, less than 'max' (5), so no change.
   - Update 'start' to 30.

   7th iteration (i = 34, space after 'the'):
   - 'end' is set to 34.
   - Extract substring from index (start + 1) = (30 + 1) to 34 -> "the".
   - Length of "the" = 3, less than 'max' (5), so no change.
   - Update 'start' to 34.

   8th iteration (i = 39, space after 'lazy'):
   - 'end' is set to 39.
   - Extract substring from index (start + 1) = (34 + 1) to 39 -> "lazy".
   - Length of "lazy" = 4, less than 'max' (5), so no change.
   - Update 'start' to 39.

   9th iteration (i = 43, space after 'dog'):
   - 'end' is set to 43.
   - Extract substring from index (start + 1) = (39 + 1) to 43 -> "dog".
   - Length of "dog" = 3, less than 'max' (5), so no change.
   - Update 'start' to 43.

   Final output:
   Biggest Word: quick
   Length: 5
*/
