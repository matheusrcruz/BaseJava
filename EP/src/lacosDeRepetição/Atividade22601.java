package lacosDeRepeti��o;

import java.util.Scanner;

public class Atividade22601 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);		
		
		int num, par = 0, impar = 0;
		
		for(int contador =1;contador<11;contador++) {
	       System.out.println("Digite o " + contador + "� n�mero");
	         num = ler.nextInt();
	         ler.close();
	         
	         if(num % 2 == 0){
	            par++;
	         }else if(num % 2 == 1){
	           impar++;
	          }    
		}
		System.out.println("Os numeros Pares s�o"+par+"");
			
		}

			
			
	}			

			
	
