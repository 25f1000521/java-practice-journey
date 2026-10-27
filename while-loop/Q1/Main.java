import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of n : ");
        int n = in.nextInt();
        System.out.println("----------------- 1 to " +  n + " numbers are -----------------------");
        Print.print_1_to_n(n);
        System.out.println("----------------- " + n + " to 1 numbers are -----------------------");
        Print.print_n_to_1(n);
    }
}