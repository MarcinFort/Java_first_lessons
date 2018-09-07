import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your current Earth weight: ");
        double earthWeight = keyboard.nextFloat();

        double relGravity = 1;
        int planetNo;

        System.out.println("I have information for the following planets:");
        System.out.println("\t1. Venus\t2. Mars\t\t3. Jupiter\n\t4. Saturn\t5. Uranus\t6. Neptune\n");
        System.out.println("Which planet are you visiting?");

        planetNo = keyboard.nextInt();

        while (planetNo < 1 || planetNo > 6) {
            System.out.println("Pick one planet from 1 to 6!");
            planetNo = keyboard.nextInt();
        }

        if (planetNo == 1) {
            relGravity = 0.78;
        }
        if (planetNo == 2) {
            relGravity = 0.39;
        }
        if (planetNo == 3) {
            relGravity = 2.65;
        }
        if (planetNo == 4) {
            relGravity = 1.17;
        }
        if (planetNo == 5) {
            relGravity = 1.05;
        }
        if (planetNo == 6) {
            relGravity = 1.23;
        }

        double newWeight = earthWeight * relGravity;
        
        System.out.println("Your weight would be "+newWeight+" kg on that planet.");

    }
}