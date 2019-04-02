/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningcollections.arraylist;

import java.util.ArrayList;

/**
 *
 * @author sscerbatiuc
 */
public class ArrayListDemo {

    final static String HELLO = "hello";

    final static ArrayList<Integer> INTEGERS = new ArrayList<>();

    static {
        INTEGERS.add(1);
    }
    
    public static void main(String... args) {
        
        INTEGERS.remove(0);
        INTEGERS.remove(new Integer(1));
//        System.out.println(STRINGS.get(0));
//        System.out.println(STRINGS.remove("hello"));
////        System.out.println(strings.remove(hello));
////        System.out.println(strings.remove(0));
//        System.out.println(STRINGS.size());
    }
}
