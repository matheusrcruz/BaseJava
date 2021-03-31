package ClienteObjeto;


import java.util.Random;
import java.util.Scanner;
import ClienteObjeto.ContaEstudante;

public class BancoMAIN {
	
	public static void main(String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		 String nomeCliente;
		 char opcao=' ';
		 char tipoConta;
		 double saldoCliente;
		 boolean ativa;
		 String cpf;
		 
		System.out.println("GRUPO 4");
		System.out.println("BEM-VINDO AO BANCO DiMAdeira");
		System.out.println("xSLOGANx");
		
		System.out.println("Deseja Ativar a conta? 1 - Ativar ou qualquer tecla para sair");
		opcao = leia.next().toUpperCase().charAt(0);
		
		if (opcao == '1') {
		System.out.println("Escolha seu tipo de conta: ");
		System.out.println("1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresarial\n5 - Estudantil\n ou 6 - Para sair: ");
		tipoConta = leia.next().charAt(0);
		
		//ESCOLHA TIPO CONTA
				if (tipoConta == '1') {
					
					System.out.println("A conta selecionada foi Poupança!");
					
					
					System.out.println("Informe seu nome: ");
					nomeCliente = leia.next();
					
					System.out.println("Informe seu CPF: ");
					cpf = leia.next();
					
					ContaPoupanca dadosPoupanca = new ContaPoupanca (nomeCliente, cpf);
					
					System.out.printf("Olá Sr(a). %s seu numero de conta é: %d\n", nomeCliente, dadosPoupanca.getNumero());
					
					
					for (int x =0; x<=10; x++) {
						
						do {
							
						System.out.println("Qual operação deseja realizar? ");
					
						System.out.println("1 - Credito (Adicionar valor a conta): ");
					
						System.out.println("2 - Debito (retirar valor da conta): ");
						opcao = leia.next().charAt(0);
						
						if (opcao != '1' && opcao != '2') {
							
							System.out.println("Opção selecionada INVALIDA!");
						}
					
						if (opcao == '1') {
						
							System.out.println("Qual valor deseja creditar? ");
							double valor = leia.nextDouble();
							dadosPoupanca.setValor(valor);
							dadosPoupanca.credito(valor);
							
						}
					
						if (opcao == '2') {
							System.out.println("Qual valor deseja debitar? ");
							double valor = leia.nextDouble();
							dadosPoupanca.setValor(valor);
							dadosPoupanca.debito(valor);
							
						}
						
						
					}while (opcao != '1' && opcao != '2');  //FINAL LOOPING
						
					}
					
				}
if (tipoConta == '2') { //ALTERAÇÃO CONTA CORRENTE COMEÇA AQUI
					
					System.out.println("A conta selecionada foi Corrente!");
					
					System.out.println("Informe seu nome: ");
					nomeCliente = leia.next();
					
					System.out.println("Informe seu CPF: ");
					cpf = leia.next();
					
					ContaCorrente corrente = new ContaCorrente (nomeCliente,cpf);
					
					System.out.printf("Olá Sr(a) %s , o numero da sua conta é: %d \n", nomeCliente, corrente.getNumero());
					
					for (int x =0; x<=10; x++) {
						
						do {
					System.out.println("Qual operação deseja realizar? ");
					
					System.out.println("1 - Credito (Adicionar valor a conta): ");
				
					System.out.println("2 - Debito (retirar valor da conta): ");
					opcao = leia.next().charAt(0);
					
					if (opcao != '1' && opcao != '2') {
						
						System.out.println("Opção selecionada INVALIDA!");
					}
					
					if (opcao == '1') {
						System.out.println("Qual valor deseja creditar? ");
						double valor = leia.nextDouble();
						corrente.setValor(valor);
						corrente.credito(valor);
						System.out.printf("O saldo atual de sua conta é: %.2f\n", corrente.getSaldo());
						
					}

					if (opcao =='2') {
						
						System.out.println("Qual valor deseja debitar? ");
						double valor = leia.nextDouble();
						corrente.setValor(valor);
						
						
						corrente.debito(valor);
						System.out.printf("O saldo atual da sua conta é: %.2f\n", corrente.getSaldo());
						
					}
					
					}while (opcao != '1' && opcao != '2');
					
					
				}
					//TALAO CHEQUE
					System.out.println("Você acabou com seus 10 movimentos em sua conta!");
					System.out.printf("Mas possuí talões disponíveis, deseja retirar? 1 - SIM ou qualquer tecla para NÃO\n");
					char opcaotalao = leia.next().charAt(0);
					
					if (opcaotalao == '1') {
						
						 
						System.out.print("Você possuí talões disponíveis, quanto(s) deseja retirar?");
						int talao = leia.nextInt();
						corrente.pedirTalao(talao);
						
						
					}
					else {
						System.out.println("Operação cancelada!");
					}
				}
					//ALTERAÇÃO CONTA CORRENTE TERMINA AQUIII
					
				if (tipoConta == '3') { //CONTA 3
					
					System.out.println("A conta selecionada foi Especial!");
					
					System.out.println("Informe seu nome: ");
					nomeCliente = leia.next();
					
					System.out.println("Informe seu CPF: ");
					cpf = leia.next();
					
					ContaEspecial especial = new ContaEspecial (nomeCliente,cpf);
					
					System.out.printf("Olá Sr(a) %s , o numero da sua conta é: %d \n", nomeCliente, especial.getNumero());
					
					for (int x =0; x<=10; x++) {
						
						do {
					System.out.println("Qual operação deseja realizar? ");
					
					System.out.println("1 - Credito (Adicionar valor a conta): ");
				
					System.out.println("2 - Debito (retirar valor da conta): ");
					opcao = leia.next().charAt(0);
					
					if (opcao != '1' && opcao != '2') {
						
						System.out.println("Opção selecionada INVALIDA!");
					}
					
					if (opcao == '1') {
						System.out.println("Qual valor deseja creditar? ");
						double valor = leia.nextDouble();
						especial.setValor(valor);
						especial.credito(valor);
						System.out.printf("O saldo atual de sua conta é: %.2f\n", especial.getSaldo());
						
					}

					if (opcao =='2') {
						
						System.out.println("Qual valor deseja debitar? ");
						double valor = leia.nextDouble();
						especial.setValor(valor);
						
						especial.debito(valor);
						System.out.printf("O saldo atual da sua conta é: %.2f\n", especial.getSaldo());
						
					}
					
					}while (opcao != '1' && opcao != '2');
					
					}
					
				}
				if (tipoConta == '4') {
					
					System.out.println("A conta selecionada foi Empresarial!");
				}
				if (tipoConta == '5') { //COMECO ESTUDANTE
					
					System.out.println("A conta selecionada foi Estudantil!");
					
					System.out.println("Informe seu nome: ");
					nomeCliente = leia.next();
					
					System.out.println("Informe seu CPF: ");
					cpf = leia.next();
					
					ContaEstudante estudante = new ContaEstudante (nomeCliente,cpf);
					
					System.out.printf("Olá Sr(a) %s , o numero da sua conta é: %d \n", nomeCliente, estudante.getNumero());
				
					//LOOPING
					for (int x =0; x<=10; x++) {
						
					do {
						
					System.out.println("Qual operação deseja realizar? ");
				
					System.out.println("1 - Credito (Adicionar valor a conta): ");
				
					System.out.println("2 - Debito (retirar valor da conta): ");
					opcao = leia.next().charAt(0);
					
					if (opcao != '1' && opcao != '2') {
						
						System.out.println("Opção selecionada INVALIDA!");
					}
					if (opcao == '1') {
						System.out.println("Qual valor deseja creditar? ");
						double valor = leia.nextDouble();
						estudante.setValor(valor);
						estudante.credito(valor);
						System.out.printf("O saldo atual de sua conta é: %.2f\n", estudante.getSaldo());
						
					}

					if (opcao =='2') {
						
						System.out.println("Qual valor deseja debitar? ");
						double valor = leia.nextDouble();
						estudante.setValor(valor);
						
						estudante.debito(valor);
						System.out.printf("O saldo atual da sua conta é: %.2f\n", estudante.getSaldo());
						
					}
					
					}while (opcao != '1' && opcao != '2');  //FINAL LOOPING
					}
				} //FIM ESTUDANTE 
				if (tipoConta == '6') {
					
					System.out.println("Você saiu da operação!");
				}
				//FIM ESCOLHA DE CONTA
		
				
		else {
			System.out.println("Você encerrou a operação!");
		}
	

	}
	

	}
		}
	