import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        // Writing to file
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Hello Java\n");
        fw.write("Hello world\n");
        fw.close();

        // Reading from file
        FileReader fr = new FileReader("sample.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
