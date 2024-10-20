
// -----------------------------------------------------------------------------
// SOME PRACTICE QUESTIONS
// -----------------------------------------------------------------------------

/*

    // Question 1.

        int a = 7;
        int b = 3;
        int result = ++a - --b + a++ * b-- - --a;
        System.out.println(result);
    

*/

/*

    // Question 2.

        int x = 15;
        int y = 4;
        int result = x-- / ++y * --x + y++;
        System.out.println(result);


*/

/*

    // Question 3.

        int p = 8;
        int q = 5;
        int result = --p % q++ + p-- * ++q - q--;
        System.out.println(result);


*/

public class Operators_Practice {

    public static void main(String[] args) {

        // Question 1.

        int a = 7;
        int b = 3;
        int result = ++a - --b + a++ * b-- - --a;
        System.out.println(result);
    
        // Lets Break it down,

        // A Variable 'a' of Datatype Integer Storing value 7.

        // A Variable 'b' of Datatype Integer Storing value 3.

        // A Variable 'result' of Datatype Integer Storing  ++a - --b + a++ * b-- - --a.

        // Lets solve, and find the value of result,

        // In Java Precedence, we will solve ++ and -- first.

        // According to Java Associativity, we will solve from left to right.

        // So, first is  ++a (prefix increment).

        // Which means first increment the value of 'a' and then use it.

        // Before, a = 7

        // After Increment, a = 8

        // result = 8 - --b + a++ * b-- - --a;

        // So, --b (prefix decrement).

        // Which means first decrement the value of 'b' and then use it.

        // Before, b = 3

        // After Decrement, b = 2

        // result = 8 - 2 + a++ * b-- - --a;

        // So, a++ (postfix increment).

        // Which means first use the value of 'a' and then increment it.

        // Before, a = 8

        // After Increment, a = 9

        // but we will use the before value of 'a' first which is 8.

        // result = 8 - 2 + 8 * b-- - --a;

        // So, b-- (postfix decrement).

        // Which means first use the value of 'b' and then decrement it.

        // Before, b = 2
        
        // After Decrement, b = 1

        // but we will use the before value of 'b' first which is 2.

        // result = 8 - 2 + 8 * 2 - --a;

        // So, --a (prefix decrement).

        // Which means first decrement the value of 'a' and then use it.

        // Before, a = 9

        // After Decrement, a = 8

        // result = 8 - 2 + 8 * 2 - 8;

        // Now, we got all the values, According to Java Precedence * has higher precedence than - and +.

        // So, we will solve * and / first.

        // 8 * 2 -> 16

        // result = 8 - 2 + 16 - 8;

        // , According to Java Associativity, we will solve from left to right.

        // result = 6 + 16 - 8;
        // 
        // result = 22 - 8;

        // So, result = 14.

        // System.out.println(result);

        // OUTPUT:- 14


         // Question 2.

         int x = 15;
         int y = 4;
         int res = x-- / ++y * --x + y++;
         System.out.println(res);


        // A Variable 'x' of Datatype Integer Storing value 15.

        // A Variable 'y' of Datatype Integer Storing value 4.

        // A Variable 'result' of Datatype Integer Storing  x-- / ++y * --x + y++.

        // Lets solve, and find the value of result,

        // In Java Precedence, we will solve ++ and -- first.

        // According to Java Associativity, we will solve from left to right.

        // So, first is  x-- (postfix decrement).

        // Which means first use the value of 'x' and then decrement it.

        // Before, x = 15

        // After Decrement, x = 14

        // But we will use the before value of 'x' first which is 15.

        // result = 15 / ++y * --x + y++;

        // So, ++y (prefix increment).

        // Which means first increment the value of 'y' and then use it.

        // Before, y = 4

        // After Increment, y = 5

        // result = 15 / 5 * --x + y++;

        // So, --x (prefix decrement).

        // Which means first decrement the value of 'x' and then use it.

        // Before, x = 14

        // After Decrement, x = 13

        // result = 15 / 5 * 13 + y++;

        // So, y++ (postfix increment).

        // Which means first use the value of 'y' and then increment it.

        // Before, y = 5

        // After Increment, y = 6

        // But we will use the before value of 'y' first which is 5.

        // result = 15 / 5 * 13 + 5;

        // According to Java Precedence, * and / have higher precedence than + and -.

        // So, we will solve * and / first.

        // According to Java Associativity, we will solve from left to right.

        // 15 / 5 -> 3

        // result = 3 * 13 + 5;

        // 3 * 13 -> 39

        // result = 39 + 5;

        // 39 + 5 -> 44

        // result = 44;

        // System.out.println(result);

        // OUTPUT:- 44


        // Question 3.

        int p = 8;
        int q = 5;
        int ans = --p % q++ + p-- * ++q - q--;
        System.out.println(ans);

        // A Variable 'p' of Datatype Integer Storing value 8.

        // A Variable 'q' of Datatype Integer Storing value 5.

        // A Variable 'ans' of Datatype Integer Storing  --p % q++ + p-- * ++q - q--.

        // Lets solve, and find the value of ans,

        // In Java Precedence, we will solve ++ and -- first.

        // According to Java Associativity, we will solve from left to right.

        // So, first is  --p (prefix decrement).

        // Which means first decrement the value of 'p' and then use it.

        // Before, p = 8

        // After Decrement, p = 7

        // ans = 7 % q++ + p-- * ++q - q--;

        // So, q++ (postfix increment).

        // Which means first use the value of 'q' and then increment it.

        // Before, q = 5

        // After Increment, q = 6

        // But we will use the before value of 'q' first which is 5.

        // ans = 7 % 5 + p-- * ++q - q--;

        // So, p-- (postfix decrement).

        // Which means first use the value of 'p' and then decrement it.

        // Before, p = 7

        // After Decrement, p = 6

        // But we will use the before value of 'p' first which is 7.

        // ans = 7 % 5 + 7 * ++q - q--;

        // So, ++q (prefix increment).

        // Which means first increment the value of 'q' and then use it.

        // Before, q = 6

        // After Increment, q = 7

        // ans = 7 % 5 + 7 * 7 - q--;

        // So, q-- (postfix decrement).

        // Which means first use the value of 'q' and then decrement it.
        
        // Before, q = 7

        // After Decrement, q = 6

        // But we will use the before value of 'q' first which is 7.

        // ans = 7 % 5 + 7 * 7 - 7;

        // According to Java Precedence, % and * have higher precedence than + and -.

        // So, we will solve % and * first.

        // According to Java Associativity, we will solve from left to right.

        // 7 % 5 -> 2

        // ans = 2 + 7 * 7 - 7;

        // 7 * 7 -> 49

        // ans = 2 + 49 - 7;

        // Now, we will solve + and -.

        // According to Java Associativity, we will solve from left to right.

        // 2 + 49 -> 51

        // ans = 51 - 7;

        // 51 - 7 -> 44

        // ans = 44;

        // System.out.println(ans);

        // OUTPUT:- 44



        
    }  
}
