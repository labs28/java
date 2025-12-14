import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        
        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }

        // 1. Iteration using Iterator//
        System.out.println("Using Iterator:");
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 2. Iteration using ListIterator//
        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listIt = names.listIterator();

        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        
        }
    }
}
