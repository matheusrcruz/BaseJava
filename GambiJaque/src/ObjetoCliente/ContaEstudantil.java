/*package ObjetoCliente;

package ClienteObjeto;

import java.util.Random;
import java.util.Scanner;

public class ObjetoEstudante {
	
	private String nomeCliente; //SUPER
	private char tipoConta; //SUPER
	private int contador; //SUPER
	private String cpfCliente; //SUPER
	protected double saldoCliente; //SUPER
	private boolean ativa;//SUPER
	private double limiteEstudantil = 5000.00; //ESTUDANTE
	private int numeroConta;//SUPER
	Random aleatorio = new Random(); //SUPER
	Scanner leia = new Scanner(System.in);
	double valor =0; //SUPER
	
	//CONSTRUTOR - VOU PERGUNTAR ISSO PARA O CLIENTE NA MINHA MAIN!!!
	public ObjetoEstudante(String nomeCliente, String cpfCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
	
	public ObjetoEstudante(String nomeCliente, String cpfCliente, int numeroConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		//numeroConta = aleatorio.nextInt(1000);
		
	}
	//FIM CONSTRUTOR

	
	//SET E GET
	public int getNumeroConta() {
		numeroConta = aleatorio.nextInt(1000);
		return numeroConta ;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta; //= aleatorio.nextInt(1000);;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public char getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(char tipoConta) {
		this.tipoConta = tipoConta;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}
	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	public double getSaldoCliente() {
		return saldoCliente;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}//FIM GET E SET

	//INICIO METODO
	public void credito(double credito) { //ESTOU COLOCANDO DINHEIRO NA CONTA
		
		if(credito > 0) {
			this.saldoCliente = this.saldoCliente + credito; //FORMULA PARA ADD DINHEIRO NO SALDO
			System.out.printf("O valor R$ %.2f foi inserido em sua conta!\n", credito);
		}
		else if(credito == 0) {
			System.out.printf("ATEN��O! O valor a ser depositado deve ser maior que R$ 0,00 \n");
			System.out.println("Impossivel completar a transa��o! Tente outro valor.");
			
		}else if(credito < 0) {
			System.out.printf("O valor informado deve ser positivo!");
			System.out.println("Impossivel completar a transa��o! Tente outro valor.");
		}
	}
	public void debito(double valor) {
		
		if (valor<=getSaldoCliente())	{
			
			this.saldoCliente=this.saldoCliente-valor;
			
			System.out.println("Transa��o realizada com sucesso, seu saldo atual �: "+ getSaldoCliente());
			System.out.println("Valor disponivel no Limite Estudantil: "+getLimiteEstudantil());
			
		}
		if (valor > getSaldoCliente() && valor<=limiteEstudantil+getSaldoCliente()) {
		
			System.out.println("Voc� n�o tem saldo suficiente para realizar a opera��o!");
			System.out.println("Deseja utilizar o empr�stimo Estudantil? ");
			System.out.println("Digite 1 para SIM e qualquer tecla para CANCELAR a opera��o!");
			char opcao = leia.next().charAt(contador);
			
			if (opcao == '1') {
				System.out.println("Qual valor deseja resgatar do Emprestimo estudantil? ");
				double valorEmprestimoEstudantil = leia.nextDouble();
				this.limiteEstudantil = this.limiteEstudantil - valorEmprestimoEstudantil;
				this.saldoCliente = this.saldoCliente + valorEmprestimoEstudantil - valor;
				System.out.println("Voc� utilizou o limite Estudantil!");
				System.out.println("Valor disponivel no Limite Estudantil: "+ getLimiteEstudantil());
				System.out.printf("Voc� retirou: %.2f\n", valor);
			}
			else {
				System.out.println("Opera��o CANCELADA!!!");
			}
		
		}
		if (valor > getSaldoCliente() && valor>limiteEstudantil+getSaldoCliente()) {
			System.out.println("Voc� n�o possu� saldo em sua conta e nem limite estudantil dispon�vel!");
			System.out.println("Opera��o cancelada!");
		}
	
	}
	
}*/
