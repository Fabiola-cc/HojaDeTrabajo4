package src;

import structure.DoublyLinkedList;

public class Stack_DoubleList<T> extends Stack<T> {
    DoublyLinkedList thisStack = new DoublyLinkedList();

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return thisStack.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return thisStack.isEmpty();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        thisStack.addFirst(value);

    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        T data = (T) thisStack.getFirst();
        thisStack.removeFirst();
        return data;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        T data = (T) thisStack.getFirst();
        return data;
    }

}
