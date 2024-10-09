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


public class TypeConversionPractice {

    public static void main(String[] args) {
        
        // Question 1.

        System.out.println('a' + 10 + "Hello" + ('e' + 1.0));

        // Lets Break it Down,

        // due to Java Associativity and Precedence We will solve the Brackets first.

        // ('e' + 1.0) -> (char + double),

        // So char v/s Double, will result in Double.

        // So Converting char into Double through Implicit Type Conversion.

        // ASCII value of 'e' -> 101 -> Integer

        // Now ('e' + 1.0) -> (101 + 1.0) -> (int + double).
        
        // So int v/s Double, will result in Double.

        // So Converting int into Double through Implicit Type Conversion.

        // (101 + 1.0) -> (101.0 + 1.0) -> 102.0

        // Next part ('a' + 10 + "Hello" + 102.0);

        // due to Java Associativity and Precedence We will solve From left to Right.

        // ('a' + 10) -> (char + int),

        // So char v/s int, will result in int.

        // So Converting char into int through Implicit Type Conversion.

        // ASCII value of 'a' -> 97

        // ('a' + 10) -> (97 + 10) -> (107)

        // Next part (107 + "Hello" + 102.0)

        // (107 + "Hello") -> (int + String)

        // So int v/s String, will result in String.

        // So Converting int into String through Implicit Type Conversion.

        // (107 + "Hello") -> ("107" + "Hello") -> "107Hello"

        // Next part ("107Hello" + 102.0)

        // ("107Hello" + 102.0) -> (String + double)

        // So String v/s double, will result in String.

        // So Converting double into String through Implicit Type Conversion.

        // ("107Hello" + 102.0) -> ("107Hello" + "102.0") -> "107Hello102.0"

        // Final OUTPUT:- 107Hello102.0

        //----------------------------------------------------------------------

        // Question 2.

        int v1 = 10; // A Variable 'v1' of Datatype Integer, Storing 10.

        int v2 = 11; // A Variable 'v2' of Datatype Integer, Storing 11.

        double p1 = v1 + v2 + 'V';

        // Lets Break it Down and Understand,

        /*
        
            Here in this Due to Java Associativity and Precedence.

            It will start solving from left to right.

            (v1 + v2) -> (int + int) -> (10 + 11) -> 21

            (v1 + v2 + 'V') -> (21 + 'V')

            (21 + 'V') -> (int + char)

            Here int and char are Different Datatype, and 
            
            int v/s char, will result in int.

            Because int is of Bigger Datatype.

            // So Through implicit Type Conversion,

            So we have to convert char into int.

            ASCII value of 'V' -> 88

            (21 + 'V') -> (21 + 88) -> (109)

            // So now, p1 is of Double datatype, so we have to convert the final answer from int to double.

            (109) -> (109.0)

            // p1 = 109.0        

         */

        int c1 = (int)p1;

        /*
        
        Here, p1 is converted into integer Datatype through Explicit Type Conversion.

        (int)(109.0) -> 109

        // So, c1 will store 109 (integer)

        */

        System.out.println((char)c1);

        /*

        // Here we have to first convert integer into char due to Explicit Type Conversion,

        // Character 'k' has its ASCII Code as 109

        // So it will convert 109 into 'k'

        // and then OUTPUT:- k

        */

        // ---------------------------------------------------------------------------

        // Question 3.

        int a = 10;

        int b = 101;

        double c = 5;

        System.out.println(a + (int)(b + c) + 0f);







    


    }
}
