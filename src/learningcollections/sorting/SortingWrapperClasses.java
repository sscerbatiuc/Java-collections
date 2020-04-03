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
        
        for(Integer x: al){
            System.out.println(x);
        }
        
        System.out.println("sortat:");

        Collections.sort(al);
        
//        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//        }
        
        for(Integer x: al){
            System.out.println(x);
        }
        


    }
}
