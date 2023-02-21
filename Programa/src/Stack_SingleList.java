package src;

import structure.StackList;
/**
 * Stack - Single Linked List
 *
 * Implementa la clase "StackList" obtenida de recursos del libro Java Structures.
 * Utiliza los mismos métodos obtenidos de tal libreria, modificando nombres y añadiendo el uso de genericos.
 * @param <T>
 *           Esta clase hace uso de genéricos permitiendo usarse con cualquier tipo de objeto.
 *
 * @date 20/02/2023
 * @author Fabiola Contreras
 */
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
