
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 9999) {
                break;
            }
            
            list.add(number);
        }
        
        if (!list.isEmpty()){
            int smallestNumber = list.get(0);
            int indexSmallest = 0;
            
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) < smallestNumber){
                    smallestNumber = list.get(i);
                    indexSmallest = i;
                }
            }
            
            System.out.println("Smallest number: " + smallestNumber);
            System.out.println("Found at index: " + indexSmallest);
        }

        
    }
}
