package learningcollections.sorting;

import java.util.*;

public class LearningSorting {

    public static void main(String args[]) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101, "Ion", 23));
        al.add(new Student(106, "Stas", 27));
        al.add(new Student(105, "Vlad", 21));

        Collections.sort(al);
        for (Student st : al) {
            System.out.println(st.getRollno() + " " + st.getName() + " " + st.getAge());
        }
    }
}
