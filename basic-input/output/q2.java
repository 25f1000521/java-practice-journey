// Take two input name and age of user and print using Scanner

import java.util.Scanner ;

class Input2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("-------Input-------");

        System.out.print("Enter your name : ");
        String name = in.nextLine();

        System.out.print("Enter your age : ");
        int age = in.nextInt();

        System.out.println("-------Output-------");

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
