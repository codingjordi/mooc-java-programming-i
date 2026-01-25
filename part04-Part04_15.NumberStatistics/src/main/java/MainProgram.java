import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ¡IMPORTANTE! Deben crearse en este orden exacto para que el test pase
        Statistics total = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        System.out.println("Enter numbers: ");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                continue; // No rompas el bucle si está vacío, solo ignora
            }
            
            int number = Integer.valueOf(input);
            
            if (number == -1) {
                break;
            }
            
            // Siempre añadimos al total
            total.addNumber(number);
            
            // Clasificamos en los otros objetos
            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }
        
        System.out.println("Sum: " + total.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        System.out.println("Average: " + total.average());
    }
}