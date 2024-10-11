// -------------------------------------------------------------------------

        // Lets Do Some Practice and Check Your Understanding:-

        /*
        
           How to Calculate the Below thing:-
           
           a1 X b1
           ---------
           a1 - b1
           
         */

         // int a1  = 10;  A Variable 'a1' of Datatype int(Integer), Storing 10.
        
         // int b1 = 5; // A Variable 'b1' of Datatype int(Integer), Storing 5.
 
         // int ans = 10; // A Variable 'ans' of datatype int(Integer), Storing Result.
 
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

public class Datatypes_Practice {

    public static void main(String[] args) {

    // Question 1.

    int a1  = 10;  // A Variable 'a1' of Datatype int(Integer), Storing 10.

    int b1 = 5; // A Variable 'b1' of Datatype int(Integer), Storing 5.

    int ans = 10; // A Variable 'ans' of datatype int(Integer), Storing Result.

    // Lets check the 1st OPTION.

    ans = a1 * b1 / a1 - b1;

    // Lets Interpret it and Check whether it gives the Same value of ans or not.

    // Java do not Follow BODMAS Rule. It has its own Associativity and Precedence.

    // According to Java Associativity and Precedence, it will do the following:-

    // * and / has higher precedence than - and +.

    // So, we will solve * and / first.

    // It has left to right associativity or the direction of interpretation.

    // Here, a1 * b1 will be solved first.

    // a1 * b1 -> 10 * 5 -> 50.

    // Then 50 / a1 will be solved.

    // 50 / a1 -> 50 / 10 -> 5.

    // Then we will solve + and -.

    // It also has same Associativity means left to right.

    // 5 - b1 will be solved.

    // 5 - b1 -> 5 - 5 -> 0.

    // Final Value of ans is 0.

    // Lets check.

    System.out.println(ans); // Prints 0.

    // This means this the Wrong Option as it doesn't give the same value of ans.

    
    // Lets check the 2nd OPTION.

    ans = (a1 * b1) / a1 - b1;

    // Lets Break it down,

    // According to Java Associativity and Precedence,

    // Brackets () has Higher Precedence than * and / .

    // * and / has higher Precedence than + and -.

    // So, we will solve the Brackets first.

    // (a1 * b1) will be Solved first.

    // Inside bracket, it has * and * as Associativity from left to right.

    // (a1 * b1) -> (10 * 5) -> 50

    // Then we will solve the / .

    // 50 / a1 -> 50 / 10 -> 5

    // then at last we will solve, - .

    // 5 - b1 -> 5 - 5 -> 0
    
    // So, final value of ans is 0.

    // This means this is also the Wrong OPTION.

    System.out.println(ans); // OUTPUT: 0

    // Lets check the Last Option.

    ans = (a1 * b1) / (a1 - b1);

    // Lets Break it down,

    // According to Java Associativity and Precedence,

    // Brackets () has Higher Precedence than * and / .

    // * and / has higher Precedence than + and -.

    // (a1 * b1) will be Solved first.

    // (a1 * b1) -> 10 * 5 -> 50

    // Then, the another Bracket will be Solved.

    // (a1 - b1) will be solved.

    // (10 - 5) -> 5

    // Now, we will solve the / .

    // 50 / 5 -> 10

    // So, the final value of ans is 10.

    // This is the Correct Answer, because the final value of ans is same.

    System.out.println(ans); // OUTPUT: 10


    // LETS SEE THE ALTERNATE METHOD,

    
    //  a1 X b1
    // ---------
    //  a1 - b1

    // Lets Write it in linear, way.

    // 10 X 5       50
    // ------- => ------ => 10
    // 10 - 5       05

    // by this we Understand the linear way,

    // So it will be like

    // ans = (a1 * b1) then divided by (a1 - b1)

    // So, the Third Option matches and Hence it is Correct.
    
    

        
    }
}
