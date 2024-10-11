// -----------------------------------------------------------------------------
// SOME PRACTICE QUESTIONS
// -----------------------------------------------------------------------------

/*

    // Question 1.

        String str = "Data Science is the future.";
        String result = str.replace("future", "now").substring(5, 15).trim();
        System.out.println(result.charAt(0) + "" + result.indexOf('c') + result.length());


*/

/*

    // Question 2.

        String str1 = "Java";
        String str2 = "java";
        String result = (str1.equals(str2) ? str1 : str2).toLowerCase();
        System.out.println(result.substring(0, 2).concat(result.substring(2).toUpperCase()));

*/

/*

    // Question 3.

    String str = "Split,This,String,Complexity";
    String[] parts = str.split(",");
    String result = String.join(" ", parts);
    System.out.println(result.substring(0, 5).toUpperCase() + parts[2].length());

*/

public class String_Practice {

    public static void main(String[] args) {
        
        // Question 1.

        String str = "Data Science is the future.";
        String result = str.replace("future", "now").substring(5, 15).trim();
        System.out.println(result.charAt(0) + "" + result.indexOf('c') + result.length());

        // Lets see and solve the Question,

        // A variable 'str' of Datatype String Storing value "Data Science is the future."

        // A Variable 'result' of Datatype String Storing value str.replace("future", "now").substring(5, 15).trim()

        // Lets Solve and find the constant value of variable 'result'.

        // so, the first String fnc is str.replace(<old String> , <new String>), this fnc is used to replace old character or old Substring from a String and Replace it with new Character or String.

        // Its return is string.

        // str.replace("future" , "now");

        // str = "Data Science is the future."

        // "Data Science is the future.".replace("future" , now)

        // Now After Replacing 'future' with 'now'.

        // The New String formed will be returned.

        // It will be "Data Science is the now."

        // Now we have the Second String function str.substring(<beginning> , <ending>);

        // This substring() fnc takes two parameter: the starting Index and the Ending index and then take that part of String from the Specified Index and Return it, it includes the character of Starting index but do not include the Character of Ending Index.

        // This function is applied on the New String formed after Replacement.

        // "Data Science is the now".substring(5 , 15);

        // Lets do the Indexing of String first,

        // String -> D a t a   S c i e n c  e     i  s     t  h  e     n  o  w
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22

        // Lets take out the Substring from index 5 till index 15.

        // It will be "Science is" without including the Character of index 15.

        // Last String function is .trim() which Returns a string whose value is this string, with all leading and trailing space removed.

        // Leading Spaces means all the spaces at the starting of String will be removed.

        // Like "   hello".trim() will return "hello" with all spaces removed.

        // Trailing Spaces means all the spaces at the starting of String will be removed.

        // Like "  hello   Guys  ".trim() will return "hello   Guys" with all starting and ending spaces removed.

        // But you may see the spaces in between the text haven't removed.

        // When we apply here "Science is".trim() , so there are no extra spaces, so it will return the same String.

        // Now, the final value of 'result' becomes "Science is"

        // Lets see the print statement, and interpret it,

        // result.charAt(0) + "" + result.indexOf('c') + result.length()

        // Here the first String function is .charAt(index) which takes a single parameter index, and returns the character at that given Index.
        
        // result = "Science is"

        // Lets do its Indexing,

        // String -> S c i e n c e   i s
        // Index  -> 0 1 2 3 4 5 6 7 8 9

        // result.charAt(0) -> So the character at index 0 is 'S'

        // The Second function is .indexOf(character) , this function is the opposite of .charAt() fnc as its takes a single character parameter and returns the Index of the Character in the Given String, if the character is not found in String it will return -1.

        // result.indexOf('c'); -> So the Character is found at index 1 and index 5 in the String.

        // But this function only returns the first Character occurrence.

        // Which is index 1.

        // result.indexOf('c'); -> 1

        // Now, the last String Function here is .length() which returns the total length of String or the no. of Characters in the String.

        // result.length() -> total no. of Characters in String 'result'

        // result = Science is

        // Which means result.length() -> 10

        // So, Now the final println() statement will be,

        // System.out.println('S' + 1 + 10)

        // System.out.println('S' + 11)

        // System.out.println(char + int)

        // So We have to convert character to String.

        // So We have to convert Integer to String.

        // System.out.println('S' + "" + 1 + 10)

        // OUTPUT:- S110











 



    }
    
}
