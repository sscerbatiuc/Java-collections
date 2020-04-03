package learningcollections.sorting;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    int rollno;
    String name;
    int age;
    long salary;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student st) {
        return this.age - st.getAge();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.rollno;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.age;
        hash = 89 * hash + (int) (this.salary ^ (this.salary >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.rollno != other.rollno) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
