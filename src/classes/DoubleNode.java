package classes;

public class DoubleNode<E> {
	private E element;
	  private DoubleNode<E> next, prev;
	  public DoubleNode() { this(null, null, null); }
	  public DoubleNode(E e, DoubleNode<E> p, DoubleNode<E> n) {
	    element = e;
	    next = n;
	    prev = p;
	  }
	  
	  public void setElement(E newElem){		  
		  element = newElem;		  
	  }
	  
	  public void setNext(DoubleNode<E> newNext) { next = newNext; }
	  public void setPrev(DoubleNode<E> newPrev) { prev = newPrev; }
	  public E getElement() { return element; }
	  public DoubleNode<E> getNext() { return next; }
	  public DoubleNode<E> getPrev() { return prev; }
	  
	  @Override
	  public String toString() {
		  return element.toString();
	  }
}