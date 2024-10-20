public class Variables {
    public static void main(String[] args) {

        // Variables are like Containers to Store some value in memory or Storage.

        // Like lets go in maths, Geometry, the most hatred Chapter.

        // In Rectangle When i want to calculate Perimeter of the Rectangle, we need 2 values ies. length(l) and Breadth(b).

        // Formula:- 2 X (l + b)

        // Here you can see that we don't know the value of l and b but we not whatever value, l and b holds will be put here to find the parameters.

        // Hence l and b are called Variables.

        // Variable word means Can Change or Vary.

        // Means its value can alter or change.

        // Imagine, i have a rectangle of length(l) 4 and breadth(b) 5.

        // Then its Perimeter: 2 X (l + b), where l = 4 and b = 5

        // Perimeter = 2 * (4 + 5) => 2 * 9 => 18

        // Now take an Example of Another Rectangle of length(l) 6 and breadth(b) 7.

        // Then its Perimeter: 2 X (l + b), where l = 6 and b = 7

        // Perimeter = 2 * (6 + 7) => 2 * 13 => 26

        // Here you can see that the values of variable l and b changes with respect of dimensions of Rectangle.

        // But did you notice that in both the cases the 2 inside the formula remains same or does't change.

        // This means 2 is a Constant.

        // Constant words means Constant, or which doesn't change.

        // -------------------------------------------------------------------

        // Require Another Example, now lets go towards Circle, and its area formula,

        // Area = pi * r * r , where r = Radius of Circle and pi = 22/7 or 3.14 approx.

        // Here you can see 2 variables ies. pi and r but what if i would say that pi is not a variable but a constant.

        // Lets Imagine a Big circle of radius(r) 10.

        // Area = pi * r * r , where r = 10 and pi = 22/7 or 3.14 approx.

        // Area = 3.14 * 10 * 10 => 314.0

        // -------------------------------------------------------------------

        // Lets Take another Circle of radius(r) 5.

        // Area = pi * r * r , where r = 5 and pi = 22/7 or 3.14 approx.

        // Area = 3.14 * 5 * 5 => 78.5

        // Now you can find that value of variable r alters or changes with respect to Circle, but value of pi remains same and hence it is known as Constant Variable or Just Constant.

        // -------------------------------------------------------------------

        // Variables in Java are written in following Syntax:-

        // There are two different ways to declare a variable in Java.

        // Only Declaration:- <Datatype> <VariableName>;

        // Example:- int a;

        // Where a is a variable of DataType Integer.

        // We don't know what value is Stored in it.

        // -------------------------------------------------------------------

        // Both Declaration and Initialization:- <Datatype> <VariableName> = <value>;

        // Example:- int a = 10;

        // Where a is a variable of DataType Integer and its value is 10.

        // Lets Try to find area of Rectangle of length(l) 4 and breadth(b) 5 using java.

        int l = 4; // Length
        int b = 5; // Breadth

        int area = l * b; // Area = length * breadth

        System.out.println("area"); // this will not print the result but print just area.
        // OUTPUT:- area

        System.out.println(area); // printing the variable without double quotes means printing its value.
        // OUTPUT:- 20

        // Let Understand the Important Rules for Writing a Variable.

        // 1. It Shouldn't Start with Numbers.

        // Ex:- int 1a = 10; , this is Wrong and Shows an error.

        // Correct Way:- int a1 = 10; , this is Correct and Doesn't Show any error.

        // 2. Java is Case Sensitive, Lowercase and Uppercase are treated differently.

        // like int x = 5; & int X = 10;

        // both are X but due to Case they are treated as different Variables.

        // On printing there values:-

        // System.out.println("x = " + x); OUTPUT:- x = 5

        // System.out.println("X = " + X); OUTPUT:- X = 10

        // 3. It Cannot Contain Spaces instead it may Contain Underscore(_).

        // String My Name = "USH"; this is InCorrect and throws an error.

        // String My_Name = "USH"; this is Correct and doesn't throws any error.

        // 4. It cannot Contain Special characters and Operators.
        
    }
}
