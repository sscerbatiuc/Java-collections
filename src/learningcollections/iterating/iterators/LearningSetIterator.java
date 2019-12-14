package learningcollections.iterating.iterators;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Stanislav Scerbatiuc
 */
public class LearningSetIterator {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        //add elements to HashSet
        hashSet.add("Object 1");
        hashSet.add("Object 2");
        hashSet.add("Object 3");
        hashSet.add("Object 4");
        hashSet.add("Object 5");

        // Declare an iterator
        Iterator<String> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            String foundElement = iterator.next();
            System.out.println(foundElement);
            if (foundElement.equals("Object 1")) {
                iterator.remove();
                System.out.println("'Object 1' removed");
            }
        }

        System.out.println("The whole list again: " + hashSet);
    }
}
