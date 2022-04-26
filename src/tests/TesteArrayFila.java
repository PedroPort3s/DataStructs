package tests;

import classes.ArrayFila;
import classes.NodeFila;

public class TesteArrayFila {
	public void execute(){
        //ArrayFila<String> q = new ArrayFila<String>(5);
        
        NodeFila<String> q = new NodeFila<String>();
        
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
        
        try {
			q.dequeue();		
	        System.out.println(q.toString());
	        q.dequeue();
	        System.out.println(q.toString());
	        q.dequeue();
	        System.out.println(q.toString());
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
