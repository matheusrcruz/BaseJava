package ARRAYS;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int valores[] = new int[5];
		//int valores[] = {10, 11, 20, 5, 1000};
		
		//String time[] = {"SPFC", "SAnTo", "CUrithians", "vasco"};
		//System.out.println(time);
		
		/*for(int x=0; x<time.length; x++) {
			System.out.println(time[x]);
		}*/
		/* System.out.println("Digite um valor1");
		 valores[1] = leia.nextInt()
		 System.out.println("Digite um valor2");
		 valores[1] = leia.nextInt()
		 System.out.println("Digite um valor3");
		 valores[1] = leia.nextInt()
		 System.out.println("Digite um valor4");
		 valores[1] = leia.nextInt()
		 System.out.println("Digite um valor5");
		 valores[1] = leia.nextInt()*/
		 
		for(int y=0;y<valores.length; y++) {
			System.out.printf("Digite o valor %d: ", (y+1));
			valores[y]=leia.nextInt();
			
		}
		for(int y = 0; y<valores.length; y++ ){
			System.out.println("O valor é"+(y+1)+valores[y]);
			
		}
		
	}

}