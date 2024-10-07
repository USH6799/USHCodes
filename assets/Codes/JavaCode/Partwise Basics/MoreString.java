public class MoreString {

    public static void main(String[] args) {
        // -------------------------------------------------------------------
        // .substring() (Used to get a substring from a String)
        // -------------------------------------------------------------------

        // It is used to get a part of String or its substring.

        String str1 = "Hello I am good"; // A String Variable 'str1' Stored the value "Hello I am good"

        // Now first lets us understand the Indexing of String.

        // String -> H e l l o   I   a m    g  o  o  d
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14

        // I want to extract everything till I.

        String ext1 = str1.substring(0,5); // This will extract everything till I.

        // Here in subString fnc, we have given two parameters, first is beginning Index and 2nd parameter is Ending Index.

        // The Extracted String will include the beginning Index Character but do not Include Ending Index Character.

        // Lets understand, str1.substring(0,5) -> "hello I am good".substring(0,5).
        
        // Hence, it will extract everything till 5th index.

        System.out.println(ext1); // OUTPUT:- hello


        // I want to Extract good from the String.

        String ext2 = str1.substring(6); // This will extract everything till end.

        // Here in subString fnc, we have given one parameter, only the beginning Index is given, this will extract everything inside a String from beginning index till end, including the last character of String as well.

        System.out.println(ext2); // OUTPUT:- good

        // Strings are immutable means unplayable.

        // You cannot change any character, nor add any character, nor delete any character.

        // -------------------------------------------------------------------
        // .equals() (Used to check whether two Strings are equal or not)
        // -------------------------------------------------------------------

        // It is used to check whether two Strings are equal or not, by Its characters.

        String str2 = "Hello"; // A String Variable 'str2' Stored the value "Hello"

        String str3 = "Hello"; // A String Variable 'str3' Stored the value "Hello"

        String str4 = "hello"; // A String Variable 'str4' Stored the value "hello"

        System.out.println(str2.equals(str3)); // OUTPUT:- true

        // Because when str2 is equal to str3, it will return true.

        // Because str2 and str3 are equal, "Hello" and "Hello" are equal.

        System.out.println(str2.equals(str4)); // OUTPUT:- false

        // This will return false because "Hello" and "hello" are not equal.

        // Yes, the Words are Equal but there Case is different.

        // Like in "Hello", H is Uppercase and in "hello", h is Lowercase.

        // So it will return false.

        // -------------------------------------------------------------------
        // .equalsIgnoreCase() (Used to check whether two Strings are equal or not, ignoring case)
        // -------------------------------------------------------------------

        // It is used to check whether two Strings are equal or not, by Its characters.

        String str5 = "Hello"; // A String Variable 'str5' Stored the value "Hello"

        String str6 = "Hello"; // A String Variable 'str6' Stored the value "Hello"

        String str7 = "hello"; // A String Variable 'str7' Stored the value "hello"

        System.out.println(str5.equalsIgnoreCase(str6)); // OUTPUT:- true

        // Because when str5 is equal to str6, it will return true.

        // Because str5 and str6 are equal, "Hello" and "Hello" are equal.

        System.out.println(str5.equalsIgnoreCase(str7)); // OUTPUT:- true

        // This will return true because "Hello" and "hello" are equal.

        // The Case is Ignored, so 'H' and 'h' are treated as equal.

        // -------------------------------------------------------------------
        // .split() (Used to split a String into an array of Strings)
        // -------------------------------------------------------------------

        // It is the function to split a String into an array of Strings, by using the delimiter.

        // Delimiter is the character which will be used to split the String.

        String str8 = "Hello I am good"; // A String Variable 'str8' Stored the value "Hello I am good"

        String[] arr = str8.split("o"); // A String Array 'arr' will store the value after splitting.

        // Now lets understand the Indexing of String.

        // Indexing starts from 0.

        // So, this is the String, "Hello I am good".

        // In this, String it will split by the delimiter "o" or the Character "o".

        // So, it will split it in "hell" , " I am g" , "d".

        // Because delimiter is "o" and it doesn't count himself in array.

        // First split occurs in "hello I am good" at point o of 'hello'

        // So the before String of 'o' is "hell".

        // Remaining String is " I am good"

        // Next 'o' is at 'good' , and it will return the before String which is "I am g"

        // Remaining String is "od" , and Now 'o' is at 'od' , so it will split before String and return it.

        // Remaining String is "d", and no more delimiter is found.

        // So the last remaining String is "d", which we will be returning as an array.

        for(String word : arr) { // This will Iterate through the array of String and Store each item of the array in the String variable 'word'.

            System.out.println(word); // This will print each item of the array.

        }// for loop ends here.

        // OUTPUT:- 
        //
        //      hell
        //       I am g
        //
        //      d


        // -------------------------------------------------------------------
        // .startswith() (Used to check whether a String starts with another String)
        // -------------------------------------------------------------------

        // It is used to check whether a String starts with the parameter, or not.

        // It will return boolean either true or false.

        String str9 = "Hello"; // A String Variable 'str9' Stored the value "Hello"

        String str10 = "Hello I am good"; // A String Variable 'str10' Stored the value "Hello I am good"

        System.out.println(str9.startsWith("i")); // OUTPUT:- false

        // Because 'str9' which is 'Hello' do not start with 'i'.

        System.out.println(str10.startsWith(str9)); // OUTPUT:- true

        // This output will be true because 'str10' which is "Hello I am good", starts with 'str9' which is 'Hello'.

        // -------------------------------------------------------------------
        // .endswith() (Used to check whether a String ends with another String)
        // -------------------------------------------------------------------

        // It is used to check whether a String ends with the parameter, or not.

        // It will return boolean either true or false.

        String str11 = "good"; // A String Variable 'str11' Stored the value "good"

        String str12 = "Hello I am good"; // A String Variable 'str12' Stored the value "Hello I am good"

        System.out.println(str11.endsWith("H")); // OUTPUT:- false

        // Because 'str11' which is 'good' do not end with 'i'.

        System.out.println(str12.endsWith(str9)); // OUTPUT:- true

        // This output will be true because 'str12' which is "Hello I am good", ends with 'str11' which is 'good'.


        // -------------------------------------------------------------------
        // .replace() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The replace() function is used to replace ALL occurrences of a given character or substring in the original string.
        // Syntax: 
        // String newStr = originalString.replace(oldChar/oldSubStr, newChar/newSubStr);

        // It does NOT modify the original string but returns a new string with the replacements.

        String Str1 = "banana"; // A String variable 'Str1' storing 'banana'.

        // Using replace() to replace all occurrences of 'a' with 'o'.
        String replacedStr1 = Str1.replace('a', 'o'); // Replaces all 'a' with 'o'.

        // Dry Run:
        // Initial String -> b a n a n a
        // After Replacement -> b o n o n o
        // All 'a' characters are replaced with 'o'.

        System.out.println(replacedStr1); // OUTPUT: "bonono"


        // -------------------------------------------------------------------
        // Example 2: Replacing all occurrences of a substring
        // -------------------------------------------------------------------

        String Str2 = "abcabc"; // A String variable 'Str2' storing 'abcabc'.

        // Using replace() to replace all occurrences of "abc" with "xyz".
        String replacedStr2 = Str2.replace("abc", "xyz"); // Replaces all "abc" with "xyz".

        // Dry Run:
        // Initial String -> a b c a b c
        // After Replacement -> x y z x y z
        // All "abc" substrings are replaced with "xyz".

        System.out.println(replacedStr2); // OUTPUT: "xyzxyz"


        // -------------------------------------------------------------------
        // Example 3: Replacing digits with letters
        // -------------------------------------------------------------------

        String Str3 = "123123"; // A String variable 'Str3' storing '123123'.

        // Using replace() to replace all occurrences of '1' with 'A'.
        String replacedStr3 = Str3.replace('1', 'A'); // Replaces all '1' with 'A'.

        // Dry Run:
        // Initial String -> 1 2 3 1 2 3
        // After Replacement -> A 2 3 A 2 3
        // All '1' digits are replaced with 'A'.

        System.out.println(replacedStr3); // OUTPUT: "A23A23"


        // -------------------------------------------------------------------
        // .replaceFirst() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The replaceFirst() function is used to replace ONLY the FIRST occurrence of a given character or substring.
        // Syntax: 
        // String newStr = originalString.replaceFirst(oldSubStr, newSubStr);

        // It returns a new string where only the first occurrence is replaced.


        // -------------------------------------------------------------------
        // Example 1: Replacing the first occurrence of a substring
        // -------------------------------------------------------------------

        String Str4 = "hellohello"; // A String variable 'Str4' storing 'hellohello'.

        // Using replaceFirst() to replace the first occurrence of "hello" with "hi".
        String replacedStr4 = Str4.replaceFirst("hello", "hi"); // Replaces the first "hello" with "hi".

        // Dry Run:
        // Initial String -> h e l l o h e l l o
        // After Replacement -> h i h e l l o
        // Only the first "hello" is replaced with "hi".

        System.out.println(replacedStr4); // OUTPUT: "hihello"


        // -------------------------------------------------------------------
        // Example 2: Replacing the first occurrence of a character
        // -------------------------------------------------------------------

        String Str5 = "abracadabra"; // A String variable 'Str5' storing 'abracadabra'.

        // Using replaceFirst() to replace the first occurrence of 'a' with 'o'.
        String replacedStr5 = Str5.replaceFirst("a", "o"); // Replaces the first 'a' with 'o'.

        // Dry Run:
        // Initial String -> a b r a c a d a b r a
        // After Replacement -> o b r a c a d a b r a
        // Only the first 'a' is replaced with 'o'.

        System.out.println(replacedStr5); // OUTPUT: "obracadabra"


        // -------------------------------------------------------------------
        // Example 3: Replacing the first occurrence of a digit
        // -------------------------------------------------------------------

        String Str6 = "123123"; // A String variable 'Str6' storing '123123'.

        // Using replaceFirst() to replace the first occurrence of "12" with "45".
        String replacedStr6 = Str6.replaceFirst("12", "45"); // Replaces the first "12" with "45".

        // Dry Run:
        // Initial String -> 1 2 3 1 2 3
        // After Replacement -> 4 5 3 1 2 3
        // Only the first "12" is replaced with "45".

        System.out.println(replacedStr6); // OUTPUT: "453123"

        // -------------------------------------------------------------------
        // String Functions Overview (trim(), strip(), concat(), toUpperCase(), toLowerCase())
        // -------------------------------------------------------------------

        // Java provides various string functions to manipulate or modify strings effectively.
        // These functions return a new string since strings are immutable in Java.

        // -------------------------------------------------------------------
        // .trim() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The trim() function is used to remove any leading and trailing spaces from a string.
        // It does NOT remove spaces in between words or characters.
        // Syntax: 
        // String newStr = originalString.trim();


        // -------------------------------------------------------------------
        // Example 1: Using trim() to remove leading and trailing spaces
        // -------------------------------------------------------------------

        String Str7 = "  hello world  "; // A String variable 'Str7' storing '  hello world  ' (with spaces).

        // Using trim() to remove spaces from the beginning and end of the string.
        String trimmedStr = Str7.trim(); // Removes the leading and trailing spaces.

        // Dry Run:
        // Initial String -> "  hello world  "
        // After trim() -> "hello world"
        // The spaces before 'hello' and after 'world' are removed.

        System.out.println(trimmedStr); // OUTPUT: "hello world"

        // -------------------------------------------------------------------
        // .strip() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The strip() function is similar to trim(), but it also removes Unicode white spaces.
        // Unicode whitespaces are wider and not covered by the regular trim() function.
        // Syntax: 
        // String newStr = originalString.strip();

        // -------------------------------------------------------------------
        // Example 2: Using strip() to remove leading and trailing spaces (including Unicode spaces)
        // -------------------------------------------------------------------

        String Str8 = "   hello world   "; // A String variable 'Str8' storing '   hello world   ' (with spaces).

        // Using strip() to remove spaces (including Unicode whitespaces).
        String strippedStr = Str8.strip(); // Removes leading and trailing spaces.

        // Dry Run:
        // Initial String -> "   hello world   "
        // After strip() -> "hello world"
        // The spaces (including Unicode whitespaces) are removed.

        System.out.println(strippedStr); // OUTPUT: "hello world"


        // -------------------------------------------------------------------
        // .concat() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The concat() function is used to concatenate (join) two strings together.
        // It joins the specified string to the end of the original string.
        // Syntax: 
        // String newStr = originalString.concat(anotherString);


        // -------------------------------------------------------------------
        // Example 3: Using concat() to join two strings
        // -------------------------------------------------------------------

        String Str9 = "Hello"; // A String variable 'Str9' storing 'Hello'.
        String Str10 = " World"; // A String variable 'Str10' storing ' World'.

        // Using concat() to join 'Str9' and 'Str10'.
        String combinedStr = Str9.concat(Str10); // Joins 'Hello' and ' World'.

        // Dry Run:
        // Initial String -> "Hello"
        // Concatenated String -> "Hello World"
        // The two strings are combined into a single string.

        System.out.println(combinedStr); // OUTPUT: "Hello World"


        // -------------------------------------------------------------------
        // .toUpperCase() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The toUpperCase() function converts all characters in the string to uppercase.
        // Syntax: 
        // String upperStr = originalString.toUpperCase();

        // -------------------------------------------------------------------
        // Example 4: Using toUpperCase() to convert all characters to uppercase
        // -------------------------------------------------------------------

        String Str11 = "hello"; // A String variable 'Str11' storing 'hello'.

        // Using toUpperCase() to convert all characters to uppercase.
        String upperStr = Str11.toUpperCase(); // Converts 'hello' to 'HELLO'.

        // Dry Run:
        // Initial String -> "hello"
        // After Conversion -> "HELLO"
        // All lowercase letters are changed to uppercase.

        System.out.println(upperStr); // OUTPUT: "HELLO"


        // -------------------------------------------------------------------
        // .toLowerCase() Function (Definition and Use)
        // -------------------------------------------------------------------

        // The toLowerCase() function converts all characters in the string to lowercase.
        // Syntax: 
        // String lowerStr = originalString.toLowerCase();

        // -------------------------------------------------------------------
        // Example 5: Using toLowerCase() to convert all characters to lowercase
        // -------------------------------------------------------------------

        String Str12 = "WORLD"; // A String variable 'Str12' storing 'WORLD'.

        // Using toLowerCase() to convert all characters to lowercase.
        String lowerStr = Str12.toLowerCase(); // Converts 'WORLD' to 'world'.

        // Dry Run:
        // Initial String -> "WORLD"
        // After Conversion -> "world"
        // All uppercase letters are changed to lowercase.

        System.out.println(lowerStr); // OUTPUT: "world"
    }
}
