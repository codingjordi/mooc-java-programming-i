import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            // 1. PRIMERO comprobamos si es -1
            if (number == -1) {
                break;
            }
            
            // 2. SOLO añadimos si no es -1
            numbers.add(number);
        }
        
        if (!numbers.isEmpty()) {
            int acc = 0;
            // Usamos un for-each para que sea más limpio
            for (int value : numbers) {
                acc += value;
            }
            
            // Ahora dividimos por el tamaño real, ya que no hay -1 infiltrados
            double average = (double) acc / numbers.size();
            System.out.println("Average: " + average);
        }
    }
}