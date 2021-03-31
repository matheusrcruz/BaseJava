package ClienteObjeto;

import java.util.Random;

public class Conta {
	
	//Atributo
	private String nomeCliente;
	private int numero;
	private String cpf;
	protected double saldo=0;
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
	public Conta(String nomeCliente, String cpf, boolean ativa) {
		
		this.cpf = cpf;
		this.ativa = ativa;
		this.nomeCliente=nomeCliente;
	}
		
	
	public Conta(String nomeCliente, String cpf) {
		super();
		this.nomeCliente = nomeCliente;
	
		this.cpf = cpf;
	}
	//ENCAPSULAMENTO
	
	public int getNumero() {
		Random aleatorio = new Random();
		numero = aleatorio.nextInt(1000);
		return numero ;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
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