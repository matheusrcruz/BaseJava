package OOP;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner call = new Scanner(System.in);
		ClasseClienteEx1 user = new ClasseClienteEx1();
		String nome;
		
		
		System.out.println("Bem Vindo a academia do Irineu Qual seu nome ");
		nome = call.next();
		user.nomeCliente(nome);
	}

}
