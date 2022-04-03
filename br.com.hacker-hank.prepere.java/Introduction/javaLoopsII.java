package Introduction;

import java.util.Scanner;

public class javaLoopsII {
	// https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		final int two = 2 ;
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int x = a;
			for (int j = 0; j < n; j++) {
				x += Math.pow(two, j) * b;
				System.out.printf("%s ",x);
			}
			System.out.println();
		}
		in.close();
	}
}
