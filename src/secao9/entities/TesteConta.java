package secao9.entities;

import java.util.Locale;
import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("Enter account name: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("deseja informar o valor do depósito inicial (y/n) ? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("informe o valor do depósito inicial: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, name, initialDeposit);
		} else {
			conta = new Conta(number, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.Deposit(depositValue);
		System.out.println("Dados da conta atualizados ");
		System.out.println(conta);

		
		System.out.println(); 
		System.out.println("Enter a withDraw value: "); 
		double withDrawValue = sc.nextDouble(); 
		conta.withDraw(withDrawValue);
		System.out.println("Dados da conta atualizados "); 
		System.out.println(conta);
		

		sc.close();

	}

}
