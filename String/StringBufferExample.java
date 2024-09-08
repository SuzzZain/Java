package String;

//StringBuffer is a thread-safe (synchronized) class used for creating mutable strings. It is slower due to synchronization.
//StringBuffer allows modification of the string in the same memory location. Unlike String, no new object is created after the modification.

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // Modifies the same object
        System.out.println(sb);  
    }
}
