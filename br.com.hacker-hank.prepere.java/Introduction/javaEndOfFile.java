package Introduction;

import java.util.Scanner;

public class javaEndOfFile {
	// https://www.hackerrank.com/challenges/java-end-of-file/problem
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; scan.hasNext(); i++) {
			System.out.println(i + " " + scan.nextLine());
		}
	}

}
