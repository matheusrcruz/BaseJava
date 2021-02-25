package OperadoresAritimedicos;

import java.util.Scanner;

public class AulaDois {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double d, x1, x2, y1, y2;
		
		System.out.print("Informe o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.print("Informe o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.print("Informe o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.print("Informe o valor de y2: ");
		y2 = ler.nextDouble();
		ler.close();
		
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("A distância é de %.2f", d);
		
	}

}