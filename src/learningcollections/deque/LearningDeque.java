package learningcollections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearningDeque {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>(10);

        deque.add("String 1 (Tail)"); // add to tail
        deque.addFirst("String 2 (Head)"); // Add first
        deque.addLast("String 3 (Tail)"); // Add to tail
        deque.push("String 4 (Head)"); //add to head
              
        // Adds an element to the tail and returns a boolean to explain if the insertion was successful.
        deque.offer("String 5 (Tail)");
        // Adds an element to the head and returns a boolean to explain if the insertion was successful.
        deque.offerFirst("String 6 (Head)");
        // Adds an element to the tail and returns a boolean to explain if the insertion was successful.
        deque.offerLast("String 7 (Tail)");
        
        System.out.println(deque + "\n");
    }

}
