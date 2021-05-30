package OOP;

public class ClasseMetodoMainRetorno {
	public static void main(String[]args) {
		
		ClasseMetodoComRetorno bmx = new ClasseMetodoComRetorno();
		/*
		String marca;
		String modelo;
		int numPassageiro;
		int qtdDeKm;
		int velocidade;*/
		
		bmx.marca = "LocalBK";
		bmx.modelo ="OneBmxSportage";
		bmx.qtdDeKm = 50;
		bmx.velocidade = 75;
		
		double exibicao = bmx.obter();
		System.out.printf("A quantidade de Km rodado é %.2f",exibicao);
		
		
		
		
	}
}
