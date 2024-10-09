public class TypeConversion {
    
    public static void main(String[] args) {

        // Type Conversion in java means converting one datatype to another datatype.

        // There are Two types of Type Conversion In java:-

        // -------------------------------------------------------------------------
        // Implicit Type Conversion or Coercion.
        // -------------------------------------------------------------------------

        // In this type of Conversion, the Smaller Datatype Value automatically converts into bigger datatype value to match its surrounding type.

        // this is Automatically Done, hence it is done by computer itself.

        // Like 

        int a = 10; // A Variable 'a' of datatype Integer Storing value 10.

        int b = 5; // A Variable 'b' of datatype Integer Storing value 5.

        double c = 10.0; // A Variable 'c' of datatype double Storing value 10.0

        System.out.println(a + b + c);

        // In this println Statement, Addition(+) goes from left to right and hence,

        // Step 1: a + b, both are of Integer datatype means same datatype so no changes are performed and added.

        // Step 2: (a+b) + c, now the sum of a + b is of Integer datatype but c is of Double datatype.

        // Now Memorize the memory size of Each datatype.

        // Integer has 4 bytes.

        // Double has 8 bytes.

        // So Double > Integer , means double datatype is bigger than Integer datatype.

        // Hence, in Step 3: (a+b) + c -> int + double -> will give double.

        // this is due to Implicit Type Conversion.

        // OUTPUT:- 25.0 (double)

        // Lets take another Example.

        char ch = 'A'; // A character Variable storing 'A'.

        int num = 10; // A Integer Variable Storing 'num'.

        System.out.println(ch + num); 

        // now in this print statement, as we saw (ch + num) -> (char + int)

        // So according to Memory Size, char has 2 bytes and int has 4 bytes so, int > char

        // So Computer does Implicit Type Conversion to convert char into Integer.

        // Now the Question arises how does, character can be converted into integer.

        // this is Due ASCII value of Each character, like

        // 'A' -> 65 as its ASCII value.

        // A - Z -> 65 - 90

        // a - z -> 97 - 122

        // Just remember it, that the codes for alphabets are this.

        // back to Question, ch + num -> 'A' + 10 , so value of 'A' -> 65 so 65 + 10 -> 75

        // OUTPUT:- 75

        // -------------------------------------------------------------------------
        // Explicit Type Conversion or Type Casting.
        // -------------------------------------------------------------------------

        // Explicit Type Conversion or Type Casting is the process of converting from bigger datatype to smaller datatype.

        // this is done by programmer.

        // Because we are reducing the memory size, and converting it into smaller datatype.

        // Syntax:- <target datatype> <variable name>;

        // Like i have a variable 'a' of datatype double Storing 77.0

        double x = 77.0;

        // Now lets convert it into Integer datatype,
        
        int y = (int) x;

        // Hence now when we describe the target datatype as integer , it converts 'x' into integer datatype, and we need any Integer variable to store it.

        // so we created a new variable 'y' and stored the value of 'x' into it.

        System.out.println(y); // OUTPUT:- 77

        // Lets convert this Double value into character.

        char z = (char) x;
        // Hence now when we describe the target datatype as char , it converts 'x' into char datatype, and we need any char variable to store it.

        // so we created a new variable 'z' and stored the value of 'x' into it.

        System.out.println(z); // OUTPUT:- 'M'

        // Because the ASCII value of 'M' is 77

        // This type of Conversion is only possible when the value in bigger datatype can be stored or converted into smaller datatype.

        // Like lets take a double variable and convert it into integer.

        double d = 108.9;

        int i = (int) d; 

        System.out.println(i); // OUTPUT:- 108

        // Here as you saw it ignores the Decimal values and taken The Integral Part of It.

        // Lets try to convert it into Character datatype.

        char dt = (char) d;
        // Converting double d into character datatype, and storing it in variable 'dt' of character datatype.

        System.out.println(dt); // OUTPUT:- l

        // Because ASCII value of 'l' is 108.


        // ------------------------------------------------------------

        double d1 = 10.3;

        System.out.println("Hello" + 12 + d1);

        // Lets Figure Out the Output of this Println() fnc,

        // Remember always, that String datatype or All non-primitive Datatypes have bigger size than Primitive Datatypes.

        // So, print("Hello" + 12 + d1);

        // Remember (+) addition in java goes from left to right.

        // it will be print(String + int + double)

        // so Firstly War between String and Int, and String wins, so int will be Converted into String through Implicit Type Conversion.

        // "Hello" + "12"

        // Now same datatype will Concatenate.

        // Result: "Hello12"

        // Secondly, print("Hello12" + d1) -> (String + double)

        // War Between String and Double Datatype, will result in String Winning.

        // So, Double datatype will be converted into String through implicit type Conversion.
        
        // "Hello12" + d1 -> "Hello12" + "10.3" -> "Hello1210.3"

        // So final Result will be of String datatype.

        // OUTPUT:- Hello1210.3

        // But What if i want to add the numbers first and then do further things.

        System.out.println("Hello" + (12 + d1));

        // In this print statement, numbers are covered by () brackets, so they will be Execute first According to Java Associativity and Precedence.

        // (12 + d1) -> (int + double)

        // So Integer Value will be converted into Double value through implicit Type Conversion.

        // (12 + d1) -> (12.0 + 10.3) -> (22.3)

        // In print() statement, now ("Hello" + 22.3) is left.

        // ("Hello" + 22.3) -> (String + double)

        // So We have to convert double datatype into String Datatype.

        // ("Hello" + 22.3) -> ("Hello" + "22.3") -> "Hello22.3"

        // OUTPUT:- Hello22.3

        // ------------------------------------------------------------

        // Some Practice Questions like, find the Output of:-

        /* Question 1.

            System.out.println('a' + 10 + "Hello" + ('e' + 1.0));

         */

        /* Question 2.

            int v1 = 10;

            int v2 = 11;

            double p1 = v1 + v2 + 'V';

            int c1 = (int)p1;

            System.out.println((char)c1);

        */

        /* Question 3.

            int a1 = 10;

            int b1 = 101;

            double c1 = 5;

            System.out.println(a1 + (int)(b1 + c1) + 0f);
         
        */
    }
}
