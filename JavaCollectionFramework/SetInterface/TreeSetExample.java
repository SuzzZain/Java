package JavaCollectionFramework.SetInterface;
// TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage. 
//The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided. 
// This must be consistent with equals if it is to correctly implement the Set interface. 

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        
        // Sorted automatically
        System.out.println(numbers); 
    }
}