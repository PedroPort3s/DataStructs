package classes;

import java.util.Arrays;

public class NodeFila<E> {
    
    protected Node<E> f;
    
    protected Node<E> l;
    
    protected int size;

    /**
     * Initializes the stack to use an array of default length.
     */
    public NodeFila() {
    	size = 0;
    }  
    
    public int size() {
    	return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E front() {
        return this.f == null ? null : this.f.getElement();
    }


    public void enqueue(E element) {
    	Node<E> n = new Node<E>();
    	
    	n.setElement(element);
    	
    	n.setNext(l);
    	
    	l = n;
    	
    	if (size == 0) {
			f = n;
		}
    	
        size++;
    }
    
    public E dequeue() throws Exception {
    	
    	if(isEmpty()) {
    		throw new Exception("Se lasque");	
    	}
    	
    	E element = f.getElement();
    	
    	if(size > 0) {
    		Node<E> tryFirst = l;
    		
    		f = null;
    		
	    	while(tryFirst.getNext() != null) {
	    		Node teste = tryFirst.getNext();
	    		
	    		if (teste.getNext() == null) {
	    			f = tryFirst;
	    	    	f.setNext(null);
	    	    	break;
				} 
	    		else {
	    			tryFirst = teste;
	    		}
	    	}
    	}
    	else {    		
			l = f;
		}
    	
        size--;
        
        return element;
    }

    public String toString() {
    	Node element = l;
    	String test = "";
    	
    	while(element != null) {
    		test += ", " + element.toString();
    		element = element.getNext();
    	}
    	
        return "ArrayQueue { \n" +
                "size=" + size + "\n " +
                ", Q=" + test +"\n " +
                ", Primeiro Elemento =" + f + "\n " +
                "} \n " ;
    }
}
