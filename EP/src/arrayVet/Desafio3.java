package arrayVet;
import java.util.Random;


public class Desafio3 {
	public static void main(String[]args) {
	

		
	
			Random valor = new Random();
			int n1[][] = new int[4][6];
			int n2[][] = new int [4][6];
			int m1[][] = new int [4][6];
			int m2[][] = new int [4][6];
			for(int x=0; x<4;x++) {
				for (int y=0; y<6; y++) {
					n1[x][y]= valor.nextInt(10)+1;
					n2[x][y]= valor.nextInt(10)+1;
				}
			}
			for (int x=0; x<4;x++) {
				for (int y=0; x<6; x++) {
					m1[x][y] = n1[x][y] + n2[x][y];
					m2[x][y] = n1[x][y] + n2[x][y];
				}
			}
			for (int x=0; x<4;x++) {
				for(int y=0;y<6;y++) {
					System.out.printf("A matriz 1é  %f)", m1[x][y]);
					System.out.printf("A matriz 2 é %f", m2[x][y]);
				}
			}

			}

		}
		//vê se roda ai

		

