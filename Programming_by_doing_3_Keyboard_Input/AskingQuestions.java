import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int age;
        String height;
        int height2;
        double weight;

        System.out.println("How old are you? ");
        age = keyboard.nextInt();

        System.out.println("How tall are you in feet? ");
        height = keyboard.next();

        System.out.println("How tall are you in inches? ");
        height2 = keyboard.nextInt();

        System.out.println("How much do you weigh? ");
        weight = keyboard.nextDouble();

        System.out.println("So you're " + age + " old, " + height + " tall and " + weight + " heavy.");
        System.out.println("You're " + height2 + " inches tall in inches");

    }
}