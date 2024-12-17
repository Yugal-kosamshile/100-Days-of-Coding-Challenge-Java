package Day 92;

class SumTask extends Thread {
    private int[] array;
    private int start, end;
    private int partialSum;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        partialSum = 0;
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
    }
}

public class SumArrayMultiThread {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int mid = array.length / 2;

        SumTask task1 = new SumTask(array, 0, mid);
        SumTask task2 = new SumTask(array, mid, array.length);

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        int totalSum = task1.getPartialSum() + task2.getPartialSum();
        System.out.println("Total sum of the array: " + totalSum);
    }
}
