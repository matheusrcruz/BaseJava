algoritmo "semnome"
var

   massa,altura, imc : real
inicio
   escreval("vamos calcular o IMC")
   escreval("Digite sua massa em KG")
   leia(massa)
   escreval("Altura em Metros")
   leia(altura)
   imc <- massa / (altura ^ 2)
   escreval("IMC: ", imc:5:2)
   se((imc >= 18.5) e (imc < 25))  entao
        escreval("Parabéns voce esta no seu peso ideal: ")
   senao
        escreval("Voce não esta na faixa de peso ideal: ")
   
   fimse
   

fimalgoritmo