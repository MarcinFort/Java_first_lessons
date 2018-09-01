import java.util.Scanner;

public class TheForgetfulMachine {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me a word!");
        keyboard.next();
        System.out.println("Give me a second word!");
        keyboard.next();
        System.out.println("\nGreat! Now, what's your favorite number?");
        keyboard.nextInt();
        System.out.println("Ok, now your second favorite number?");
        keyboard.nextInt();
        System.out.println("\nWhew! Wasn't that fun?");

    }
}