
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number? ");
        int number = scanner.nextInt();
        
        int sum = 0;
        
        for(int i = number; i >= 1; i--){
            sum += i;
        }
        
        System.out.println("The sum is " + sum);

    }
}
