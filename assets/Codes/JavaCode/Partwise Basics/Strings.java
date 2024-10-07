import java.util.Scanner;
// imported scanner class for taking input from user.

public class Strings {
    public static void main(String[] args) {

        // String is a non-primitive datatype value.

        // It is the Collection of Characters, or the Sequence of Characters.

        // like "hello123", it is a string which has 'h' , 'e' , 'l' , 'o' , '1' , '2' , '3' as its characters.

        // It is non-primitive hence its memory size is not fixed but we can find through total no. of characters in it.

        // Because each character is of 2 Byte in size.

        // So, String will take memory of character size * total no. of characters

        // -------------------------------------------------------------------
        // String Declaration
        // -------------------------------------------------------------------

        // Through Wrapper Class, or its Primitive class.

        String st = new String("Hello123 Sir");

        System.out.println(st); // OUTPUT:- Hello123 Sir

        // Through simple variables.

        String str = "Hello123 Sir";

        System.out.println(str); // OUTPUT:- Hello123 Sir

        // We will study about the 1st way in future so no need of thinking about it.

        // -------------------------------------------------------------------
        // Taking String Input
        // -------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        // creating sc object of Scanner class for taking input or running input fncs.

        String name = sc.next(); // This will take only the first word of the String and Store it in variable 'name';

        // Like input is "Hi god".

        // In this input 'Hi' and 'god' are two separate words.

        // But name will store only the first word and ignore the rest.

        System.out.println(name); // OUTPUT:- Hi

        // How to take whole String as input and Store it?

        String fullname = sc.nextLine(); // This will take the Whole String and Store it in variable 'fullname';

        // Like input is "Hi god".

        // In this input 'Hi' and 'god' are two separate words.

        // fullname = "Hi god"

        System.out.println(fullname); // OUTPUT:- Hi god

        // -------------------------------------------------------------------
        // Concatenation
        // -------------------------------------------------------------------

        // Concatenation is the process of joining two or more strings together.
        
        String a = "hello "; // A String Variable 'a' Stored the value "hello "

        String b = "world"; // A String Variable 'b' Stored the value "world"

        // Here we concatenate both Strings using the '+' operator.

        System.out.println(a + b); // OUTPUT:- hello world

        // -------------------------------------------------------------------
        // Finding the Length of String
        // -------------------------------------------------------------------

        String x = "hello what is my length?"; // A String Variable 'x' Stored the value "hello what is my length?"

        System.out.println(x.length()); // OUTPUT:- 26

        // <str>.length() fnc is used to find the length of the String.


        // -------------------------------------------------------------------
        // charAt(finding the character at particular index)
        // -------------------------------------------------------------------

        String y = "hello"; // A String Variable 'y' Stored the value "hello"

        // Here we find the character at particular index using charAt() fnc.

        // Lets find the Character at index 3.

        System.out.println(y.charAt(3)); // OUTPUT:- l

        // <str>.charAt() fnc is used to find the character at particular index.

        // here Java Indexing begins from 0.

        //  String ->  h e l l o
        //  Index  ->  0 1 2 3 4

        // Now i want to Split each Character of this String,

        // Lets put an loop to take each Character one by one and print it.

        for(int i = 0 ; i < y.length() ; i++){ // A for loop running on variable 'i' which is iterating from 0 to y.length().

            System.out.print(y.charAt(i) + " , "); // Printing Character at index 'i' in the String 'y' one by one.

        }// for loop ends here.

        System.out.println(); // Empty print statement to add extra line so that further input may continue from next line.

        // Lets perform a dry run and check the output.

        // y.length() -> 5 

        //  String ->  h e l l o
        //  Index  ->  0 1 2 3 4

        // For i = 0, (i < 5) -> true,

        // So, i = 0 and y.charAt(0) -> h

        // For i = 1, (i < 5) -> true,

        // So, i = 1 and y.charAt(1) -> e

        // For i = 2, (i < 5) -> true,

        // So, i = 2 and y.charAt(2) -> l

        // For i = 3, (i < 5) -> true,

        // So, i = 3 and y.charAt(3) -> l

        // For i = 4, (i < 5) -> true,

        // So, i = 4 and y.charAt(4) -> o

        // So, i = 5, (i < 5) -> false, so, loop ends here.

        // OUTPUT:- h , e , l , l , o ,

        // -------------------------------------------------------------------
        // .indexOf (used to find the index of given Character or String in another String.)
        // -------------------------------------------------------------------

        // indexOf() fnc is used to find the index of given String or Character in a Particular String,

        // In case of Multiple Occurrences of Character in String then it will run the first Occurrence index of that String.

        String str13 = "Hello World i hope it is well"; // A String variable 'str13' Storing 'Hello World i hope it is well'.

        int index = str13.indexOf('e'); // This will return the index of first Character found in the string 'str13'.

        // Lets understand Its Indexing first.

        // String -> H e l l o   W o r l d     i     h  o  p  e     i  t     i  s     w  e  l  l
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28

        // According to above Statement, it will return the first Occurrence of 'e' in String "hello World i hope it is well".

        // It will check the Whole String, starting from 0 index till last index.

        // 'e' is founded at index 1.

        // 'index1' variable will Store 1 because 'e' is found at index 1.

        System.out.println(index); // OUTPUT:- 1

        // lets find 'o'

        int index1 = str13.indexOf('o'); // This will return the index of first Character found in the string 'str13'.

        // According to above Statement, it will return the first Occurrence of 'o' in String "hello World i hope it is well".

        // It will check the Whole String, starting from 0 index till last index.

        // 'o' is founded at index 4 and at index 7.

        // 'index' variable will Store 4 because first Occurrence of 'o' is found at index 4 not 7.

        // This will only return the first occurrence and then do not check further String.

        System.out.println(index1); // OUTPUT:- 4

        // But what if i want to Know the index of 2nd Occurrence of 'o' in the String.

        // Here we can also set the Starting and Ending Index, from where search will start.

        int index2 = str13.indexOf('o' , 5); // This will return the index of first Character found in the string 'str13'.

        // According to above Statement, it will return the first Occurrence of 'o' in String "hello World i hope it is well".

        // It will not check the Whole String, it will start searching from index 5 till last index because last index is not specified and by default it is length of String.

        // It will search in only " World i hope it is well".

        
        // 'o' is founded at index 7 in this new range of String.
        
        // 'index2' variable will Store 7 because first Occurrence of 'o' is found at index 7 according to new String.
        
        // This will only return the first occurrence and then do not check further String.

        System.out.println(index2); // OUTPUT:- 7

        // Now i wanted to find index of i in 'hope it is'.

        // This time we need to enter both beginning and ending index of the String, in which it will search for i.

        // So lets try to find 'i'.

        int index3 = str13.indexOf('i' , 14 , 24); // This will return the index of first Character found in the string 'str13'.

        // According to above Statement, it will return the first Occurrence of 'i' in String "hello World i hope it is well".

        // It will not check the Whole String, it will start searching from index 14 till index 24 because starting and ending index for the Searching is Provided by the user in the function.

        // It will search in only "hope it is".I  

        
        // 'i' is founded at index 19 in this new range of String.
        
        // 'index3' variable will Store 19 because first Occurrence of 'o' is found at index 19 according to new String.

        System.out.println(index3); // OUTPUT:- 19



        // -------------------------------------------------------------------
        // .lastIndexOf (used to find the last index of a given Character or String in another String.)
        // -------------------------------------------------------------------

        // lastIndexOf() function is used to find the last occurrence of a given String or Character in a Particular String,

        // In case of Multiple Occurrences of Character or String, it will return the index of the last occurrence.

        // Let's take a new example String.

        String str14 = "This is a simple example of lastIndexOf function in Java."; // A String variable 'str14' storing 'This is a simple example of lastIndexOf function in Java.'.

        int lastIndex = str14.lastIndexOf('i'); // This will return the last index of the Character 'i' found in the string 'str14'.

        // According to the above statement, it will return the last occurrence of 'i' in the String "This is a simple example of lastIndexOf function in Java."

        // It will check the whole String, starting from the last index and moving backward.

        // The last occurrence of 'i' is found at index 54.

        // The 'lastIndex' variable will store 54 because 'i' is found at index 54 in the backward search.

        System.out.println(lastIndex); // OUTPUT:- 54

        // Let's find 'e'

        int lastIndex1 = str14.lastIndexOf('e'); // This will return the last index of Character 'e' found in the string 'str14'.

        // According to the above statement, it will return the last occurrence of 'e' in the String "This is a simple example of lastIndexOf function in Java."

        // It will check the whole String, starting from the last index and moving backward.

        // 'e' is found at index 39 as the last occurrence, though 'e' also appears earlier.

        // The 'lastIndex1' variable will store 39 because 'e' is found at index 39 in the backward search.

        System.out.println(lastIndex1); // OUTPUT:- 39

        // But what if I want to know the index of the second-last occurrence of 'e' in the String?

        // We can also set the starting index, indicating from where the backward search will start.

        int lastIndex2 = str14.lastIndexOf('e', 38); // This will return the last index of Character 'e' found in the string 'str14', but starting the backward search from index 38.

        // According to the above statement, it will start searching from index 38 and move backward, so the second-last 'e' will be located.

        // It will find 'e' at index 25 in this backward search from index 38.

        // The 'lastIndex2' variable will store 25 because the second-last 'e' is found at index 25.

        System.out.println(lastIndex2); // OUTPUT:- 25

        // Now I want to find the last index of 'n' in a specific range of the String.

        // This time, we will enter both the beginning and ending index of the String within which it will search for 'n'.

        // Let's try to find 'n'.

        int lastIndex3 = str14.lastIndexOf('n', 50); // This will return the last index of Character 'n' found in the string 'str14', searching backward from index 50.

        // According to the above statement, it will return the last occurrence of 'n' in the range "This is a simple example of lastIndexOf function in Jav".

        // It will search backward starting from index 50, but it will not check beyond index 0.

        // 'n' is found at index 46 in this range.

        // The 'lastIndex3' variable will store 46 because 'n' is found at index 46 according to the backward search in the specified range.

        System.out.println(lastIndex3); // OUTPUT:- 46

        // -------------------------------------------------------------------
        // .lastIndexOf (used to find the last index of a given String in another String.)
        // -------------------------------------------------------------------

        // In this example, we will use 'lastIndexOf()' to find the last occurrence of a substring in a String.

        String str15 = "This example is a good example of how to use the lastIndexOf function."; // A String variable 'str15' storing 'This example is a good example of how to use the lastIndexOf function.'.

        int lastIndexSubstring = str15.lastIndexOf("example"); // This will return the last index of the substring 'example' found in the string 'str15'.

        // According to the above statement, it will return the last occurrence of the substring 'example' in the String "This example is a good example of how to use the lastIndexOf function."

        // It will check the whole String, starting from the last index and moving backward.

        // The last occurrence of 'example' is found at index 28.

        // The 'lastIndexSubstring' variable will store 28 because the substring 'example' is found at index 28 in the backward search.

        System.out.println(lastIndexSubstring); // OUTPUT:- 28

        // -------------------------------------------------------------------
        // lastIndexOf with a starting index to search backward from
        // -------------------------------------------------------------------

        // Let's take another example to search for the last occurrence of a character starting from a specific index.

        String str16 = "I will practice Java regularly to improve my skills in Java."; // A String variable 'str16' storing 'I will practice Java regularly to improve my skills in Java.'.

        int lastIndexFromStart = str16.lastIndexOf('a', 40); // This will return the last index of the character 'a' found in the string 'str16', but starting the backward search from index 40.

        // Let's understand its indexing first.

        // String -> I     w  i  l  l     p  r  a  c  t  i  c  e     J  a  v  a     r  e  g  u  l  a  r  l  y     t  o     i  m  p  r  o  v  e     m  y     s  k  i  l  l  s     i  n     J  a  v  a  .
        // Index  -> 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69

        // According to the above statement, it will return the last occurrence of 'a' before or at index 40 in the String "I will practice Java regularly to improve my skills in Java."

        // It will start searching backward from index 40. The character 'a' is found at index 35 in this range.

        // The 'lastIndexFromStart' variable will store 35 because 'a' is found at index 35 in the backward search starting from index 40.

        System.out.println(lastIndexFromStart); // OUTPUT:- 35

        // -------------------------------------------------------------------
        // lastIndexOf with a starting index to search for a substring
        // -------------------------------------------------------------------

        // In this example, we will search for a substring 'Java' from a specific index.

        String str17 = "Learning Java is fun. Java helps in building strong programming skills."; // A String variable 'str17' storing 'Learning Java is fun. Java helps in building strong programming skills.'.

        int lastIndexOfSubstringFromStart = str17.lastIndexOf("Java", 30); // This will return the last index of the substring 'Java' found in the string 'str17', but starting the backward search from index 30.

        // Let's understand its indexing first.

        // String -> L  e  a  r  n  i  n  g     J  a  v  a     i  s     f  u  n  .     J  a  v  a     h  e  l  p  s     i  n     b  u  i  l  d  i  n  g     s  t  r  o  n  g     p  r  o  g  r  a  m  m  i  n  g     s  k  i  l  l  s  .
        // Index  -> 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69

        // According to the above statement, it will return the last occurrence of 'Java' before or at index 30 in the String "Learning Java is fun. Java helps in building strong programming skills."

        // It will search backward starting from index 30. The substring 'Java' is found at index 8 in this range.

        // The 'lastIndexOfSubstringFromStart' variable will store 8 because 'Java' is found at index 8 in the backward search starting from index 30.

        System.out.println(lastIndexOfSubstringFromStart); // OUTPUT:- 8

        // -------------------------------------------------------------------
        // lastIndexOf with both start and end index for character search
        // -------------------------------------------------------------------

        // Now we will specify both the starting and ending index to search for the character 'o' in a substring range.

        String str18 = "Programming is all about solving problems with logic."; // A String variable 'str18' storing 'Programming is all about solving problems with logic.'.

        int lastIndexCharInRange = str18.lastIndexOf('o', 40); // This will return the last index of the character 'o' found in the string 'str18', starting the backward search from index 40.

        // Let's understand its indexing first.

        // String -> P  r  o  g  r  a  m  m  i  n  g     i  s     a  l  l     a  b  o  u  t     s  o  l  v  i  n  g     p  r  o  b  l  e  m  s     w  i  t  h     l  o  g  i  c  .
        // Index  -> 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58

        // According to the above statement, it will return the last occurrence of 'o' in the range from index 0 to 40 in the String "Programming is all about solving problems with logic."

        // It will search backward starting from index 40. The character 'o' is found at index 32 in this range.

        // The 'lastIndexCharInRange' variable will store 32 because 'o' is found at index 32 in the backward search in the given range.

        System.out.println(lastIndexCharInRange); // OUTPUT:- 32


        // -------------------------------------------------------------------
        // .compareTo() (Used to Compare two String graphically)
        // -------------------------------------------------------------------

        // In this it will compare the ASCII values of two Strings.

        String st1 = "Hello"; // A String Variable 'st1' Stored the value "Hello"

        String st2 = "Hi"; // A String Variable 'st2' Stored the value "Hi"

        int result = st1.compareTo(st2); // Here we compare the ASCII values of two Strings.

        // In this the first String 'st1' will be compared with the second String 'st2'.

        // Lets do A dry run and understand how it works.

        // st1 -> Hello
        // st2 -> Hi

        // So, it will start comparing the ASCII values of the first Character of both Strings.

        // Since, st1.charAt(0) -> H is same as st2.charAt(0) -> H,

        // So it won't do anything, and move to the next character.

        // This time, st1.charAt(1) -> e is different from st2.charAt(1) -> i.

        // So it will subtract st1.charAt(1) - st2.charAt(1) -> e - i.

        // but it is not possible to subtract two Characters.
        
        // so firstly it will convert and get the ASCII value of st1.charAt(1) -> e and st2.charAt(1) -> i.

        // ASCII code of 'e' -> 101

        // ASCII code of 'i' -> 105

        // Now, (e - i) -> 101 - 105 -> -4

        // So the value Stored in 'result' will be -4.

        System.out.println(result); // OUTPUT:- -4

        // -------------------------------------------------------------------
        // .compareToIgnoreCase() (Used to Compare two String graphically)
        // -------------------------------------------------------------------

        // In this also, it will compare two Strings, but it won't compare strings According to case.

        String st3 = "Hello"; // A String Variable 'st3' Stored the value "Hello"

        String st4 = "wello"; // A String Variable 'st3' Stored the value "Hello"

        int result1 = st3.compareTo(st4); // Here we compare the ASCII values of two Strings.

        // Here When we start comparing the first Character of both Strings,

        // Since, st3.charAt(0) -> H is different from st4.charAt(0) -> w,

        // We will Compare the ASCII values of st3.charAt(0) -> H and st4.charAt(0) -> w.

        // ASCII code of 'H' -> 72

        // ASCII code of 'w' -> 119

        // Now, (H - w) -> 72 - 119 -> -47

        // Now the value Stored in 'result1' will be -47.

        System.out.println(result1); // OUTPUT:- -47

        // Now, lets use compareToIgnoreCase() function.

        int result2 = st3.compareToIgnoreCase(st4);

        // Here When we Start comparing the first Character of both Strings,

        // Since, st3.charAt(0) -> H is different from st4.charAt(0) -> w,

        // We will Compare the ASCII values of st3.charAt(0) -> H and st4.charAt(0) -> w.

        // ASCII code of 'H' -> 72

        // ASCII code of 'w' -> 119

        // But in this we are Ignoring Case, so will find the ASCII value of 'W' instead of 'w' because 'H' is an uppercase letter.

        // ASCII code of 'W' -> 87

        // Now, (H - W) -> 72 - 87 -> -15

        System.out.println(result2); // OUTPUT:- -15

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
