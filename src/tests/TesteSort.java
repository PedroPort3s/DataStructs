package tests;

import java.util.Arrays;

import classes.Sort;

public class TesteSort {
	
	Sort _sort = null;
	
	public TesteSort() {
		this._sort = new Sort();
	}
	
	public void execute() {
		System.out.println("Bubble Sort");
		
		TesteBubbleSort();
		
		System.out.println("Seleciona Sort");
		
		TesteSelecionaSort();
		
	}
	
	public void TesteBubbleSort() {
		int[] vet = {46,54,88,5,3,8,6,74,32,14,100,-85};
		
		System.out.println(Arrays.toString(vet));
		
		_sort.bubbleSort(vet);
		
		System.out.println(Arrays.toString(vet));
	}
	
	public void TesteSelecionaSort() {
		int[] vet = {38,54,23,5,3,8,6,74,32,14,100,-85, -21};
		
		System.out.println(Arrays.toString(vet));
		
		_sort.selecionaSort(vet);
		
		System.out.println(Arrays.toString(vet));
	}

}
