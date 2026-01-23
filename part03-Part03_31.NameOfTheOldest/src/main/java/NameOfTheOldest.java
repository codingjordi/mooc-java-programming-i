
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOldest = "";
        int ageOldest = 0;

        while (true) {
            String person = scanner.nextLine();

            if (person.isEmpty()) {
                break;
            }

            String[] personDetails = person.split(",");

            for (String details : personDetails) {
                if (Integer.valueOf(personDetails[1]) > ageOldest) {
                    ageOldest = Integer.valueOf(personDetails[1]);
                    nameOldest = personDetails[0];
                }
            }
        }

        System.out.println("Name of the oldest: " + nameOldest);


    }
}
