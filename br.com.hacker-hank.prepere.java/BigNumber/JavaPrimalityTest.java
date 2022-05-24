package BigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        // https://www.hackerrank.com/challenges/java-primality-test/problem
        Scanner scanner = new Scanner(System.in);

        BigInteger big = scanner.nextBigInteger();
        if(big.isProbablePrime(100)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        scanner.close();
    }

}
