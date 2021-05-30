package ClienteObjeto;

public class TestCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {
		
		resultSoma = MetodoStatico.soma(1, 2);
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		
		//calc.soma(1, 2);
		
		soma2Valores(1, 2);
		
	}

	static int soma2Valores(int num1, int num2){
		return MetodoStatico.soma(num1, num2);
	}

}
