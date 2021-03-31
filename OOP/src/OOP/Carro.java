package OOP;

public class Carro {
	private String marca;
	private String placa;
	private String cor;
	//private double tamanho;
	//private boolean ligado;

	//Nesse caso ele está executando a tarefa de atribuir
	//Constructor são executores, quem criar o obejto é o new pega a visão
	public Carro(String marca, String placa,String cor) {
			this.marca = marca;
			this.placa = placa;
			this.cor = cor;
	
	}
	public String getDescricaoCarro(){
		
		String descricao = marca + " " + placa + " " + cor;
		return descricao;
	}
	
	
	

}
