
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            try {
                int number = Integer.valueOf(input);

                System.out.println((int) Math.pow(number, 3));

            } catch (NumberFormatException e) {
                System.out.println("El input no es un número");
            }
        }

    }
}
