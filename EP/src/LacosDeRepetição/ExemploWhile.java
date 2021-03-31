package LacosDeRepetição;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.print("\nDigite sua idade: ");
		idade = ler.nextInt();
		
		while(idade >=1) {			
			System.out.printf("Sua idade %d",idade);
			if(idade >=18) {
				
				System.out.printf("\nVocê é maior idade:%d ",idade);
				
			}if(idade >=60){
				System.out.printf("\nVocê é idoso: %d",idade);
			}/*else {
				System.out.printf("Idade invalida %d", idade);
			}
			System.out.print("\nDigite sua idade");
			idade = ler.nextInt();
			ler.close();*/
			break;
		}
			System.out.println("\n Fim da pesquisa :");
		
	 }
		


}
