package src;

import structure5.AbstractList;

/**
 *
 * @date 21/02/2023
 * @author Fabiola Contreras
 */
public class Stack_List<T> extends Stack<T> {
    AbstractList SList;

    public Stack_List(int TipoL) {
        SList = List_Factory.getInstance(TipoL);
    }

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return SList.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return SList.isEmpty();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        SList.addFirst(value);

    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        return (T) SList.removeFirst();
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return (T) SList.getFirst();
    }

}
