import java.util.Scanner;

public class AlphabeticalOrder {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("What's your last name? ");
        String lastName = keyboard.next();

        if (lastName.compareTo("Carswell") <= 0) {
            System.out.println("you don't have to wait long");
        } else if (lastName.compareTo("Jones") <= 0) {
            System.out.println("that's not bad");
        } else if (lastName.compareTo("Smith") <= 0) {
            System.out.println("looks like a bit of a wait");
        } else if (lastName.compareTo("Young") <= 0) {
            System.out.println("it's gonna be a while");
        } else {
            System.out.println("not going anywhere for a while?");
        }
    }

}