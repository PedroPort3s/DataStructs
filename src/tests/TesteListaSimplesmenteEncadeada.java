package tests;

import classes.ListaSimplesmenteEncadeada;

public class TesteListaSimplesmenteEncadeada {
	 private void testarAdicionarNode(ListaSimplesmenteEncadeada l){
	        l.addNewNode("primeiro item ");
	        l.addNewNode("Segundo item ");
	        l.addNewNode("Terceiro item ");
	        l.addNewNode("Quarto item ");
	        l.addNewNode("Quinto item ");
	        l.addNewNode("Sexto item ");
	        l.addNewNode("S�timo item ");


	        System.out.println("Lista ap�s as inser��es" );
	        System.out.println("List: "+ l);

	    }
	 
	 private void testarAdicionarNodeCauda(ListaSimplesmenteEncadeada l){
	        l.addNewNode("primeiro item ");
	        l.addNewNode("Segundo item ");
	        l.addNewNode("Terceiro item ");
	        
	        l.addNewNodeOnTail("primeiro item na cauda");
	        l.addNewNodeOnTail("segundo item na cauda");
	        
	        l.addNewNode("Quarto item ");


	        System.out.println("Lista ap�s as inser��es" );
	        System.out.println("List: "+ l);

	    }

	    private void testarRemover1Elemento(ListaSimplesmenteEncadeada  l){
	        System.out.println("+--------------------------------------+");
	        System.out.println("Removendo um �tem da lista" );
	        l.removeNode();
	        System.out.println("List: "+ l);
	    }

	    private void testarRemoverTodosElementos( ListaSimplesmenteEncadeada l){
	        System.out.println("Removendo todos os itens" );
	        l.removeAll();
	        System.out.println("List: "+ l);
	    }



	    public void execute(){
	        ListaSimplesmenteEncadeada l = new ListaSimplesmenteEncadeada();
	        
	        testarAdicionarNode(l);

	        testarRemover1Elemento(l);

	        testarRemoverTodosElementos(l);
	        
	        this.testarAdicionarNodeCauda(l);
	        this.testarRemoverTodosElementos(l);
	    }
}
