package tests;

import java.time.Duration;
import java.time.Instant;

public class EntryPoint {

	public static void main(String[] args) {
		//TesteArrayPilha();
		
		//TesteListaSimplesmenteEncadeada();
		
		//TesteListaDuplamenteEncadeada();
		
		 //TesteArrayFila();
		
		TesteSearch();
	}
	
	private static void TesteSearch() {
		TesteSearch testeBusca = new TesteSearch();		
		
		testeBusca.execute();			
	}
	
	private static void TesteArrayPilha() {
		TesteArrayPilha testePilha = new TesteArrayPilha();
		
		testePilha.execute();	
	}
	
	private static void TesteArrayFila() {
		TesteArrayFila testeFila = new TesteArrayFila();
		
		testeFila.execute();
	}
	
	private static void TesteListaSimplesmenteEncadeada() {
		TesteListaSimplesmenteEncadeada testeListaSimples = new TesteListaSimplesmenteEncadeada();
		
		testeListaSimples.execute();	
	}
	
	private static void TesteListaDuplamenteEncadeada() {
		TesteListaDuplamenteEncadeada testeListaDupla = new TesteListaDuplamenteEncadeada();
		
		testeListaDupla.execute();	
	}
}
