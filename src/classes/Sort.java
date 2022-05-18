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
		
		for (int j = 1; j < v.length; j++) {
			if (v[i] < v[j]) {
				i = j;
			}
		}
		
		return i;
	}
	
	public void selecionaSort(int v[]) {
		int n = v.length;
		
		int selecionado = 0;
		int i,j;
		int temp = 0;
		
		while (n > 1) {
			i = seleciona(v,n);
			temp = v[n-1];
			v[n-1] = v[i];
			v[i] = temp;
			n--;	
		}
	}
	
}
