package ClienteObjeto;
	// LARISSA
	//classepoupanca
	import java.util.Scanner;

	public class ContaPoupanca extends Conta{
		
	        private int diaAtualPoupanca;
	        private int mesAtualPoupanca;
	        private int diaAniversario;
	        private int mesAniversario;
	        private  double valor=0; // valor é mesma coisa que momento da transacao 
	        

	        //construtores
	        public ContaPoupanca (String nomeCliente, String cpf) {
	        	super (nomeCliente,cpf);
	        }
	        
	        public ContaPoupanca (String nomeCliente, String cpf, int diaAtualPoupanca, int mesAtualPoupanca, int diaAniversario, int mesAniversario)
	        {
	        	super (nomeCliente, cpf);
	        	this.diaAtualPoupanca = diaAtualPoupanca;
	        	this.mesAtualPoupanca = mesAtualPoupanca;
	        	this.diaAniversario = diaAniversario;
	        	this.mesAniversario = mesAniversario; 	
	        }
	        
	       
	        
	        
	        

	        

			public double getValor() {
				return valor;
			}

			public void setValor(double valor) {
				this.valor = valor;
			}

			public int getDiaAtualPoupanca() {
				return diaAtualPoupanca;
			}

			public void setDiaAtualPoupanca(int diaAtualPoupanca) {
				this.diaAtualPoupanca = diaAtualPoupanca;
			}

			public int getMesAtualPoupanca() {
				return mesAtualPoupanca;
			}

			public void setMesAtualPoupanca(int mesAtualPoupanca) {
				this.mesAtualPoupanca = mesAtualPoupanca;
			}

			public int getDiaAniversario() {
				return diaAniversario;
			}

			public void setDiaAniversario(int diaAniversario) {
				this.diaAniversario = diaAniversario;
			}

			public int getMesAniversario() {
				return mesAniversario;
			}

			public void setMesAniversario(int mesAniversario) {
				this.mesAniversario = mesAniversario;
			}



			@Override
	        public void credito(double valor) {
				
				if (valor>0) {
					Scanner leia = new Scanner (System.in);
					
					System.out.println("Informe o dia atual: ");
					int diaAtualPoupanca = leia.nextInt();
					
					System.out.println("Informe o mês atual: ");
					int mesAtualPoupanca = leia.nextInt();
					
					System.out.println("Agora, informe o dia do seu aniversário: ");
					int diaAniversario = leia.nextInt();
					
					System.out.println("Informe o mês de seu aniversário: ");
					int mesAniversario = leia.nextInt();
					
					if(diaAtualPoupanca == diaAniversario && mesAtualPoupanca==mesAniversario) {
						
						System.out.println("Você tem uma bonificação de 0,05% pelo dia de seu aniversário!");
						double bonificacao = valor * 0.05;
						System.out.printf("Sua bonificação é de: %.2f \n", bonificacao);
						
						saldo = (bonificacao + saldo)+valor;
						
						System.out.printf("Seu saldo atual é: %.2f", saldo);
						
					}else 
					{
						System.out.println("Valor informado inválido!");
					}
				}
					
	        }

			
			
			
			@Override
			public void debito(double valor) {
				
		
				if(this.saldo >= valor){
					this.saldo = this.saldo - valor;
					System.out.printf("Você retirou %.2f de sua conta, seu saldo atual é de: %.2f", valor, saldo);
				
						
				
			 }
			if (this.saldo < valor) {
				System.out.println("Você não possuí valor suficiente para realizar o saque!");
				System.out.println("Operação cancelada");
			}
			
        }
			
			
			
			
			
			
	}//CHAVE CLASSE


