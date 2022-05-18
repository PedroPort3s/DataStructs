package tests;

import java.time.Duration;
import java.time.Instant;

public class TesteSearch {
	
	public void execute() {
		
		//executeString();
		executeInt();
	}
	
	private void executeString() {
		String chave = "Teste";
		
		String[] array = {"Pedro","Vitor","Gabriel","Andre","Corno","Gordo","Kid Bengala","Especial","Retardo","Teste"};
		
		Instant starts = Instant.now();
		
		Boolean encontrou = buscaBinaria(chave, array) == 1;
		
		Instant ends = Instant.now();
		
		System.out.println(encontrou);
		
		System.out.println(Duration.between(starts, ends).getNano());
	}
	
	private void executeInt() {
		int qtd = 1000;
		int chave = 999;
		
		int[] array = new int[qtd];
		
		for (int i = 0; i < qtd; i++) {
			array[i] = i;
		}
		
		Instant starts = Instant.now();
		
		//int resultado = buscaSequencialFor(chave, array);
		
		int resultado = buscaSequencialWhile(chave, array);
		
		//Boolean encontrou = buscaBinaria(chave, array) == 1;
		
		Instant ends = Instant.now();
		
		System.out.println(resultado);
		
		System.out.println(Duration.between(starts, ends).getNano());
	}
	
	private int buscaSequencialFor(int c, int[] v) {
		
		int n = v.length;
		
		for (int i = 0; i < n; i++) {
			
			if (c == v[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	private int buscaSequencialWhile(int c, int[] v) {
		
		int n = v.length;
		
		int i = 0;
		
		while(i < n) {
			
			if (c == v[i]) {
				return i;
			}
			
			i++;
		}
		
		return -1;
	}
	
	private int buscaSequencial(String c, String[] v) {
		
		int n = v.length;
		
		int i = 0;
		
		while(i < n) {
			
			if (c == v[i]) {
				return i;
			}
			
			i++;
		}
		
		return -1;
	}
	
	private int buscaBinaria(int c, int[] v) {
		
		int p = 0;
		int n = v.length;
		int u = n - 1;
		
		int m = 0;
		
		while (p <= u) {
			m = (p + u) / 2; //divide o pedaço de vetor ao meio
			
			if (c == v[m]) { // chave igual a posição central do "subvetor"
				return 1;
			}
			else {				
				if (c < v[m]) { // se for menor está abaixo da metade, maior acima
					u = m-1;
				} 
				else {
					p = m+1;
				}
			}
		}
		
		return 0;
	}
	
	private int buscaBinaria(String c, String[] v) {
		
		int p = 0;
		int n = v.length;
		int u = n - 1;
		
		int m = 0;
		
		while (p <= u) {
			m = (p + u) / 2;
			
			if (c.equals(v[m])) {
				return 1;
			}
			else {
				p = m+  1;
			}
		}
		
		return 0;
	}
}
