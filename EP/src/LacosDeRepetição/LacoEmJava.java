package LacosDeRepetição;

import java.util.Scanner;

public class LacoEmJava {
	
	 public static void main(){
		 
		 Scanner ler = new Scanner(System.in); 
		 String nome;
		 char genero;
	 
		 System.out.print("Digite o nome");
		 nome = ler.next().toUpperCase();
		 System.out.print("Digite F/M/O: ");
		 genero= ler.next().toUpperCase().charAt(0); //Char 0 primeiro digitado 
		 
		 while(genero != 'M' && genero != 'F' && genero != 'O') {
			 System.out.print("Você digitou errado");
			 genero= ler.next().toUpperCase().charAt(0);
			 
		 }
		 
	 }

}
