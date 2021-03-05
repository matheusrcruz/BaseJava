package DesafioProgramador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Zoologico {
	public static void main (String [] args) {
		
		
		
		Scanner  leia  =  new  Scanner ( System . in); 
		Locale . setDefault( Locale . US );  //  MODO AMERICANO - 
		List <Animal> lista = new ArrayList<>();
		
		System.out.println("Escolha quantos animais você quer por no zoologico: ");
		int quantidade = leia.nextInt();
		
		for (int x =1; x<=quantidade; x++) {
			
			System.out.println("Animal "+x);
			
			
			System.out.println("Qual animal você deseja?\n1-Cachorro 2-Cavalo 3-Preguiça");
			char tipo = leia.next().charAt(0);
			
			
			
			System.out.print("Escolha o nome de seu animal: ");
			String nome = leia.next();
			
			System.out.println("Digite a idade de seu animal: ");
			int idade = leia.nextInt();
			
		
			
			if (tipo == '1') {
				System.out.println("Você escolheu o Doguineo: ");
				lista.add(new Cachorro(nome, idade));	
				
			}
			else if (tipo == '2') {
				System.out.println("Você escolheu o Cavalo: ");
				lista.add(new Cavalo (nome, idade));
			}
			else if (tipo == '3') {
				System.out.println("Você escolheu o Preguiça");
				lista.add(new Preguica(nome,idade));
			}
			else {
				System.out.println("Você digitou um número invalido!!");
			}
		}
		
		System.out.println("Animal(is) escolhido(s): ");
		for (Animal animal:lista) {
			System.out.println("nome: "+animal.getNome()+" A idade dele é: "+animal.getIdade());
			
			animal.EmiteSom();
			animal.Acao();
		}
		
		
	}
	
	
}