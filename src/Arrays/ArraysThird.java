package Arrays;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ArraysThird {
	public static void main(String[] args) {
		System.out.println("Welcome to matrix addition program");
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element of matrix A with comma or space separetion: ");
		String MatrixA = sc.nextLine();
		matrixN(MatrixA, a);
		dispayMatrixN(a);
		System.out.print("Enter element of matrix B with comma or space separetion: ");
		String MatrixB = sc.nextLine();
		matrixN(MatrixB, b);
		dispayMatrixN(b);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//addition
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Sum of Matrix A and B is: ");
		dispayMatrixN(c);
		sc.close();
	}

	public static void matrixN(String matrixElement, int N[][]) {
		StringTokenizer st = new StringTokenizer(matrixElement);
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N[i].length; j++) {
				int temp = Integer.parseInt(st.nextToken(",| "));
				N[i][j] = temp;
			}
		}
	}

	public static void dispayMatrixN(int N[][]) {
		System.out.println();
		for (int ai[] : N) {
			for (int aij : ai) {
				System.out.print(aij + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
