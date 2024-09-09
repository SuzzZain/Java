package JavaCollectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.List;

// The ArrayList class is a resizable array, which can be found in the java.util package. Elements can be added and removed from an Arraylist.

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //Access elements
        System.out.println(fruits.get(1));

        //Iterate through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
