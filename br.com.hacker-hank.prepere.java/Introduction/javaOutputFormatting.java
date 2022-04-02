package Introduction;

import java.util.Scanner;

public class javaOutputFormatting {
	// https://www.hackerrank.com/challenges/java-output-formatting/problem
	// https://www.youtube.com/watch?v=moQ3Kr8ouiU&ab_channel=NathanSchutz
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
           String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
    }

}
