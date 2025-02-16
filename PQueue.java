import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        // Creating a PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the queue
        pq.add(10);
        pq.add(5);
        pq.add(30);
        pq.add(2);
        pq.add(8);

 
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
