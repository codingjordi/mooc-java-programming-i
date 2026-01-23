import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String phrase = scanner.nextLine();
            
            if(phrase.isEmpty()){
                break;
            }
            
            String[] words = phrase.split(" ");
            
            
            
            System.out.println(words[0]);
        }


    }
}
