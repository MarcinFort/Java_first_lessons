import java.util.Scanner;

public class ADumbCalculator {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number: ");
        double firstNo = keyboard.nextFloat();
        System.out.print("Second number: ");
        double secondNo = keyboard.nextFloat();
        System.out.print("Third number: ");
        double thirdNo = keyboard.nextFloat();

        double result = (firstNo + secondNo + thirdNo) / 2;

        System.out.println(firstNo + " + " + secondNo + " + " + thirdNo + " = " + result);

    }
}