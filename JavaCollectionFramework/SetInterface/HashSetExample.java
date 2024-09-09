package JavaCollectionFramework.SetInterface;

// A HashSet is a collection of items where every item is unique, and it is found in the java.util package.  Does not guarantee order.

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        Set <String> city = new HashSet<>();
        city.add("New York");
        city.add("Los Angeles");
        city.add("Chicago");
        city.add("New York"); // Duplicate, will be ignored.

        for (String cities : city){
            System.out.println(cities);
        }
    }
}
