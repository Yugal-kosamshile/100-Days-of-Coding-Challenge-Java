public class QueueUsingArray {
    private int[] queue;
    private int front, rear, size;

    public QueueUsingArray(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) System.out.println("Queue is full!");
        else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
            System.out.println("Enqueueing " + value);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int value = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return value;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    public boolean isFull() { return size == queue.length; }
    public boolean isEmpty() { return size == 0; }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeuing: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}
