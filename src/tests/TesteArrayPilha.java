package tests;
import classes.ArrayPilha;
import exceptions.EmptyStackException;;

public class TesteArrayPilha {
    public void execute() {
      
        try {
        	  ArrayPilha<String> a = new ArrayPilha<String>();
              System.out.println("Teste Array-Stack");
              a.push("João");
              a.push("Maria");
              a.push("Antonio");
              a.push("Unibrasil");
              a.push("Marcos");
              a.push("Eugênio");
              a.push("Leão");
              a.push("Joaquim");
              a.push("José");
              a.push("Pedro Daniel Portes");
              
              //remover todos os itens              
              while(!a.isEmpty()){
            	  
            	  String removido = a.top();
            	  
            	  a.pop();
            	  
            	  System.out.println("Removeu: " + removido);
              }
              
              // removeu todos, tentar remover com a pilha vazia
              a.pop();
              
              
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage());
		}
    }
}