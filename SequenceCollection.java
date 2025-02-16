import java.util.ArrayList;
import java.util.List;

public class SequenceCollection {
    public static void main(String[] args) {
        List<String> sequence = new ArrayList<>();
        
        // Adding elements
        sequence.add("Apple");
        sequence.add("Banana");
        sequence.add("Cherry");
        
        // Iterating over the sequence
        System.out.println("Sequence Elements:");
        for (String item : sequence) {
            System.out.println(item);
        }
        
        System.out.println("First element: " + sequence.get(0));
        
        // Removing an element
        sequence.remove("Banana");
        System.out.println("After removal: " + sequence);
    }
}

