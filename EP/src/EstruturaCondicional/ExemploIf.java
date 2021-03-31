package EstruturaCondicional;

import java.util.Scanner;

public class ExemploIf {
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade = 0;
		
		System.out.println("Digite seu nome: ");
		nome = ler.next().toUpperCase();
		System.out.println("Digite sua idade : ");
		idade = ler.nextInt();
		if(idade < 18) {
			System.out.println("MUito novo ");
			
		}
		
					
		
		
		
	
	
	
	} 

}
