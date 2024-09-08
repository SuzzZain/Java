package String;
//Strings are used for storing text. A String variable contains a collection of characters surrounded by double quotes.
//Immutable: Objects that cannot be modified after creation. String is immutable, meaning every time you modify it, a new object is created.
//Mutable: Objects that can be modified after creation. StringBuffer and StringBuilder are mutable.
public class Strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;  // Both s1 and s2 point to the same string in memory
        s1 = s1 + " World";  // s1 is reassigned to a new string "Hello World", original "Hello" remains unchanged

        System.out.println(s1);  
        System.out.println(s2);  
    }
}
