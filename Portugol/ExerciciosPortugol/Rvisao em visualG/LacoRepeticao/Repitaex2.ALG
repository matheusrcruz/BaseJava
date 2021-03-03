algoritmo "semnome"
var
N,S :inteiro
resp: caractere
inicio
      S<- 0
          repita
                escreval("Digite um numero: ")
                leia(N)
                S<- S + N
                escreva("Quer continuar? (S/N)")
                leia(resp)
          ate(resp="N")
          escreval("A soma dos valores é: ", S)

fimalgoritmo