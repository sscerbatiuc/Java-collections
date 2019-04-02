package learningcollections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Stanislav Scerbatiuc
 */
public class SortingWrapperClasses {

    public static void main(String args[]) {

        ArrayList<Integer> al = new ArrayList();
        al.add(201);
        al.add(101);
        al.add(230);  

        Collections.sort(al);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
