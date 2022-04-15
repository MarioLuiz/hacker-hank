package Introduction;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class javaCurrencyFormatter {
	// https://www.hackerrank.com/challenges/java-currency-formatter/problem
	public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nfUs = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUs.format(payment);
        
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nfIndia.format(payment);
        
        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfChina.format(payment);
        
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFrance.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
