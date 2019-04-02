/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningcollections.iterating.classic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sscerbatiuc
 */
public class IteratingDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("2Hello");

        for (int i = 0; i < strings.size(); i++) {
            String element = strings.get(i);
            System.out.println(element);
        }
        
        int index = 0;
        while(index++ < strings.size()){
            System.out.println(strings.get(index));
        }
        
        for (String el : strings) {
            System.out.println(el);
        }
    }

}
