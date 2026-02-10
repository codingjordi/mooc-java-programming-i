
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josaca
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todo;
    
    public UserInterface(TodoList todo, Scanner scanner) {
        this.scanner = scanner;
        this.todo = todo;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            } else if(command.equals("add")) {
                System.out.println("To add: ");
                String todoToAdd = scanner.nextLine();
                
                this.todo.add(todoToAdd);
            } else if(command.equals("list")) {
                this.todo.print();
            } else if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int todoNumber = Integer.valueOf(scanner.nextLine());
                
                this.todo.remove(todoNumber);
            }
        }
    }
}
