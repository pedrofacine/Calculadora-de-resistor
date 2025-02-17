fun obterValor (cor: string): Int {
    return when (cor.lowercase()) {
        "preto" -> 0
        "marrom" -> 1
        "vermelho" -> 2
        "laranja" -> 3
        "amarelo" -> 4
        "verde" -> 5
        "azul" -> 6
        "roxo" -> 7
        "cinza" -> 8
        "branco" -> 9
        else -> -1
    }
}
