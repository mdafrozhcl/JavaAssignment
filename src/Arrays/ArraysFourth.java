package Arrays;

import java.util.Scanner;

public class ArraysFourth {
	public static void main(String[] args) {
		System.out.println("Welcome to transpose of a matrix");
		int a[][] = new int[3][3];
		int aT[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element of matrix A with comma or space separetion: ");
		String MatrixA = sc.nextLine();
		ArraysThird.matrixN(MatrixA, a);
		System.out.println("Transpose of matrix");
		transposeMatrix(a,aT);
		ArraysThird.dispayMatrixN(aT);
		sc.close();
	}

	private static void transposeMatrix(int[][] a, int[][] aT) {
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				aT[i][j]=a[j][i];
			}
		}
	}
}
