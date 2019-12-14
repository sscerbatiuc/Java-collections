package learningcollections;

import java.util.HashSet;
import java.util.Set;
import learningcollections.entity.Person;

/**
 *
 * @author sscerbatiuc
 */
public class HashSetDemo {

    static Set<Person> personsSet = new HashSet<>();

    public static void main(String[] args) {
        Person p1 = new Person("Jake", "Peter");
        Person p2 = new Person("Jake", "Peter");
        personsSet.add(p2);
        personsSet.add(p1);
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        
        for(Person p: personsSet){
            System.out.println(p);
        }
    }

}
