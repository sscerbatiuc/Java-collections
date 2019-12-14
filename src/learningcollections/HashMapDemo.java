package learningcollections;

import java.util.HashMap;
import java.util.Map.Entry;
import learningcollections.entity.PersonWithCode;

/**
 *
 * @author sscerbatiuc
 */
public class HashMapDemo {
    
    static HashMap<Integer, PersonWithCode> personMap = new HashMap<>();
    
    public static void main(String[] args) {
        
    }
    
    static void addPerson(PersonWithCode p){
        personMap.put(p.getCode(), p);
    }
    
    static void getPerson(int code){
        personMap.get(code);
    }
    
    public void delete(int code){
        personMap.remove(code);
    }
    
    static void iterate(){
        for(Entry<Integer, PersonWithCode> entry : personMap.entrySet()){
            System.out.println("Person");
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
    
}
