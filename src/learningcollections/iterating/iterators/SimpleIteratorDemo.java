package learningcollections.iterating.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sscerbatiuc
 */
public class SimpleIteratorDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("2Hello");
        strings.add("3Hello");

        Iterator<String> iterator = strings.iterator();
        if (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        String next2 = iterator.next();
        System.out.println(next2);
        System.out.println(iterator.next());
    }
}
