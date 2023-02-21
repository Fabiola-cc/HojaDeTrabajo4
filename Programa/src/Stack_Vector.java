package src;

import structure.StackVector;

/**
 * Stack - Vector
 *
 * Implementa la clase "StackVector" obtenida de recursos del libro Java Structures.
 * Utiliza los mismos métodos obtenidos de tal libreria, modificando nombres y añadiendo el uso de genericos.
 * @param <T>
 *           Esta clase hace uso de genéricos permitiendo usarse con cualquier tipo de objeto.
 *
 * @date 20/02/2023
 * @author Fabiola Contreras
 */
public class Stack_Vector<T> extends Stack<T> {
    StackVector sv = new StackVector();

    @Override
    public int count() {
        // TODO Auto-generated method stub
        return sv.size();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return sv.isEmpty();
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        sv.add(value);

    }

    @Override
    public T pull() {
        // TODO Auto-generated method stub
        T info = (T) sv.get();
        sv.remove();
        return info;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        T info = (T) sv.get();
        return info;
    }

}
