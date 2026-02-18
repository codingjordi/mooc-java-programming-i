
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point totals, -1 stops:");

        int grades = 0;
        int gradesSum = 0;

        int gradesPassing = 0;
        int gradesSumPassing = 0;

        while (true) {
            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                System.out.println("Point average (all): " + 1.0 * gradesSum / grades);
                System.out.println("Point average (passing): " + 1.0 * gradesSumPassing / gradesPassing);
                System.out.println("Pass percentage: " + 100.0 * gradesPassing / grades);
                break;
            }

            if (points >= 0 && points <= 100) {
                grades++;

                if (points >= 50 && points <= 100) {
                    gradesPassing++;
                    gradesSumPassing += points;
                }
                gradesSum += points;

            }
        }
    }
}
