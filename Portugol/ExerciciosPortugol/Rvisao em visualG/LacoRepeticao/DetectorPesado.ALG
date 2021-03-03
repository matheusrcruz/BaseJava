algoritmo "semnome"
var
I:inteiro
N, Pesado: caracter
P, Mai: real
inicio
    limpaTela
    escreval("===================================")
    escreval("DETECTOR DE PESADO")
    escreval("Maior Peso ate agora ", Mai, "KG")
    escreval("===================================")
    para I <- 1 ate 5 faca
         escreva("Digite o nome: ")
         leia(N)
         escreva("Digite o peso de ", N, ": ")
         leia(P)
         se(P>Mai) entao
          Mai <- P
          Pesado <- N
         fimSe
    limpaTela
    escreval("===================================")
    escreval("DETECTOR DE PESADO")
    escreval("Maior Peso ate agora ", Mai, "KG")
    escreval("===================================")
    fimPara
    limpaTela
    limpaTela
    escreval("===================================")
    escreval("DETECTOR DE PESADO")
    escreval("Maior Peso ate agora ", Mai, "KG")
    escreval("===================================")
    escreval("A pessoa mais pesada foi", pesado,"com ", mai, "quilos.")

fimalgoritmo