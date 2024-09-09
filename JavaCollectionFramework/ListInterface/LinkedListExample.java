package JavaCollectionFramework.ListInterface;

import java.util.LinkedList;

// Same as Arraylist but LinkedList stores its items in containers.
// The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        number.add(10);
        number.add(20);
        number.addFirst(5); // Add to the beginning
        number.addLast(1); // Add to the last
    
        for (int numbers : number) {
            System.out.println(numbers);
        } 
    }
}
