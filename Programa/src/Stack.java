package src;

/**
 * @author MAAG
 *
 */

public abstract class Stack<T> {

	public int count(){return 0;}

	public boolean isEmpty(){return false;}

	public void push(T value){}

	public T pull(){return null;}

	public T peek(){return null;}
}
