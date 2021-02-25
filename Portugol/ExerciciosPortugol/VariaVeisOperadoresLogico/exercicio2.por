programa
{
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	//	dias e mostre-a expressa apenas em dias. 
	// Anos = 12 mese e 365 dias Mes = 30 dias 
	funcao inicio()
	{
		//Valores de entrada
		inteiro  anoNascimento = 0, mesesNascimento = 0, diaNascimento =0
		//valores padrão
		inteiro diaHoje = 16 , anoAtual = 2021, mesAtual = 2
		//Somas 
		inteiro diasDeVida = 0, mesDeVida =0, idadeEmDias = 0, totalDias = 0
		
		escreva("Informe o ano em que voce nasceu: ")
		leia(anoNascimento)

		escreva("\n Mes do seu nascimento, somento Numeros: Exemplo Fevereiro é equivalente a mes 2 ")
		leia(mesesNascimento)

		escreva("\n Agora para concluir o Processo precisamos saber o dia em que voce nasceu: 	")
		leia(diaNascimento)


		diasDeVida = (anoAtual - anoNascimento) * 365
		mesDeVida = (mesesNascimento - mesAtual) * 30
		idadeEmDias = ( diaNascimento - diaHoje)

		
		
		
		 escreva("Voce viveu em dias ", diasDeVida)

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 953; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */