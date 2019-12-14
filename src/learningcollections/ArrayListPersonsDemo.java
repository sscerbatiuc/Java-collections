package learningcollections;

import java.util.ArrayList;
import learningcollections.entity.Person;

/**
 *
 * @author sscerbatiuc
 */
public class ArrayListPersonsDemo {
    
    static ArrayList<Person> persons = new ArrayList<>();
    
    public static void main(String[] args){
        
    }
    
    static void addingElements(){
        for (int i = 0; i < 10; i++) {
            persons.add(new Person("Name" + i, "Surname" + i));
        }
    }
    
    static void print(){
        for(Person p: persons){
            System.out.println(p);
        }
    }
    
    static boolean checkIfContains(Person person){
        return persons.contains(person);
    }
    
    
}
