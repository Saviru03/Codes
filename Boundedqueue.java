class Bounded {
    private int[] queue;
    private int front, rear, size, capacity;

    public Bounded(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Insert an element
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued");
    }

    // Remove an element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    // Get the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }
        return queue[front];
    }

    // Get the current size of the queue
    public int getSize() {
        return size;
    }

    // Display the queue elements
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class Boundedqueue {
    public static void main(String[] args) {
        Bounded bq = new Bounded(5);

        bq.enqueue(10);
        bq.enqueue(20);
        bq.enqueue(30);
        bq.enqueue(40);
        bq.enqueue(50);
        bq.enqueue(60); 

        bq.displayQueue();

        System.out.println("Dequeued: " + bq.dequeue());
        System.out.println("Dequeued: " + bq.dequeue());

        bq.displayQueue();

        bq.enqueue(60);
        bq.enqueue(70);

        bq.displayQueue();

        System.out.println("Front element: " + bq.peek());
    }
}
