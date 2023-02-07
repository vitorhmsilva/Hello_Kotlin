//Operações comuns com variáveis primitivas
1 + 1
53 - 3
50 / 10
1 / 2
1.0 / 2.0
6 * 50

//Operações sobrepondo variáveis e inteiros
val fish = 2
fish * 2

//Kotlin trata números como primitivos, mas você pode chamar
//métodos como se fossem Objetos
fish.times(6)
fish.div(10)
fish.plus(3)
fish.minus(3)

//Kotlin possui classes encapsuladoras de tipos primitivos utilizando primitivo como um objeto
1.toLong()

//Se você tentar armazenar um valor primitivo em uma variável do tipo Number, ele precisará ser colocado em um objeto
// encapsulador, isso se chama encaixotar, e na maioria das vezes vai ser implícito
val boxed: Number = 1
boxed.toLong()

//Tipos de Variáveis
//Imutáveis
val aquarium = 1
//aquarium = 2 vai dar um erro, (Descomente essa linha para vê-lo

//Mutáveis
var fishes = 2
fishes
//mudando o valor
fishes = 50
fishes

//Kotlin não converte tipos de números em outros tipos implicitamente
val b: Byte = 1

//val i: Int = b iria dar um erro pois ele não faz essa conversão implícita, portanto a maneira correta de se fazer
// isso é:
val i: Int = b.toInt()
i

//Kotlin suporta underlines para indicar a separação de grupos numéricos em literais numéricos
val oneMillion = 1_000_000
val numeroBoleto = 99_99999_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010

//Nulabilidade em Kotlin é facilitada por meio da definição de uma váriável que pode ser nula por meio de um "?"
//var rocks: Int = null , daria um NullPointerException
var marbles: Int? = null

//E em tipos complexos como listas, dá para definir qual elemento pode ou não ser nulo por exemplo
var lotsOfFish: List<String?> = listOf(null, null) //define os elementos da listas como podendo ser nulos
var evenMoreFish: List<String>? = null // define o objeto da lista como podendo ser nulo
var definitelyFish: List<String?>? = null //define tanto elementos, como a própria lista serem nulos

//Caso queira se certificar que uma variável ou objeto é nulo é nula ao chamar um método ou uma ação sobre ela basta utilizar dois pontos de exclamação
var comida: Int? = null
comida!!.minus(3)

//Para salvar os programadores de vários if elses para tratamento de váriaveis nulas, a linguagem Kotlin oferece uma
//forma mais simples co o uso do ponto de interrogação "?", ou operador Elvis
var fishFoodTreats = 5
print(fishFoodTreats?.dec() ?: 0)