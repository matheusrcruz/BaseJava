package desafioProgramador;

import java.util.Scanner;

public class DesafioTriangulo {
	public static void main(String[]args) {
		int altura1 = 0, altura2 = 0 , altura3 = 0;
		int base1 = 0,base2 = 0,base3 = 0;
		int total1 = 0, total2 = 0, total3 = 0;
		Scanner call = new Scanner(System.in);

		System.out.println("Digite a base do seu trinagulo");
		altura1 = call.nextInt();
		System.out.println("Digite a altura do seu trinagulo");
		base1 = call.nextInt();
		System.out.println("Digite a base do seu trinagulo");
		altura2 = call.nextInt();
		System.out.println("Digite a altura do seu trinagulo");
		base2 = call.nextInt();
		System.out.println("Digite a base do seu trinagulo");
		altura3 = call.nextInt();
		System.out.println("Digite a altura do seu trinagulo");
		base3 = call.nextInt();
		call.close();
		
		total1 = (base1*altura1)*2;
		total2 = (base2*altura2)*2;
		total3 = (base3*altura3)*2;
		if((total1 > total2) && (total1>total2)){
			System.out.println("O maior é o 1 tringulo" + total1);
			
		}else if((total2 > total1) && (total2>total3)){
			System.out.println("O maior é o 2 tringulo" + total2);
		}else {
			
			System.out.println("O maior é o 3 tringulo" + total3);			
		}
		

		
	
	
		
		
	}

}
