package lacosDeRepetição;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		char sexo = 0;
		char humor = 0;
		char opcao = 'S';
		int contador = 1;
		int pessoaCalma=0;
		
		while(opcao =='S'|| contador < 150){
		System.out.println("Digite a idade da pessoal");
		idade = leia.nextInt();
		
		System.out.println("Digite o Sexo da pessoa");
		sexo = leia.next().charAt(0);
		
		System.out.println("A pessoa é: ");
		System.out.println("1 - Calma: ");
		System.out.println("2 - Nervosa:  ");
		System.out.println("3- Agressiva: ");
		humor = leia.next().charAt(0);
		
		System.out.println("Sair S ou N");
		opcao = leia.next().toUpperCase().charAt(0);
		
		
		
		contador ++;
		
		

		}
		System.out.println("Acabou a pesquisa");
		
	}

}
