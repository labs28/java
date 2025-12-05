import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Sara");
        names.add("John");

        System.out.println("All names: " + names);

        names.remove("Sara");
        names.add(1, "Mina");

        System.out.println("After changes: " + names);

        String first = names.get(0);
        System.out.println("First name: " + first);
        System.out.println("Size: " + names.size());
    }
}
