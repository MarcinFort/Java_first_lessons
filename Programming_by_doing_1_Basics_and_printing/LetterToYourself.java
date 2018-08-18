public class LetterToYourself {

    public static void main(String[] args) {

        String[] addressLines = {"Harry Potter", "Hawk Street 23", "3441 California, USA"};

        for (int a = 0; a < 15; a++) {
            if (a == 0 || a == 14) {
                System.out.print("+");
                for (int i = 0; i < 50; i++) {
                    System.out.print("-");
                }
                System.out.print("+");
            } else if (a >= 10 && a <= 12) {
                int index = a - 10;
                System.out.print("|");
                for (int b = 0; b < 26; b++) {
                    System.out.print(" ");
                }
                System.out.print(addressLines[index]);
                int spacesToTheEnd = 24 - addressLines[index].length();
                for (int c = 0; c < spacesToTheEnd; c++) {
                    System.out.print(" ");
                }
                System.out.print("|");
            } else {
                System.out.print("|");
                for (int k = 0; k < 50; k++) {
                    if (k > 43 && k < 49 && a > 1 && a < 6) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("|");
            }
            System.out.print("\n");

        }

    }
}