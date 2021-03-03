package OOP;

public class Quadrado {
	
	public double lado;
	
	
	public void areaQuadrado()
	{
		System.out.println("Area do quadrado � "+(lado*lado));
	}
	
	public double calculoAreaQuadrado()
	{
		
		return (lado*lado);
	}
	
	public String tamanhoQuadro() {
		
		String resposta="";
		
		if ((lado*lado)> 10)
		{
			resposta = "AREA MAIOR QUE 10";
		} else
		{
			resposta = "AREA MENOR QUE 10";
		}
		
		return resposta;
	}

}
