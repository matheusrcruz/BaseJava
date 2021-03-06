/*package test;

import java.util.Random;
import java.util.Scanner;

//import ClienteObjeto.ObjetoEstudante;

public class ContaEstudantil {
public static void main(String [] args) {
	Scanner leia = new Scanner (System.in);
	
	 String nomeCliente;
	 char opcao;
	 char tipoConta;
	 int contador;
	 String cpfCliente;
	 double saldoCliente;
	 boolean ativa;
	 double limiteEstudantil; // aqui muda de tpo de conta para tipo de conta
	 int numeroConta=0;

	 
	System.out.println("BEM-VINDO AO BANCO DiMAdeira");
	System.out.println("SLOGAN");
	
	System.out.println("Deseja Ativar a conta? 1 - Ativar ou qualquer tecla para sair");
	opcao = leia.next().toUpperCase().charAt(0);
	
	if (opcao == '1') {
	System.out.println("Escolha seu tipo de conta: ");
	System.out.println("1 - Conta Poupan�a\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Estudantil: ");
	tipoConta = leia.next().charAt(0);
	
	//ESCOLHA TIPO CONTA
			if (tipoConta == '1') {
				
				System.out.println("A conta selecionada foi Poupan�a!");
			}
			if (tipoConta == '2') {
				
				System.out.println("A conta selecionada foi Corrente!");
			}
			if (tipoConta == '3') {
				
				System.out.println("A conta selecionada foi Especial!");
			}
			if (tipoConta == '4') {
				
				System.out.println("A conta selecionada foi Empresarial!");
			}
			if (tipoConta == '5') {
				
				System.out.println("A conta selecionada foi Estudantil!");
				
				System.out.println("Informe seu nome: ");
				nomeCliente = leia.next();
				
				System.out.println("Informe seu CPF: ");
				cpfCliente = leia.next();
				
				ObjetoEstudante estudante = new ObjetoEstudante(nomeCliente, cpfCliente, numeroConta);
				
				System.out.printf("Ol� Sr(a) %s , o numero da sua conta �: %d \n", nomeCliente, estudante.getNumeroConta());
			
				//LOOPING
				for (int x =0; x<=10; x++) {
					
				do {
					
				System.out.println("Qual opera��o deseja realizar? ");
			
				System.out.println("1 - Credito (Adicionar valor a conta): ");
			
				System.out.println("2 - Debito (retirar valor da conta): ");
				opcao = leia.next().charAt(0);
				
				if (opcao != '1' && opcao != '2') {
					
					System.out.println("Op��o selecionada INVALIDA!");
				}
				if (opcao == '1') {
					System.out.println("Qual valor deseja creditar? ");
					double valor = leia.nextDouble();
					estudante.setValor(valor);
					estudante.credito(valor);
					System.out.printf("O saldo atual de sua conta �: %.2f"+ estudante.getSaldoCliente());
					
				}

				if (opcao =='2') {
					
					System.out.println("Qual valor deseja debitar? ");
					double valor = leia.nextDouble();
					estudante.setValor(valor);
					
					estudante.debito(valor);
					System.out.printf("O saldo atual da sua conta �: %.2f\n", estudante.getSaldoCliente());
					
				}
				
				}while (opcao != '1' && opcao != '2');  //FINAL LOOPING
					
			}
			if (tipoConta == '6') {
				
				System.out.println("Voc� saiu da opera��o!");
			}
			//FIM ESCOLHA DE CONTA
	
			}
	else {
		System.out.println("Voc� encerrou a opera��o!");
	}
}

}
}
*/