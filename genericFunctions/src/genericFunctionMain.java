import java.util.Scanner;

public class genericFunctionMain {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num1;
        double num2;
        double result;


        System.out.println("This program adds an int and a double!");
        System.out.print("Please input a int: ");
        num1 = scan.nextInt();

        System.out.println();

        System.out.print("Please input a double: ");
        num2 = scan.nextDouble();

        System.out.println();

        result = num1 + num2;

        System.out.println("The result of " + num1 + " + " + num2 + " is " + result);
    }
}
