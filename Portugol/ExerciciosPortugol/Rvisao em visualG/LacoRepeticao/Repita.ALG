algoritmo "semnome"
var
   N, S: inteiro
   resp: caracter
inicio
 S<-0
 repita
       Escreva("Digite o Valor:=====> ")
       leia(N)
       S<-S+N
       Escreva(" Quer continuar: S/N ")
       resp
 ate(resp = "N")
 escreva("A Soma é :", S)

fimalgoritmo