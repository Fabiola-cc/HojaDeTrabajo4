package src;

/**
 * Clase abstracta de la cual pueden heredar otras clases.
 */

public abstract class Stack<T> implements IStack<T>{

	Stack(){

	}

	public Stack getInstance(){
		return Stack_Factory.getInstance();
	}

	/**
	 * Busca el tamaño de la pila y retorna un entero con ese dato
	 *
	 * @return
	 * 	int - tamaño pila
	 */
	public int count(){return 0;}

	/**
	 * Permite conocer si una pila no tiene elementos
	 * @return
	 * 	boolean - falso en caso de sí tener elementos
	 */
	public boolean isEmpty(){return false;}

	/**
	 * Permite añadir algún elemento a la pila
	 *
	 * @param value
	 * 	valor a añadir
	 */
	public void push(T value){}

	/**
	 * Extrae el último elemento ingresado a la pila
	 * @return
	 * 	objeto tipo T en la última posición
	 */
	public T pull(){return null;}

	/**
	 * Muestra el dato del último elemento ingresado a la pila
	 * @return
	 * 	objeto tipo T en la última posición
	 */
	public T peek(){return null;}
}
