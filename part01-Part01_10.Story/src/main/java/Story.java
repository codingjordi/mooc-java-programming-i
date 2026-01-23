
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.\n" +
"What is the main character called?");
        
        String message1 = scanner.nextLine();
        
        System.out.println("What is their job?");
        
        String message2 = scanner.nextLine();
        
        System.out.println("Here is the story:\n" +
            "Once upon a time there was " + message1 + ", who was " + message2 + ".\n" +
            "On the way to work, " + message1 + " reflected on life.\n" +
            "Perhaps " + message1 + " will not be " + message2 +" forever.");

    }
}
