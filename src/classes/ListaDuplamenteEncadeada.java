package classes;

public class ListaDuplamenteEncadeada {
	protected int size;            // number of elements
	  protected DoubleNode header, trailer;    // sentinels

	  /**
	   * Constructor that creates an empty list
	   */
	  public ListaDuplamenteEncadeada() {
	    size = 0;
	    header = new DoubleNode(null, null, null);    // create header
	    trailer = new DoubleNode(null, header, null);    // create trailer
	    header.setNext(trailer);    // make header and trailer point to each other
	  }

	  /**
	   * Returns the number of elements in the list
	   */
	  public int size() {
	    return size;
	  }

	  /**
	   * Returns whether the list is empty
	   */
	  public boolean isEmpty() {
	    return (size == 0);
	  }

	  /**
	   * Returns the first node of the list
	   */
	  public DoubleNode getFirst() throws IllegalStateException {
	    if (isEmpty()) throw new IllegalStateException("List is empty");
	    return header.getNext();
	  }

	  /**
	   * Returns the last node of the list
	   */
	  public DoubleNode getLast() throws IllegalStateException {
	    if (isEmpty()) throw new IllegalStateException("List is empty");
	    return trailer.getPrev();
	  }

	  /**
	   * Returns the node before the given node v. An error occurs if v
	   * is the header
	   */
	  public DoubleNode getPrev(DoubleNode v) throws IllegalArgumentException {
	    if (v == header) throw new IllegalArgumentException
	            ("Cannot move back past the header of the list");
	    return v.getPrev();
	  }

	  /**
	   * Returns the node after the given node v. An error occurs if v
	   * is the trailer
	   */
	  public DoubleNode getNext(DoubleNode v) throws IllegalArgumentException {
	    if (v == trailer) throw new IllegalArgumentException
	            ("Cannot move forward past the trailer of the list");
	    return v.getNext();
	  }


	  /**
	   * Inserts the given node z before the given node v. An error
	   * occurs if v is the header
	   */
	  public void addBefore(DoubleNode v, DoubleNode z) throws IllegalArgumentException {
		DoubleNode u = getPrev(v);    // may throw an IllegalArgumentException
	    z.setPrev(u);
	    z.setNext(v);
	    v.setPrev(z);
	    u.setNext(z);
	    size++;
	  }

	  /**
	   * Inserts the given node z after the given node v. An error occurs
	   * if v is the trailer
	   */
	  public void addAfter(DoubleNode v, DoubleNode z) {
		  DoubleNode w = getNext(v);    // may throw an IllegalArgumentException
	    z.setPrev(v);
	    z.setNext(w);
	    w.setPrev(z);
	    v.setNext(z);
	    size++;
	  }

	  /**
	   * Inserts the given node at the head of the list
	   */
	  public void addFirst(DoubleNode v) {
	    addAfter(header, v);
	  }

	  /**
	   * Inserts the given node at the tail of the list
	   */
	  public void addLast(DoubleNode v) {
	    addBefore(trailer, v);
	  }

	  /**
	   * Removes the given node v from the list. An error occurs if v is
	   * the header or trailer
	   */
	  public void remove(DoubleNode v) {
		DoubleNode u = getPrev(v);    // may throw an IllegalArgumentException
		DoubleNode w = getNext(v);    // may throw an IllegalArgumentException
	    // unlink the node from the list 
	    w.setPrev(u);
	    u.setNext(w);
	    v.setPrev(null);
	    v.setNext(null);
	    size--;
	  }


	  @Override
	  public String toString() {
	     String r = "";
	     DoubleNode n = this.getFirst();
	     String s = (String)n.getElement();
	     r = s + "\n";


	     while (n != this.trailer) {
	       n = n.getNext();
	       if ( n.getElement() != null) {
	         r = r + (String) n.getElement();
	         r += "\n";
	       }
	    }
	    return r;
	  }
}
