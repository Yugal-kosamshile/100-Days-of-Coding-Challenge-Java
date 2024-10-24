public class StackUsingArray {
    private int[] stack;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a given size
    public StackUsingArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1; // Stack is empty initially
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println("Pushing " + value + " onto the stack.");
        }
    }

    // Pop method to remove and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1; // Return an invalid value to indicate an error
        } else {
            int poppedValue = stack[top--];
            return poppedValue;
        }
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1; // Return an invalid value to indicate an error
        } else {
            return stack[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        // Create a stack of size 5
        StackUsingArray stack = new StackUsingArray(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop the top element
        System.out.println("Popped element is: " + stack.pop());

        // Peek after popping
        System.out.println("Top element after pop: " + stack.peek());

        // Push another element
        stack.push(40);

        // Peek the top element
        System.out.println("Top element is: " + stack.peek());
    }
}
