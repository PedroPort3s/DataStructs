package tests;
import classes;

public class TesteArrayPilha {
    public static void main(String[] args) {
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
    }
}