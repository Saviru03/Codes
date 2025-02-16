public class BoundedStack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public BoundedStack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity]; 
        this.top = -1; 
    }

    public boolean push(T item) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push: " + item);
            return false; 
        }
        stack[++top] = item;
        return true;
    }

    
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        }
        return stack[top--];
    }

    
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return null;
        }
        return stack[top];
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

    
    public boolean isFull() {
        return top == capacity - 1;
    }

   
    public int size() {
        return top + 1;
    }

   
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        BoundedStack<Integer> stack = new BoundedStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); 

        System.out.println("Popped: " + stack.pop()); 
        stack.display(); 

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); 

        System.out.println("Top element: " + stack.peek()); 
    }
}
