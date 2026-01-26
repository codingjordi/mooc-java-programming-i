
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while(fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] csv = row.split(",");
                
                if(Integer.valueOf(csv[1]) == 1) {
                    System.out.println(csv[0] + ", " + "age: " + csv[1] + " year");
                } else {
                    System.out.println(csv[0] + ", " + "age: " + csv[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
