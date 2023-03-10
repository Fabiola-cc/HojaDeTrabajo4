package src;

import java.util.ArrayList;

/**
 * @author
 *         Maria José Villafuerte
 *         Fabiola Contreras
 *         Madeline Castro
 * @category Hoja De Trabajo #2
 *           Propósito: Uno de los tipos de pila del código, permite ingresar, eliminar y verificar los elementos.
 * @date 30/01/2023
 */

public class Stack_ArrayList<T> extends Stack<T> {

    private ArrayList<T> ourStack;
    public Stack_ArrayList(){
        ourStack = new ArrayList<>();
    }

    /**
     * Metodo que cuenta la cantidad de elementos que hay dentro de la pila
     * @return Cantidad de elementos dentro de la pila
     */
    @Override
    public int count() {
        return ourStack.size();
    }

    /**
     * Metodo que verifica si la pila se encuentra vacia
     * @return true si la pila esta vacia
     * @return false si la pila no esta vacia
     */
    @Override
    public boolean isEmpty() {
        return ourStack.isEmpty();
    }

    /**
     * Metodo que agrega a la pila un valor del indice 0
     * @param value valor para agregar dentro de la pila
     */
    @Override
    public void push(T value) {
        ourStack.add(0, value);
    }

    /**
     * Metodo que remueve de la pila un valor del indice 0
     * @return valor eliminado de la pila
     */
    @Override
    public T pull() {
        return ourStack.remove(0);
    }

    /**
     * Metodo que obtiene del src.Stack el valor del indice 0
     * @return
     */
    @Override
    public T peek() {
        return ourStack.get(0);
    }

    @Override
    public String toString() {
        String hola = "";

        for (T element: ourStack
             ) {
                 hola += element;
        }
        return hola;
    }
}
