package learningcollections.sets;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sscerbatiuc
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> stringsSet = new HashSet<>(150, 1.5F);
        stringsSet.add("Hello2");
        System.out.println("Hello2".hashCode());
        System.out.println(stringsSet.add("Hello"));
        stringsSet.add("Hello");
        stringsSet.add("Hello");
        
        System.out.println(stringsSet.size());
    }
    

}
