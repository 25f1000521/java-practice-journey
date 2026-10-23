// Take two input name and age of user and print using console 

import java.io.Console;

class Input1{
    public static void main(String[] args){
        
        Console cons = System.console();

        String name = cons.readLine("Enter your name : ");
        int age = Integer.parseInt(cons.readLine("Enter your age : "));

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}