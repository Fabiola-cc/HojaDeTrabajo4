import structure.StackVector;

public class Stack_Vector<T> implements IStack<T> {
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
