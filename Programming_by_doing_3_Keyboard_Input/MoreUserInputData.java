import java.util.Scanner;

public class MoreUserInputData {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the following information so I can sell it for a profit!\n");
        System.out.println("First name:");
        String firstName = keyboard.next();
        System.out.println("Last name:");
        String lastName = keyboard.next();
        System.out.println("Grade:");
        int grade = keyboard.nextInt();
        while (grade > 12 || grade < 9) {
            System.out.println("The grade scale: 9-12. Try again:");
            grade = keyboard.nextInt();
        }
        System.out.println("Student ID:");
        int studentID = keyboard.nextInt();
        System.out.println("Login:");
        String login = keyboard.next();
        System.out.println("GPA (0.0-4.0):");
        double gpa = keyboard.nextFloat();
        while (gpa < 0 || gpa > 4) {
            System.out.println("Available scale: 0.0-4.0. Try again:");
            gpa = keyboard.nextFloat();
        }

        System.out.println("Your information:");
        System.out.println("\tLogin: \t"+login);
        System.out.println("\tId: \t"+studentID);
        System.out.println("\tName: \t"+lastName+", "+firstName);
        System.out.println("\tGPA: \t"+gpa);
        System.out.println("\tGrade: \t"+grade);
    }
}