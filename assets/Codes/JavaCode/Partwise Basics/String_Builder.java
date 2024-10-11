import java.util.*;

public class String_Builder {

    public static void main(String[] args) {
        
        // We know, from Earlier Chapters, that Strings are Immutable, that cannot be edited, nor the characters deleted or Changed.

        // This is due to Heap Memory in which our all String data Get Stored.

        // There are mainly Two Spaces of Memory:

        // Stack Memory:- In which all the data, are Stacked one Upon another and Executed from top to Bottom.

        // like i have created some variables.

        int a = 13; // A variable 'a' of datatype Integer Storing Integer.

        double b = 1.3; // A variable 'b' of datatype Double Storing double.

        boolean c = true; // A variable 'c' of datatype boolean Storing true.

        // In the Stack Memory, they are Stored like this.

        /* STACK MEMORY and Heap memory

            |        |
            ----------
            |   c    | --------> Inside heap memory 13 is Stored and c is pointing towards 13 as its Value.
            ----------
            |   b    | --------> Inside heap memory 1.3 is Stored and b is pointing towards 1.3 as its Value.
            ----------
            |   a    | --------> Inside heap memory 13 is Stored and a is pointing towards 13 as its Value.
            ----------

            This is know as Stack Memory in which data is arranged in form of Stacks,


            // Heap Memory is the type of Memory in which data are not arranged in form of Stacks or any order, it is just an empty space, where the values are stored, and reference are passed to Variables.

            // It first Stores a then b then c, from down to top.

            // but during Operations, firstly the Upper Stack will be removed then lower Stacks are Removed.
         
         */

        // Whenever we add, something in String, that it doesn't change the value of That String, but created a new value and Start pointing towards it. and Deletes the Old value.

        String str = "h";  // Inside Stack Memory, str is Stored.

        // Inside heap memory, "h" is Stored and str is pointing towards it[referencing].

        str = str + "e"; // Inside Stack Memory, str is Stored Already so no new data is created.

        // Inside heap memory, "h" data is Deleted, and new data "he" is Created and Now str is pointing towards it[referencing].

        str = str + "l"; // Inside Stack Memory, str is Stored Already so no new data is created.

        // Inside heap memory, "he" data is Deleted, and new data "hel" is Created and Now str is pointing towards it[referencing].

        str = str + "l"; // Inside Stack Memory, str is Stored Already so no new data is created.

        // Inside heap memory, "hel" data is Deleted, and new data "hell" is Created and Now str is pointing towards it[referencing].

        str = str + "o"; // Inside Stack Memory, str is Stored Already so no new data is created.

        // Inside heap memory, "hell" data is Deleted, and new data "hello" is Created and Now str is pointing towards it[referencing].

        // Here due to this Deletion and Recreation of values, this might take some time, in ms, which is negligible for us but when we want to manipulate String at high level, or in big Software, this might take time in Seconds, which is not good for user and reduces its Experience.

        // For this, Solution formed and Know as StringBuilder, which manipulates and Change the data rather Then deleting and Recreating.

        // Lets Understand About String Builder class.

        // Syntax will be same as Syntax of Object Creation.

        // Here the StringBuilder class do not Create variable, but creates Objects.

        // Syntax:- <className> <object name> = new <className> ();

        // className: StringBuilder

        // Syntax for StringBuilder:- StringBuilder <object name> = new StringBuilder(<value>);

        // Lets create our 1st Variable sb.
    
        StringBuilder sb = new StringBuilder("Hello Guys"); // Here we are Creating Object of String Builder.

        // The variable 'sb' is Storing the value "Hello Guys"

        System.out.println(sb); // OUTPUT:- Hello Guys

        // Lets know about Some functions of String Builder class Which is used to manipulate String.

        // -----------------------------------------------------------------------------
        // <string>.charAt(<index>); To get the character at given index.
        // -----------------------------------------------------------------------------

        // Lets get the First Character of the String.

        // Lets do the Indexing First.

        // String -> H e l l o   G u y s
        // Index  -> 0 1 2 3 4 5 6 7 8 9

        // So, lets get the first Character means the Character at index 0.

        System.out.println(sb.charAt(0)); // OUTPUT:- H

        // -----------------------------------------------------------------------------
        // <string>.setCharAt(<old index>, <new char>); To set the character at given index.
        // -----------------------------------------------------------------------------

        // Now lets Understand to Set characters or Change Characters at a Given Index.

        // Lets do the Indexing First.

        // String -> H e l l o   G u y s
        // Index  -> 0 1 2 3 4 5 6 7 8 9

        // I want to Change this "Hello guys" to "Hello boys"

        // so to do that i have to Change two characters ie. "G" and "u".

        // So, index of 'G' is 6.
        // So, index of 'u' is 7.

        sb.setCharAt(6, 'B'); // Changing the value of 'G' to 'B'

        // This function will change the Character at given index (index 6) by the new Character 'B'.

        System.out.println(sb); // OUTPUT:- Hello Buys

        // this is not that i wanted, so lets claim it.

        // I want to Change one more Character at index 7.

        sb.setCharAt(7, 'o'); // Changing the value of 'u' to 'o'

        // This function will change the Character at index 7 by the new Character 'o'.

        System.out.println(sb); // OUTPUT:- Hello Boys

        // ------------------------------------------------------------------------------
        // <string>.insert(<index>, <value>); To Insert the value at given index.
        // -----------------------------------------------------------------------------

        // This Function is used to add new Characters in the String.

        // Here "Hello Boys" look incomplete due to full stop(.), so lets add it.

        // Lets do the Indexing First.

        // String -> H e l l o   B o y s
        // Index  -> 0 1 2 3 4 5 6 7 8 9

        // Here i want to add a new Character at last means after 9th index, or i mean at 10th index.

        sb.insert(10, '.'); // Adding a new Character at 10th index

        // Here This function will add a new Character '.' at Given Index (10th index).

        System.out.println(sb); // OUTPUT:- Hello Boys.

        // I want to add an Extra 's' before full Stop(.)

        // Lets do the Indexing First,

        // String -> H e l l o   B o y s .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10

        // So this means I want to add an Extra character at 9th Index.

        sb.insert(9, 's'); // Adding a new Character at 9th index

        // Here This function will add a new Character 's' at Given Index (9th index).

        System.out.println(sb); // OUTPUT:- Hello Boyss.

        // Now, see the Indexing:-

        // String -> H e l l o   B o y s s  .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11

        // Here we have added a new character 's' at index 9 and shifted the rest string part forward.


        // ------------------------------------------------------------------------------
        // <string>.delete(<start index>, <end index>); To delete the characters between start and end index.
        // ------------------------------------------------------------------------------

        // Lets delete "llo" from "hello Boyss.".

        // Lets do the indexing first,

        // String -> H e l l o   B o y s s  .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11

        // So i want to delete from index 2 till index 4.

        sb.delete(2, 5); // Deleting the characters between 2nd and 5th index.

        // I had written 2nd Index because it is inclusive, or included in deleting, means the Character at index 2 will be deleted.

        // I had written 5th index because it is exclusive, or not included in deleting, means the Character at index 5 will not be deleted.

        // It will delete everything from 2nd Index till 5th Index.

        // but not include the 5th index or you can say till 4th index.

        System.out.println(sb); // OUTPUT:- He Boyss.

        // I also wanted to Delete that extra 's'.

        // Lets do the Indexing first,

        // String -> H e   B o y s s .
        // Index  -> 0 1 2 3 4 5 6 7 8 

        // So i want to delete extra 's' i can pick any 's', so lets pick the last 's' at index 7.

        sb.delete(7 , 8); // Deleting the Characters between 7th and 8th index.

        // As i said starting index is inclusive an Ending index in exclusive, so i won't delete the 8th index Character.

        // but it will the 7th index Character as it is Inclusive.

        System.out.println(sb); // OUTPUT:- He Boys.

        // ------------------------------------------------------------------------------
        // <string>.append(<substring>); Use to add a Substring at the Last of the String.
        // ------------------------------------------------------------------------------

        // I also wanted to add "He Boys and she Girls", but it is only "He Boys".

        // I am not going to add Each character using insert() fnc, nor i am going to simply use concatenation, as it is not the Correct way.

        // So, lets use the append() fnc which will add the sub String at the last of the String.

        sb.append("and she Girls."); // Here we appended the sub String at the last of the String.
        
        // By this we have added "and she Girls" at the last of the String.

        System.out.println(sb); // OUTPUT:- He Boys.and she Girls.

        // Lets remove the extra full stop in between the String.

        // Lets do the Indexing first,

        // String -> H e   B o y s . a n d     s  h  e     G  i  r  l  s  .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21

        // So we have to delete the extra full stop at index 7.

        sb.delete(7 , 8); // Deleting the Characters between 7th and 8th index.

        // Here 7th index is inclusive and 8th index is exclusive, so i won't delete the 8th index Character.

        // but it will the 7th index Character as it is Inclusive.

        System.out.println(sb); // OUTPUT:- He Boysand she Girls.

        // Now, there is no space and 'Boysand'

        // So lets fix it by inserting an space character.

        // Lets do the Indexing first,

        // String -> H e   B o y s a n d     s  h  e     G  i  r  l  s  .
        // Index  -> 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

        sb.insert(7, " "); // Inserting the space character at 7th index.

        // This will add the space character at the 7th index.

        System.out.println(sb); // OUTPUT:- He Boys and she Girls.

        // Now we have perfectly manipulated the String from "Hello Guys" to "He Boys and she Girls."

        // by learning different StringBuilder functions.

    }
}

// --------------------------------------------------------------------------------
// SOME PRACTICE QUESTIONS
// --------------------------------------------------------------------------------


// QUESTION 1. Reverse a given String and store the Reverse into new String, do not use StringBuilder class fncs.


// QUESTION 2. Reverse a given String Through String Builder Class Fncs.


// QUESTION 3. Compare the Time Complexity of Both the Cases.
// if Q.1 case has less time complexity than Q.2 , then make the new logic to reverse a String using String Builder class Fncs, with less Time complexity than Q.1 .

// Try to Solve this Problems, you will get the Solution of this Questions in next Chapter.