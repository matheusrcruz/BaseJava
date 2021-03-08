package ClienteObjeto;

public class ContaCorrente extends Conta {
	//MATHEUS
	
		private int pedirTalao;
		private double valor = 0;
		private int contadortalao=3;
		private int talao = 0;
		 /*constructor*/
		
	
			
		public ContaCorrente (String nomeCliente, String cpf) {
			super(nomeCliente, cpf);
			
		}

		public int getPedirTalao() {
			return pedirTalao;
		}

		public void setPedirTalao(int pedirTalao) {
			this.pedirTalao = pedirTalao;
		}
		 public double getValor() {
				return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		/*Metodo*/
		public void talaoCheque(talao) {
			//this.setPedirTalao (this.getPedirTalao()+1);
			if(this.pedirTalao < 3) 
			{
					
				this.setPedirTalao (this.getPedirTalao()+1);
				contadortalao--;
				System.out.println("Lembre-se voce tem direito a 3 Cheques mensais: ");
				
			}else{
				System.out.println("Lamento mais você atingiu a quantidade de Cheques mensais: ");
			}
			
		}//Override vai emBaixo ou metodo debito :) lembre-se não tem credito especial
		
			@Override
			public void credito(double valor) {
				super.saldo = super.saldo + valor;		
			}
			public void debito(double valor) {
				
				if(super.saldo >= valor) {
				super.saldo = super.saldo - valor;		
			 }else if(saldo == 0 || saldo < 0) {
				 talaoCheque(this.setPedirTalao());
				
			 }
		
			}

			

	}