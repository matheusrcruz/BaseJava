package Array;
//Djavan
//não te esquecei um dia, nem um dia: JAVA
//o elo com todas as cores pra enfrentar amores gris: ORIENTAÇÃO A OBJETOS NA VEIA!!!


import java.util.Scanner;

public class ExemploArray {
	public static void main (String[]args) {
							//Cronstrutor ou contructor instanciando uma entrada
		Scanner entrada = new Scanner(System.in);
		int[] arrayUm = {2, 4 ,6, 8, 10, 12 };
		int[] arrayDois = {1, 3, 5, 7, 9, 11};
		float[] nota = new float[5];
		
		//verificando tamanho do Array == Vetor
		if(arrayDois.length>8) {
			System.out.println("Maior que 8!: ");
		} else {
			System.out.println("Menor Que 8 o array: ");
		}
		
		System.out.println("O tamanho do Array Um:  "+ arrayUm.length);
		
		String[] cars = {"GOL", "Celtinha", "Fusquinha", "volvo"};
		
		//Ultizando for each, faz varredura até o ultimo indice e não preciso passar a variavel
		for(String i : cars) {
			System.out.println(i);
			
		}
		
		//Poupulando o Array ou seja colocando item(valor) a cada indice(Posição 0 é o inicio como exemplo) :)
		for(int i =0; i<5; i++) {
			//Lembre-se a primeira posição sempre sera Zero(Computador exerga zero como primeiro sempre)
			System.out.println("Entre com uma nota");
			nota[i] = entrada.nextFloat();
			
		}
		//Representando um Array
		for(int i=0; i<5; i++) {
			System.out.println("Nota"+i+1+"="+nota[i]);
		}
		
		
		
		
	}

}
