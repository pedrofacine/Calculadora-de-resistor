fun obterValor(cor: String): Int {
    return when (cor.lowercase()) {
        "preto" -> 0
        "marrom" -> 1
        "vermelho" -> 2
        "laranja" -> 3
        "amarelo" -> 4
        "verde" -> 5
        "azul" -> 6
        "roxo", "violeta" -> 7
        "cinza" -> 8
        "branco" -> 9
        else -> -1
    }
}

fun obterMultiplicador(cor: String): Double {
    return when (cor.lowercase()) {
        "preto" -> 1.0
        "marrom" -> 10.0
        "vermelho" -> 100.0
        "laranja" -> 1_000.0
        "amarelo" -> 10_000.0
        "verde" -> 100_000.0
        "azul" -> 1_000_000.0
        "violeta" -> 10_000_000.0
        "cinza" -> 100_000_000.0
        "branco" -> 1_000_000_000.0
        "dourado" -> 0.1
        "prateado" -> 0.01
        else -> -1.0
    }
}

fun obterTolerancia(cor: String): String {
    return when (cor.lowercase()) {
        "marrom" -> "±1%"
        "vermelho" -> "±2%"
        "verde" -> "±0.5%"
        "azul" -> "±0.25%"
        "violeta" -> "±0.1%"
        "cinza" -> "±0.05%"
        "dourado" -> "±5%"
        "prateado" -> "±10%"
        else -> "Valor inválido"
    }
}

fun main() {
    print("Quantas faixas tem o resistor (4 ou 5)? ")
    val numFaixas = readln().toIntOrNull()

    if (numFaixas !in listOf(4, 5)) {
        println("Erro: Apenas resistores de 4 ou 5 faixas são suportados.")
        return
    }

    print("Digite a primeira cor: ")
    val cor1 = readln()
    val valor1 = obterValor(cor1)
    if (valor1 == -1) {
        println("Erro: Cor inválida ($cor1).")
        return
    }

    print("Digite a segunda cor: ")
    val cor2 = readln()
    val valor2 = obterValor(cor2)
    if (valor2 == -1) {
        println("Erro: Cor inválida ($cor2).")
        return
    }

    var valor3 = 0
    if (numFaixas == 5) {
        print("Digite a terceira cor: ")
        val cor3 = readln()
        valor3 = obterValor(cor3)
        if (valor3 == -1) {
            println("Erro: Cor inválida ($cor3).")
            return
        }
    }

    print("Digite a cor do multiplicador: ")
    val corMultiplicador = readln()
    val multiplicador = obterMultiplicador(corMultiplicador)
    if (multiplicador == -1.0) {
        println("Erro: Cor inválida para multiplicador ($corMultiplicador).")
        return
    }

    print("Digite a cor da tolerância: ")
    val corTolerancia = readln()
    val tolerancia = obterTolerancia(corTolerancia)
    if (tolerancia == "Valor inválido") {
        println("Erro: Cor inválida para tolerância ($corTolerancia).")
        return
    }

    val resistencia = if (numFaixas == 4) {
        (valor1 * 10 + valor2) * multiplicador
    } else {
        (valor1 * 100 + valor2 * 10 + valor3) * multiplicador
    }

    println("O valor do resistor é: $resistencia ohms ($tolerancia)")
}
