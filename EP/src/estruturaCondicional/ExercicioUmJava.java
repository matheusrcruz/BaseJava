package estruturaCondicional;

import java.util.Scanner;

//1- Faça um programa que receba tres inteiros e diga qual deles  é o maior.
public class ExercicioUmJava {

	public static void main(String[] args) {
			

		
		int number1, number2, number3; 
		Scanner  ler = new Scanner(System.in);
		

		System.out.println("Digite o primeiro numero: ");
		number1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		number2 = ler.nextInt();
		
		System.out.println("Digite o terceiro");
		number3 = ler.nextInt();
		ler.close();
		
		if((number1 > number2 ) && (number1 > number3)){
		System.out.printf("O Primeiro Digitado é o  maior %d :", number1);
		
			
		}else if(((number2 > number1 ) && (number2 > number3))){
			System.out.printf(" O segundo digitado é o maior %d  :", number2);
			
			
		}else{
			System.out.printf(" O terceiro Digitado é o maior %d :", number3);
	
		}
	}

}







