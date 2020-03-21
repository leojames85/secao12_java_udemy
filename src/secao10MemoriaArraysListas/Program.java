package secao10MemoriaArraysListas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		
		System.out.println("Digite qtde de índices do vetor...");
		int index = sc.nextInt();
		double[] vect = new double[index];
		
		for (int i = 0; i < vect.length; i++) {
			
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vect.length; i++) {
			
			System.out.println("posicao["+i+"] = " + vect[i]);
		}

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		 double avg = sum/vect.length;
		System.out.printf("average height: %.2f ", avg );
		
		sc.close();
	}

}
