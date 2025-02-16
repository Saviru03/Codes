import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
 
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits List: " + fruits);

        // Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0));

        fruits.set(1, "Blueberry"); 
        System.out.println("Updated List: " + fruits);

        fruits.remove("Cherry");
        System.out.println("After Removal: " + fruits);

        // Iterating over ArrayList using a loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Size of ArrayList: " + fruits.size());

        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}

