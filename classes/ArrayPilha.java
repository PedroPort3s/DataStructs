package classes;
import interfaces;

public class ArrayPilha<E> implements Pilha<E>{

    protected int top = -1;
    protected int capacity;
    protected E pilha[];

    public static final int CAPACITY = 1000;

    public ArrayPilha(){
        this(CAPACITY);
    }

    public ArrayPilha(int capacity){
        this.capacity = capacity;

        pilha = new Object[this.capacity];
    }

    public int size(){
        return (top + 1);        
    }

    public boolean isEmpty(){
        return (top < 0);
    }

    public void push(E element){
        S[++top] = element;
    }

    public E top(){
        return S[top];
    }

    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException("Não é possível remover elementos de uma pilha vazia.");
        }

        E element;

        element = top();
        S[--top] = null;
        return element;
    }

    public String toString(){
        String s;
        s= "[";
        if(size() > 0){
            s += S[0];
        }
        else if (size() > 1){
            for (int i = 0; i < size(); i++) {
                s += "," + S[i];
            }
        }
        return s + "]";
    }

    public void status(String op, Object element) {
        System.out.print("------> " + op); // print this operation
        System.out.println(", returns " + element); // what was returned
        System.out.print("result: size = " + size() + ", isEmpty = " +
        isEmpty());
        System.out.println(", stack: " + this); // contents of the stack
        System.out.println("\n");
    }
} 