package Day 96;

class MyTask implements Runnable {
    private String taskName;

    MyTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
        System.out.println(taskName + " completed.");
    }
}

public class ConcurrencyWithThreads {
    public static void main(String[] args) {
        System.out.println("Starting Threads...");

        // Create threads
        Thread t1 = new Thread(new MyTask("Thread 1"));
        Thread t2 = new Thread(new MyTask("Thread 2"));
        Thread t3 = new Thread(new MyTask("Thread 3"));

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        try {
            // Wait for threads to finish
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have finished execution.");
    }
}
