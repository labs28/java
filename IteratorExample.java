import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("One");
        items.add("Two");
        items.add("Three");
        items.add("Four");

        System.out.println("Using Iterator (forward):");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println("Using ListIterator (forward and backward):");
        ListIterator<String> listIterator = items.listIterator();
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            System.out.println("Forward: " + value);
        }
        while (listIterator.hasPrevious()) {
            String value = listIterator.previous();
            System.out.println("Backward: " + value);
        }
    }
}
