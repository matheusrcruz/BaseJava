package EstruraCondicional;

import java.util.Scanner;

public class ExercicioDoisJava {

	public static void main(String[] args) {
	//2- Faça um programa que entre com três números e coloque em ordem crescente.
		int number1, number2, number3;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Numero");
		number1 = ler.nextInt();
		System.out.println("Digite o segundo Numero");
		number2 = ler.nextInt();
		System.out.println("Digite o terceiro Numero");
		number3 = ler.nextInt();
		ler.close();
			/* ninho de rato
				if((number1 > number2) && (number1 > number3)) {
					if(((number2 < number1) && (number2 > number3))) {
						if(((number3 < number2) && (number3 < number1))) {
							System.out.printf("1 %d, 2 d%, 3 d%", number1,number2,number3);
							}
						  }
						}
							*/
			
			if((number1 > number2 ) && (number1 > number3)){
			System.out.printf("O Primeiro Digitado é o  maior %d :", number1);
			
				
			}else if(((number2 > number1 ) && (number2 > number3))){
				System.out.printf(" O segundo digitado é o maior %d  :", number2);
				
			}else/* if(((number3 > number1 ) && (number3 > number2)))*/{
				System.out.printf(" O terceiro Digitado é o maior %d :", number3);	
				}
	}
}
