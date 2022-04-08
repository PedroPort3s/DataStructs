package tests;

import classes.DoubleNode;
import classes.ListaDuplamenteEncadeada;

public class TesteListaDuplamenteEncadeada {
	public void execute(){
        ListaDuplamenteEncadeada dl = new ListaDuplamenteEncadeada();
        
        TesteDeInsercaoBasica(dl);
        
        MostrarConteudoDeTrasParaFrente(dl);
        
        TesteCidadesEncadeadas(dl);
        
        TesteCidadesComMaisDadosEncadeadas(dl);
    }
	
	private void TesteDeInsercaoBasica(ListaDuplamenteEncadeada dl) {
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
        
        PrintarLista(dl);
	}
	
	private void PrintarLista(ListaDuplamenteEncadeada dl) {
		System.out.println("+-----------------------------------+ ");
        System.out.println("Lista : ");
        System.out.println(dl);
        System.out.println("+-----------------------------------+ ");		
	}
	
	private void MostrarConteudoDeTrasParaFrente(ListaDuplamenteEncadeada dl) {
			
			DoubleNode elemento = dl.getLast();
			
			System.out.println("De trás para frente:");
			
			while(elemento.getElement() != null) {
				
				System.out.println(elemento.toString());
				
				elemento = elemento.getPrev();
			}
			
	}	

	private void TesteCidadesEncadeadas(ListaDuplamenteEncadeada dl) {
		// remove all the nodes on list
		dl.clear();
		
		String[] cidades = new String[] {"Porto Alegre","Florianópolis", "Curitiba", "São Paulo", "Rio de Janeiro", "Vitória", "Belo Horizonte"};
		
		for (int i = 0; i < cidades.length; i++) {
			
			DoubleNode<String> no = new DoubleNode<String>();
			
			no.setElement(cidades[i]);
			
			if (i == 0) {
				dl.addFirst(no);
			}
			else {
				dl.addAfter(dl.getLast(), no);
			}
		}
		
		PrintarLista(dl);
	}
	
	private void TesteCidadesComMaisDadosEncadeadas(ListaDuplamenteEncadeada dl) {
		// remove all the nodes on list
		dl.clear();
		
		//local class
		class Cidade {
			
			public Cidade(String cidade, double populacao, float tempMedia) {
				this.cidade = cidade;
				this.populacao = populacao;
				this.tempMedia = tempMedia;
			}
			
	        public double populacao = 0;
	        public float tempMedia = 0;
	        public String cidade = null;
	        
	        @Override
	        public String toString() { return "Cidade: " + this.cidade + " População: " + populacao + " Temp. Média: " + tempMedia;}
	    }
		
		Cidade[] cidades = new Cidade[] {
				new Cidade("Porto Alegre",1492530,15),
				new Cidade("Florianópolis",516524, 16), 
				new Cidade("Curitiba",1963726,17), 
				new Cidade("São Paulo",12396372,20), 
				new Cidade("Rio de Janeiro",6775561, 24), 
				new Cidade("Vitória",369534, 22), 
				new Cidade("Belo Horizonte",2530701,25)
		};
		
		DoubleNode<Cidade> no = null;
		
		for (int i = 0; i < cidades.length; i++) {
			
			no = new DoubleNode<Cidade>();
			
			no.setElement(cidades[i]);
			
			if (i == 0) {
				dl.addFirst(no);
			}
			else {
				dl.addAfter(dl.getLast(), no);
			}
		}
		
		
		no = new DoubleNode<Cidade>();
		
		no.setElement(new Cidade("Londrina",580870,20));
		
		DoubleNode<Cidade> noSearch = dl.getLast();
		
		while(!noSearch.getElement().cidade.equals("Curitiba")) {
			noSearch = noSearch.getPrev();
		}
		
		dl.addAfter(noSearch, no);
		
		
		PrintarLista(dl);
	}
}

