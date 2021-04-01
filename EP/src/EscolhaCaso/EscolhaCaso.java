package EscolhaCaso;

import java.util.Scanner;

public class EscolhaCaso {

	public static void main(String[] args) {
		
		System.out.println("Entre com um dia da semana que seja de 1 a 7");
		Scanner scan = new Scanner(System.in);
		int diaSemana = scan.nextInt();
		
		/*if(diaSemana == 1) 
		{
			System.out.println("Domingo");
		}
		else if(diaSemana == 2)
		{
			System.out.println("Segunda");
		}else if(diaSemana == 3) {
			System.out.println("Terça");
		}
		else if(diaSemana == 4) {
			System.out.println("Quarta");
		}
		else if(diaSemana == 5) {
			System.out.println("Quinta");
		}
		else if(diaSemana == 6) {
			System.out.println("Sexta");
		}
		else if(diaSemana == 7) {
			System.out.println("Sabado");
		}
		else {
			System.out.println("Dia da semana invalido");
		}*/
			
		switch(diaSemana) {
		
			case 1 : System.out.println("Domingo");break;
			case 2 : System.out.println("Segunda");break;
			case 3 : System.out.println("Terça");break;
			case 4 : System.out.println("Quarta ");break;
			case 5 : System.out.println("Quinta");break;
			case 6 : System.out.println("Sexta");break;
			case 7 : System.out.println("Sábado");break;
			
			default : System.out.println("Não é um dia da semana valido");
			
			}
		
		
		
		
		
	}
}
