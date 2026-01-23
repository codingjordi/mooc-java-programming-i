
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while(true){
            String person = scanner.nextLine();
            
            if(person.isEmpty()){
                break;
            }
            
            String[] personInfo = person.split(",");
            
            if(Integer.valueOf(personInfo[1]) > oldest) {
                oldest = Integer.valueOf(personInfo[1]);
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
