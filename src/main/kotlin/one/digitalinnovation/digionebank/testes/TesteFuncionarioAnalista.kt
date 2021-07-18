package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val vicente = Analista("Vicente Carlos", "456.456.456-45", 2000.0)

    ImprimeRelatorioFuncionario.imprime(vicente)
}