package tests;

import classes.DoubleNode;
import classes.ListaDuplamenteEncadeada;

public class TesteListaDuplamenteEncadeada {
	public void execute(){
        ListaDuplamenteEncadeada dl = new ListaDuplamenteEncadeada();
        DoubleNode node, node1, node2;

        node1 = new DoubleNode();
        node1.setElement("Jos�");

        dl.addFirst(node1);

        node2  = new DoubleNode();
        node2.setElement("Jo�o Carlos");
        dl.addAfter(node1, node2);

        node = new DoubleNode();
        node.setElement("Mais um nome inclu�do");
        dl.addAfter(node2, node);

        System.out.println("+-----------------------------------+ ");
        System.out.println("Lista : ");
        System.out.println(dl);
        System.out.println("+-----------------------------------+ ");
    }
}
