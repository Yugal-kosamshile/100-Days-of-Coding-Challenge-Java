class Node {
    int key;
    String value;
    Node next;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

class CountHashMap {
    private final int SIZE = 10;
    private Node[] buckets = new Node[SIZE];
    private int count = 0;

    private int getIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, String value) {
        int index = getIndex(key);
        Node head = buckets[index];
        while (head != null) {
            if (head.key == key) { head.value = value; return; }
            head = head.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        count++;
        System.out.println("Adding key: " + key + ", value: \"" + value + "\"");
    }

    public String get(int key) {
        Node head = buckets[getIndex(key)];
        while (head != null) {
            if (head.key == key) return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = getIndex(key);
        Node head = buckets[index];
        Node prev = null;
        while (head != null) {
            if (head.key == key) {
                if (prev == null) buckets[index] = head.next;
                else prev.next = head.next;
                count--;
                System.out.println("Removing key: " + key);
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        CountHashMap map = new CountHashMap();
        map.put(1, "A");
        map.put(2, "B");
        System.out.println("Current count: " + map.size());
        
        map.remove(1);
        System.out.println("Current count: " + map.size());
    }
}
