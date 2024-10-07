import java.util.Scanner; // importing Scanner class for taking input from the user.

public class ArrayQuestion { // Declaring the main class named "ArrayQuestion".

    public static void main(String[] args) { // main method, the starting point of any Java program.

        // Question: Take an array input from the user. Search for a Number 'x' in that array and return its index.

        Scanner sc = new Scanner(System.in); 
        // Creating an object of the Scanner class called "sc" to take user input.

        System.out.print("Enter the size of the array: "); 
        // Asking the user to input the size of the array.

        int n = sc.nextInt(); 
        // 'n' is assigned the value that the user enters.
        // Let's assume the user enters 5.
        // Now: n = 5

        int[] arr = new int[n]; 
        // Declaring an integer array of size 'n'. 
        // Now, 'arr' is an array of size 5, i.e., it can hold 5 integers.

        System.out.println("Enter the elements of the array: "); 
        // Prompting the user to enter elements for the array.

        for (int i = 0; i < n; i++) { 
            // This loop will run 'n' times (5 times in this case), asking the user to input array elements.

            arr[i] = sc.nextInt(); 
            // Inside the loop, the user inputs an integer at index 'i'.
            // Example: Let's assume user inputs: 3, 7, 8, 12, 5.
            // After each iteration:
            // i = 0, arr[0] = 3
            // i = 1, arr[1] = 7
            // i = 2, arr[2] = 8
            // i = 3, arr[3] = 12
            // i = 4, arr[4] = 5
            // Final state of array: arr = [3, 7, 8, 12, 5]
        }

        System.out.print("Enter the number you want to search: "); 
        // Asking the user to input the number to search in the array.

        int x = sc.nextInt(); 
        // 'x' is assigned the value that the user enters.
        // Let's assume the user enters 12.
        // Now: x = 12

        int index = -1; 
        // Initializing 'index' with -1, assuming that the number is not found initially.
        // Now: index = -1

        for (int i = 0; i < n; i++) { 
            // Loop to traverse each element of the array.
            // The loop runs from i = 0 to i < n (i.e., i < 5).
            
            if (arr[i] == x) { 
                // Inside the loop, we check if the current array element (arr[i]) matches 'x'.

                index = i; 
                // If the element matches 'x', we store the index of the found element in 'index'.
                // Then we break out of the loop since we found the element.
                break;
            }
        }

        if(index == -1){ 
            // If 'index' remains -1, that means 'x' was not found in the array.

            System.out.println("Number not found"); 
            // Output a message that the number was not found.
        }
        else{ 
            // If 'index' is updated, then the number 'x' was found.

            System.out.println("The index of the number you searched is: " + index); 
            // Output the index where the number was found.
        }
    }
}

// *****************************************
// Dry Run: (Assuming user inputs 5 elements: [3, 7, 8, 12, 5] and searches for 12.)
// *****************************************

/*

Iteration-wise breakdown:

1. User inputs the size of the array 'n = 5'.
2. The user then inputs 5 elements for the array: [3, 7, 8, 12, 5].
   Array at this stage: arr = [3, 7, 8, 12, 5]

3. User inputs the number 'x = 12' to search in the array.

4. The 'for' loop begins to traverse each element of the array to check if 'arr[i] == x'.

    - Iteration 1: 
      i = 0, arr[0] = 3 (3 != 12), so loop continues.

    - Iteration 2: 
      i = 1, arr[1] = 7 (7 != 12), so loop continues.

    - Iteration 3: 
      i = 2, arr[2] = 8 (8 != 12), so loop continues.

    - Iteration 4: 
      i = 3, arr[3] = 12 (12 == 12), condition satisfied.
      
      'index' is set to 3.
      The loop breaks since the element is found.

5. Since the 'index' is not -1, the final output is:
   "The index of the number you searched is: 3".

*/

// In case the user searched for a number that is not present (e.g., 15):
/*

1. The loop would have gone through all the iterations without finding the number, and 'index' would remain -1.
2. The output would have been:
   "Number not found".
   
*/

