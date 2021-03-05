package CLASSES;

public class ContaCorrente extends Conta {
	 private int pedirTalao=0;
	 
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
		this.setPedirTalao(this.getPedirTalao() +1);
		
	}
	
	

}
