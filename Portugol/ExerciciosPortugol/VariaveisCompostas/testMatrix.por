/*
	Faça um programa que crie um vetor por leitura com 5 valores 
	de pontuação de uma atividade e o escreva em seguida. 
	Encontre após a maior pontuação e a apresente. 
*/

programa
{
	
	funcao inicio()
	{
		
		inteiro pontuacoes[5]

	
		inteiro maiorPontuacao = 0

		para (inteiro contador = 0; contador < 5; contador++)
		{
		
			leia(pontuacoes[contador])

			
			se (pontuacoes[contador] > maiorPontuacao) {
				maiorPontuacao = pontuacoes[contador]
			}
		}

		escreva("\n")
		
		para (inteiro contador = 0; contador < 5; contador++)
		{
			escreva("Pontuação ", contador+1, ": ", pontuacoes[contador], "\n")
		}
		escreva("A maior pontuação é: ", maiorPontuacao, "\n")
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */