public class MathClass {

   public static void main(String[] args) {

        // --------------------------------------------------------------------------
        // MATH's CLASS    
        // --------------------------------------------------------------------------

        // Math class is one of the most useful class library in present time, it contains many Mathematical function which helps us to perform various mathematical question easily, like finding absolute value(abs), finding Square Root(sqrt), finding cube root(cbrt) , finding random between 0 and 1(random), and many more.

        //---------------------------------------------------------------------------

        // It is already imported in every Program of Java so u can directly use its function just like Scanner class Functions.

        // It is Another class, so we  will use a Syntax:- for Calling them

        // syntax:- <classname> . <methodname>;

        // Lets Start with our First mathematical Function.

        // --------------------------------------------------------------------------
        // Math.abs(a); (To find the Absolute Value of 'a').
        // --------------------------------------------------------------------------

        // Its return type is same as the Parameter type.

        System.out.println(Math.abs(-10)); // OUTPUT:- 10 (integer)
        
        System.out.println(Math.abs(-1.8)); // OUTPUT:- 1.8 (double)

        System.out.println(Math.abs(-19.878f)); // OUTPUT:- 19.878 (float)

        System.out.println(Math.abs(-13848l)); // OUTPUT:- 13848 (long)

        // -------------------------------------------------------------------------
        // Math.sqrt(a); (to find the Square root of 'a')
        // -------------------------------------------------------------------------

        // Its return type is Always Double for all type of parameters.

        System.out.println(Math.sqrt(64)); // OUTPUT:- 8.0 (double)

        System.out.println(Math.sqrt(9.0)); // OUTPUT:- 3.0 (double)

        // -------------------------------------------------------------------------
        // Math.cbrt(a); (to find the cube root of 'a')
        // -------------------------------------------------------------------------

        // Its return type is Always Double for all type of parameters.

        System.out.println(Math.cbrt(64)); // OUTPUT:- 4.0 (double)

        System.out.println(Math.cbrt(27.0)); // OUTPUT:- 3.0 (double)

        // -------------------------------------------------------------------------
        // Math.floor(a); (to find the floor value of 'a' | the Nearest Lower Whole Number)
        // -------------------------------------------------------------------------

        // Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.

        // Its return type is always Double for all types of Parameters.

        System.out.println(Math.floor(9.7)); // OUTPUT:- 9.0 (double)

        System.out.println(Math.floor(3)); // OUTPUT:- 3.0 (double)

        System.out.println(Math.floor(-8.2f)); // OUTPUT:- -9.0 (double)

        // -------------------------------------------------------------------------
        // Math.ceil(a); (to find the ceil value of 'a' | the Nearest Upper Whole Number)
        // -------------------------------------------------------------------------

        // Returns the largest (closest to positive infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.

        // Its return type is always Double for all types of Parameters.

        System.out.println(Math.ceil(9.7)); // OUTPUT:- 10.0 (double)

        System.out.println(Math.ceil(3)); // OUTPUT:- 3.0 (double)

        System.out.println(Math.ceil(-8.2f)); // OUTPUT:- -8.0 (double)

        // -------------------------------------------------------------------------
        // Math.clamp(val , min , max); (to Clamp a Particular 'val' between the 'min' and 'max' range)
        // -------------------------------------------------------------------------

        // Its return type is same as the Parameter type.

        System.out.println(Math.clamp(45.6 , 20 , 40.0)); // OUTPUT:- 40.0 (double)
        
        System.out.println(Math.clamp(16 , 20 , 40)); // OUTPUT:- 20 (Integer)

        System.out.println(Math.clamp(27.6 , 20 , 40)); // OUTPUT:- 27.6 (double)


        // -------------------------------------------------------------------------
        // Math.min(a , b); (find the minimum Value between a and b)
        // -------------------------------------------------------------------------

        // Its return type is same as the Parameter type.

        System.out.println(Math.min(14.5 , 17)); // OUTPUT:- 14.5 (double)

        System.out.println(Math.min(-10, 4)); // OUTPUT:- -10 (Integer)

        // -------------------------------------------------------------------------
        // Math.max(a , b); (find the maximum Value between a and b)
        // -------------------------------------------------------------------------

        // Its return type is same as the Parameter type.

        System.out.println(Math.max(14.5 , 17)); // OUTPUT:- 17.0 (double)

        System.out.println(Math.max(-10, 4)); // OUTPUT:- 4 (Integer)


        // -------------------------------------------------------------------------
        // Math.random(); (Generate and return a random double value between 0 and 1.)
        // -------------------------------------------------------------------------

        System.out.println(Math.random()); // OUTPUT:- different each time (double)

        // -------------------------------------------------------------------------
        // Math.round(a); (round of 'a' to nearest Integer or Long value.)
        // -------------------------------------------------------------------------

        // Its return type is same for Integer parameter, and long for rest types of Parameter.

        System.out.println(Math.round(56.83764738)); // OUTPUT:- 57 (Long)
 
        System.out.println(Math.round(89)); // OUTPUT:- 89 (Integer)

        System.out.println(Math.round(-8.9)); // OUTPUT:- -9 (Long)

        // -------------------------------------------------------------------------
        // Math.pow(base , power); (returns 'base' raised to the power of 'power' | base^power)
        // -------------------------------------------------------------------------

        // Its return type is Always double for All types of Parameters.

        System.out.println(Math.pow(2, 4)); // OUTPUT:- 16.0 (double)

        System.out.println(Math.pow(3.0, 4)); // OUTPUT:- 81.0 (double)

        // -------------------------------------------------------------------------
        // Math.PI; (return the value of Pi)
        // -------------------------------------------------------------------------

        // The double value that is closer than any other to pi (π), the ratio of the circumference of a circle to its diameter.

        // Its return type is Double

        System.out.println(Math.PI); // OUTPUT:- 3.141592653589793

   } 

}