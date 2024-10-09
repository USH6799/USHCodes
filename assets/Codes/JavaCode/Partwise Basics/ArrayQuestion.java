// -------------------------------------------------------------
// PRACTICE QUESTIONS
// -------------------------------------------------------------

//  Question 1. Ask the marks of Student(from user) in 3 Subject and Calculate the total Marks he got.
//  
//  Show the Marks of Each subject, and the Total Marks 


/*

    Question 2. Ask the marks of Student(from user) for 'n' Subjects(take n as input from user) and Calculate the total Marks he got and find the Average Marks he Got.

    Name the Subjects as Subject 1 , Subject 2 , ... , Subject n.

    Display the Marks got in each Subject, total marks, and the Average marks.

*/


/*

    Question 3. Ask the marks of Student(from user) for 'n' Subjects(take n as input from user) and Calculate the total Marks he got and find the Average Marks he Got, also calculate the Percentage, 

    if Percentage is below 34% -> fail,
    if Percentage is between 35% to 90% -> Pass,
    if Percentage is Above 90% -> topper

    Name of Each Subject should be taken input from user.

    Show the Complete Result at last.

*/

// You will get the Codes of this Programs, in The Next Chapter.
// Before that ,try to do this Program and figure out what You have Studied till now.


import java.util.Scanner;  // Importing the Scanner class to take input from the user

public class ArrayQuestion {
    public static void main(String[] args) {
        
        // Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        
        // -------------------------------------------------------------
        // QUESTION 1: 
        // Take the marks of 3 subjects from the user and calculate the total marks.
        // -------------------------------------------------------------
        
        
        // Declaring an array to store marks of 3 subjects
        int[] marks1 = new int[3];
        
        // Taking input from the user for each subject's marks
        for (int i = 0; i < marks1.length; i++) {
            
            System.out.print("Enter the Marks of Subject " + (i + 1) + ": ");

            marks1[i] = sc.nextInt();  // Storing the user input in the array
            
            // Explanation: In this loop, the user is prompted to enter marks for Subject 1, then Subject 2, and so on. 
            // Each entered mark is saved in the corresponding index of the `marks1` array.
        }
        
        // Initializing a variable to calculate the total marks
        int sum1 = 0;
        
        // Calculating Total Marks by iterating through the array
        for (int i = 0; i < marks1.length; i++) {

            sum1 += marks1[i];  // Adding each subject's marks to the total sum
            
            // Explanation: In this loop, each subject's marks from the `marks1` array are added to `sum1`.
            // After the loop finishes, `sum1` will contain the total marks of the student.
        }
        
        // Displaying Marks of Each Subject
        for (int i = 0; i < marks1.length; i++) {

            System.out.println("\nMarks Got in Subject " + (i + 1) + " is: " + marks1[i]);  // Displaying marks of each subject
            
            // Explanation: This loop goes through each element in the array and prints the marks for each subject.
        }
        
        // Printing the total marks
        System.out.println("\nTotal Marks Got out of " + (3 * 100) + ": " + sum1);
        
        // Explanation: The total marks out of 300 (as each subject is out of 100) are displayed here.
        
        
        // -------------------------------------------------------------
        // DRY RUN of QUESTION 1:
        // -------------------------------------------------------------
        // Let's assume user input is as follows:
        // Marks for Subject 1: 70
        // Marks for Subject 2: 80
        // Marks for Subject 3: 90
        // 
        // Dry Run of the loops:
        // 
        // Loop 1 (Taking input):
        // i = 0: Prompt for Subject 1, marks1[0] = 70
        // i = 1: Prompt for Subject 2, marks1[1] = 80
        // i = 2: Prompt for Subject 3, marks1[2] = 90
        //
        // Loop 2 (Calculating sum):
        // i = 0: sum1 += marks1[0] -> sum1 = 70
        // i = 1: sum1 += marks1[1] -> sum1 = 150
        // i = 2: sum1 += marks1[2] -> sum1 = 240
        //
        // Loop 3 (Displaying marks):
        // i = 0: Print "Marks Got in Subject 1 is: 70"
        // i = 1: Print "Marks Got in Subject 2 is: 80"
        // i = 2: Print "Marks Got in Subject 3 is: 90"
        //
        // Output: Total Marks Got out of 300: 240
        
        
        // -------------------------------------------------------------
        // QUESTION 2: 
        // Take the marks of 'n' subjects from the user, calculate the total marks, and find the average.
        // -------------------------------------------------------------
        
        
        System.out.print("Enter the no. Of Subjects(n): ");

        int n = sc.nextInt();  // Taking the number of subjects as input
        
        // Declaring an array to store marks of 'n' subjects
        int[] marks2 = new int[n];
        
        // Taking input from the user for each subject's marks
        for (int i = 0; i < marks2.length; i++) {

            System.out.print("Enter the Marks of Subject " + (i + 1) + ": ");

            marks2[i] = sc.nextInt();  // Storing the user input in the array
            
            // Explanation: This loop asks the user for the marks of each subject, stores the entered value in `marks2` array.
        }
        
        // Initializing a variable to calculate the total marks
        int sum2 = 0;
        
        // Calculating Total Marks by iterating through the array
        for (int i = 0; i < marks2.length; i++) {

            sum2 += marks2[i];  // Adding each subject's marks to the total sum
            
            // Explanation: The loop adds up the marks for each subject and stores the result in `sum2`.
        }
        
        // Displaying Marks of Each Subject
        for (int i = 0; i < marks2.length; i++) {

            System.out.println("\nMarks Got in Subject " + (i + 1) + " is: " + marks2[i]);  // Displaying marks of each subject

        }
        
        // Displaying total marks
        System.out.println("\nTotal Marks Got out of " + (n * 100) + ": " + sum2);
        
        // Displaying Average
        System.out.println("Average Marks: " + (sum2 / n));
        
        
        // -------------------------------------------------------------
        // DRY RUN of QUESTION 2:
        // -------------------------------------------------------------
        // Let's assume the user inputs the following:
        // Number of subjects: 4
        // Marks for Subject 1: 70
        // Marks for Subject 2: 85
        // Marks for Subject 3: 90
        // Marks for Subject 4: 95
        //
        // Dry Run of the loops:
        //
        // Loop 1 (Taking input):
        // i = 0: marks2[0] = 70
        // i = 1: marks2[1] = 85
        // i = 2: marks2[2] = 90
        // i = 3: marks2[3] = 95
        //
        // Loop 2 (Calculating sum):
        // i = 0: sum2 += marks2[0] -> sum2 = 70
        // i = 1: sum2 += marks2[1] -> sum2 = 155
        // i = 2: sum2 += marks2[2] -> sum2 = 245
        // i = 3: sum2 += marks2[3] -> sum2 = 340
        //
        // Loop 3 (Displaying marks):
        // i = 0: Print "Marks Got in Subject 1 is: 70"
        // i = 1: Print "Marks Got in Subject 2 is: 85"
        // i = 2: Print "Marks Got in Subject 3 is: 90"
        // i = 3: Print "Marks Got in Subject 4 is: 95"
        //
        // Output:
        // Total Marks Got out of 400: 340
        // Average Marks: 85
        
        
        // -------------------------------------------------------------
        // QUESTION 3: 
        // Take marks of 'n' subjects from the user, calculate the total marks, average, and percentage. Display pass/fail status.
        // -------------------------------------------------------------
        
        
        System.out.print("Enter the no. Of Subjects(n): ");

        int m = sc.nextInt();  // Taking the number of subjects as input
        
        // Declaring an array to store names of 'n' subjects
        String[] subject = new String[m];
        
        // Taking input for each subject's name
        for (int i = 0; i < subject.length; i++) {

            System.out.print("Enter the Name of Subject " + (i + 1) + ": ");

            subject[i] = sc.next();  // Storing the name of each subject

        }
        
        // Declaring an array to store marks of 'm' subjects
        int[] marks3 = new int[m];
        
        // Taking input for each subject's marks
        for (int i = 0; i < marks3.length; i++) {

            System.out.print("Enter the Marks of " + subject[i] + ": ");

            marks3[i] = sc.nextInt();  // Storing marks of each subject

        }
        
        // Initializing a variable to calculate the total marks
        int sum3 = 0;
        
        // Calculating Total Marks by iterating through the array
        for (int i = 0; i < marks3.length; i++) {

            sum3 += marks3[i];  // Adding each subject's marks to the total sum

        }
        
        // Displaying Marks of Each Subject
        for (int i = 0; i < marks3.length; i++) {

            System.out.println("\nMarks Got in " + subject[i] + ": " + marks3[i]);  // Displaying marks for each subject

        }
        
        // Displaying total marks
        System.out.println("\nTotal Marks Got out of " + (m * 100) + ": " + sum3);
        
        // Displaying average
        System.out.println("Average Marks: " + (sum3 / m));
        
        // Displaying percentage
        double percentage = (sum3 * 100.0) / (m * 100);

        System.out.println("Percentage: " + percentage + "%");
        
        // Checking if the student passed or failed
       
        if(percentage > 90.0){

            System.out.println("Tell me the Secret, You Topped!");
            
        }
        else if(percentage > 33){
            
            System.out.println("You Passed, relax do not Stress for Top!");
            
        }
        else{
            
            System.out.println("You Failed, Try Again Next Life");

        }
        
        // -------------------------------------------------------------
        // DRY RUN of QUESTION 3:
        // -------------------------------------------------------------
        // Let's assume the user inputs the following:
        // Number of subjects: 3
        // Subject 1 name: Maths
        // Subject 1 marks: 80
        // Subject 2 name: Science
        // Subject 2 marks: 60
        // Subject 3 name: English
        // Subject 3 marks: 70
        //
        // Dry Run of the loops:
        //
        // Loop 1 (Taking input for subject names):
        // i = 0: subject[0] = "Maths"
        // i = 1: subject[1] = "Science"
        // i = 2: subject[2] = "English"
        //
        // Loop 2 (Taking input for subject marks):
        // i = 0: marks3[0] = 80
        // i = 1: marks3[1] = 60
        // i = 2: marks3[2] = 70
        //
        // Loop 3 (Calculating sum):
        // i = 0: sum3 += marks3[0] -> sum3 = 80
        // i = 1: sum3 += marks3[1] -> sum3 = 140
        // i = 2: sum3 += marks3[2] -> sum3 = 210
        //
        // Loop 4 (Displaying marks):
        // i = 0: Print "Marks Got in Maths: 80"
        // i = 1: Print "Marks Got in Science: 60"
        // i = 2: Print "Marks Got in English: 70"
        //
        // Output:
        // Total Marks Got out of 300: 210
        // Average Marks: 70
        // Percentage: 70.0%
        // Status: Pass
    }
}
