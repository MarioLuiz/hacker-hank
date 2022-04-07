package Introduction;

import java.util.Scanner;

public class javaStaticInitializerBlock {
	// https://www.hackerrank.com/challenges/java-static-initializer-block/problem

	static Scanner scan = new Scanner(System.in);
	static int B = scan.nextInt();
	static int H = scan.nextInt();

	static boolean flag = (B <= 0) || (H <= 0) ? false : true;

	static {
		try {
			if (!flag) {
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of c
