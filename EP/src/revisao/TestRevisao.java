package revisao;

import java.util.Scanner;

 public class TestRevisao {
	 
	 public static void main(String[]args)
	 {
			Scanner leia = new Scanner(System.in);//objeto leia
			String nome;
			Pessoa amigo = new Pessoa("Maria");//Objeto amigo
			
			
			System.out.println("Digite o nome");
			nome = leia.next();
			Pessoa user = new Pessoa(nome); //Objeto user
			
			System.out.println("O nome � "+ user.getNome());
	
	}
}