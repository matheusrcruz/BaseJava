algoritmo "semnome"
var
I:inteiro
N, Pesado: caracter
P, Mai: real
procedimento Topo()
inicio
limpaTela
escreval("===================================")
escreval("DETECTOR DE PESADO")
escreval("Maior Peso ate agora ", Mai, "KG")
escreval("===================================")

fimProcedimento
inicio
    Topo()
    para I <- 1 ate 5 faca
         escreva("Digite o nome: ")
         leia(N)
         escreva("Digite o peso de ", N, ": ")
         leia(P)
         se(P>Mai) entao
          Mai <- P
          Pesado <- N
         fimSe
         Topo()
    fimPara
    Topo()
    escreval("A pessoa mais pesada foi ", pesado," com ", mai," quilos.")

fimalgoritmo