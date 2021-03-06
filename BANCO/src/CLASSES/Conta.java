package CLASSES;

public class Conta {
	//Atributo
	private int numero;
	private String cpf;
	protected double saldo;
	private boolean ativa;
	
	//Constructor
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	//Constructor Sobrecarga

	public Conta(int numero) {
	
		this.numero = numero;
	}//Sobrecarga
	public Conta(String cpf, boolean ativa) {
		
		this.cpf = cpf;
		this.ativa = ativa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	//METODOS 
	
	public void credito(double valor) {
		this.saldo = this.saldo + valor;		
	}
	public void debito(double valor) {
		if(this.saldo >= valor){
		this.saldo = this.saldo - valor;		
	 }
		
	}
	
	
	
	
}
