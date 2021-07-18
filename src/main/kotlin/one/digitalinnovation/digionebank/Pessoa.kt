package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Vinicius"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val vinicius = Pessoa()

    println(vinicius.pessoaInfo())
}