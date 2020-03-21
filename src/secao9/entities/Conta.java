package secao9.entities;

public class Conta {
	
	private int number;
	private String name;
	private double initialDeposit;
	private double balance;
	
	public Conta(int number, String name) {
		
		this.number = number;
		this.name = name;
	}
	
	public Conta(int number, String name, double initialDeposit) {
		
		this.number = number;
		this.name = name;
		Deposit(initialDeposit);
	}

	
	
	public int getNumber() {
		return number;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public double getDepositoInicial() { return depositoInicial; }
	 * 
	 * public void setDepositoInicial(double depositoInicial) { this.depositoInicial
	 * = depositoInicial; }
	 */
	public double getBalance() {
		return balance;
	}

	
	
	public void Deposit(double value) {
		
		balance += value;
		
	}

	public void withDraw(double value) {
		
		balance -= value + 5.0;
	}

	
	
	@Override
	public String toString() {
		return "Conta " + number + ", name=" + name + ", balance="
				+ balance ;
	}
	
	

}
