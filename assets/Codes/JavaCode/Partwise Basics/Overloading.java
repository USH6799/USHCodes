public class Overloading {

    public static void main(String[] args) {
        Function2();
    }

    
    // Lets create a Function to Input the Name of the User and greet him.

    static void Greeting(String name){ // A function 'Greeting' take 1 parameter 'name' and returning void which means it is an Impure function.

        System.out.println("Hello " + name); // Printing hello and the value of var 'name';

    }// function 'Greeting' ends here.

    // Lets create One more Function In which it takes the name and its gender and Greet Accordingly.

    static void Greeting(String name , char gender){ // A function 'Greeting' take 2 parameters 'name' and 'gender' and returning void which means it is an Impure function.

    // This is also called an Overloaded Function.

    // Overloaded Functions are the Functions which have same name but have Different Return type and Different type of Parameters, or Different no. of Parameters.

    // Overloading means Creating the same function with different Parameters. 

        if(gender == 'M' || gender == 'm'){ // Checking whether the value of 'gender' is equal to 'M' or 'm', if it is equal to any one then the Condition becomes true and hence if block will run.

            System.out.println("Hello " + name + " Sir"); // Greets the Person according to its gender.
        
        }// if block ends here.

        else if(gender == 'F' || gender == 'f'){ // Checking Whether 'gender' is equal to 'F' or 'f', if it is equal to any one then the Condition becomes true and hence if block will run.

            System.out.println("Hello " + name + " Ma'am"); // Greets the Person according to its gender.

        }// else if block ends here.

        else{ // If none of the above Conditions are true, then this block will run.

            System.out.println("Wrong Gender, Please Enter M for male and F for female."); // Prints this message.

        } // else block ends here.

    }// Function 'Greeting' ends here.

    // Lets try to Call them Both,

    static void Function2(){ // We can Call Any Function Inside another function, hence a Temporary Function is created. Do not Focus on this Function.

        Greeting("Himanshu"); // Calling the Function 'Greeting' with 1 parameter 'Himanshu'.

        // This is the First function, because there is only one parameter during calling.

        // Inside Greeting(name) fnc,

        // Value of name = Himanshu

        // OUTPUT:- Hello Himanshu

        // Lets call the 2nd Function,

        Greeting("Himanshu" , 'M'); // Calling the Function 'Greeting' with 2 parameters 'Himanshu' and 'M'.

        // This time, the second Overloaded Function will execute because this time there are 2 parameters during calling.

        // Inside Greeting(name , gender) fnc,

        // Value of name = Himanshu

        // Checking if Condition, condition:- (gender == 'M' || gender == 'm')

        // According to Calling, value of gender is 'M'.
        
        // (gender == 'M' || gender == 'm') -> (true || false) because gender is equal to 'M' but it is not equal to 'm'.

        // There is an ||(or) between the 2 conditions and or says that it will return true if any one of the condition is true and will return false if both the conditions are false.

        // (true || false) -> returns true, hence the Condition is True so if block will run, and display the OUTPUT.

        // OUTPUT:- Hello Himanshu Sir


    }// Function 'Function2' ends here.

}
