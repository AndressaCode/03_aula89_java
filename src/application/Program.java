package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// fazer um vetor com n posicoes e no final apresentar
		// a media entre os n numeros do vetor
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will be entered? ");
		int n = sc.nextInt();
		
		double sum = 0.0;
		double [] vect = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Number " + (i+1) + ": ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.printf("%nAverage Height: %.2f", sum/n);
		
		sc.close();
	}

}
