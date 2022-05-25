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
		
		//System.out.println("Seleciona Sort Desc");
		
		//TesteSelecionaSortDesc();
		
		System.out.println("Merge Sort");
		
		TesteMergeSort();
		
		System.out.println("Insertion Sort");
		
		TesteInsertionSort();
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
	
	public void TesteInsertionSort() {
		int[] vet = {38,54,23,5,3,8,6,74,32,14,100,-85, -21};
		
		System.out.println(Arrays.toString(vet));
		
		_sort.insertion_sort(vet, vet.length);
		
		System.out.println(Arrays.toString(vet));
	}
	
	public void TesteMergeSort() {
		int[] vet = {38,54,23,5,3,8,6,74,32,14,100,-85, -21};
		
		System.out.println(Arrays.toString(vet));
		
		_sort.merge_sort(vet, 0, vet.length - 1);
		
		System.out.println(Arrays.toString(vet));
	}
	
	public void TesteSelecionaSortDesc() {
		int[] vet = {38,54,23,5,3,8,6,74,32,14,100,-85, -21};
		
		System.out.println(Arrays.toString(vet));
		
		_sort.selecionaSortDesc(vet);
		
		System.out.println(Arrays.toString(vet));
	}

}
