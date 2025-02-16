class Circular {
    private int[] queue;
    private int front, rear, size, capacity;

    public Circular(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

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

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }
        return queue[front];
    }

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

    public int getSize() {
        return size;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Circular cq = new Circular(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60); 

        cq.displayQueue();
        
        System.out.println("Dequeued: " + cq.dequeue());
        System.out.println("Dequeued: " + cq.dequeue());

        cq.displayQueue();

        cq.enqueue(60);
        cq.enqueue(70);
        
        cq.displayQueue();
        
        System.out.println("Front element: " + cq.peek());
    }
}
