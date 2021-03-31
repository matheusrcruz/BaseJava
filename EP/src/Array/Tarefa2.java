package Array;

import java.util.Random;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int lancamento[] = new int[3];
		double mediaAritimetica = 0.00;
		double maiorPontuacao = 0.00;
		double contadorMaiorPontuacao = 0.00;
		double somaValores =0.00;
		int valor =0;
				//instaciando a calsse random
				 Random NumeroDado = new Random();
		for(int x=0;x<lancamento.length; x++) {
				System.out.printf("Digite o resultado do lancamento %d : ",(x+1));
				//lancamento[x]=leia.nextInt();
				//lancamento[x] = ((int) Math.random()*6)+1; interface :)
					lancamento[x]= NumeroDado.nextInt(6)*1;//(10)+50
		}
		/*
		 	for(int x = 0; x<lancamento.length; x++ ) {
			System.out.printf("\n O valor do lançamento %d  é %d",(x+1), lancamento[x]);
			somaValores = somaValores + lancamento[x];
		
		}
		*/
		for(int x = 0;x<lancamento.length;x++  ) {
			somaValores = somaValores+lancamento[x];
			
			if(lancamento[x] >= maiorPontuacao) {
				if(lancamento[x]>maiorPontuacao) {
					contadorMaiorPontuacao = 0;
				}
				
				
				maiorPontuacao = lancamento[x];
				contadorMaiorPontuacao ++;
				
			}
			
		}
		//processamento
		mediaAritimetica = somaValores/ lancamento.length;
		//saidas fora do laco
		 System.out.printf("\nO total de lancamentos digitados %.0f",somaValores );
		 System.out.printf("\nA media é : %.2f",somaValores);
		 System.out.printf("\no maior valor é: %f",maiorPontuacao);
		 System.out.printf("O maior valor aparece %f vezes", contadorMaiorPontuacao );
		
	}

}
