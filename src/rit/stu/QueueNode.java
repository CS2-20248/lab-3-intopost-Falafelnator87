package rit.stu;

import rit.cs.Node;
import rit.cs.Queue;

/**
 * A queue implementation that uses a Node to represent the structure.
 *
 * @param <T> The type of data the queue will hold
 * @author RIT CS
 */
public class QueueNode<T> implements Queue<T> {
    private Node<T> front;
    private Node<T> back;
    /**
     * Create an empty queue.
     */
    public QueueNode() {
        front = null;
        back = null;
    }

    @Override
    public T back() {
        assert !empty();
        return back.getData();
    }

    @Override
    public T dequeue() {
        assert !empty();
        T data = front.getData();
        front = front.getNext();
        return data;
    }

    @Override
    public boolean empty() {
        return front == null;
    }

    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element, null);
        if (empty()) {
            front = newNode;
            back = newNode;
        } else {
            back.setNext(newNode);
            back = back.getNext();
        }
    }

    @Override
    public T front() {
        assert !empty();
        return front.getData();
    }
}
