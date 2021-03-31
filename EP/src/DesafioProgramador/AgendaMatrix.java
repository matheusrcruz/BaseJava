package DesafioProgramador;

//import java.util.Scanner;

//Desafio
/*
 * Matriz agenda de 24 linha x 31
 * 
 * 
 * */


public class AgendaMatrix {
	public static void main(String[]args) {
		int dia = 0;
		
		//Scanner call = new Scanner(System.in);
		String agenda[][] = new String[24][31];
		for(int contLinha = 0; contLinha<=23; contLinha++) {
			for(int contColuna = 0; contColuna<=30; contColuna++) {
			 //System.out.println("Marque na agenda a tarefa do dia");
			 System.out.print(agenda[contLinha][contColuna]);
			 
				
			}
			//dia[contLinha][contColuna] = call.nextLine();
		
		}
	}
}