import java.io.*;

// Class must implement Serializable
class Student implements Serializable {
    int id = 101;
    String name = "Haseeb";
}

public class Main {
    public static void main(String[] args) throws Exception {

        Student s = new Student();   // create object

        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);   // writing object to file
        oos.close();
        fos.close();

        System.out.println("Object Serialized.");
        System.out.println("Student ID: " + s.id);
        System.out.println("Student Name: " + s.name);
    }
}
