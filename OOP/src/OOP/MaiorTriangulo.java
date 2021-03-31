package OOP;

import java.util.Scanner;

public class MaiorTriangulo {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		Triangulo T3 = new Triangulo();
		Triangulo T4 = new Triangulo();  //objeto
		Quadrado Q1 = new Quadrado();
		Pessoa usuario = new Pessoa();
		
		
		
		double base1, altura1, area1;
		double base2, altura2, area2;
		double area3;
		double areaquadrado;
		
		
		System.out.println("Digite o seu nome :");
		usuario.nome = leia.next();
		
		System.out.println("Digite o lado do quadrado :");
		Q1.lado = leia.nextDouble();
		
		
		Q1.areaQuadrado();
		areaquadrado = Q1.calculoAreaQuadrado();
		
		System.out.printf("A area � %s",Q1.tamanhoQuadro());
		
		System.out.println("Digite a base 1:");
		base1 = leia.nextDouble();
		System.out.println("Digite a altura 1: ");
		altura1 = leia.nextDouble();
		
		area1 = (base1 * altura1)/2;
		
		System.out.println("Base 1:"+base1);
		System.out.println("Altura 1: "+altura1);
		System.out.println("Area 1:"+area1);
		
		System.out.println("SEGUNDO TRIANGULO");
		System.out.println("Digite a base 2:");
		base2 = leia.nextDouble();
		System.out.println("Digite a altura 2: ");
		altura2 = leia.nextDouble();
		
		area2 = (base2 * altura2)/2;
		
		System.out.println("Base 2:"+base2);
		System.out.println("Altura 2: "+altura2);
		System.out.println("Area 2:"+area2);
		
		
		
		System.out.println("TERCEIRO TRIANGULO");
		System.out.println("Digite a base 3:");
		T3.base = leia.nextDouble();
		System.out.println("Digite a altura 3:");
		T3.altura = leia.nextDouble();
		
		
		
		//area3 = (T3.altura * T3.base)/2;
		
		//System.out.println("Area do triangulo 3 �"+area3);
		
		T3.areaTriangulo();
		
		
				
		if (area1 > area2) {
			System.out.println("Triangulo 1 tem a maior area!!!");
		} else if (area1 == area2)
		{
			System.out.println("Triangulos iguais!!!");
		}
		else {
			System.out.println("Triangulo 2 tem a maior area!!!");
		}
				
		
		
	}

}
