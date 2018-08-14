public class Conditionals {
    public static void main(String[] args) {

        String password = "correct";

        int cars = 12;

        if (password == "correct") {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied!");
        }

        if (cars > 13) {
            System.out.println("There are a lot of cars!");
        } else if (cars > 1) {
            System.out.println("There are some cars!");
        } else if (cars == 1) {
            System.out.println("There is one car!");
        } else {
            System.out.println("There are no cars.");
        }

        char allCorrect = password == "correct" && cars > 10 ? 'Y' : 'N';

        System.out.println(allCorrect);

        char myFavLetter = 'v';

        switch (myFavLetter) {
            case 'a':
                System.out.println("It's a vowel!");
                break;
            case 'b':
                System.out.println("It's a consonant!");
                break;
            case 'v':
                System.out.println("It's a really awesome consonant!");
                break;
            default:
                System.out.println("It's some symbol I don't have in my database;)");
        }

    }
}