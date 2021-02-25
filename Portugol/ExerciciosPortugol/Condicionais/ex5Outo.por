programa
{
	
	funcao inicio()
	{
	   real indice
        real a, b, c

        escreva("Digite o índice de 0.3 a 0.25: ")
        leia(indice)

        se (indice == 0.3){
            escreva("Grupo A suspender atividades")
        }
        senao se (indice == 0.4){
            escreva("Grupo A e B suspender atividades")
        }
        senao se (indice <= 0.5){
            escreva("Todos os grupos suspender atividades")
        }

        senao{
            escreva("Tudo OK.")
        }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 42; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */