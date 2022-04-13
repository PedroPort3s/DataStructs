package tests;

import classes.ArrayFila;

public class TesteArrayFila {
	public void execute(){
        ArrayFila<String> q = new ArrayFila<String>(5);
        System.out.println(q.toString());

        q.enqueue("Elemento 1");
        System.out.println(q.toString());
        q.enqueue("Elemento 2");
        System.out.println(q.toString());
        q.enqueue("Elemento 3");
        System.out.println(q.toString());
        q.enqueue("Elemento 4");
        System.out.println(q.toString());
        q.enqueue("Elemento 5");
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
        q.dequeue();
        System.out.println(q.toString());
    }

}
