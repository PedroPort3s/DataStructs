package tests;
import classes.ArrayPilha;
import exceptions.EmptyStackException;;

public class TesteArrayPilha {
    public static void main(String[] args) {
      
        try {
        	  ArrayPilha<String> a = new ArrayPilha<String>();
              System.out.println("TesteArrayStack");
              a.push("José da Silva");
              a.push("Mariano dos Santos");
              System.out.println("Tamanho da pilha : " + a.size());
              System.out.println("mostra a pilha : " + a);
              a.pop();
              System.out.println("mostra a pilha : " + a);
              a.pop();
              System.out.println("mostra a pilha : " + a);
			a.pop();
		} catch (EmptyStackException e) {
			System.out.println(e.getMessage());
		}
    }
}