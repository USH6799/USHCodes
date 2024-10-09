// -------------------------------------------------------------------
        // SOME PRACTICE QUESTIONS
        // -------------------------------------------------------------------

        // Question 1.

        
        /* What will be the Output.

            System.out.println("a");
            System.out.print("b");
            System.out.print("c");
            System.out.println("d");

        */

public class Basic_Practice {

    public static void main(String[] args) {

        // Question 1.

            System.out.println("a");
            System.out.print("b");
            System.out.print("c");
            System.out.println("d");

        // Lets Interpret its Output,

        // At first print Statement it has println() which means it adds a new line after printing.

        // So, it will print "a" and then a new line.
        
        // At Second print Statement, it has print() which means it will not add any new line after printing,
        
        // So, it will print "b" and then no new line.
        
        // At Third print Statement, it has print() which means it will not add any new line after printing,
        
        // So, it will print "c" and then no new line.

        // At Last print Statement it has println() which means it adds a new line after printing.

        // So, it will print "d" and then a new line.


        // so, lets print OUTPUT in order,

        // OUTPUT:- 
             
        //  a
        //  bcd
        // 

        // Because after printing "a" it will add a new line because it has println().

        // So, second and third do not have println() So they will print on the same.

        // Fourth has println(), so it will print first on the same line then add a new line.
    }
}
