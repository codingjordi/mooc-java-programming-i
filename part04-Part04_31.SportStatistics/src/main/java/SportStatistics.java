
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String fileName = scan.nextLine();
        
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        int counter = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] matchDetails = line.split(",");
                
                if(teamName.equals(matchDetails[0])) {
                    counter++;
                    
                    if(Integer.valueOf(matchDetails[2]) > Integer.valueOf(matchDetails[3])){
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                if(teamName.equals(matchDetails[1])) {
                    counter++;
                    
                    if(Integer.valueOf(matchDetails[3]) > Integer.valueOf(matchDetails[2])){
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        
        
        
        } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + counter);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        

    }

}
