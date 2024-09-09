package ExceptionHandling;

// throws: Used in a method signature to declare that a method may throw an exception.

import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) throws IOException{
        throwIOException();
    }

    public static void throwIOException() throws IOException {
        throw new IOException("This is a checked exception.");
    }
}
