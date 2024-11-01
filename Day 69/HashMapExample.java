
class Node {
    int key;
    String value;
    Node next;
    Node(int key, String value) { this.key = key; this.value = value; }
}

class HashMapExample {
    private final int SIZE = 10;
    private Node[] buckets = new Node[SIZE];

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
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        HashMapExample map = new HashMapExample();
        map.put(1, "A");
        System.out.println("Key: 1, Value: " + map.get(1));
        map.put(2, "B");
        System.out.println("Key: 2, Value: " + map.get(2));
        map.remove(1);
        System.out.println("After removal, Key 1: " + map.get(1));
    }
}
