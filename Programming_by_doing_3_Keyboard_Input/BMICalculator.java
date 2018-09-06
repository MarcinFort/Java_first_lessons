import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Your height in m: ");
        double height = keyboard.nextFloat();
        System.out.print("Your weight in kg: ");
        double weight = keyboard.nextFloat();

        double BMI = weight / (height * height);

        System.out.println("Your BMI is "+BMI);
    }
}