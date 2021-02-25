programa
/*
 * Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
 */
// formula a =b.h/2
{
	
	funcao inicio()
	{
		inteiro a = 0, b = 0, h = 0
		escreva("Digite a altura do triangulo: ")
		leia(h)
		escreva("Digite a base do tringulo: ")
		leia(b)
		a = (b*h)/2
		se(a%2 == 0 e a > 0){
			escreva("O resultado é ", a)		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */