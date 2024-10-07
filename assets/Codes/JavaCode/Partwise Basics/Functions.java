public class Functions {
    public static void main(String[] args) {
        Function1();




        // FUNCTIONS:- THE REUSABLE BLOCK OF CODE

        // By its name, u can understand in Short about Functions, actually functions are the part of code which have a specific task to perform by taking some input and providing some output.

        // Function is a block of Code which takes Some input, process it and Provide us the Desired Output.

        // Mainly we Use functions dur to 3 reasons:-

        // It creates our code reusable and hence by writing the code once, we can use it many times and also improve our code readability.

        // We can call functions with different parameters and perform different tasks on them.

        // It makes our code more modular and easier to maintain.

        // Syntax of a Function is Divided into Two parts:- Its Prototype and Its Calling.

        // Prototype:- <return type> <function name> (<parameters>) { <code> }

        // Calling:- <function name> (<parameters>)

        // Lets pick up the nasty code, like find whether the number is Even or odd.

        int num1 = 10;

        if(num1 % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // I have one more number to be checked then i would write the code again.

        int num2 = 7;

        if(num2 % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        // Now i want to do this with 10 more numbers, should i now copy this code again and again to check whether the number is even or odd which makes our code very lengthy and unreadable.

        // Here we can fix the Problem by Wrapping this Code inside the Functions.

        // The function is the Separate thing like main function , so it should be written inside the class but not inside other functions.

        // If you use the Static Keyword in the Function Prototype which makes it a Static fnc and then the function do not need any object for Calling it.

        // We will Study OOPs in future and there we will study non-static fncs but here we are going to understand Static Functions so its compulsory to Write static in Function Prototype.

        // We cannot use keywords in place of Function name, it could be anything but not the Keywords.

        // There are mainly Two Types of Functions in Java:-

        // PURE AND IMPURE FNCS

        // Pure Function:- A pure function is a function that returns a value, to the caller, it uses the return keyword for returning the value from function and it is compulsory to be used.

        // Pure fncs are those which have a desired return type other then void.

        // Impure Function:- An impure function is a function that does not return a value, to the caller, it may use or may not use the return keyword for returning the value from function and it is not compulsory to be used.

        // Impure fncs are all those Functions which have their return type as void.

    }

    static void OddOrEven(int var) { // This is the Prototype of the Function 'OddOrEven' taking int 'var' as parameter and returning void which means it is a impure function.

        if(var % 2 == 0) { // Here we are checking whether the number is even or odd.
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }// function 'OddOrEven' ends here.

    // Now we do not Require to Write that codes repeatedly again and again.

    // Now we create a Function 'OddOrEven' which takes int 'var' as parameter and returning void which means it is a impure function so Now lets call it.

    static int AddTwo(int val){ // This is the Prototype of the Function 'AddTwo' taking int 'val' as parameter and returning Integer Value which means it is a pure function.

        return val + 2; // adds 2 in the Original Value of 'val' and return it to the caller.

    }// Function 'AddTwo' ends here.

    static void Function1(){ // We can Call Any Function Inside another function, hence a Temporary Function is created. Do not Focus on this Function.

        OddOrEven(10); // Calling the Function 'OddOrEven' with 10 as parameter.

        // Here when we call the Function we have passed 10 as the value for var.

        // Now Inside the function,

        // var = 10

        // Then if else block will Check whether the number is even or odd and print the result.

        // OUTPUT:- Even

        // Lets try with more numbers.

        OddOrEven(4); // OUTPUT:- Even

        OddOrEven(7); // OUTPUT:- Odd

        OddOrEven(8); // OUTPUT:- Even

        OddOrEven(9); // OUTPUT:- Odd

        // Here You saw that by just wrapping our Even Odd Checker Code inside the Function, we are able to Find it many times without any Further Problem and we also Do not Have to Write more Codes, which make the Code Readable and maintainable.

        int x1 = AddTwo(10); // Calling the Pure function 'AddTwo()' with a Argument 10.

        // Argument is the Value which Goes in the Parameter inside the Function like here 10 is the argument which get Stored in var 'val' inside the Function.

        // Inside the Fnc, it returns (val + 2) -> which means (10 + 2) -> 12
        
        // So, to Store the Returned Value by the Function, we Created a Variable x1 of Same Return Type(Integer).

        // So Now the value of x1 becomes 12.

        int y1 = AddTwo(13);

        // In the Same way, y1 becomes 15.

        // You can say this variables are the callers of the Functions.

        // Lets check their Value.

        System.out.println(x1); // OUTPUT:- 12

        System.out.println(y1); // OUTPUT:- 15
    }
}