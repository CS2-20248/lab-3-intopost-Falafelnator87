package rit.stu;

import rit.cs.Node;
import rit.cs.Stack;

import java.util.ArrayList;

/**
 * A stack implementation that uses a Node to represent the structure.
 *
 * @param <T> The type of data the stack will hold
 * @author RIT CS
 */
public class StackNode<T> implements Stack<T> {
    private Node<T> top;

    /**
     * Create an empty stack.
     */
    public StackNode() {
        top = null;
    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public T pop() {
        assert !empty();
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    @Override
    public void push(T element) {
        top = new Node<>(element, top);
    }

    @Override
    public T top() {
        assert !empty();
        return top.getData();
    }
}
