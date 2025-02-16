import java.util.Stack;

class Queue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor
    public Queue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation (Push element onto stack1)
    public void enqueue(int item) {
        stack1.push(item);
        System.out.println(item + " enqueued");
    }

    // Dequeue operation (Remove element from queue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }

        // Move elements from stack1 to stack2 if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation (Get the front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }

        // Move elements from stack1 to stack2 if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Get the size of the queue
    public int getSize() {
        return stack1.size() + stack2.size();
    }
}

// Driver class to test QueueStack
public class QueueStack {
    public static void main(String[] args) {
        Queue qs = new Queue();

        qs.enqueue(10);
        qs.enqueue(20);
        qs.enqueue(30);

        System.out.println("Dequeued: " + qs.dequeue());
        System.out.println("Front element: " + qs.peek());

        qs.enqueue(40);
        qs.enqueue(50);

        System.out.println("Dequeued: " + qs.dequeue());
        System.out.println("Dequeued: " + qs.dequeue());
        System.out.println("Dequeued: " + qs.dequeue());
        System.out.println("Dequeued: " + qs.dequeue()); 
    }
}
