
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josaca
 */
public class Room {
    
    private ArrayList<Person> students;
    
    public Room() {
        
        this.students = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.students.add(person);
    }
    
    public boolean isEmpty() {
        return this.students.isEmpty();
    }
    
    public Person shortest() {
        if(this.students.isEmpty()) {
            return null;
        }
        
        Person shortest = this.students.get(0);
        for(Person student : this.students) {
            if(student.getHeight() < shortest.getHeight()) {
                shortest = student;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        Person shortestPerson = this.shortest();
        
        if(this.students.isEmpty()) {
            return null;
        }
        
        this.students.remove(shortestPerson);
        
        return shortestPerson;
    }
    
    public ArrayList<Person> getPersons() {
        return this.students;
    }
}
