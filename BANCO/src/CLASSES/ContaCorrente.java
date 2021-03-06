package CLASSES;

public class ContaCorrente extends Conta {
	 int pedirTalao ;
	 
	 /*constructor*/
	public ContaCorrente(int numero) {
		super(numero);
	}

	public int getPedirTalao() {
		return pedirTalao;
	}

	public void setPedirTalao(int pedirTalao) {
		this.pedirTalao = pedirTalao;
	}
	/*Metodo*/
	public void talaoCheque() {
		//this.setPedirTalao (this.getPedirTalao()+1);
		if(this.pedirTalao < 3) 
		{
			this.setPedirTalao (this.getPedirTalao()+1);
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
			
			if(super.saldo >= valor){
			super.saldo = super.saldo - valor;		
		 }
	
		}

}
