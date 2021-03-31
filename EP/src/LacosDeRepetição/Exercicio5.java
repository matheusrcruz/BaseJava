package LacosDeRepetição;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		byte nun =0 ;
		int soma=0;
		do {
			System.out.println("Digite um numero! Digite 0 para poder parar o programa");
			nun = leia.nextByte();
			soma = soma +nun;
			
		}while(nun !=0);
		System.out.println("A soma dos numeros é :"+ soma);
	}
}
	 
