package datastructure_queue;

public class ArrayQueue<T> implements Queue<T> {

    private static final int DEFAULT_SIZE = 10;
    private Object[] array = new Object[DEFAULT_SIZE];
    private int front = -1;
    private int rear = -1;

    @Override
    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("full");
            return;
        }
        array[++rear] = data;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        front = ++front % DEFAULT_SIZE;
        final Object result = array[front];
        return (T) result;
    }

    private boolean isEmpty() {
        return front == rear;
    }

    private boolean isFull() {
        return rear == (DEFAULT_SIZE - 1);
    }


}
