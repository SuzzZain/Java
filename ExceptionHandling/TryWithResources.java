package ExceptionHandling;

// The try-with-resources statement is a special kind of try block in Java that automatically closes resources (like files, streams, etc.) once the execution is complete. This eliminates the need to manually close the resource in the finally block.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"));){
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("IOException occured");
        }
    }
}
