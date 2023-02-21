package src;

import structure.DoublyLinkedList;

/**
 * Stack - Double Linked List
 *
 * Implementa la clase "DoublyLinkedList" obtenida de recursos del libro empleado.
 * Hereda de la clase abstracta Stack, generando un stack con el uso de la lista doblemente encadenada.
 * @param <T>
 *           Esta clase hace uso de genéricos permitiendo usarse con cualquier tipo de objeto.
 *
 * @date 20/02/2023
 * @author Fabiola Contreras
 */

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
