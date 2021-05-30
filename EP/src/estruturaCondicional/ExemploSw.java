package estruturaCondicional;

import java.util.Scanner;

public class ExemploSw {

	public static void main(String[] args) {
	
			Scanner leia = new Scanner(System.in);

			int numeroMes;
			System.out.println("Numero mes");
			numeroMes = leia.nextInt();
			leia.close();
			/*if(numeroMes == 1) {
				
				
			}else if (numeroMes == 2) {
				
				System.out.println("");
			}*/
			switch(numeroMes) {
			
			case 1:
			{
				System.out.println("JANEIRO");
			}
			break;
	}
	}

}
