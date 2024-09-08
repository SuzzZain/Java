package String;

//StringBuilder is similar to StringBuffer but is not thread-safe, meaning it is faster and should be used when synchronization is not needed.

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  // Modifies the same object
        System.out.println(sb);  
    }
}
