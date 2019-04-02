/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningcollections.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author sscerbatiuc
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        Set<String> stringsSet = new TreeSet<>();
        stringsSet.add("H");
        stringsSet.add("W");
        stringsSet.add("A");
        stringsSet.add("Q");

        System.out.println(stringsSet.toString());

        Set<CustomClass> customSet = new TreeSet<>();
        customSet.add(new CustomClass(300));
        customSet.add(new CustomClass(255));
        customSet.add(new CustomClass(1));
        
        System.out.println(customSet.toString());
    }

}

class CustomClass implements Comparable<CustomClass>{

    int value;

    public CustomClass(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(CustomClass o) {
        // -negative 0 +positive
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return "CustomClass{" + "value=" + value + '}';
    }
    
    
}
