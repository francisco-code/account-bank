package entities;

public class Conta {
	
	public static final double TAXA = 5.00; 

	private int numConta;
	private String name;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(int numConta, String name, double initValue) {
		this.numConta = numConta;
		this.name = name;
		deposit(initValue);
	}
	
	public Conta(int numConta, String name) {
		this.numConta = numConta;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double value) {
		saldo += value;
	}
	
	public void saque(double value) {
		saldo -= (value + TAXA);
	}

	public String toString() {
		return "Account " 
				+ numConta 
				+ ", Holder: " 
				+ name 
				+ ", Saldo: $ " 
				+ String.format("%.2f", saldo);
	}
	
	
	
}
