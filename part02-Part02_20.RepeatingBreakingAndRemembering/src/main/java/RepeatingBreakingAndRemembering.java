
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        double avg = 0;
        int odds = 0;
        int evens = 0;
        
        System.out.println("Give numbers:");
        
        while(true){
            int number = scanner.nextInt();
            
            if(number == -1) {
                break;
            } else {
                sum += number;
                numbers++;
                if(number % 2 == 0) {
                    evens++;
                } else {
                    odds++;
                }
                
            }
            
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + ((double)sum / (double)numbers));
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
        

    }
}
