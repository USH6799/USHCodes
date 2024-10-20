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

        // System.out.println('S' + "" + 1 + 10)

        // System.out.println('S' + "" + 1 + 10)

        // System.out.println(char + String + int + int)

        // So We have to convert character to String.

        // So We have to convert Integer to String.

        // System.out.println("S" + "" + "1" + "10")

        // OUTPUT:- S110


        // Question 2.

        String str1 = "Java";
        String str2 = "java";
        String res = (str1.equals(str2) ? str1 : str2).toLowerCase();
        System.out.println(res.substring(0, 2).concat(res.substring(2).toUpperCase()));

        // A Variable 'str1' of Datatype String Storing value "Java"

        // A Variable 'str2' of Datatype String Storing value "java"

        // A Variable 'res' of Datatype String Storing value (str1.equals(str2) ? str1 : str2).toLowerCase();

        // Here we uses the ternary operator (? :).

        // so if the condition is true, then it will return the str1 and if the condition is false then it will return str2.

        // Condition: str1.equals(str2)

        // .equals() function compares the two Strings, case wise and Length wise as Well, and return true or false.

        // str1 = "Java"

        // str2 = "java"

        // str1.equals(str2) -> "Java".equals("java"), which is false, because case wise, the str1 has uppercase 'J' and str2 has lowercase 'j'.

        // So, it will return str2, because condition is false.

        // .lowerCase() function converts the String to lowercase.

        // str2.toLowerCase() -> "java".toLowerCase() -> "java"

        // Final value of 'res' becomes "java".

        // Lets see the print statement, and interpret it,

        // res.substring(0, 2).concat(res.substring(2).toUpperCase())

        // Here the first String function is .substring(index).

        // This substring() fnc takes two parameter: the starting Index and the Ending index and then take that part of String from the Specified Index and Return it, it includes the character of Starting index but do not include the Character of Ending Index.

        // Lets do the Indexing first,

        // String -> j a v a
        // Index  -> 0 1 2 3

        // res.subString(0 , 2) -> "java".subString(0 , 2) -> "ja"

        // Because index 0 will be included but index 2 won't be included.

        // "ja".concat(res.substring(2).toUpperCase())

        // So, we have to Solve the inner functions first,

        // res.substring(2) -> Will return the characters from index 2 till end.

        // res.substring(2) -> "java".substring(2) -> "va"

        // "va".toUpperCase() -> Returns the String in Uppercase.

        // va.toUpperCase() -> "VA"

        // System.out.println(res.substring(0, 2).concat(res.substring(2).toUpperCase()));

        // System.out.println("ja".concat("VA"));
        
        // .concat() function is used to concatenate two strings Together or join them as single String.
        
        // System.out.println("jaVA");

        // OUTPUT:- jaVA
        

        
        // Question 3.

        String Str = "Split,This,String,Complexity";
        String[] parts = Str.split(",");
        String ans = String.join(" ", parts);
        System.out.println(ans.substring(0, 5).toUpperCase() + parts[2].length());


        // A Variable 'Str' of Datatype String storing value "Split,This,String,Complexity"

        // An Array 'parts' of Datatype String Storing Str.split(",");

        // .split() function splits the given String by the indices on which the parameter Character or String is Found.

        // .split() Returns an Array of Strings.

        // "Split,This,String,Complexity".split(","); means it splits the String into an Array from Point "," where it is found.

        // "Split,This,String,Complexity".split(",") -> ["Split" , "This" , "String" , "Complexity"]

        // Remember it is an Array of Strings so it need an array container to be Stored.

        // Here 'parts' Array served as the Container.

        // parts = ["Split" , "This" , "String" , "Complexity"]
        // Index =     0    ,    1   ,     2    ,      3

        // A Variable 'ans' of Datatype String Storing String.join(" ", parts);

        // .join() fnc is used to join the all the items of array into a Single String separated by the parameter.

        // U can say .join() is the reverse function of .split()

        // String.join(" " , ["Split" , "This" , "String" , "Complexity"])

        // this means it will join each item of array separated by " ", and return a Single String.

        // It will be like "Split" + " " + "This" + " " + "String" + " " + "Complexity"

        // Now, the final of res will be "Split This String Complexity".

        // ans = "Split This String Complexity"

        // Lets move towards the printing Statement,

        // System.out.println(ans.substring(0, 5).toUpperCase() + parts[2].length());

        // This substring() fnc takes two parameter: the starting Index and the Ending index and then take that part of String from the Specified Index and Return it, it includes the character of Starting index but do not include the Character of Ending Index.

        // Lets do the Indexing First,

        // String -> S p l i t   T h i s    S  t  r  i  n  g     C  o  m  p  l  e  x  i  t  y
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27

        // ans.substring(0 , 5) -> "Split This String Complexity".substring(0 , 5) -> "Split"

        // It Includes the index 0 character but it do not include index 5 character.

        // Then .toUpperCase() which converts the String into Uppercase.

        // "Split".toUpperCase() -> "SPLIT"

        // parts[2].length()

        // Here we are taking the item of the array 'parts' at index 2

        // Item at index 2 in 'parts' Array is "String"

        // .length() calculates and return the total length of the String or the Number of Character in the String.

        // "String".length() -> 6

        // System.out.println(ans.substring(0, 5).toUpperCase() + parts[2].length());
        
        // System.out.println("SPLIT" + 6);
        
        // System.out.println(String + int);

        // so we have to Convert Integer into String through implicit Type Conversion.

        // 4 (integer) -> "6" (String)

        // System.out.println("SPLIT" + "6") -> OUTPUT:- SPLIT6
        














 



    }
    
}
