import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamsExample {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        String text = "Hello from Java I/O Streams";

        try (FileOutputStream out = new FileOutputStream(fileName)) {
            out.write(text.getBytes());
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        try (FileInputStream in = new FileInputStream(fileName)) {
            StringBuilder builder = new StringBuilder();
            int b;
            while ((b = in.read()) != -1) {
                builder.append((char) b);
            }
            System.out.println("Data read from file: " + builder.toString());
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
