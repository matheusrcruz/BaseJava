programa
{
        funcao inicio()
        {
					  
			
			real primeiroSemestre
			real segundoSemestre
			real terceiroSemestre
			real media
			
			escreva ("Digite sua nota do Priemeiro semstre: ")
			leia (primeiroSemestre)
			escreva ("Digite sua nota do Segundo semestre: ")
			leia (segundoSemestre)
			escreva ("Digite sua nota do Terceiro semestre: ")
			leia (terceiroSemestre)
	

			media = primeiroSemestre + segundoSemestre + terceiroSemestre

			se(media/3 < 5)
			{
				escreva("Reprovado sua media é ", media)
			}senao{
				escreva("Mizeravi sua nota é ", media, " pode comemorar!!! ")				
				}
  
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 617; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */