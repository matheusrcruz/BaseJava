package ClienteObjeto;


import java.util.Scanner;

public class  ContaEstudante extends Conta{
	
	//JAQUELINE CAVALARO
	
	private double limiteEstudantil = 5000.00; //ESTUDANTE
	
	private double valor =0; //SUPER momento da transação
	
	//CONSTRUTOR - VOU PERGUNTAR ISSO PARA O CLIENTE NA MINHA MAIN!!!
	public ContaEstudante(String nomeCliente, String cpf, boolean ativa) {
		super(nomeCliente, cpf, ativa);
		
		
	}
	
	public ContaEstudante(String nomeCliente, String cpf) {
		super(nomeCliente, cpf);
	
		//numeroConta = aleatorio.nextInt(1000);
		
	}
	//FIM CONSTRUTOR

	
	//SET E GET
	
	
	
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}
	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}//FIM GET E SET

	//INICIO METODO
	@Override
	public void credito(double credito) { //ESTOU COLOCANDO DINHEIRO NA CONTA
		
		if(credito > 0) {//teriamos que repassar esse metodo para as outras calasses
			saldo = saldo + credito; //FORMULA PARA ADD DINHEIRO NO SALDO
			System.out.printf("O valor R$ %.2f foi inserido em sua conta!\n", credito);
		}
		else if(credito == 0) {
			System.out.print("ATENÇÃO! O valor a ser depositado deve ser maior que R$ 0,00 \n");
			System.out.println("Impossivel completar a transação! Tente outro valor.");
			
		}else if(credito < 0) {
			System.out.print("O valor informado deve ser positivo!");
			System.out.println("Impossivel completar a transação! Tente outro valor.");
		}
	}
	@Override
	public void debito(double valor) {
		int contador=0;
		
		if (valor<=getSaldo())	{
			
			saldo=saldo-valor;
			
			System.out.println("Transação realizada com sucesso, seu saldo atual é: "+ getSaldo());
			System.out.println("Valor disponivel no Limite Estudantil: "+getLimiteEstudantil());
			
		}
		if (valor > getSaldo() && valor<=limiteEstudantil+getSaldo()) {
			Scanner leia = new Scanner(System.in);
			System.out.println("Você não tem saldo suficiente para realizar a operação!");
			System.out.println("Deseja utilizar o empréstimo Estudantil? ");
			System.out.println("Digite 1 para SIM e qualquer tecla para CANCELAR a operação!");
			char opcao = leia.next().charAt(contador);
			
			if (opcao == '1') {
				System.out.println("Qual valor deseja resgatar do Emprestimo estudantil? ");
				double valorEmprestimoEstudantil = leia.nextDouble();
				this.limiteEstudantil = this.limiteEstudantil - valorEmprestimoEstudantil;
				this.saldo = this.saldo + valorEmprestimoEstudantil - valor;
				System.out.println("Você utilizou o limite Estudantil!");
				System.out.println("Valor disponivel no Limite Estudantil: "+ getLimiteEstudantil());
				System.out.printf("Você retirou: %.2f\n", valor);
			}
			else {
				System.out.println("Operação CANCELADA!!!");
			}
		
		}
		if (valor > getSaldo() && valor>limiteEstudantil+getSaldo()) {
			System.out.println("Você não possuí saldo em sua conta e nem limite estudantil disponível!");
			System.out.println("Operação cancelada!");
		}
	
	}
	
}