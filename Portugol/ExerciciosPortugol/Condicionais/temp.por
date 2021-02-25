programa
{
	
	funcao inicio()
	{
		real tempoDuracao = 0.00
		real segundos = 0.00
		real minutos = 0.00
		real horas = 0.00

		// 1 hora 60 min, 1 min 60 segundo, 1 hora em min 3600 segundos
	
		escreva("Escreva tempo de duracao em segundos")
		leia(tempoDuracao)

		horas = tempoDuracao/ 3600
		minutos = ( tempoDuracao % 3600 ) /60
		segundos = (tempoDuracao % 3600) % 60
		
		escreva("Horas[s]", horas)
		escreva("\n minutos[s]",minutos)
		escreva("\n segundos[s]", segundos)
		
		

		
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */