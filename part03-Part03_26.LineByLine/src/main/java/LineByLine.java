
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String[] parts = string.split(" ");

        if (parts.length > 0) {
            for (String part : parts) {
                System.out.println(part);
            }
        }

    }
}
