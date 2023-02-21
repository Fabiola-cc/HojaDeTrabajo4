package src;

import structure.StackList;

public class Stack_SingleList<T> extends Stack<T> {
    StackList ssl = new StackList();

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return ssl.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return ssl.empty();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        ssl.add(value);
    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        T data = (T) ssl.get();
        ssl.remove();
        return data;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        T data = (T) ssl.get();
        return data;
    }

}
