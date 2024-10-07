import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        // Array is a Non-Primitive Datatype in Java.

        // Array is also as Reference type in Java because when we copy an array, it copies the memory address of the array.

        // Array means a Variable which can contain more than one value of same datatype.

        // Like i have some numbers (1 , 2 , 4), now i have to store it in memory,

        // So, i will create 3 variables,.

        int a = 1; // a is the name of the variable and 1 is the value of the variable.

        int b = 2; // A variable 'b' of datatype Integer Storing value 2.

        int c = 4; // A variable 'c' of datatype Integer Storing value 4.

        // but what if i have 100 numbers, then how can i store them in memory?

        // I am not going to create 100 variables.

        // There we use Arrays.

        // Example, we have to store some items like Subjects and their marks,

        int eng = 50; // A variable 'eng' of datatype Integer Storing value 50.

        int math = 60; // A variable 'math' of datatype Integer Storing value 60.

        int hindi = 70; // A variable 'hindi' of datatype Integer Storing value 70.

        // to Overcome this problem in java we are going to create a List of items of same datatype.

        // There are also 2 ways to Create an array just like variables.

        // -------------------------------------------------------------------------

        // 1. Only Declaration -> We use this way when we have to add items in the future but not in present.

        // Syntax of 1st:- <datatype>[] <arrayname> = new <datatype>[size]; this is compulsory.

        // Initialization Syntax(in future): <arrayname>[<index>] = <value>;    

        // Lets Store my marks, using both ways:-

        int[] marks = new int[3]; // We created an Empty array of type int with size 3.

        // We can't store any value in an array without giving it a size.

        // Lets set its value.

        marks[0] = 50; // We set value 50 in index 0.

        marks[1] = 60; // We set value 60 in index 1.

        marks[2] = 70; // We set value 70 in index 2.

        // Lets Know about Indexing which is important before knowing array,

        // You have noticed in your question paper, that each question is indexed starting from 1 or maybe a.

        // Like 1 then 2 then 3.

        // but In java, indexing begins from 0.

        // Like 1st question in your question paper is indexed as 1.

        // But in java 1st Item, is indexed as 0.

        // In real life:- 1 , 2 , 3 , 4 , 5 , 6 , 7 , ... , n.

        // In Java:-      0 , 1 , 2 , 3 , 4 , 5 , 6 , ... , n - 1.
        
        // now here marks = { 0 , 0 , 0 };

        // this is an empty array of type int with size 3.

        // Empty array is filled with null values, like 0.

        // After filling the values at each index, 

        // For marks[0] at index 0, we set value 50.

        // marks = { 50 , 0 , 0 };

        // For marks[1] at index 1, we set value 60.

        // marks = { 50 , 60 , 0 };

        // For marks[2] at index 2, we set value 70.

        // marks = { 50 , 60 , 70 };

        System.out.println(marks); // OUTPUT:- this will give the memory address of the array.
        // you cannot see array like this.


        System.out.println(marks[0]); // OUTPUT:- 50

        System.out.println(marks[1]); // OUTPUT:- 60

        System.out.println(marks[2]); // OUTPUT:- 70

        // this is the poor way to print the array.

        // Because for large arrays, it will take a lot of time to print them.

        // You need to set a loop,

        for(int i = 0 ; i < marks.length ; i++){ // A For loop runs from 0 to the length of the array.

            System.out.println("marks[" + i + "] = " + marks[i]); // We print the value of each index.

        }// for loop ends here.

        // Lets do a Dry Run of above code.

        // for i = 0,

        // OUTPUT:- marks[0] = 50

        // for i = 1, 

        // OUTPUT:- marks[1] = 60

        // for i = 2,

        // OUTPUT:- marks[2] = 70

        // Loop terminates.

        // For loop of Array:-

        for(int j : marks){ // A for Loop Running on Each item of Array and returning it in int j, for each item.

            // int j because marks is an array of Integer datatype.

            // Remember j do not store index, but it store the actual value.

            System.out.println(j); 

        }

        // Lets do A dry run,

        // for j = 50 or marks[0] = 50,

        // OUTPUT:- 50

        // for j = 60 or marks[1] = 60,

        // OUTPUT:- 60

        // for j = 70 or marks[2] = 70,

        // OUTPUT:- 70

        // --------------------------------------------------------------------------

        // Lets understand about the 2nd way of Creating Arrays,

        // 2. Declaration and Initialization -> We use this way when we have to add items in the present.

        // Syntax of 2nd:- <datatype>[] <arrayname> = { <value1> , <value2> , <value3> }; this is compulsory.

        int[] numbers = {10 , 56 , 3 , 5 , 6 , 23 , 543};

        // Here we created an array of type int with size 7.

        // And we have filled it with the values 10 , 56 , 3 , 5 , 6 , 23 , 543.

        // Now lets print it out.

        for (int i : numbers) { // For Loop Running on Each item of Array and returning it in int i, for each item.

            System.out.println(i); // We print the value of each index.

        }

        // Lets do A dry run,

        // for i = 10 or numbers[0] = 10,

        // OUTPUT:- 10

        // for i = 56 or numbers[1] = 56,

        // OUTPUT:- 56

        // for i = 3 or numbers[2] = 3,

        // OUTPUT:- 3

        // for i = 5 or numbers[3] = 5,

        // OUTPUT:- 5

        // for i = 6 or numbers[4] = 6,

        // OUTPUT:- 6

        // for i = 23 or numbers[5] = 23,

        // OUTPUT:- 23

        // for i = 543 or numbers[6] = 543,

        // OUTPUT:- 543

        // Loop terminates.


        // Lets Create a user Driven Array.

        Scanner sc = new Scanner(System.in); // To take input from user.
        

        System.out.println("Enter the size of array: "); // Enter the size of array.

        int size = sc.nextInt(); // A variable to store the size of array.

        int[] arr = new int[size]; // A new array of type int with size 'size'.

        for(int i = 0 ; i < size ; i++){ // For Loop Running on Each index of Array.

            System.out.print("Enter the value at index " + i + ": "); // Enter the value at each index.

            arr[i] = sc.nextInt(); // Taking Input from user and storing it in array at index i.

        }// for loop ends here.

        // Lets try to Print the Array,

        for(int j : arr){ // For Loop Running on Each item of Array and returning it in int j, for each item.

            System.out.println(j); // We print the value of each index.

        }

        // Lets assume the size of array is 3.

        // Now, it creates an array of type int with size 3.

        // arr = { 0 , 0 , 0 }

        // Empty Array created in memory so array is filled with null values ie. 0.

        // Looping on Each Index of Array,

        // for i = 0,

        // Taken input from user and stored it in arr[0].

        // Lets think that user enters 5.

        // arr[0] = 5

        // arr = { 5 , 0 , 0 }

        // for i = 1,

        // Taken input from user and stored it in arr[1].

        // Lets think that user enters 12.

        // arr[0] = 12

        // arr = { 5 , 12 , 0 }

        // for i = 2,

        // Taken input from user and stored it in arr[2].

        // Lets think that user enters 15.

        // arr[2] = 15

        // arr = { 5 , 12 , 15 }

        // Moving Towards the next loop, for printing the value of Array.

        // when int j = 5, arr[0] = 5,

        // OUTPUT:- 5

        // when int j = 12, arr[1] = 12,

        // OUTPUT:- 12

        // when int j = 15, arr[2] = 15,

        // OUTPUT:- 15

        // ----------------------------------------------------------------------

        // Declare an integer array with a size of 4
        // The 'new int[4]' initializes an array with four elements.
        // By default, each element of an int array is set to 0.
        int[] emp_arr = new int[4];

        // Loop through each item in the integer array 'emp_arr'
        // 'item' will hold the value of each element as we loop through the array.
        for(int item : emp_arr) {

            // Print each element followed by a space
            // Since all elements are initially set to 0, it will print "0 0 0 0"
            System.out.print(item + " ");
        }

        // OUTPUT:- 0 0 0 0
        System.out.println(); // Move to the next line after printing the int array


        // Dry Run for emp_arr:
        // -------------------------------------
        // emp_arr = [0, 0, 0, 0]   // Default int array values
        // Iteration 1: item = 0 -> prints "0 "
        // Iteration 2: item = 0 -> prints "0 "
        // Iteration 3: item = 0 -> prints "0 "
        // Iteration 4: item = 0 -> prints "0 "
        // Final output: "0 0 0 0"
        // -------------------------------------


        // ----------------------------------------------------------------------

        // Declare a double array with a size of 3
        // The 'new double[3]' initializes an array with three elements.
        // By default, each element of a double array is set to 0.0.
        double[] double_arr = new double[3];

        // Loop through each item in the double array 'double_arr'
        for(double item : double_arr) {

            // Print each element followed by a space
            // Since all elements are initially set to 0.0, it will print "0.0 0.0 0.0"
            System.out.print(item + " ");
        }

        // OUTPUT:- 0.0 0.0 0.0
        System.out.println(); // Move to the next line after printing the double array


        // Dry Run for double_arr:
        // -------------------------------------
        // double_arr = [0.0, 0.0, 0.0]   // Default double array values
        // Iteration 1: item = 0.0 -> prints "0.0 "
        // Iteration 2: item = 0.0 -> prints "0.0 "
        // Iteration 3: item = 0.0 -> prints "0.0 "
        // Final output: "0.0 0.0 0.0"
        // -------------------------------------

        // ----------------------------------------------------------------------

        // Declare a boolean array with a size of 3
        // The 'new boolean[3]' initializes an array with three elements.
        // By default, each element of a boolean array is set to false.
        boolean[] bool_arr = new boolean[3];

        // Loop through each item in the boolean array 'bool_arr'
        for(boolean item : bool_arr) {

            // Print each element followed by a space
            // Since all elements are initially set to false, it will print "false false false"
            System.out.print(item + " ");
        }

        // OUTPUT:- false false false
        System.out.println(); // Move to the next line after printing the boolean array


        // Dry Run for bool_arr:
        // -------------------------------------
        // bool_arr = [false, false, false]   // Default boolean array values
        // Iteration 1: item = false -> prints "false "
        // Iteration 2: item = false -> prints "false "
        // Iteration 3: item = false -> prints "false "
        // Final output: "false false false"
        // -------------------------------------


    }
}
