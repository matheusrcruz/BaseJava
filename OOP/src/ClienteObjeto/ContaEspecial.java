package ClienteObjeto;

public class ContaEspecial extends Conta {

	// Victor França

		private double limite = 1000;
		private double valor = 0;
		
		// CONSTRUTOR
		public ContaEspecial (String nomeCliente, String cpf) {
			super (nomeCliente, cpf);
		}
		
		public ContaEspecial(int numero) {
			super(numero);
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
		public double getLimite() {
			return limite;
		}

		public double usarLimite (double valor) {
			double saldo = super.getSaldo();
			double diferenca = valor - saldo;
			this.limite -= diferenca;
			System.out.print("seu limite é : ");
			super.credito(saldo);
			System.out.print(limite);
			return limite;
		}

		@Override
		public void debito (double valor) {
			double saldo = super.getSaldo();
			if (saldo >= valor) {
				saldo -= valor;
			} else {
				this.usarLimite(valor);
			}
		}

	}

	
	
	
	
	

