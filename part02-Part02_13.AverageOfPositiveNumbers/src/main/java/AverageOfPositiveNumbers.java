
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int loops = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            
            if(number == 0) {
                if(sum == 0) {
                    System.out.println("Cannot calculate the average");
                }
                System.out.println(((double)sum / (double)loops));
                break;
            } else if(number > 0 ) {
                loops += 1;
                sum += number;
            }
        }

    }
}
