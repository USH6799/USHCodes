public class Datatypes {
    public static void main(String[] args) {
        // Let us understand about datatypes before Starting Variables.

        // Datatypes are just used to Specify the Type of Data, so that computer can understand it and use it properly.

        // Like if you want to use any numbers, than you have to specify the Datatype of that number like Integer, Float, Double , Short or Long.

        // Before Starting Datatypes let us know something about memory, like each value takes some space in our memory in form of bits and bytes.

        // 1 bit => (0 or 1)

        // 1 byte => 8 bits
        // 1 kilobyte(kb) => 1024 bytes
        // 1 megabyte(mb) => 1024 kilobytes
        // 1 gigabyte(gb) => 1024 megabytes
        // 1 terabyte(tb) => 1024 gigabytes
        // 1 petabyte(pb) => 1024 terabytes
        // 1 exabyte(eb) => 1024 petabytes
        // 1 zettabyte(zb) => 1024 exabytes
        // 1 yottabyte(yb) => 1024 zettabytes

        // Each Datatype have different Memory Size.

        // --------------------------------------------------------------------------

        // There are Mainly 2 types of Datatypes in Java:-

        // 1. Primitive Datatypes
        // 2. Non-Primitive Datatypes

        // Primitive Datatypes:-

        // Byte => Space: 1 byte or 8 bits
        // Range:- -128 to 127

        // Boolean(True or False) => Space: 1 byte or 8 bits
        // Range:- true(1) or false(0)

        // short => Space: 2 bytes or 16 bits
        // Range:- -32,768 to 32,767 / -2^15 to 2^15 - 1

        // char(Character) => Space: 2 bytes or 16 bits
        // Range:- 0 to 65535

        // int(Integer) => Space: 4 bytes or 32 bits
        // Range:- -2,147,483,648 to 2,147,483,647 / -2^31 to 2^31 - 1

        // float(Float or Decimal Values) => Space: 4 bytes or 32 bits
        // Range:- Can Store about 6-7 decimal digits

        // Long(Long or big integer values) => Space: 8 bytes or 64 bits
        // Range:- -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 / -2^63 to 2^63 - 1

        // double(Double or Big Decimal Values) => Space: 8 bytes or 64 bits
        // Range:- Can Store about 15 decimal digits

        // Non-Primitive Datatypes:-
        // there memory size is not fixed and can change according to the values Stored in it.

        // They are the Set of Different Primitive datatypes or more than one Primitive Datatype.

        // In My words, all Non-Primitive Datatypes are formed by some Primitive Datatypes and have Storage size according to them.

        // String
        // Array
        // Object
        // Class
        // Interface

        // -----------------------------------------------------------------------------

        // Lets do Some Coding.

        Byte a = 12; // A variable 'a' of Datatype Byte Storing the value 12.

        char ch = 'a'; // A variable 'ch' of Datatype char Storing the value 'a'.
        // Character values are always enclosed with Single Quotes 'char'.

        short b = 112; // A variable 'b' of Datatype short Storing the value 12.

        Boolean flag = true; // A variable 'flag' of Datatype Boolean Storing the value true.

        int c = 1234567890; // A variable 'c' of Datatype int Storing the value 1234567890.

        long d = 3456789L; // A variable 'd' of Datatype long Storing the value 3456789L.

        // We have to Specify the 'L' at the end of the number to show them as long values because by default in java all decimal numbers are int.

        float e = 12.34f; // A variable 'e' of Datatype float Storing the value 12.34.
        // We have to Specify the Decimal number by f at last to show them as float values because by default in java all decimal numbers are double.

        double f = 12.34; // A variable 'f' of Datatype double Storing the value 12.34.

        System.out.println(a);
        // OUTPUT:- 12

        System.out.println(ch);
        // OUTPUT:- a

        System.out.println(b);
        // OUTPUT:- 112

        System.out.println(flag);
        // OUTPUT:- true

        System.out.println(c);
        // OUTPUT:- 1234567890

        System.out.println(d);
        // OUTPUT:- 3456789

        System.out.println(e);
        // OUTPUT:- 12.34

        System.out.println(f);
        // OUTPUT:- 12.34

        // Lets add two Numbers:-

        int x = 4; // A variable 'x' of Datatype int Storing the value 4.

        int y = 10; // A variable 'y' of Datatype int Storing the value 10.

        int sum = x + y; // A variable 'sum' of Datatype int Storing the value of x + y.

        // Adding two Numbers or Integer values using + operator is known as Adding, FUN FACT. have use in future.

        System.out.println(sum);
        // OUTPUT:- 14

        // -----------------------------------------------------------

        // Lets Move towards Non Primitive Datatypes:

        // String:-

        String str = "Hello I am String i can store 233 and also 2.4 and anything else";
        // String values are always Enclosed with double Quotes "String".

        // String values can contain anything, and i would say anything, it can either a char or nu,be ror decimal values or Boolean, anything.

        // But do you Know that all the things written inside the String str are neither Of Integer datatype, nor any other primitive datatype, but in reality they are of char datatype.

        // In Other words, U can Say that Strings are the Set of different Characters.

        // Like here 'H' is a char, '2' is also a char, '.' is also a char, and everything else are of Character Datatype.

        System.out.println("str");
        // Here we are directly printing the String value.

        // OUTPUT:- str

        System.out.println(str);
        // But here we are printing the value of Variable str which stores some String value.

        // OUTPUT:- Hello I am String i can store 233 and also 2.4 and anything else.

        // We will learn about other Non-Primitive Datatypes in Upcoming Chapters, till we only require to know about main primitive datatype and String Datatype.

        // ------------------------------------------------------------------------

        // NevertheLess, Additional Knowledge about Strings,

        // Concatenation(or Addition of String using + Operator).

        // There are Two ways to Concatenate Strings or Add Strings, ies. Using + Operator or .concat() fnc.

        // But here we will understand about + Operator Only:

        String str_1 = "1"; // A Variable str_1 storing Some String values.

        String str_2 = "1"; // A Variable str_2 storing Some String values.

        String str3 = str_1 + str_2; // Adding Both Strings and Storing it in Variable str3.

        System.out.println(str3); // printing the value Stores in Variable str3.

        // OUTPUT:- 11

        // Hence they are joined not Added and i have also Proved that 1 and 1 is Equal to 11 not 2,😂😂.

        // Concatenation works only in string values where using + operator it attaches both values as a single unit.

        // Ex:- In integer, 1 + 1 = 2, like math toppers says 1 + 1 is 2.

        // Ex:- In string, "1" + "1" = "11", like Legends says 1 + 1 is 11.

        // So there is different fnc of Operators with resect of Different Datatypes.

        // -------------------------------------------------------------------------

        // Lets Do Some Practice and Check Your Understanding:-

        /*
           How to Calculate the Below thing:-
           
           a1 X b1
           ---------
           a1 - b1
           
         */

        int a1  = 10; // A Variable 'a1' of Datatype int(Integer), Storing 10.
        
        int b1 = 5; // A Variable 'b1' of Datatype int(Integer), Storing 5.

        int ans = 10; // A Variable 'ans' of datatype int(Integer), Storing Result.

        // which Option will give the Same value of ans.

        /*
           OPTION 1:
           ans = a1 * b1 / a1 - b1;
         */

        /*
           OPTION 2:
           ans = (a1 * b1) / a1 - b1;
         */

        /*
           OPTION 3:
           ans = (a1 * b1) / (a1 - b1);
         */

        // Try to Copy my Code and Run it in your System and Understand the OUTPUTS.

        // ----------------------------------------------------------------------
    }
}
