
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josaca
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictonary) {

        this.scanner = scanner;
        this.dictionary = dictonary;

    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                if (this.dictionary.translate(word) == null || !this.dictionary.translate(word).equals(word)) {
                    this.dictionary.add(word, translation);
                }
                
                continue;
            } else if(command.equals("search")) {
                System.out.print("Translation: ");
                String search = scanner.nextLine();
                
                String translation = this.dictionary.translate(search);
                
                if(translation == null) {
                    System.out.println("Word " + search + " was not found");
                    continue;
                }
                
                System.out.println(translation);
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
