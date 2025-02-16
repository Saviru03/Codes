import java.util.*;

public class Collectionframework {
    public static void main(String[] args) {

        Collection<Integer> c = new LinkedList<>();

        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        System.out.println("Is the collection empty? " + c.isEmpty());

        System.out.println("Size of the collection: " + c.size());

        System.out.println("Does the collection contain 30? " + c.contains(30));

        c.remove(30);

        System.out.println("Elements in the collection after removal: " + c);
    }
}
