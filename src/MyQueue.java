public class MyQueue<T> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    //enqueue (adiciona no final)
    public void add(T e) {
        Node newNode = new Node(e);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    //dequeue (remove do início)
    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return data;
    }

    //peek (ver o primeiro sem remover)
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return front.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = rear = null;
        size = 0;
    }

    public boolean contains(T element) {
        Node current = front;

        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        Node current = front;

        int i = 0;
        while (current != null) {
            array[i++] = current.data;
            current = current.next;
        }

        return array;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node current = front;

        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }
}