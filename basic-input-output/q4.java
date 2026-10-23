// Write a Java program that asks the user for two integers and displays:
// 1. Their sum
// 2. Their difference
// 3. Their product
// 4. Their quotient
// 5. Their remainder
// Example:
// Enter first number: 17
// Enter second number: 5

// ----- Results -----
// Sum: 22
// Difference: 12
// Product: 85
// Quotient: 3
// Remainder: 2


// Rules:
// - Use Scanner for input.
// - Store both numbers in int variables.
// - Use arithmetic operators such as +, -, *, /, and %.
// - Don't hardcode the results.

import java.util.Scanner;

class Basic_Arithmetics{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("-------Taking input as Integers-------");

        System.out.print("Enter first number : ");
        int num1 = in.nextInt();

        System.out.println("Enter second number : ");
        int num2 = in.nextInt();

        System.out.println("-------Output-------");

        System.out.println("Sum : " + (num1 + num2));
        System.out.println("Difference : " + (num1 - num2));
        System.out.println("Product : " + (num1 * num2));
        System.out.println("Quotient : " + (num1 / num2));
        System.out.println("Remainder : " + (num1 % num2));

        in.close();
    }
}