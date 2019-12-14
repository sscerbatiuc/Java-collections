package learningcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import learningcollections.entity.Person;

/**
 *
 * @author sscerbatiuc
 */
public class ArrayListStringDemo {
    
    static ArrayList<String> strings = new ArrayList<>();
    static ArrayList<Person> persons = new ArrayList<>();
    
    public static void main(String[] args){
        
    }
    
    
    static void addingElements(){
        for (int i = 0; i < 10; i++) {
            strings.add("Value " + i);
        }
    }
    
    static void iteratingElements(){
        for(String value: strings){
            // code
        }
        
        for (int i = 0; i < strings.size(); i++) {
            // code
        }
        
        // while, do-while
    }
    
    static String getElement(int index){
        return strings.get(index);
    }
    
    static boolean checkIfContains(String value){
        return strings.contains(value);
    }
    
    static String search(String value){
        for(String element: strings){
            if(element.equalsIgnoreCase(value)){
                return element;
            }
        }
        return null;
    }
    
    static String delete(int index){
        return strings.remove(index);
    }
    
    static boolean delete(String value){
        return strings.remove(value);
    }
    
    static void sortList(){
        Collections.sort(strings);
    }
    
    static void iterateUsingIterator(){
        ListIterator<String> iterator = strings.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}
