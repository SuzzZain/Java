package JavaCollectionFramework.MapInterface;

// A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

// One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 25);
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 35);

        // Access elements
        System.out.println("Alice's age: " + ageMap.get("Alice"));

        for(Map.Entry <String, Integer> entry : ageMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
