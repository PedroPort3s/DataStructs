package interfaces;

import exceptions.EmptyStackException;

public interface Pilha<E>{
    public int size();
    public boolean isEmpty();
    public E pop() throws EmptyStackException;
    public void push(E obj);
    public E top();
}