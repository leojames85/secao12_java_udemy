package secao10MemoriaArraysListas;

import java.util.Locale;
import java.util.Scanner;

public class RentProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] vect = new Student[10];
		
		System.out.println("Insira o número de estudantes que vão alugar quartos: ");
		int n =  sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.println("name: ");
			String name =  sc.nextLine();
			
			System.out.println("Email: ");
			String email =  sc.nextLine();
			
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Student(name, email, room);
			
		}
		
		for (int i = 0; i < vect.length; i++) {
			
			if(vect[i] != null) {
				System.out.println( vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		
		sc.close();
	}

}
