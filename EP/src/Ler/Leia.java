package Ler;

import java.util.Scanner;

public class Leia {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner (System.in);
	

	/*System.out.println("Digite seu nome inteiro ");
	String nome = scan.nextLine();	
	System.out.printf("Seu nome completo é %s", nome);
	
	
	//le so mente o primeiro nome
	System.out.println("\n Digite seu primeiro nome ");
	String primeiroNome = scan.next();
	System.out.printf("Seu primeiro nome é: %s \n", primeiroNome);
	
	System.out.println("Digite sua idade ");
	int idade = scan.nextInt();
	System.out.printf("Sua idade é: %d", idade);
	
	System.out.println("Digite sua altura: ");
	double altura = scan.nextDouble();
	System.out.println("sua altura é " + altura);*/
	
	System.out.println("Digite seu nome, sua idade, sua altura, possui filhos? e se tem bichinho de estumacao");
	String nome = scan.nextLine();
	int idade = scan.nextInt();
	float altura = scan.nextFloat();
	byte filhos = scan.nextByte();
	char animal = scan.next().charAt(1);
	System.out.println("Voce selecionou os seguintes valores ");
	System.out.printf("Seu nome %s, sua idade é %d, sua altura %f, filhos%d, animalzinho de estimação %c ", nome, idade, altura, filhos, animal);
	
		
		
		
		
		
	}

}
