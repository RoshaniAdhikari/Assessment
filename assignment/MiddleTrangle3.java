package assignment;

import java.util.Scanner;

class MiddleTriangle {
	static void printPattern(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
				//System.out.print("* ")
//				System.out.print(j + " ");
			}
			System.out.println();
		}
	}}
public class MiddleTrangle3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Enter 3 Pattern Numbers to get Middle Triangle---");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		// MiddleTriangle m = new MiddleTriangle();
		MiddleTriangle.printPattern(num1);
		MiddleTriangle.printPattern(num2);
		MiddleTriangle.printPattern(num3);
	}
}



