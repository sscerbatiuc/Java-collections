package learningcollections.iterating.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Stanislav Scerbatiuc
 */
public class LearningListIterator {

    public static void main(String args[]) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Object 1");
        arrayList.add("Object 2");
        arrayList.add("Object 3");
        arrayList.add("Object 4");
        
        // Declaring an iterator
        ListIterator<String> stringsIterator = arrayList.listIterator();
        
        // Forward
        System.out.println("traversing elements in forward direction...");
       while(stringsIterator.hasNext()) {
            String foundElement = stringsIterator.next();
            
            System.out.println("Element "+ arrayList.indexOf(foundElement) +": " + foundElement);
            if(foundElement.equals("Object 4")){
                System.out.println("Object 4 removed");
                stringsIterator.remove();
                System.out.println("Element removed");
                break;
            }
        }
        
        // Backward
        System.out.println("traversing elements in backward direction...");
        while (stringsIterator.hasPrevious()) {
            
            System.out.println("really traversing");
            System.out.println(stringsIterator.previous());
            
        }
    }
}
