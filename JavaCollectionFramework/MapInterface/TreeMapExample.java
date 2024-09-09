package JavaCollectionFramework.MapInterface;

import java.util.TreeMap;

// The TreeMap in Java is used to implement Map interface and NavigableMap along with the AbstractMap Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. 

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Orange", 3);
        
        // TreeMap automatically sorts by keys
        System.out.println(map); // {Apple=5, Banana=2, Orange=3}
    }
}
