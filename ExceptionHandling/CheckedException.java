package ExceptionHandling;

// Checked vs. Unchecked Exceptions
// Checked Exceptions: These are checked at compile time, meaning the compiler ensures that they are either handled with a try-catch block or declared using the throws keyword. Examples include IOException, SQLException.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            File file = new File("no_such_file.txt");
            FileReader fr = new FileReader(file); //will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
