public class Schedule {
    public static void main(String[] args) {

        String topBottomBar = "+";
        for (int i = 0; i < 50; i++) {
            topBottomBar += "-";
        }
        topBottomBar += "+";

        String[] subjects = { "Maths", "C++", "Biotechnology", "Java Programming", "Python Algorithms" };
        String[] teachers = { "F. Smith", "R. Black", "T. DeLano", "A. Travis", "V. Johnson" };

        System.out.println(topBottomBar);
        for (int j = 1; j < 6; j++) {
            String tableRow = "| ";
            tableRow += j;
            tableRow += " |";
            for (int k = 0; k < (25 - subjects[j-1].length()); k++) {
                tableRow += " ";
            }
            tableRow += subjects[j-1];
            tableRow += " | ";
            for (int l = 0; l < (17 - teachers[j-1].length()); l++) {
                tableRow += " ";
            }
            tableRow += teachers[j-1];
            tableRow += " |";
            System.out.println(tableRow);
        }
        System.out.println(topBottomBar);
    }
}