package Arrays;

import java.util.Scanner;

public class ArraysSecond {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Arrays");
		System.out.println(":Welcome to sorting program:");
		System.out.print("Enter the number of element to be sorted: ");
		int size = sc.nextInt();
		int[] list=new int[size];
		
		while(size>0){
			System.out.print("Enter array element["+(list.length-size)+"]: ");
			list[list.length-size]=sc.nextInt();
			size--;
		}
		
		System.out.println("Array Items before sorting");
		displayArray(list);
		//descending
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				int temp;
				if (list[i] < list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		System.out.println("Array Items after sorting");
		displayArray(list);
		
	}
	
	public static void displayArray(int[] list){
		for(int i:list){
			System.out.println(i);
		}
	}

}
