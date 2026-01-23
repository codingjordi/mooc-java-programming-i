
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int acc = 0;
        String longest = "";
        int persons = 0;
        
        
        while(true){
            //1.demanar dadesm(nom,edat)
        String csv = scanner.nextLine();
        
        //2. break si cadena vuida
        if(csv.isEmpty()){
            break;
        }
                
        // pasar csv a array de string
        String[] details = csv.split(",");
        
        //3. sumar edat personal al acc
        persons++;
        acc += Integer.valueOf(details[1]);
        
        
        //4. comparar si nom es mes llarg que longest
        if(longest.length() < details[0].length()){
              longest = details[0];
            }
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (double)acc / (double)persons);
        

    }
}
