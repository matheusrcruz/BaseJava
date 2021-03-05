package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadFunc {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de funcionario: ");
		int quantidade = leia.nextInt();
		
		List<Funcionario> lista = new ArrayList<>();
		for(int x = 1; x<=quantidade;x++) {
			System.out.println(" Funcionario ou 2 terceiro");
			char tipo = leia.next().charAt(0);
			
			
			System.out.println("funcionario"+x);
			
			System.out.println("Nome");
			String nome = leia.next();
			System.out.println("Matricula");
			int matricula = leia.nextInt();
			System.out.println("Horas trabalhada");
			int horasTrabalhada = leia.nextInt();
			System.out.println("Valor hora");
			double valorHora = leia.nextDouble();
			
			
		
			if(tipo =='2') //String nome, int matricula, int horasTrabalhada, double valorHora
			{
				System.out.println("Valor Adicional ");
				lista.add(new Terceiro(nome,matricula,horasTrabalhada,valorHora));
			}else {
				lista.add(new Funcionario(nome,matricula,horasTrabalhada,valorHora));
			}//Polimorfismo Na pratica
			System.out.println();
			System.out.println("Pagamento de salario");
			
		
		}for( Funcionario fun: lista) {
			System.out.println(fun.getNome()+ "seu salario em R$"+fun.salario());
		}
		System.out.println("Fim de programa volte sempre: ");
		
		
		
	}
}
