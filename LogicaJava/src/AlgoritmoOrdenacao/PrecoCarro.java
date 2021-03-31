package AlgoritmoOrdenacao;

public class PrecoCarro {
	public static void main(String[] args) {
		int maisBarato = 0;
		double precos[] = new double[5];
		precos[0] = 1000.000;
		precos[1] = 46.000;
		precos[2] = 16.000;
		precos[3] = 46.000;
		precos[4] = 17.000;

		for (int atual = 0; atual <= 4; atual++) {
			if(precos[atual] < precos[maisBarato]) {
				maisBarato = atual;
			}
			System.out.println(maisBarato);
			System.out.println("O carro mais barato é: " + precos[maisBarato]);
		}

	}

}
