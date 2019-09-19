import java.util.*;

public class testMain {

    //global variables for ease
    private static int a;
    private static int b;

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int [] array = {5, 1, 2, 5, 4, 4, 10, 7, 8, 5};
        char [] charA = { 'a', 'b', 'c', 'd', 'a', 'a'};

        System.out.print("Enter var 1: ");
        a = scan.nextInt();

        System.out.print("Enter var 2: ");
        b = scan.nextInt();

        swap();

        System.out.println("Swapped var 1: " + a);
        System.out.println("Swapped var 2: " + b);

        findFives(array);

        int number = countNumberOfOccurences(array);
        System.out.println("5 occurs " + number + " times");

        int factorialVal = factorial(a);
        System.out.println("the factorial of swapped a is " + factorialVal);

        int charVal = charFinder(charA);
        System.out.println("A occurs " + charVal + " times in the char array");

    }

    private static void swap(){
        int temp;

        temp = a;
        a = b;
        b = temp;
    }


    private static void findFives(int [] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == 5)
                System.out.println("There is a 5 in element " + i);
        }
    }

    private static int countNumberOfOccurences(int[] array){
        int count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] == 5)
                count++;
        }
         return count;
    }

    private static int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    private static int charFinder(char[] charArray){
        int count = 0;

        for (int i = 0; i < charArray.length; i++){
            if (charArray[i] == 'a')
                count++;
        }
        return count;
    }
}
