package Introduction;

import java.util.Scanner;

public class javaStdinAndStdout2 {

	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/java-stdin-stdout/problem
		Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        // Write your code here.
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
		scan.close();
	}

}
