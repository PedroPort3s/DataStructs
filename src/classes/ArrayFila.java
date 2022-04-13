package classes;

import java.util.Arrays;

import interfaces.Fila;

public class ArrayFila<E> implements Fila<E> {
	/**
     * Length of the array used to implement the queue.
     */
    protected int capacity; 	// The actual capacity of the stack array

    /**
     * Default array capacity.
     */
    public static final int CAPACITY = 1000;	// default array capacity

    /**
     * Array used to implement the stack.
     */
    protected E Q[];		// Generic array used to implement the queue

    /**
     * first element of the queue that should be removed
     */
    protected int f;
    /**
     * Next position where a new element will be inserted in the queue
     */
    protected int r;

    /**
     * Initializes the stack to use an array of default length.
     */
    public ArrayFila() {
        this(CAPACITY); // default capacity
    }

    /**
     * Initializes the stack to use an array of given length.
     * @param cap length of the array.
     */
    public ArrayFila(int cap) {
        capacity = cap;
        Q = (E[]) new Object[capacity]; // compiler may give warning, but this is ok
        f = 0;
        r = 0;
    }

    @Override
    public int size() {
    	return ( this.capacity - f + r) % this.capacity;
    }

    @Override
    public boolean isEmpty() {
        return (f==r);
    }

    @Override
    public E front() {
        return Q[f];
    }

    @Override
    public void enqueue(E element) {
        Q[r] = element;
        r = (r+1) % capacity;
    }

    @Override
    public E dequeue() {
        E temp;
        temp = Q[f];
        Q[f] = null;
        f = (f+1) % capacity;
        return temp;
    }

    @Override
    public String toString() {
        return "ArrayQueue { \n" +
                "capacity=" + capacity + "\n " +
                ", Q=" + Arrays.toString(Q) +"\n " +
                ", Primeiro Elemento =" + f + "\n " +
                ", Próximo livre =" + r + "\n " +
                '}'+ "\n " ;
    }
}
