
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while(true){
            System.out.println("?");
            
            String command = scan.nextLine();
            if(command.equals("Add")){
                System.out.println("Name: "); 
                String birdName = scan.nextLine();
                
                System.out.println("Name in Latin: ");
                String birdLatinName = scan.nextLine();
                
                birds.add(new Bird(birdName, birdLatinName));
            }
            
            if(command.equals("Observation")) {
                System.out.println("Bird? ");
                String birdName = scan.nextLine();
                
                boolean found = false;
                
                for(Bird bird : birds) {
                   if(bird.getName().equals(birdName)) {
                       bird.setObservations();
                       found = true;
                       break;
                   }
                }
                
                if(found == false) {
                    System.out.println("Not a bird!");
                }
            }
            
            if(command.equals("All")) {
                for(Bird bird : birds) {
                    System.out.println(bird);
                }
            }
            
            if(command.equals("One")) {
                System.out.println("Bird? ");
                String birdName = scan.nextLine();
                
                for(Bird bird : birds) {
                    if(bird.getName().equals(birdName)) {
                        System.out.println(bird);
                    }
                }
            }
            
            if(command.equals("Quit")) {
                break;
            }
        }

    }

}
