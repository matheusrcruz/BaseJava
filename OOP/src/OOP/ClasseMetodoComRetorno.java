package OOP;

public class ClasseMetodoComRetorno {
	
	String marca;
	String modelo;
	int numPassageiro;
	int qtdDeKm;
	int velocidade;
	
	
	
	
	double obter() {
		return qtdDeKm * velocidade;
	}
}
