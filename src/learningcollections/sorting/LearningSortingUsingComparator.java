/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningcollections.sorting;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Stanislav Scerbatiuc
 */
public class LearningSortingUsingComparator {

    public static void main(String args[]) {

        ArrayList<Student> aList = new ArrayList<>();
        aList.add(new Student(101, "Stas", 23));
        aList.add(new Student(106, "Ion", 27));
        aList.add(new Student(105, "Vlad", 21));

        System.out.println("Sorting by Name...");

        Collections.sort(aList, new NameComparator());
        for (Student st : aList) {
            System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
        }

        System.out.println("Sorting by age...");

        Collections.sort(aList, new AgeComparator());
        for (Student st : aList) {
            System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
        }

    }
}
