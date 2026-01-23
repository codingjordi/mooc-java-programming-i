
import java.util.ArrayList;
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. pide la frase
        //2. la convierte en un array de Strings
        
        

        while (true) {

            String phrase = scanner.nextLine(); 
            
            String[] words = phrase.split(" ");
            ArrayList<String> avWords = new ArrayList<>();
            
            if(phrase.equals("")){
                break;
            }
            
            //3. itera cada String del array para saber si contiene "av"
            for (String word : words) {
                if (word.contains("av")) {
                    avWords.add(word);
                }
            }

            //4. imprime palabras con "av"
            for (String word : avWords) {
                System.out.println(word);
            }

        }

    }
}
