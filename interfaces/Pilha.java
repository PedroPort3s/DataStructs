package interfaces;

public interface Pilha<E>{
    public int size();
    public boolean isEmpty();
    public E pop();
    public void push(E obj);
    public E top();
}