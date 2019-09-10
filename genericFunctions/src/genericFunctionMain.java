import java.util.Scanner;
import java.lang.*;

public class genericFunctionMain {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num1, num2;
        int result;
        double num3, num4;
        double result2;


        System.out.println("This program adds two numbers!");
        System.out.print("Please input a int: ");
        num1 = scan.nextInt();

        System.out.println();

        System.out.print("Please input a int: ");
        num2 = scan.nextInt();

        System.out.println();

        result = num1 + num2;

        System.out.println("The result of " + num1 + " + " + num2 + " is " + result);

        genericFunction<Integer> val1 = new genericFunction<Integer>(num1,num2);

        System.out.println("The generic adder result is: " + val1.toString());


        System.out.print("Please input a double: ");
        num3 = scan.nextDouble();

        System.out.println();

        System.out.print("Please input a double: ");
        num4 = scan.nextDouble();

        System.out.println();

        result2 = num3 + num4;

        System.out.println("The result of " + num3 + " + " + num4 + " is " + result2);

        genericFunction<Double> val2 = new genericFunction<Double>(num3,num4);

        System.out.println("The generic adder result is: " + val2.toString());
    }
}
