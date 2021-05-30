package arrayVet;

public class EstruturaVetor {

	public static void main(String[] args) {
		
		
		
		double temperatura001 = 31.3;
		double temperatura002 = 32.0;
		double temperatura003 = 33.3;
		double temperatura004 = 27.2;
		
		double[] temperaturas = new double [365];
		temperaturas[0] = 31.6;
		temperaturas[1] = 30.3;
		temperaturas[2] = 18.9;
		temperaturas[3] = 27.1;
		temperaturas[4] = 29.9;
		temperaturas[5] = 20.6;
		
		System.out.printf("\n O valor da temperatura do dia um é %f ", temperaturas[0]);
		System.out.printf("\n Tamanho do array  é %d", temperaturas.length);
		
		System.out.println("\n O valor do Array" + temperaturas);//Mostra o endereço na memoria
		
		//inteirando nosso array
		for(int i = 0; i < temperaturas.length;i ++) {
			System.out.printf("\n O valor da temperatura do dia %d  um é %f ", i+1, temperaturas[i]);
		}
		
		//for melhorado implementado na versao 5 do java for each
		//
		for(double temp : temperaturas) {
			System.out.println(temp);
			
		}

	}

}
