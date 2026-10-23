// Java Practice Question 01 — Input & Output
// Beginner
// Question: Student Information

// Write a Java program that asks the user to enter:
// 1. Their full name (String)
// 2. Their age (int)
// 3. Their percentage (double)
// Print all three values in the specified format.

// Example input:
// Enter your full name: Amar Kumar
// Enter your age: 20
// Enter your percentage: 85.5


// Expected output:
// ----- Student Information -----
// Name: Amar Kumar
// Age: 20
// Percentage: 85.5%


// Rules
// - Use Scanner for input.
// - Use nextLine() to read the full name.
// - Use nextInt() for age.
// - Use nextDouble() for percentage.
// - Use System.out.println() to display the output.

import java.util.Scanner;

class Student_Information{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("-------Student Information Input -------");

        System.out.print("Enter your full name : ");
        String name = in.nextLine();

        System.out.print("Enter your age : ");
        int age = in.nextInt();

        System.out.print("Enter your percentage : ");
        double percentage = in.nextDouble();

        System.out.println("-------Student Information Output-------");

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Percentage : " + percentage+"%");

        in.close();



    }
}