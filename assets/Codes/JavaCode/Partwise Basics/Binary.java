
public class Binary {

    public static void main(String[] args) {

        // What is Number System?

        // Number System is a way of writing numbers, like 0, 1, 2, 3, 4, 5, etc.

        // It is the System of writing numbers in a specific base.

        // A number system is defined as a system of writing to express numbers. It is
        // the mathematical notation for representing numbers of a given set by using
        // digits or other symbols in a consistent manner.

        // There are three number systems in Java.

        // 1. Binary Number System is the base-2 number system. (Include 0 and 1)

        // 2. Decimal Number System is the base-10 number system. (Include 0, 1, 2, 3,
        // 4, 5, 6, 7, 8, 9)

        // 3. Hexadecimal Number System is the base-16 number system. (Include 0, 1, 2,
        // 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)

        // --------------------------------------------------------------------------

        // Base-2 means it has only two possible values 0 and 1.

        // In Java and many Programming Languages, There is no math number System or
        // Decimal Number System.

        // They all follow the Binary Number System.

        // In Decimal Number System, we have 10 digits, 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 ,
        // 8 , 9.

        // All the numbers is Decimal Number System are Represented by 0, 1, 2, 3, 4, 5,
        // 6, 7, 8, 9.

        // Like small number 57.

        // It Included 5 and 7 which are the Digits of Decimal Number System.

        // Like Big number 239374983469.

        // It also the Same Digits of Decimal Number System.

        // Means any number formed or Written in Decimal Number System is Represented by
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.

        // Hence it is also known as base-10 Number System.

        // And on the other Side, Binary Number System or the Number System of Computer,
        // is known as base-2 Number System.

        // Because it only has two possible values, 0 and 1.

        // All the Numbers, either big or small, are Represented by 0 and 1.

        // Like 4 in Decimal Number System is represented by 0100 in Binary Number
        // System.

        // Now, you may think that they also include the Same Digits of Decimal Number
        // System.

        // But In Binary Number System, we can use only this 2 Digits, ie. 0 and 1.

        // Lets Understand how to Write Decimal Number System in Binary Number System.

        // Lets Suppose we have to convert 4 in Decimal Number System to Binary Number
        // System.

        // First we have to keep dividing 4 by 2 till we reach 1.

        // 4 / 2 -> 2 and remainder is 0.

        // We Count the Remainder of Each Step as the Binary Numbers, because any number
        // divided by 2 will give either 1 or 0 as the remainder.

        // Binary Format: 0

        // 2 / 2 -> 1 and remainder is 0.

        // Remember, we have to keep writing the Remainder from right to left.

        // Binary Format: 0 0

        // 1 / 2 -> 0 and remainder is 1.

        // Binary Format: 1 0 0

        // Now, we finally Converted 4 into binary Format, which is 100 .

        // Now, when we have to represent it then we say,

        // Now, lets convert a Binary Number into Decimal Number System.

        // Lets Suppose we have to convert 1101 in Binary Number System to Decimal
        // Number System.

        // So, firstly we have to pick each digit from right to left, and keep
        // multiplying it by powers of 2, starting from power 0 till last digit.

        // Like, here the Digits are 1, 1, 0, 1.

        // So, firstly 1 * 2^0 = 1 * 1 = 1

        // Decimal Format: 1

        // Then 0 * 2^1 = 0 * 2 = 0

        // Decimal Format: 1 + 0

        // Here we have to Keep Adding the Result at each Step.

        // Then 1 * 2^2 = 1 * 4 = 4

        // Decimal Format: 1 + 0 + 4

        // Then 1 * 2^3 = 1 * 8 = 8

        // Decimal Format: 1 + 0 + 4 + 8

        // Here we have to keep increasing the power of 2 by 1. starting from power 0.

        // Decimal Format: 1 + 0 + 4 + 8 = 13

        // So, 1101 in Binary Number System is equal to 13 in Decimal Number System.

        // Lets Know, some Starting values of Decimal Number System,

        // 0 -> 000

        // 1 -> 001

        // 2 -> 010

        // 3 -> 011

        // 4 -> 100

        // 5 -> 101

        // 6 -> 110

        // 7 -> 111

        // 8 -> 1000

        // 9 -> 1001

        // 10 -> 1010

        // One more Important thing about binary number in java,

        // Like there is no datatype called binary or anything else to represent binary
        // number in java.

        // But we can Represent it in form of Integers using '0b' prefix.

        // This Tells us the Machine, that it is a binary number.

        // Like,

        int a = 0b1010; // a is a variable of datatype Integer, storing 10 in Decimal Number System.

        // But Actually, it is a 1010 in Binary Number System.

        // Lets print it.

        System.out.println(a); // OUTPUT: 10

        // But how can we print it in Decimal Number System?

        // Here we use Integer.toBinaryString(number) method.

        // Here we need a String Variable to store the result of
        // Integer.toBinaryString(number) method.

        // This takes an Integer Value and converts it to Binary String.

        System.out.println(Integer.toBinaryString(a)); // OUTPUT: 1010

        // Remember the Output is String not Integer.

        // -------------------------------------------------------------------
        // BITWISE OPERATORS
        // -------------------------------------------------------------------

        // Some Bitwise Operators like & , | , ^ , ~ , << , >>

        // -------------------------------------------------------------------
        // Binary AND Operator
        // -------------------------------------------------------------------

        // It is Used to check the Bitwise relation between Two Binary Numbers.

        // In Java, 0 is Represented as false, and 1 is represented as true.

        // Lets Assume, we have two Binary Numbers.

        int A = 101; // A Variable 'A' of Datatype Integer, storing 101.

        int B = 100; // A Variable 'B' of Datatype Integer, storing 100.

        int C = A & B; // A Variable 'C' of Datatype Integer, storing the result of A & B.

        // Here A & B = 101 & 100 .

        // In Java as i said before, 0 is Represented as false, and 1 is represented as
        // true.

        // AND Operator means, if both the values are 1(true) then it will return
        // 1(true), and if either one of them is 0(false) or both of them are 0(false)
        // then it will return 0(false).

        //   1 0 1
        // & 1 0 0
        // ---------
        //   1 0 0

        // Because 1 & 1 means (true & true) = true, so returns 1.

        // Then , 0 & 0 means (false & false) = false, so returns 0.

        // Then , 1 & 0 means (true & false) = false, so returns 0.

        // So, final value of C becomes 100.

        // Lets check the Output.

        System.out.println(C); // OUTPUT:- 100

        // Answer is same we think of.

        // -------------------------------------------------------------------
        // Binary OR Operator
        // -------------------------------------------------------------------

        // It is Used to check the Bitwise relation between Two Binary Numbers.

        // In Java, 0 is Represented as false, and 1 is represented as true.

        // Lets Assume, we have two Binary Numbers.

        A = 101; // A Variable 'A' of Datatype Integer, storing 101.

        B = 100; // A Variable 'B' of Datatype Integer, storing 100.

        C = A | B; // A Variable 'C' of Datatype Integer, storing the result of A | B.

        // Here A | B = 101 | 100 .

        // In Java as i said before, 0 is Represented as false, and 1 is represented as
        // true.

        // OR operator returns 1(true) if either digit is 1(true) and returns 0(false)
        // if both digits are 0(false).

        //   1 0 1
        // | 1 0 0
        // ---------
        //   1 0 1

        // Because 1 | 1 means (true | true) = true, so returns 1.

        // Then , 0 | 0 means (false | false) = false, so returns 0.

        // Then , 1 | 0 means (true | false) = true, so returns 1.

        // So, final value of C becomes 101.

        // Lets check the Output.

        System.out.println(C); // OUTPUT:- 101

        // Answer is same we think of.

        // -------------------------------------------------------------------
        // Binary XOR Operator
        // -------------------------------------------------------------------

        // It is Used to check the Bitwise relation between Two Binary Numbers.

        // In Java, 0 is Represented as false, and 1 is represented as true.

        // Lets Assume, we have two Binary Numbers.

        A = 101; // A Variable 'A' of Datatype Integer, storing 101.

        B = 100; // A Variable 'B' of Datatype Integer, storing 100.

        C = A ^ B; // A Variable 'C' of Datatype Integer, storing the result of A ^ B.

        // Here A ^ B = 101 ^ 100 .

        // In Java as i said before, 0 is Represented as false, and 1 is represented as
        // true.

        // XOR Operator returns 0(false) if both the values are similar means either
        // both are 0(false), or both are 1(true). If the values are different, like 0
        // and 1, then it will return 1(true).

        //   1 0 1
        // ^ 1 0 0
        // ---------
        //   0 0 1

        // Because 1 ^ 1 means (true ^ true) = false, so returns 0.

        // Then , 0 ^ 0 means (false ^ false) = false, so returns 0.

        // Then , 1 ^ 0 means (true ^ false) = true, so returns 1.

        // So, final value of C becomes 001.

        System.out.println(C); // OUTPUT:- 001

        // Answer is same we think of.

        // -------------------------------------------------------------------
        // Binary One's Complement(~)
        // -------------------------------------------------------------------

        // It is used to reverse the given Order.

        // In Java, 0 is Represented as false, and 1 is represented as true.

        // Lets assume, Two binary Numbers.

        A = 101; // A Variable 'A' of Datatype Integer, storing 101.

        B = 100; // A Variable 'B' of Datatype Integer, storing 100.

        // Then ~A will be 010.

        // And ~B will be 011.

        // -------------------------------------------------------------------
        // Binary Left Shift(<<)
        // -------------------------------------------------------------------

        // It is an Operator which shifts each digit of binary number to left side.

        // Like i Two binary Numbers.

        A = 101; // A Variable 'A' of Datatype Integer, storing 101.

        B = 100; // A Variable 'B' of Datatype Integer, storing 100.

        // It is binary Operator so it needs two Operands, Second Operand is by how much
        // digit you want to shift and first Operand is The binary number you want to
        // Shift.

        // [binary]<<[how much digit you want to shift]

        // A << 1 -> 010

        // Lets interpret how this Output came,

        // Here we have 1 0 1,

        // So Shifting them to left side by 1.

        // _ 1 0 1 _ << 1 -> 1 0 1 0 _

        // Here this Two empty spaces by default is filled with 0.

        // So, _ 1 0 1 _ << 1 -> 1 0 1 0 _

        // But there we are only counting 4 digits, due to left shift of 1, so Result
        // would be 1010.

        // B << 2 -> 00000

        // Lets interpret how this Output came,

        // Here we have 1 0 0,

        // So Shifting them to left side by 2.

        // _ 1 0 0 _ << 2 -> 0 0 0 0 _

        // So, final Result would be 000.

        // -------------------------------------------------------------------
        // Binary Right Shift(>>)
        // -------------------------------------------------------------------

        // It is an Operator which shifts each digit of binary number to right side.

        // Like i Two binary Numbers.

        A = 101; // A Variable 'A' of Datatype Integer, storing 101.

        B = 100; // A Variable 'B' of Datatype Integer, storing 100.

        // It is binary Operator so it needs two Operands, Second Operand is by how much
        // digit you want to shift and first Operand is The binary number you want to
        // Shift.

        // [binary]>>[how much digit you want to shift]

        // A >> 1 -> 010

        // Lets interpret how this Output came,

        // Here we have 1 0 1,

        // So Shifting them to right side by 1.

        // _ 1 0 1 _ >> 1 -> _ 0 1 0 1

        // Here this Two empty spaces by default is filled with 0.

        // So, _ 1 0 1 _ >> 1 -> _ 0 1 0 1

        // But there we are only counting 4 digits, due to right shift of 1, so Result
        // would be 1010.

        // B >> 2 -> 000

        // Lets interpret how this Output came,

        // Here we have 1 0 0,

        // So Shifting them to right side by 2.

        // _ 1 0 0 _ >> 2 -> _ 0 0 0 0

        // So, final Result would be 000.

        // ------------------------------------------------------------------------------
        // Number System Overview
        // ------------------------------------------------------------------------------

        // A Number System is a method for representing numbers using digits or symbols.
        // It consists of a set of digits and a base. For example, the Decimal System
        // has
        // a base of 10, using the digits 0-9.

        // In Java, we commonly use three number systems:

        // 1. Binary (Base-2): Only uses digits 0 and 1.
        // 2. Decimal (Base-10): Uses digits 0 through 9.
        // 3. Hexadecimal (Base-16): Uses digits 0-9 and letters A-F.

        // The importance of number systems lies in their applications in computing,
        // where binary is foundational because it aligns with the digital nature of
        // computers.

        // ------------------------------------------------------------------------------
        // Binary Number System
        // ------------------------------------------------------------------------------

        // The Binary System uses only two digits, 0 and 1.
        // Each binary digit is known as a "bit." Multiple bits can represent larger
        // numbers. For instance, the decimal number 4 is represented as 0100 in binary.

        // Converting from Decimal to Binary:
        // To convert a decimal number to binary, repeatedly divide the number by 2
        // and keep track of the remainders.

        // Example: Convert 4 to Binary
        // Step 1: 4 / 2 = 2, remainder = 0
        // Step 2: 2 / 2 = 1, remainder = 0
        // Step 3: 1 / 2 = 0, remainder = 1

        // Read the remainders from bottom to top: 100

        // Therefore, 4 in Decimal = 100 in Binary.

        // ------------------------------------------------------------------------------
        // Using Binary in Java
        // In Java, we can represent binary literals by prefixing them with `0b`.

        int a = 0b1010; // Here, 'a' stores the decimal equivalent of binary 1010, which is 10.

        // To verify the binary representation, we print 'a'.
        System.out.println(a); // OUTPUT: 10

        // To convert an integer to its binary string representation, we use the
        // Integer.toBinaryString() method.

        String binaryString = Integer.toBinaryString(a); // Converts integer 'a' to binary string.

        // Let's print the binary representation of 'a'.
        System.out.println(binaryString); // OUTPUT: 1010

        // Remember, the output is a String, not an Integer.

        // ------------------------------------------------------------------------------
        // BITWISE OPERATORS
        // ------------------------------------------------------------------------------

        // Bitwise operators perform operations on binary representations of integers.
        // Common bitwise operators include:
        // 1. AND (&)
        // 2. OR (|)
        // 3. XOR (^)
        // 4. NOT (~)
        // 5. Left Shift (<<)
        // 6. Right Shift (>>)

        // ------------------------------------------------------------------------------
        // Example: Bitwise AND Operator
        // ------------------------------------------------------------------------------

        // The AND operator compares each bit of two binary numbers and returns 1 if
        // both bits are 1,
        // otherwise returns 0.

        int A = 0b101; // Binary 101, which is 5 in decimal.
        int B = 0b100; // Binary 100, which is 4 in decimal.

        // Performing AND operation between A and B.
        int C = A & B;

        // Let's evaluate the expression A & B:

        // A: 1 0 1 (Binary representation of 5)
        // B: 1 0 0 (Binary representation of 4)
        // -----------------
        // Result: 1 0 0 (Binary representation of 4)

        // Dry Run of A & B:
        // 1st Bit: A(1) AND B(1) = 1
        // 2nd Bit: A(0) AND B(0) = 0
        // 3rd Bit: A(1) AND B(0) = 0

        // Therefore, the result is 4 in decimal (binary 100).

        System.out.println("Result of A & B (A & B): " + C); // OUTPUT: 4

        // ------------------------------------------------------------------------------
        // Example: Bitwise OR Operator
        // ------------------------------------------------------------------------------

        // The OR operator compares each bit of two binary numbers and returns 1 if at
        // least one of the
        // bits is 1.

        C = A | B; // Performing OR operation between A and B.

        // Let's evaluate the expression A | B:

        // A: 1 0 1 (Binary representation of 5)
        // B: 1 0 0 (Binary representation of 4)
        // -----------------
        // Result: 1 0 1 (Binary representation of 5)

        // Dry Run of A | B:
        // 1st Bit: A(1) OR B(1) = 1
        // 2nd Bit: A(0) OR B(0) = 0
        // 3rd Bit: A(1) OR B(0) = 1

        // Therefore, the result is 5 in decimal (binary 101).

        System.out.println("Result of A | B (A | B): " + C); // OUTPUT: 5

        // ------------------------------------------------------------------------------
        // Example: Bitwise XOR Operator
        // ------------------------------------------------------------------------------

        // The XOR operator compares each bit of two binary numbers and returns 1 if the
        // bits are different.

        C = A ^ B; // Performing XOR operation between A and B.

        // Let's evaluate the expression A ^ B:

        // A: 1 0 1 (Binary representation of 5)
        // B: 1 0 0 (Binary representation of 4)
        // -----------------
        // Result: 0 0 1 (Binary representation of 1)

        // Dry Run of A ^ B:
        // 1st Bit: A(1) XOR B(1) = 0
        // 2nd Bit: A(0) XOR B(0) = 0
        // 3rd Bit: A(1) XOR B(0) = 1

        // Therefore, the result is 1 in decimal (binary 001).

        System.out.println("Result of A ^ B (A ^ B): " + C); // OUTPUT: 1

        // ------------------------------------------------------------------------------
        // Example: Bitwise NOT Operator (~)
        // ------------------------------------------------------------------------------

        // The NOT operator inverts all bits of a binary number. 0 becomes 1, and 1
        // becomes 0.

        int notA = ~A; // Performing NOT operation on A.

        // A is 101 (5 in decimal), so NOT A would be:

        // Binary representation of A: 0 0 0 0 0 0 1 0 1 (in a 32-bit representation)

        // After applying NOT (~):
        // Result: 1 1 1 1 1 1 0 1 0 (In binary, which is -6 in decimal due to two's
        // complement representation).

        System.out.println("Result of ~A (~A): " + notA); // OUTPUT: -6

        // ------------------------------------------------------------------------------
        // Example: Left Shift Operator (<<)
        // ------------------------------------------------------------------------------

        // The left shift operator shifts the bits of a binary number to the left by a
        // specified number of positions.
        // New bits shifted in from the right are set to 0.

        int leftShiftResult = A << 1; // Shifting A (101) to the left by 1.

        // Evaluating A << 1:

        // Original A: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 (5 in decimal)
        // Shifted: 0 0 0 0 0 0 0 0 1 0 1 0 (10 in decimal)

        // The left shift effectively multiplies the number by 2 for each shift
        // position.

        System.out.println("Result of A << 1 (A << 1): " + leftShiftResult); // OUTPUT: 10

        // ------------------------------------------------------------------------------
        // Example: Right Shift Operator (>>)
        // ------------------------------------------------------------------------------

        // The right shift operator shifts the bits of a binary number to the right by a
        // specified number of positions.
        // The sign bit (leftmost bit) is used to fill in new bits on the left.

        int rightShiftResult = A >> 1; // Shifting A (101) to the right by 1.

        // Evaluating A >> 1:

        // Original A: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 (5 in decimal)
        // Shifted: 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 (2 in decimal)

        // The right shift effectively divides the number by 2 for each shift position,
        // discarding the fractional part.

        System.out.println("Result of A >> 1 (A >> 1): " + rightShiftResult); // OUTPUT: 2

        // ------------------------------------------------------------------------------
        // Conclusion
        // ------------------------------------------------------------------------------

        // Understanding binary numbers and bitwise operations is fundamental in
        // computer science.
        // These concepts are essential for low-level programming, data manipulation,
        // and performance optimization.

        // The ability to convert between different number systems and perform bitwise
        // operations allows
        // programmers to write efficient and powerful code.

    }
}


// ------------------------------------------------------------------------------
// PRACTICE PROBLEMS
// ------------------------------------------------------------------------------

/*
    Question 1:

        int num = 0b10101100; // Binary representation of 172   

        // Perform a left shift followed by a bitwise AND with a mask
        int result = (num << 2) & 0b11110000;

        // Output the result
        System.out.println(result); // What will this output?


    Question 2:

        int n = 0b10110101; // Binary representation of 181
        int count = 0;

        // Count the number of set bits
        for (int i = 0; i < 8; i++) {
            count += (n >> i) & 1;
        }

        // Output the count of set bits
        System.out.println(count); // What will this output?


    Question 3:

        int num = 0b11011010; // Binary representation of 218

        // Toggle bits at positions 1 and 3
        int result = num ^ (1 << 1) ^ (1 << 3);

        // Output the result
        System.out.println(result); // What will this output?

 */
