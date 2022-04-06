package classes;

/** Lista simplesmente encadeada */
public class ListaSimplesmenteEncadeada<E> {
    // nodo cabeça da lista
    protected Node head;
    protected Node tail;
    protected long size;

    public ListaSimplesmenteEncadeada(){
        head = null;
        size = 0;
    }

    /**
     * Add a new element in the top of the list, deallocating the items
     * @param Element to be added
     */
    public void addNewNode(E elemento){
        Node n  = new Node();
        n.setElement(elemento);
        n.setNext(this.head);
        
        this.head = n;
        
        if (size == 0) {
        	this.tail = this.head;			
		}
        
        this.size++;
    }
    
    public void addNewNodeOnTail(E elemento){
        Node n = new Node();        
        
        n.setElement(elemento);
        n.setNext(null);
        
        this.tail.setNext(n);
        
        this.tail = n;
        
        
        this.size++;
    }

    /**
     * Removes the node header
     */
    public void removeNode(){
        Node n = this.head;
        this.head = this.head.getNext();
        n = null;
        this.size--;
    }

    public void removeAll(){
        Node n;

        while (this.head != null){
            this.removeNode();
        }

    }


    @Override
    public String toString() {
        String itemsLista = "";
        Node i = this.head;
        while (i != null) {
            itemsLista += i.getElement() + " \n";
            i = i.getNext();
        }
        return "ListaSimplesmenteEncadeada {" +
                "head=" + head +
                ", size=" + size +
                ",\nElementos da lista:  \n{\n" + itemsLista +
                '}';


    }

}
