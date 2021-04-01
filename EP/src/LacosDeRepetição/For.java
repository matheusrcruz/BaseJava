package LacosDeRepetição;

public class For {

	public static void main(String[] args) {
			
		//COMUM
		for(int i = 0; i < 8; i ++  ) {
			 System.out.println(i);
		}
		
			//MAIS DE UMA VARIAVEL
		for(int i = 0, j = 10; i < 8; i ++, j --  ) {
			 System.out.printf("\nvalores incremento %d , valores decremento %d ",i, j);
			
		}
		
		//COM VALORES AUSENTE for(int count =0; count < 20; count +=2)
		int count = 0;
		
		for( ;count< 20; ) {
			System.out.println("Valor é "+ count);
			count += 2 ;
		}/*
		
		//Looping infinito
		for(; ; ) {
			
			System.out.println("GAmbiarra");
		}*/
		
		 //loop sem corpo
		 int soma = 0;
		 for(int i = 0; i < 5; soma += i ++);
		 System.out.println("Valor da soma é " + soma);
		 
		 
		 
		 
	}

}
