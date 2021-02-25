programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//ingredientes 
		real x1, x2
		real y1, y2
		real d
		real p1,p2

		//modo de preparo - entradas - processos
		escreva("Digite o valor x1: ")
		leia(x1)
		
		escreva("Digite o valor x2: ")
		leia(x2)
		
		escreva("Digite o valor y1: ")
		leia(y1)
		escreva("Digite o valor y2: ")
		leia(y2)

		p1 = (x1 + x2)
		p1 = Matematica.potencia(p1, 2)
		p2 = Matematica.potencia(p2, 2)
		d = Matematica.raiz((p1 +p2), 2)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 */