package classes;

import java.util.Iterator;

public class Sort {
	
	public void bubbleSort(int[] v) {
		int temp = 0;
		int n = v.length;
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (v[j] > v[j + 1]) {
					temp = v[j + 1];
					v[j + 1] = v[j];
					v[j] = temp;
				}
			}
		}
	}
	
	private int seleciona(int v[], int n) {
		int i = 0;
		
		for (int j = 1; j < n; j++) {
			if (v[i] < v[j]) {
				i = j;
			}
		}
		
		return i;
	}
	
	public void selecionaSort(int v[]) {
		int n = v.length;
		
		int i;
		int temp;
		
		while (n > 1) {
			i = seleciona(v,n);
			temp = v[n-1];			
			v[n-1] = v[i];
			v[i] = temp;
			n--;	
		}
	}
	
	private int selecionaDesc(int v[], int n) {
		int i = 0;
		
		for (int j = v.length; j > 1; j--) {
			if (v[i] > v[j]) {
				i = j;
			}
		}
		
		return i;
	}
	
	public void selecionaSortDesc(int v[]) {
		int n = 0;
		
		int selecionado;
		int i,j;
		int temp;
		
		while (n < v.length) {
			i = selecionaDesc(v,n);
			temp = v[n-1];
			v[n-1] = v[i];
			v[i] = temp;
			n++;	
		}
	}
	
	private void intercala(int vetor[], int primeiro, int meio, int ultimo) {
		int temp[] = new int[ultimo - primeiro + 1];
		int index = primeiro;
		int j = meio + 1;
		int k = 0;
		
		while (index <= meio && j <= ultimo) {
			if (vetor[index] < vetor[j]) {
				temp[k] = vetor[index];
				index++;
			} else {
				temp[k] = vetor[j];
				j++;
			}
			k++;
		}
		
		while (index <= meio) {
			temp[k] = vetor[index];
			k++;
			index++;
		}
		
		while (j <= ultimo) {
			temp[k] = vetor[j];
			k++;
			j++;
		}
		
		for (k = 0; k <= ultimo - primeiro; k++) {
			vetor[primeiro + k] = temp[k];
		}
	}
	
	public void merge_sort(int vetor[], int primeiro, int ultimo) {
		if (primeiro != ultimo) {
			int meio = (primeiro + ultimo) / 2;
			merge_sort(vetor, primeiro, meio);
			merge_sort(vetor, meio + 1, ultimo);
			intercala(vetor,primeiro,meio,ultimo);
		}
	}
	
	private void insere(int x, int vetor[], int n) {
		
		while (n > 0 && x < vetor[n - 1]) {
			vetor[n] = vetor[n-1];
			n--;
		}
		
		vetor[n] = x;
	}
	
	public void insertion_sort(int[] vetor, int n) {
		for (int i = 0; i < n; i++) {
			insere(vetor[i], vetor, i);
		}
	}
}
