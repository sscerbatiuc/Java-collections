package learningcollections.iterating.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Stanislav Scerbatiuc
 */
public class LearningMapIterator {
    public static void main(String[] args) {
        // Create a HashSet
        Map<Integer, String> hashMap = new HashMap<>();

        //add elements to HashSet
        hashMap.put(1, "Object 1");
        hashMap.put(2, "Object 2");
        hashMap.put(3, "Object 3");
        hashMap.put(4, "Object 4");
        hashMap.put(5, "Object 5");

        // Declare an iterator
        Iterator<Entry<Integer,String>> mapIterator = hashMap.entrySet().iterator();

        while (mapIterator.hasNext()) {
            Entry<Integer,String> foundElement = mapIterator.next();
            System.out.println(foundElement);
            if (foundElement.getValue().equals("Object 1")) {
                mapIterator.remove();
                System.out.println("'Object 1' removed");
            }
        }
        
        // How to do it correctly
//        for(Entry<Integer,String> mapEntry: hashMap.entrySet()){
//            System.out.println(mapEntry.getValue());
//            if(mapEntry.getKey().equals(1)){
//                System.out.println("'Object 1' removed");
//                hashMap.remove(mapEntry.getKey());
//            }
//        }

        System.out.println("The whole map again: " + hashMap);
    }
}
